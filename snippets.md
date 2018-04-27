# Code snippets for ApiOmat #

The examples are using the following use case scenario:  
The name of the example module is "TestModule" containing a *TestClass*,  
holding an attribute of type String named *testAttribute*,  
an attribute *testAttributeReference* that references another class of type *TestClassRef*  
and an attribute *testAttributeImage* of type Image.  
The request used is the object named *r*.  
  
In addition to this module, there is another module "TestModule02" containing a *TestClass02*, holding an attribute of type String named *testAttribute02*.  
  
  
  

## create a new object   


    final TestClass objectInstance = TestModule.AOM.createObject( r.getApplicationName( ), TestClass.MODULE_NAME, TestClass.MODEL_NAME, r );  
    objectInstance.save( );  

  
  
## get a configuration value for a module   

`<ConfigurationKey>` the configuration value's key. You can find all available configuration values and therefore configuration keys in your TestModule.java file. The improved *getParsedConfigValue*-method provides a type conversion as configured in native module config.  
  

    TestModule.APP_CONFIG_PROXY.getConfigValue( <ConfigurationKey>, r.getApplicationName( ), r.getSystem( ) );    
    TestModule.APP_CONFIG_PROXY.getParsedConfigValue( <ConfigurationKey>, r.getApplicationName( ), r.getSystem( ) );    
  
  
  
## create a log entry     
  
To log messages from within your module code just use one of several logging methods. The example below shows how to synchronous log messages for a specific module. There are several other methods for logging, including parameters e.g. for asynchronous logging or a particular model.    
  
  
    TestModule.AOM.log( r.getApplicationName( ), "content of the message to be logged", false );  
  
  
  
## get an attribute and log a message   
  
The variable *objectInstance* is an instance of TestClass.  
  
  
    TestModule.AOM.log( r.getApplicationName( ), "attribute's value: " + objectInstance.getTestAttribute( ), false );  
  
  
  
## set an attribute's value   
  
The variable *objectInstance* is an instance of TestClass.  
The placeholder `<ValueOfTheAttribute>` is the value the attribute should be set to.  
  
  
    objectInstance.setTestAttribute( <ValueOfTheAttribute> );  
    objectInstance.save( );  
  
  
  
## modify roles   
It is possible to extend the class specific security restrictions by setting roles additionally on object level.  
  
The variable *objectInstance* is an instance of TestClass.  
  
  
    objectInstance.setAllowedRolesRead( new String[] { "TestRole" } );  
    objectInstance.setAllowedRolesWrite( new String[] { "TestRole" } );  
    objectInstance.setAllowedRolesGrant( new String[] { "TestRole" } );  
    objectInstance.save( );  
  
  
  
## add a reference   
  
To add a reference to an object, the object itself as well as the object to be referenced have to be saved already.  
Furthermore you need to know the name of the attribute holding the reference.  
  
The variable *referenceInstance* is an instance of TestClassRef.  
  
  
    TestClass.postTestAttributeReference( referenceInstance );  
  
  
  
## find an object by id   
  
The placeholder `<IdOfTheObjectToBeQueried>` is the id of the object that should be found.  
  
  
    TestModule.AOM.findById( r.getApplicationName( ), <IdOfTheObjectToBeQueried>, TestClass.MODULE_NAME, "TestModel", r );  
  
  
  
## find an object by one of its attribute's value   
  
*Visit [documentation](http://docs.apiomat.com/26/Query.html "query documentation") for further information.*  
  
  
    final IModel[] result = TestModule.AOM.findByNames( r.getApplicationName( ), TestClass.MODULE_NAME, TestClass.MODEL_NAME, "TestAttribute == \"value\"", r );  
  
  
  
## find an object of another module by one of its attribute's value   
  
*Visit [documentation](http://docs.apiomat.com/26/Query.html "query documentation") for further information.*  
  
  
    final IModel[] result = TestModule.AOM.findByNames( r.getApplicationName( ), TestClass02.MODULE_NAME, TestClass02.MODEL_NAME, "TestAttribute02 == \"value\"", r );  
  
  
  
## throw custom exception with custom status code   
  
    TestModule.AOM.throwException( 667, "example message" );  
  
  
  
## upload and load an image   
  
    /*	alternative 1: old way */  
    try( InputStream input = new URL( "http://testimage.testserver.tst/exampleFile.png" ).openStream( ) )  
    {  
    	/* upload image */  
    	TestClass tc = new TestClass( );  
    	tc.save( );  
    	tc.postTestAttributeImage( input, "exampleFile", "png" );  
      
    	/* load data */  
    	final InputStream imageInputStream = new BufferedInputStream( tc.loadTestAttributeImage( ) );  
    	//alternative: final InputStream imageInputStream = tc.loadTestAttributeImageAsStream( );  
    	/* delete: */  
    	tc.deleteData( ResourceType.IMAGE, tc.getTestAttributeImageURL( ) );  
    	tc.setTestAttributeImageURL( "" );  
    	tc.save( );      	    	    	    	    	
    }  
    catch ( IOException e )  
    {  
    	TestModule.AOM.logError( r.getApplicationName( ), e, false );  
    }  
      
    /*	alternative 2: new way */  
    try( InputStream input = new URL( "http://testimage.testserver.tst/exampleFile.png" ).openStream( ) )  
    {  
    	/* upload image */  
    	TestClass tc = new TestClass( );  
    	tc.save( );  
    	tc.addReferencedData( input, "testAttributeImage", "exampleFile", "png" );  
    	  
    	 /* reload to have the url attached */  
    	tc = ( TestClass ) TestModule.AOM.findById( r.getApplicationName( ), tc.getId( ), TestClass.MODULE_NAME, TestClass.MODEL_NAME, r );  
    	/* download image */  
    	String url = tc.getTestAttributeImageURL( );  
    	if( url.endsWith( "/" ) )  
    	{  
    		url = url.substring( 0, url.length( ) - 1 );  
    	}  
    	final String id = url.substring( url.lastIndexOf( "/" ) + 1, url.length( ) );  
    	/* load the data */  
    	final DataWrapper dw = tc.loadReferencedData( "testAttributeImage", id );  
    	final BufferedInputStream imageInputStream = new BufferedInputStream( dw.getData( ) );  
    	  
    	/* delete the data */  
    	tc.deleteReferencedData( "testAttributeImage", id );  
    }  
    catch ( IOException e )  
    {  
    	TestModule.AOM.logError( r.getApplicationName( ), e, false );  
    }    	    	  
  
  
  
## call hooks from native module   
When performing CRUD operations directly from within a native module, the corresponding hook methods are not triggered by default,    
e.g. the `beforeDelete` and `afterDelete` methods when performing a `delete` on an existing object.  
  
If you want the hook methods to be executed anyway, you can set the `hooksInUsedModulesEnabled` flag to *true*.  
  
  
    r.setHooksInUsedModulesEnabled( true );  
    TestModule.AOM.deleteByNames( TestClass.MODULE_NAME, TestClass.MODEL_NAME, "testAttribute == \"<value>\"", r );  
  
  
  
## read models on streams   
  
    IModel<?>[ ] fieldListTmp = TestModule.AOM.findByNames( r.getApplicationName( ), TestClass.MODULE_NAME, TestClass.MODEL_NAME, "testAttribute == \"<value>\"", r );  
    final List<TestClass> fieldList = Arrays.stream( fieldListTmp ).map( t -> {  
    	return ( TestClass ) t;  
    } ).collect( Collectors.toList( ) );  
  
  
  
## check if a request is authenticated as an account   
*This method returns* true *if the request was sent by a customer or an organization and* false *if it was sent by a user or guest.*  
  
    r.getIsAccountRequest( )  
  

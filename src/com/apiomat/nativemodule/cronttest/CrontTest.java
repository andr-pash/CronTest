/*
 * Copyright (c) 2011 - 2018, Apinauten GmbH
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, 
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this 
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.cronttest;


/**
 * Generated class for starting and stopping your module. 
 * 
 * Please be aware that all overridden methods in this class are called internally with 
 * A NEW INSTANCE OF THIS CLASS every time. That is, you cannot use instance variables 
 * in these overridden methods, because they are initialized again before each call.
 * 
 */
@com.apiomat.nativemodule.Module( description="", 
         usedModules = { }, securityPermissions = {} )
public class CrontTest implements com.apiomat.nativemodule.IModule
{
    static com.apiomat.nativemodule.IApplicationConfigProxy APP_CONFIG_PROXY;
    static com.apiomat.nativemodule.IStaticMethods AOM;
    
    // Sample for a module configuration
    //
    // @com.apiomat.nativemodule.NativeModuleConfig(
    //     datatype = Type.TEXT,
    //     example = "localhost",
    //     title = "Server Hostname",
    //     info = "Hostname of the server",
    //     defaultValue = "localhost",
    //     notifyAllNodes = true,
    //     order = 1 )
    // public static String HOSTNAME = "CrontTest_hostname";
    //
    // Read @NativeModuleConfig values using the following code:
    // CrontTest.APP_CONFIG_PROXY.getConfigValue( CrontTest.HOSTNAME, appName, system );

    /**
     * This method gets called once in the cluster when the module is uploaded.
     */
    @Override
    public void onDeploy( )
    {
        //TODO will be called on SDK upload or service start
    }

    /**
     * This method gets called once in the cluster when the ApiOmat service is shutdown.
     */
    @Override
    public void onUndeploy( )
    {
        //TODO will be called when service shuts down (maintenance)
    }
    
    /**
     * This method gets called when the configuration for an app changes for this module
     */
    @Override
    public void onConfigChanged( String appName, String configKey, String system )
    {
        // TODO Auto-generated method stub
    }
    
    /**
     * This method may provide an implementation for your own REST interface
     */
    @Override
    public com.apiomat.nativemodule.AbstractRestResource getSpecificRestResource( javax.ws.rs.core.UriInfo uriInfo, 
    	javax.servlet.http.HttpServletRequest servletRequest, javax.ws.rs.core.SecurityContext securityContext, 
    	javax.ws.rs.core.Request wsRequest )
    {
        // TODO comment in to use a basic rest endpoint with a ping method
        //return new RestClass( uriInfo, servletRequest, securityContext, wsRequest );
        return null;
    }
    
    /**
     * This method gets called every hour
     */
    @Override
    public void onCronHourly( final String appName, final String system )
    {
        // TODO Auto-generated method stub
    }

    /**
     * This method gets called every day
     */
    @Override
    public void onCronDaily( final String appName, final String system )
    {
        // TODO Auto-generated method stub
    }

    /**
     * This method gets called every week
     */
    @Override
    public void onCronWeekly( final String appName, final String system )
    {
        // TODO Auto-generated method stub
    }

    /**
     * This method gets called every month
     */
    @Override
    public void onCronMonthly( final String appName, final String system )
    {
        // TODO Auto-generated method stub
    }
    
    /**
     * This method can be used for health checks (http://<hostname>/yambas/rest/modules/<modulename>/<appname>/health)
     * <p>
     *  -1 means health check not implemented<br>
	 *  0 means "OK"<br>
	 *  every other code signalizes a custom error
	 */
    @Override
    public int checkHealth( final String appName, final String system )
    {
        return -1;
    }
}

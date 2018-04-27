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
package com.apiomat.nativemodule.basics;


import com.apiomat.nativemodule.basics.*;
/**
* Generated default class representing a user in your app
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "Basics" )
public class User extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.basics.User> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.basics.User>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "Basics";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "User";

    /** class specific attributes */
    private java.util.Date dateOfBirth = null;
    private java.util.Map<String, Object> dynamicAttributes = new java.util.concurrent.ConcurrentHashMap<>();
    private String firstName = null;
    private String lastName = null;
    private double[] loc;
    private String password = null;
    private String sessionToken = null;
    @com.apiomat.nativemodule.Mandatory
    private String userName = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public User ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public java.util.Date getDateOfBirth()
    {
         return this.dateOfBirth;
    }

    public void setDateOfBirth( java.util.Date arg )
    {
        this.dateOfBirth = arg;
    }

    public java.util.Map<String, Object> getDynamicAttributes()
    {
       return this.dynamicAttributes;
    }

    public void setDynamicAttributes( java.util.Map<String, Object> map )
    {
       this.dynamicAttributes = map;
    }

    public String getFirstName()
    {
         return this.firstName;
    }

    public void setFirstName( String arg )
    {
        this.firstName = arg;
    }

    public String getLastName()
    {
         return this.lastName;
    }

    public void setLastName( String arg )
    {
        this.lastName = arg;
    }

    public double getLocLatitude( )
    {
         return this.loc !=null && this.loc.length > 0 ? this.loc[0] : 0;
    }

    public double getLocLongitude( )
    {
         return this.loc !=null && this.loc.length > 1 ? this.loc[1] : 0;
    }

    public void setLocLatitude( double latitude )
    {
        if( this.loc == null )
        {
            this.loc = new double[]{};
        }

        if ( this.loc.length < 2 )
        {
            this.loc = new double[]{ latitude, 0 };
        }
        else
        {
            this.loc[0] = latitude;
        }
    }

    public void setLocLongitude( double longitude )
    {
        if( this.loc == null )
        {
            this.loc = new double[]{};
        }

        if ( this.loc.length < 2 )
        {
            this.loc = new double[]{ 0, longitude };
        }
        else
        {
            this.loc[1] = longitude;
        }
    }

    public String getPassword()
    {
         return this.password;
    }

    public void setPassword( String arg )
    {
        this.password = arg;
    }

    public String getSessionToken()
    {
         return this.sessionToken;
    }

    public void setSessionToken( String arg )
    {
        this.sessionToken = arg;
    }

    public String getUserName()
    {
         return this.userName;
    }

    public void setUserName( String arg )
    {
        this.userName = arg;
    }

}

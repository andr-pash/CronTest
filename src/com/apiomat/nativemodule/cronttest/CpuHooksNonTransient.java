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
import com.apiomat.nativemodule.*;
import com.apiomat.nativemodule.basics.User;


/**
* Generated class for hooks on your Cpu data model
*/

public class CpuHooksNonTransient<T extends com.apiomat.nativemodule.cronttest.Cpu> implements com.apiomat.nativemodule.IModelHooksNonTransient<com.apiomat.nativemodule.cronttest.Cpu>
{
    protected com.apiomat.nativemodule.cronttest.Cpu model;

    @Override
    public void setCallingModel( com.apiomat.nativemodule.cronttest.Cpu model )
    {
        this.model = model;
    }


    /*
     * Following Methods can be used if your data model is NOT set to TRANSIENT
     */

    @Override
    public void beforePost( com.apiomat.nativemodule.cronttest.Cpu obj, com.apiomat.nativemodule.Request r )
    {
    }


    @Override
    public void afterPost( com.apiomat.nativemodule.cronttest.Cpu obj, com.apiomat.nativemodule.Request r )
    {
    }

    @Override
    public void beforeGet( String id, com.apiomat.nativemodule.Request r )
    {
    }

    
    @Override
    public void afterGet( com.apiomat.nativemodule.cronttest.Cpu obj, com.apiomat.nativemodule.Request r )
    {
    }

    @Override
    public String beforeGetAll( String query, com.apiomat.nativemodule.Request r )
    {
        /* NOTE that returning null or "" would ignore any query and always return any object of this class and backend */
        return query;
    }

    @Override
    public java.util.List<com.apiomat.nativemodule.cronttest.Cpu> afterGetAll( java.util.List<com.apiomat.nativemodule.cronttest.Cpu> objects, String query, com.apiomat.nativemodule.Request r )
    {
        /*
         * If you want to change the returned list of elements, you have to create a new list
         * and add the elements to return to it. Because getting elements from the "objects"
         * list will return a copy, changing values in this list does not have any effect.
         *
         * If NULL is returned, unnecessary conversions are omitted and result is taken from database.
         */
        return null;
    }
    @Override
    public boolean beforePut( com.apiomat.nativemodule.cronttest.Cpu objFromDB, com.apiomat.nativemodule.cronttest.Cpu obj, com.apiomat.nativemodule.Request r )
    {
        return false;
    }

    @Override
    public void afterPut( com.apiomat.nativemodule.cronttest.Cpu obj, com.apiomat.nativemodule.Request r )
    {
    }

    @Override
    public boolean beforeDelete( com.apiomat.nativemodule.cronttest.Cpu obj, com.apiomat.nativemodule.Request r )
    {
        return false;
    }


    @Override
    public boolean beforePostData( final com.apiomat.nativemodule.cronttest.Cpu obj, final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.Request r )
    {
        return false;
    }

    @Override
    public void afterPostData( final com.apiomat.nativemodule.cronttest.Cpu obj, final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.Request r )
    {
    }

    @Override
    public String beforeGetData( final String dataId, final String attributeName, final com.apiomat.nativemodule.TranscodingConfiguration transcodingConfig, final com.apiomat.nativemodule.Request r )
    {
        return null;
    }

    @Override
    public void afterGetData( final String dataId, final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.TranscodingConfiguration transcodingConfig, final com.apiomat.nativemodule.Request r )
    {
    }

    @Override
    public boolean beforeDeleteData( final com.apiomat.nativemodule.cronttest.Cpu obj, final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.Request r )
    {
        return false;
    }

    @Override
    public void afterDeleteData( final com.apiomat.nativemodule.cronttest.Cpu obj, final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.Request r )
    {
    }

    @Override
    public boolean beforePostRef( com.apiomat.nativemodule.cronttest.Cpu obj, Object referencedObject, String referenceName, com.apiomat.nativemodule.Request r )
    {
        return false;
    }

    @Override
    public void afterPostRef( com.apiomat.nativemodule.cronttest.Cpu obj, Object referencedObject, String referenceName, com.apiomat.nativemodule.Request r )
    {
    }

    @Override
    public String beforeGetAllReferences( String query, String referenceName, com.apiomat.nativemodule.Request r )
    {
        /* NOTE that returning null or "" would ignore any query and always return any referenced object */
        return query;
    }

    @Override
    public <Z extends com.apiomat.nativemodule.AbstractClientDataModel> java.util.List<Z> afterGetAllReferences( java.util.List<Z> objects, String query,
        String referenceName, com.apiomat.nativemodule.Request r )
    {
            return null; // return objects here if you changed sth; returning null prevents unnecessary conversions
    }

    @Override
    public boolean beforeDeleteRef( com.apiomat.nativemodule.cronttest.Cpu obj, Object referencedObject, String referenceName, com.apiomat.nativemodule.Request r )
    {
        return false;
    }

    @Override
    public void afterDeleteRef( com.apiomat.nativemodule.cronttest.Cpu obj, Object referencedObject, String referenceName, com.apiomat.nativemodule.Request r )
    {
    }

}

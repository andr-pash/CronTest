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
 * REST class for your module
 */
@io.swagger.annotations.Api( value = "/CrontTest", tags="CrontTest" )
public class RestClass extends com.apiomat.nativemodule.AbstractRestResource
{
    /**
     * Constructor, leave as is
     *
     * @param uriInfo
     * @param servletRequest
     * @param securityContext
     * @param wsRequest
     */
    public RestClass( javax.ws.rs.core.UriInfo uriInfo, javax.servlet.http.HttpServletRequest servletRequest, javax.ws.rs.core.SecurityContext securityContext,
        javax.ws.rs.core.Request wsRequest )
    {
        super( uriInfo, servletRequest, securityContext, wsRequest );
    }

    /**
     * A simple ping-like GET endpoint.
     * You can pass a <PARAM> to the following URL, which is contained in the response then.
     *
     * curl <BASEURL>/yambas/rest/modules/CrontTest/{appName}/spec/ping/<PARAM>
     *
     * The @ApiOperation and @ApiParam annotations are used to documnt the REST endpoint in the apidocs:
     * <BASEURL>/apidocs/index.html
     *
     * @param param arbitrary value which is returned in response
     * @return response
     */
    @io.swagger.annotations.ApiOperation( value = "A simple ping-like GET endpoint" )
    @javax.ws.rs.GET
    @javax.ws.rs.Path( "/ping/{param}" )
    public javax.ws.rs.core.Response ping( @io.swagger.annotations.ApiParam( value = "param name" ) @javax.ws.rs.PathParam( "param" ) String param )
    {
        final com.apiomat.nativemodule.Request request = this.getAOMRequest( );
        // extract auth information from the request object if needed
        System.out.println( request );

        if (param == null || "".equals( param.trim( ) ))
        {
            param = "pong";
        }

        return javax.ws.rs.core.Response.ok( param ).type( javax.ws.rs.core.MediaType.TEXT_PLAIN ).build( );
    }
}

/*
 *   Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */
package org.apache.directory.fortress.core;


/**
 * This exception extends {@link SecurityException} and is thrown when Fortress cannot find correct cfg for a particular entity.
 * See the {@link GlobalErrIds} javadoc for list of error ids.
 *
 * @author Shawn McKinney
 */
public class CfgException extends SecurityException
{
    /** Default serialVersionUID */
    private static final long serialVersionUID = 1L;


    /**
     * Create an exception with an error code that maps to {@link GlobalErrIds} and message text.
     * @param  errorId see {@link GlobalErrIds} for list of valid error codes that can be set.  Valid values between 0 & 100_000.
     * @param msg contains textual information including method of origin and description of the root cause.
     */
    public CfgException( int errorId, String msg )
    {
        super( errorId, msg );
    }


    /**
     * Create exception with error id, message and related exception.
     * @param  errorId see {@link GlobalErrIds} for list of valid error codes that can be set.  Valid values between 0 & 100_000.
     * @param msg contains textual information including method of origin and description of the root cause.
     * @param previousException contains reference to related exception which usually is system related, i.e. ldap.
     */
    public CfgException( int errorId, String msg, Exception previousException )
    {
        super( errorId, msg, previousException );
    }
}

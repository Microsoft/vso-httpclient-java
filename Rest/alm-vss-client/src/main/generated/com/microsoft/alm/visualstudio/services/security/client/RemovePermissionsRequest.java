// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.visualstudio.services.security.client;

import java.util.List;
import java.util.UUID;

/** 
 */
public class RemovePermissionsRequest {

    private List<UUID> identityIds;
    private String token;

    public List<UUID> getIdentityIds() {
        return identityIds;
    }

    public void setIdentityIds(final List<UUID> identityIds) {
        this.identityIds = identityIds;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }
}

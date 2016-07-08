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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.events;

import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.Release;

/** 
 */
public class ReleaseUpdatedEvent
    extends RealtimeReleaseEvent {

    private Release release;

    public Release getRelease() {
        return release;
    }

    public void setRelease(final Release release) {
        this.release = release;
    }
}

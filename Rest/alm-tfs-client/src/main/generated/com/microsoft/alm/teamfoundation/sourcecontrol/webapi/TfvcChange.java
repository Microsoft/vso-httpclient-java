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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import java.util.ArrayList;

/** 
 */
public class TfvcChange
    extends Change<TfvcItem> {

    /**
    * List of merge sources in case of rename or branch creation.
    */
    private ArrayList<TfvcMergeSource> mergeSources;
    /**
    * Version at which a (shelved) change was pended against
    */
    private int pendingVersion;

    /**
    * List of merge sources in case of rename or branch creation.
    */
    public ArrayList<TfvcMergeSource> getMergeSources() {
        return mergeSources;
    }

    /**
    * List of merge sources in case of rename or branch creation.
    */
    public void setMergeSources(final ArrayList<TfvcMergeSource> mergeSources) {
        this.mergeSources = mergeSources;
    }

    /**
    * Version at which a (shelved) change was pended against
    */
    public int getPendingVersion() {
        return pendingVersion;
    }

    /**
    * Version at which a (shelved) change was pended against
    */
    public void setPendingVersion(final int pendingVersion) {
        this.pendingVersion = pendingVersion;
    }
}

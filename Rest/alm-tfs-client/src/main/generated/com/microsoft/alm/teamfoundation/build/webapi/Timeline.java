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

package com.microsoft.alm.teamfoundation.build.webapi;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/** 
 */
public class Timeline
    extends TimelineReference {

    private UUID lastChangedBy;
    private Date lastChangedOn;
    private ArrayList<TimelineRecord> records;

    public UUID getLastChangedBy() {
        return lastChangedBy;
    }

    public void setLastChangedBy(final UUID lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    public Date getLastChangedOn() {
        return lastChangedOn;
    }

    public void setLastChangedOn(final Date lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
    }

    public ArrayList<TimelineRecord> getRecords() {
        return records;
    }

    public void setRecords(final ArrayList<TimelineRecord> records) {
        this.records = records;
    }
}

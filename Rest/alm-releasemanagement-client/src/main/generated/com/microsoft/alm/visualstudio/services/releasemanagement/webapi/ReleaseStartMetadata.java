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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ArtifactMetadata;

/** 
 */
public class ReleaseStartMetadata {

    private ArrayList<ArtifactMetadata> artifacts;
    private int definitionId;
    private String description;
    private boolean isDraft;
    private ArrayList<String> manualEnvironments;
    private ReleaseReason reason;

    public ArrayList<ArtifactMetadata> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(final ArrayList<ArtifactMetadata> artifacts) {
        this.artifacts = artifacts;
    }

    public int getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(final int definitionId) {
        this.definitionId = definitionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @JsonProperty("isDraft")
    public boolean isDraft() {
        return isDraft;
    }

    @JsonProperty("isDraft")
    public void setDraft(final boolean isDraft) {
        this.isDraft = isDraft;
    }

    public ArrayList<String> getManualEnvironments() {
        return manualEnvironments;
    }

    public void setManualEnvironments(final ArrayList<String> manualEnvironments) {
        this.manualEnvironments = manualEnvironments;
    }

    public ReleaseReason getReason() {
        return reason;
    }

    public void setReason(final ReleaseReason reason) {
        this.reason = reason;
    }
}

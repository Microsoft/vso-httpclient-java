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

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.teamfoundation.core.webapi.TeamProjectReference;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class GitRepository {

    private ReferenceLinks _links;
    private String defaultBranch;
    private UUID id;
    private String name;
    private TeamProjectReference project;
    private String remoteUrl;
    private String url;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(final String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(final String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}

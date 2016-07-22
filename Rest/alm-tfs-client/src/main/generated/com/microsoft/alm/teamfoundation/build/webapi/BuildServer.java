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
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class BuildServer {

    private ArrayList<ShallowReference> agents;
    private ShallowReference controller;
    private int id;
    private boolean isVirtual;
    private String messageQueueUrl;
    private String name;
    private boolean requireClientCertificates;
    private ServiceHostStatus status;
    private Date statusChangedDate;
    private String uri;
    private String url;
    private int version;

    public ArrayList<ShallowReference> getAgents() {
        return agents;
    }

    public void setAgents(final ArrayList<ShallowReference> agents) {
        this.agents = agents;
    }

    public ShallowReference getController() {
        return controller;
    }

    public void setController(final ShallowReference controller) {
        this.controller = controller;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    @JsonProperty("isVirtual")
    public boolean isVirtual() {
        return isVirtual;
    }

    @JsonProperty("isVirtual")
    public void setVirtual(final boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    public String getMessageQueueUrl() {
        return messageQueueUrl;
    }

    public void setMessageQueueUrl(final String messageQueueUrl) {
        this.messageQueueUrl = messageQueueUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public boolean getRequireClientCertificates() {
        return requireClientCertificates;
    }

    public void setRequireClientCertificates(final boolean requireClientCertificates) {
        this.requireClientCertificates = requireClientCertificates;
    }

    public ServiceHostStatus getStatus() {
        return status;
    }

    public void setStatus(final ServiceHostStatus status) {
        this.status = status;
    }

    public Date getStatusChangedDate() {
        return statusChangedDate;
    }

    public void setStatusChangedDate(final Date statusChangedDate) {
        this.statusChangedDate = statusChangedDate;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(final int version) {
        this.version = version;
    }
}

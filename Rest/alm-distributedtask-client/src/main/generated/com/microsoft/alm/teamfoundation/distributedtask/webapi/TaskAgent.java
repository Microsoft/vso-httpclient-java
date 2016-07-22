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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.Date;
import java.util.HashMap;
import com.microsoft.alm.visualstudio.services.webapi.PropertiesCollection;

/** 
 */
public class TaskAgent
    extends TaskAgentReference {

    /**
    * Gets the request which is currently assigned to this agent.
    */
    private TaskAgentJobRequest assignedRequest;
    /**
    * Gets or sets the authorization information for this agent.
    */
    private TaskAgentAuthorization authorization;
    /**
    * Gets the date on which this agent was created.
    */
    private Date createdOn;
    /**
    * Gets or sets the maximum job parallelism allowed on this host.
    */
    private int maxParallelism;
    private PropertiesCollection properties;
    /**
    * Gets the date on which the last connectivity status change occurred.
    */
    private Date statusChangedOn;
    private HashMap<String, String> systemCapabilities;
    private HashMap<String, String> userCapabilities;

    /**
    * Gets the request which is currently assigned to this agent.
    */
    public TaskAgentJobRequest getAssignedRequest() {
        return assignedRequest;
    }

    /**
    * Gets the request which is currently assigned to this agent.
    */
    public void setAssignedRequest(final TaskAgentJobRequest assignedRequest) {
        this.assignedRequest = assignedRequest;
    }

    /**
    * Gets or sets the authorization information for this agent.
    */
    public TaskAgentAuthorization getAuthorization() {
        return authorization;
    }

    /**
    * Gets or sets the authorization information for this agent.
    */
    public void setAuthorization(final TaskAgentAuthorization authorization) {
        this.authorization = authorization;
    }

    /**
    * Gets the date on which this agent was created.
    */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
    * Gets the date on which this agent was created.
    */
    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
    * Gets or sets the maximum job parallelism allowed on this host.
    */
    public int getMaxParallelism() {
        return maxParallelism;
    }

    /**
    * Gets or sets the maximum job parallelism allowed on this host.
    */
    public void setMaxParallelism(final int maxParallelism) {
        this.maxParallelism = maxParallelism;
    }

    public PropertiesCollection getProperties() {
        return properties;
    }

    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    /**
    * Gets the date on which the last connectivity status change occurred.
    */
    public Date getStatusChangedOn() {
        return statusChangedOn;
    }

    /**
    * Gets the date on which the last connectivity status change occurred.
    */
    public void setStatusChangedOn(final Date statusChangedOn) {
        this.statusChangedOn = statusChangedOn;
    }

    public HashMap<String, String> getSystemCapabilities() {
        return systemCapabilities;
    }

    public void setSystemCapabilities(final HashMap<String, String> systemCapabilities) {
        this.systemCapabilities = systemCapabilities;
    }

    public HashMap<String, String> getUserCapabilities() {
        return userCapabilities;
    }

    public void setUserCapabilities(final HashMap<String, String> userCapabilities) {
        this.userCapabilities = userCapabilities;
    }
}

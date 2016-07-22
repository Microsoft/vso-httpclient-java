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

package com.microsoft.alm.visualstudio.services.gallery.webapi.acquisitionrequest;


/** 
 */
public class AcquisitionOperation {

    /**
    * State of the the AcquisitionOperation for the current user
    */
    private AcquisitionOperationState operationState;
    /**
    * AcquisitionOperationType: install, request, buy, etc...
    */
    private AcquisitionOperationType operationType;
    /**
    * Optional reason to justify current state. Typically used with Disallow state.
    */
    private String reason;

    /**
    * State of the the AcquisitionOperation for the current user
    */
    public AcquisitionOperationState getOperationState() {
        return operationState;
    }

    /**
    * State of the the AcquisitionOperation for the current user
    */
    public void setOperationState(final AcquisitionOperationState operationState) {
        this.operationState = operationState;
    }

    /**
    * AcquisitionOperationType: install, request, buy, etc...
    */
    public AcquisitionOperationType getOperationType() {
        return operationType;
    }

    /**
    * AcquisitionOperationType: install, request, buy, etc...
    */
    public void setOperationType(final AcquisitionOperationType operationType) {
        this.operationType = operationType;
    }

    /**
    * Optional reason to justify current state. Typically used with Disallow state.
    */
    public String getReason() {
        return reason;
    }

    /**
    * Optional reason to justify current state. Typically used with Disallow state.
    */
    public void setReason(final String reason) {
        this.reason = reason;
    }
}

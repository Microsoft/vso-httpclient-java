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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.util.ArrayList;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class TestCaseResultUpdateModel {

    private Integer[] associatedWorkItems;
    private String automatedTestTypeId;
    private String comment;
    private String completedDate;
    private String computerName;
    private ArrayList<CustomTestField> customFields;
    private String durationInMs;
    private String errorMessage;
    private String failureType;
    private String outcome;
    private IdentityRef owner;
    private String resolutionState;
    private IdentityRef runBy;
    private String stackTrace;
    private String startedDate;
    private String state;
    private String testCasePriority;
    private ShallowReference testResult;

    public Integer[] getAssociatedWorkItems() {
        return associatedWorkItems;
    }

    public void setAssociatedWorkItems(final Integer[] associatedWorkItems) {
        this.associatedWorkItems = associatedWorkItems;
    }

    public String getAutomatedTestTypeId() {
        return automatedTestTypeId;
    }

    public void setAutomatedTestTypeId(final String automatedTestTypeId) {
        this.automatedTestTypeId = automatedTestTypeId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(final String completedDate) {
        this.completedDate = completedDate;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(final String computerName) {
        this.computerName = computerName;
    }

    public ArrayList<CustomTestField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(final ArrayList<CustomTestField> customFields) {
        this.customFields = customFields;
    }

    public String getDurationInMs() {
        return durationInMs;
    }

    public void setDurationInMs(final String durationInMs) {
        this.durationInMs = durationInMs;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getFailureType() {
        return failureType;
    }

    public void setFailureType(final String failureType) {
        this.failureType = failureType;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(final String outcome) {
        this.outcome = outcome;
    }

    public IdentityRef getOwner() {
        return owner;
    }

    public void setOwner(final IdentityRef owner) {
        this.owner = owner;
    }

    public String getResolutionState() {
        return resolutionState;
    }

    public void setResolutionState(final String resolutionState) {
        this.resolutionState = resolutionState;
    }

    public IdentityRef getRunBy() {
        return runBy;
    }

    public void setRunBy(final IdentityRef runBy) {
        this.runBy = runBy;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(final String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(final String startedDate) {
        this.startedDate = startedDate;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getTestCasePriority() {
        return testCasePriority;
    }

    public void setTestCasePriority(final String testCasePriority) {
        this.testCasePriority = testCasePriority;
    }

    public ShallowReference getTestResult() {
        return testResult;
    }

    public void setTestResult(final ShallowReference testResult) {
        this.testResult = testResult;
    }
}

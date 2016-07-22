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

/** 
 */
public class TestFailureDetails {

    private int count;
    private ArrayList<ShallowReference> testResults;

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public ArrayList<ShallowReference> getTestResults() {
        return testResults;
    }

    public void setTestResults(final ArrayList<ShallowReference> testResults) {
        this.testResults = testResults;
    }
}

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

import java.util.List;

/** 
 */
public class TestPlansWithSelection {

    private int lastSelectedPlan;
    private int lastSelectedSuite;
    private List<TestPlan> plans;

    public int getLastSelectedPlan() {
        return lastSelectedPlan;
    }

    public void setLastSelectedPlan(final int lastSelectedPlan) {
        this.lastSelectedPlan = lastSelectedPlan;
    }

    public int getLastSelectedSuite() {
        return lastSelectedSuite;
    }

    public void setLastSelectedSuite(final int lastSelectedSuite) {
        this.lastSelectedSuite = lastSelectedSuite;
    }

    public List<TestPlan> getPlans() {
        return plans;
    }

    public void setPlans(final List<TestPlan> plans) {
        this.plans = plans;
    }
}

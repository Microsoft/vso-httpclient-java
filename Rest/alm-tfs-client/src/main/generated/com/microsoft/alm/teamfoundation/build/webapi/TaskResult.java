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


/** 
 */
public enum TaskResult {

    SUCCEEDED(0),
    SUCCEEDED_WITH_ISSUES(1),
    FAILED(2),
    CANCELED(3),
    SKIPPED(4),
    ABANDONED(5),
    ;

    private int value;

    private TaskResult(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("SUCCEEDED")) { //$NON-NLS-1$
            return "succeeded"; //$NON-NLS-1$
        }

        if (name.equals("SUCCEEDED_WITH_ISSUES")) { //$NON-NLS-1$
            return "succeededWithIssues"; //$NON-NLS-1$
        }

        if (name.equals("FAILED")) { //$NON-NLS-1$
            return "failed"; //$NON-NLS-1$
        }

        if (name.equals("CANCELED")) { //$NON-NLS-1$
            return "canceled"; //$NON-NLS-1$
        }

        if (name.equals("SKIPPED")) { //$NON-NLS-1$
            return "skipped"; //$NON-NLS-1$
        }

        if (name.equals("ABANDONED")) { //$NON-NLS-1$
            return "abandoned"; //$NON-NLS-1$
        }

        return null;
    }
}

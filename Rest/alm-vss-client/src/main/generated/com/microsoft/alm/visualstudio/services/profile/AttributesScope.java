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

package com.microsoft.alm.visualstudio.services.profile;


/** 
 */
public enum AttributesScope {

    CORE(1),
    APPLICATION(2),
    ;

    private int value;

    private AttributesScope(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("CORE")) { //$NON-NLS-1$
            return "core"; //$NON-NLS-1$
        }

        if (name.equals("APPLICATION")) { //$NON-NLS-1$
            return "application"; //$NON-NLS-1$
        }

        return null;
    }
}

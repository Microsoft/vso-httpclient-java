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


/** 
 */
public enum SupportedIdeType {

    UNKNOWN(0),
    VISUAL_STUDIO(1),
    INTELLI_J(2),
    ANDROID_STUDIO(3),
    WEB_STORM(4),
    PHP_STORM(5),
    PY_CHARM(6),
    RUBY_MINE(7),
    C_LION(8),
    DATA_GRIP(9),
    M_P_S(10),
    APP_CODE(11),
    ;

    private int value;

    private SupportedIdeType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNKNOWN")) { //$NON-NLS-1$
            return "unknown"; //$NON-NLS-1$
        }

        if (name.equals("VISUAL_STUDIO")) { //$NON-NLS-1$
            return "visualStudio"; //$NON-NLS-1$
        }

        if (name.equals("INTELLI_J")) { //$NON-NLS-1$
            return "intelliJ"; //$NON-NLS-1$
        }

        if (name.equals("ANDROID_STUDIO")) { //$NON-NLS-1$
            return "androidStudio"; //$NON-NLS-1$
        }

        if (name.equals("WEB_STORM")) { //$NON-NLS-1$
            return "webStorm"; //$NON-NLS-1$
        }

        if (name.equals("PHP_STORM")) { //$NON-NLS-1$
            return "phpStorm"; //$NON-NLS-1$
        }

        if (name.equals("PY_CHARM")) { //$NON-NLS-1$
            return "pyCharm"; //$NON-NLS-1$
        }

        if (name.equals("RUBY_MINE")) { //$NON-NLS-1$
            return "rubyMine"; //$NON-NLS-1$
        }

        if (name.equals("C_LION")) { //$NON-NLS-1$
            return "cLion"; //$NON-NLS-1$
        }

        if (name.equals("DATA_GRIP")) { //$NON-NLS-1$
            return "dataGrip"; //$NON-NLS-1$
        }

        if (name.equals("M_P_S")) { //$NON-NLS-1$
            return "mPS"; //$NON-NLS-1$
        }

        if (name.equals("APP_CODE")) { //$NON-NLS-1$
            return "appCode"; //$NON-NLS-1$
        }

        return null;
    }
}

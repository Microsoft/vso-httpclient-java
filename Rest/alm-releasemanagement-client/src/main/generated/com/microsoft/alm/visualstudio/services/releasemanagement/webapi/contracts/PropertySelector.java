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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.List;

/** 
 */
public class PropertySelector {

    private List<String> properties;
    private PropertySelectorType selectorType;

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(final List<String> properties) {
        this.properties = properties;
    }

    public PropertySelectorType getSelectorType() {
        return selectorType;
    }

    public void setSelectorType(final PropertySelectorType selectorType) {
        this.selectorType = selectorType;
    }
}

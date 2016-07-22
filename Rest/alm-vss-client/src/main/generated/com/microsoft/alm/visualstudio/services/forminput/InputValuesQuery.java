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

package com.microsoft.alm.visualstudio.services.forminput;

import java.util.ArrayList;
import java.util.HashMap;

/** 
 */
public class InputValuesQuery {

    private HashMap<String, String> currentValues;
    /**
    * The input values to return on input, and the result from the consumer on output.
    */
    private ArrayList<InputValues> inputValues;
    /**
    * Subscription containing information about the publisher/consumer and the current input values
    */
    private Object resource;

    public HashMap<String, String> getCurrentValues() {
        return currentValues;
    }

    public void setCurrentValues(final HashMap<String, String> currentValues) {
        this.currentValues = currentValues;
    }

    /**
    * The input values to return on input, and the result from the consumer on output.
    */
    public ArrayList<InputValues> getInputValues() {
        return inputValues;
    }

    /**
    * The input values to return on input, and the result from the consumer on output.
    */
    public void setInputValues(final ArrayList<InputValues> inputValues) {
        this.inputValues = inputValues;
    }

    /**
    * Subscription containing information about the publisher/consumer and the current input values
    */
    public Object getResource() {
        return resource;
    }

    /**
    * Subscription containing information about the publisher/consumer and the current input values
    */
    public void setResource(final Object resource) {
        this.resource = resource;
    }
}

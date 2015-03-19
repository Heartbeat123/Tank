package com.intuit.tank.harness.data;

/*
 * #%L
 * Harness Data
 * %%
 * Copyright (C) 2011 - 2015 Intuit Inc.
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.intuit.tank.harness.data.AssignmentData;
import com.intuit.tank.harness.data.ResponseData;

/**
 * The class <code>ResponseDataTest</code> contains tests for the class <code>{@link ResponseData}</code>.
 * 
 * @generatedBy CodePro at 9/10/14 9:36 AM
 */
public class ResponseDataTest {
    /**
     * Run the String getKey() method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/10/14 9:36 AM
     */
    @Test
    public void testGetKey_1()
            throws Exception {
        ResponseData fixture = new AssignmentData();

        String result = fixture.getKey();

        assertEquals(null, result);
    }

    /**
     * Run the String getValue() method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/10/14 9:36 AM
     */
    @Test
    public void testGetValue_1()
            throws Exception {
        ResponseData fixture = new AssignmentData();

        String result = fixture.getValue();

        assertEquals(null, result);
    }

    /**
     * Run the void setKey(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/10/14 9:36 AM
     */
    @Test
    public void testSetKey_1()
            throws Exception {
        ResponseData fixture = new AssignmentData();
        String key = "";

        fixture.setKey(key);

    }

    /**
     * Run the void setValue(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/10/14 9:36 AM
     */
    @Test
    public void testSetValue_1()
            throws Exception {
        ResponseData fixture = new AssignmentData();
        String value = "";

        fixture.setValue(value);

    }
}
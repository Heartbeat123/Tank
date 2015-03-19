package com.intuit.tank.harness.test;

/*
 * #%L
 * Intuit Tank Agent (apiharness)
 * %%
 * Copyright (C) 2011 - 2015 Intuit Inc.
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */

public class GotoScriptException extends RuntimeException {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;
    private String gotoTarget = "";

    public GotoScriptException(String msg, String gotoTarget) {
        super(msg);
        this.gotoTarget = gotoTarget;
    }

    public String getGotoTarget() {
        return gotoTarget;
    }

}

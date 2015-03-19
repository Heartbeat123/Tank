// CHECKSTYLE:OFF
/**
 * Source code generated by Fluent Builders Generator
 * Do not modify this file
 * See generator home page at: http://code.google.com/p/fluent-builders-generator-eclipse-plugin/
 */

package com.intuit.tank.project;

/*
 * #%L
 * Intuit Tank data model
 * %%
 * Copyright (C) 2011 - 2015 Intuit Inc.
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */

import java.util.Date;

public class PeriodicDataBuilder extends PeriodicDataBuilderBase<PeriodicDataBuilder> {
    public static PeriodicDataBuilder periodicData() {
        return new PeriodicDataBuilder();
    }

    public PeriodicDataBuilder() {
        super(new PeriodicData());
    }

    public PeriodicData build() {
        return getInstance();
    }
}

class PeriodicDataBuilderBase<GeneratorT extends PeriodicDataBuilderBase<GeneratorT>> {
    private PeriodicData instance;

    protected PeriodicDataBuilderBase(PeriodicData aInstance) {
        instance = aInstance;
    }

    protected PeriodicData getInstance() {
        return instance;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withJobId(int aValue) {
        instance.setJobId(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withTimestamp(Date aValue) {
        instance.setTimestamp(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withPeriod(int aValue) {
        instance.setPeriod(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withPageId(String aValue) {
        instance.setPageId(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withSampleSize(int aValue) {
        instance.setSampleSize(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withMean(double aValue) {
        instance.setMean(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withMin(double aValue) {
        instance.setMin(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withMax(double aValue) {
        instance.setMax(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withId(int aValue) {
        instance.setId(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withCreated(Date aValue) {
        instance.setCreated(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withModified(Date aValue) {
        instance.setModified(aValue);

        return (GeneratorT) this;
    }

    @SuppressWarnings("unchecked")
    public GeneratorT withForceCreateDate(Date aValue) {
        instance.setForceCreateDate(aValue);

        return (GeneratorT) this;
    }
}

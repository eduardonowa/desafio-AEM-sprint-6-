/*
 * ***********************************************************************
 * SPA Vue Project CONFIDENTIAL
 * ___________________
 *
 * Copyright 2022 SPA Vue Project.
 * All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property
 * of SPA Vue Project and its suppliers, if any. The intellectual and
 * technical concepts contained herein are proprietary to SPA Vue Project
 * and its suppliers and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from SPA Vue Project.
 * ***********************************************************************
 */

package com.vue.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.osgi.annotation.versioning.ConsumerType;


/**
 * Defines the {@code HomeRed} Sling Model used for the {@code vue/components/home-red} component.
 * 
 */
@ConsumerType
public interface HomeRed
    extends ComponentExporter
{


    @JsonProperty("description")
    String getDescription();

    @JsonProperty("colorDescription")
    String getColorDescription();

    @JsonIgnore
    @JsonProperty("textAlignHeader")
    String getTextAlignHeader();

    @JsonIgnore
    String getFontFamilyDescription();

    @JsonProperty("fontSizeDescription")
    Long getFontSizeDescription();

}

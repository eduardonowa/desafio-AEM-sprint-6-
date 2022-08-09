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

package com.vue.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vue.core.models.HomeRed;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {
    SlingHttpServletRequest.class
}, adapters = {
    HomeRed.class,
    ComponentExporter.class
}, resourceType = "vue/components/home-red")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class HomeRedImpl
    implements HomeRed
{

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String description;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String colorDescription;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textAlignHeader;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyDescription;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeDescription;
    @SlingObject
    private Resource resource;

    @Override
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @Override
    @JsonProperty("colorDescription")
    public String getColorDescription() {
        return colorDescription;
    }

    @Override
    @JsonProperty("textAlignHeader")
    public String getTextAlignHeader() {
        return textAlignHeader;
    }

    @Override
    public String getFontFamilyDescription() {
        return fontFamilyDescription;
    }

    @Override
    @JsonProperty("fontSizeDescription")
    public Long getFontSizeDescription() {
        return fontSizeDescription;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}

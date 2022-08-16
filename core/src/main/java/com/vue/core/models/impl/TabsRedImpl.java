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
import com.vue.core.models.TabsRed;
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
    TabsRed.class,
    ComponentExporter.class
}, resourceType = "vue/components/tabs-red")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class TabsRedImpl
    implements TabsRed
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
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleTextBasic;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeTitleBasic;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyTitleBasic;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleColorBasic;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleTextSocial;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeTitleSocial;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyTitleSocial;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleColorSocial;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleTextCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeTitleCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyTitleCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleColorCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleTextSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeTitleSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyTitleSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleColorSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String backgroundButtonZero;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String msgZero;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelCheckbox;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelFullname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String placeholderFullname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String spanFullname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelNickname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String placeholderNickname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String placeholderCertificates;
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
    @JsonProperty("titleTextBasic")
    public String getTitleTextBasic() {
        return titleTextBasic;
    }

    @Override
    @JsonProperty("fontSizeTitleBasic")
    public Long getFontSizeTitleBasic() {
        return fontSizeTitleBasic;
    }

    @Override
    public String getFontFamilyTitleBasic() {
        return fontFamilyTitleBasic;
    }

    @Override
    @JsonProperty("titleColorBasic")
    public String getTitleColorBasic() {
        return titleColorBasic;
    }

    @Override
    @JsonProperty("titleTextSocial")
    public String getTitleTextSocial() {
        return titleTextSocial;
    }

    @Override
    @JsonProperty("fontSizeTitleSocial")
    public Long getFontSizeTitleSocial() {
        return fontSizeTitleSocial;
    }

    @Override
    public String getFontFamilyTitleSocial() {
        return fontFamilyTitleSocial;
    }

    @Override
    @JsonProperty("titleColorSocial")
    public String getTitleColorSocial() {
        return titleColorSocial;
    }

    @Override
    @JsonProperty("titleTextCertificates")
    public String getTitleTextCertificates() {
        return titleTextCertificates;
    }

    @Override
    @JsonProperty("fontSizeTitleCertificates")
    public Long getFontSizeTitleCertificates() {
        return fontSizeTitleCertificates;
    }

    @Override
    public String getFontFamilyTitleCertificates() {
        return fontFamilyTitleCertificates;
    }

    @Override
    @JsonProperty("titleColorCertificates")
    public String getTitleColorCertificates() {
        return titleColorCertificates;
    }

    @Override
    @JsonProperty("titleTextSuccess")
    public String getTitleTextSuccess() {
        return titleTextSuccess;
    }

    @Override
    @JsonProperty("fontSizeTitleSuccess")
    public Long getFontSizeTitleSuccess() {
        return fontSizeTitleSuccess;
    }

    @Override
    public String getFontFamilyTitleSuccess() {
        return fontFamilyTitleSuccess;
    }

    @Override
    @JsonProperty("titleColorSuccess")
    public String getTitleColorSuccess() {
        return titleColorSuccess;
    }

    @Override
    @JsonProperty("backgroundButtonZero")
    public String getBackgroundButtonZero() {
        return backgroundButtonZero;
    }

    @Override
    @JsonProperty("msgZero")
    public String getMsgZero() {
        return msgZero;
    }

    @Override
    @JsonProperty("labelCheckbox")
    public String getLabelCheckbox() {
        return labelCheckbox;
    }

    @Override
    @JsonProperty("labelFullname")
    public String getLabelFullname() {
        return labelFullname;
    }

    @Override
    @JsonProperty("placeholderFullname")
    public String getPlaceholderFullname() {
        return placeholderFullname;
    }

    @Override
    @JsonProperty("spanFullname")
    public String getSpanFullname() {
        return spanFullname;
    }

    @Override
    @JsonProperty("labelNickname")
    public String getLabelNickname() {
        return labelNickname;
    }

    @Override
    @JsonProperty("placeholderNickname")
    public String getPlaceholderNickname() {
        return placeholderNickname;
    }

    @Override
    @JsonProperty("labelCertificates")
    public String getLabelCertificates() {
        return labelCertificates;
    }

    @Override
    @JsonProperty("placeholderCertificates")
    public String getPlaceholderCertificates() {
        return placeholderCertificates;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}

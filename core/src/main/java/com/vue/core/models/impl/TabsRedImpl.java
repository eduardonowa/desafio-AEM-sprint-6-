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
    private String fontFamilyDescription;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeDescription;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textAlignHeader;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyNav;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String bgColorSpanNav;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textNavColor;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleTextBasic;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeTitleBasic;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyTitleBasic;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleColorBasic;
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
    private String LabelEmail;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String PlaceholderEmail;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String InvalidTextEmail;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String LabelPhone;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelBirthday;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String spanBirthday;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelCheckbox;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String msgZero;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String backgroundButtonZero;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleTextSocial;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeTitleSocial;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyTitleSocial;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleColorSocial;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelLinkedin;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String placeholderLinkedin;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleTextCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeTitleCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyTitleCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleColorCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String placeholderCertificates;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleTextSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeTitleSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyTitleSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleColorSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessFullName;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessFullName;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessFullName;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessNickname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessNickname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessNickname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessEmail;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessEmail;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessEmail;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessPhone;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessPhone;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessPhone;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessBirthday;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessBirthday;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessBirthday;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessAge;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessAge;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessAge;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessLinkedin;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessLinkedin;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessLinkedin;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessGithub;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessGithub;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessGithub;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessTeam;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessTeam;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessTeam;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessInstitution;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessInstitution;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessInstitution;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long textFontSizeSuccessGraduation;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textFontFamilySuccessGraduation;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String textColorSuccessGraduation;
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
    public String getFontFamilyDescription() {
        return fontFamilyDescription;
    }

    @Override
    @JsonProperty("fontSizeDescription")
    public Long getFontSizeDescription() {
        return fontSizeDescription;
    }

    @Override
    @JsonProperty("textAlignHeader")
    public String getTextAlignHeader() {
        return textAlignHeader;
    }

    @Override
    public String getFontFamilyNav() {
        return fontFamilyNav;
    }

    @Override
    @JsonProperty("bgColorSpanNav")
    public String getBgColorSpanNav() {
        return bgColorSpanNav;
    }

    @Override
    @JsonProperty("textNavColor")
    public String getTextNavColor() {
        return textNavColor;
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
    @JsonProperty("LabelEmail")
    public String getLabelEmail() {
        return LabelEmail;
    }

    @Override
    @JsonProperty("PlaceholderEmail")
    public String getPlaceholderEmail() {
        return PlaceholderEmail;
    }

    @Override
    @JsonProperty("InvalidTextEmail")
    public String getInvalidTextEmail() {
        return InvalidTextEmail;
    }

    @Override
    @JsonProperty("LabelPhone")
    public String getLabelPhone() {
        return LabelPhone;
    }

    @Override
    @JsonProperty("labelBirthday")
    public String getLabelBirthday() {
        return labelBirthday;
    }

    @Override
    @JsonProperty("spanBirthday")
    public String getSpanBirthday() {
        return spanBirthday;
    }

    @Override
    @JsonProperty("labelCheckbox")
    public String getLabelCheckbox() {
        return labelCheckbox;
    }

    @Override
    @JsonProperty("msgZero")
    public String getMsgZero() {
        return msgZero;
    }

    @Override
    @JsonProperty("backgroundButtonZero")
    public String getBackgroundButtonZero() {
        return backgroundButtonZero;
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
    @JsonProperty("labelLinkedin")
    public String getLabelLinkedin() {
        return labelLinkedin;
    }

    @Override
    @JsonProperty("placeholderLinkedin")
    public String getPlaceholderLinkedin() {
        return placeholderLinkedin;
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
    @JsonProperty("textFontSizeSuccessFullName")
    public Long getTextFontSizeSuccessFullName() {
        return textFontSizeSuccessFullName;
    }

    @Override
    public String getTextFontFamilySuccessFullName() {
        return textFontFamilySuccessFullName;
    }

    @Override
    @JsonProperty("textColorSuccessFullName")
    public String getTextColorSuccessFullName() {
        return textColorSuccessFullName;
    }

    @Override
    @JsonProperty("textFontSizeSuccessNickname")
    public Long getTextFontSizeSuccessNickname() {
        return textFontSizeSuccessNickname;
    }

    @Override
    public String getTextFontFamilySuccessNickname() {
        return textFontFamilySuccessNickname;
    }

    @Override
    @JsonProperty("textColorSuccessNickname")
    public String getTextColorSuccessNickname() {
        return textColorSuccessNickname;
    }

    @Override
    @JsonProperty("textFontSizeSuccessEmail")
    public Long getTextFontSizeSuccessEmail() {
        return textFontSizeSuccessEmail;
    }

    @Override
    public String getTextFontFamilySuccessEmail() {
        return textFontFamilySuccessEmail;
    }

    @Override
    @JsonProperty("textColorSuccessEmail")
    public String getTextColorSuccessEmail() {
        return textColorSuccessEmail;
    }

    @Override
    @JsonProperty("textFontSizeSuccessPhone")
    public Long getTextFontSizeSuccessPhone() {
        return textFontSizeSuccessPhone;
    }

    @Override
    public String getTextFontFamilySuccessPhone() {
        return textFontFamilySuccessPhone;
    }

    @Override
    @JsonProperty("textColorSuccessPhone")
    public String getTextColorSuccessPhone() {
        return textColorSuccessPhone;
    }

    @Override
    @JsonProperty("textFontSizeSuccessBirthday")
    public Long getTextFontSizeSuccessBirthday() {
        return textFontSizeSuccessBirthday;
    }

    @Override
    public String getTextFontFamilySuccessBirthday() {
        return textFontFamilySuccessBirthday;
    }

    @Override
    @JsonProperty("textColorSuccessBirthday")
    public String getTextColorSuccessBirthday() {
        return textColorSuccessBirthday;
    }

    @Override
    @JsonProperty("textFontSizeSuccessAge")
    public Long getTextFontSizeSuccessAge() {
        return textFontSizeSuccessAge;
    }

    @Override
    public String getTextFontFamilySuccessAge() {
        return textFontFamilySuccessAge;
    }

    @Override
    @JsonProperty("textColorSuccessAge")
    public String getTextColorSuccessAge() {
        return textColorSuccessAge;
    }

    @Override
    @JsonProperty("textFontSizeSuccessLinkedin")
    public Long getTextFontSizeSuccessLinkedin() {
        return textFontSizeSuccessLinkedin;
    }

    @Override
    public String getTextFontFamilySuccessLinkedin() {
        return textFontFamilySuccessLinkedin;
    }

    @Override
    @JsonProperty("textColorSuccessLinkedin")
    public String getTextColorSuccessLinkedin() {
        return textColorSuccessLinkedin;
    }

    @Override
    @JsonProperty("textFontSizeSuccessGithub")
    public Long getTextFontSizeSuccessGithub() {
        return textFontSizeSuccessGithub;
    }

    @Override
    public String getTextFontFamilySuccessGithub() {
        return textFontFamilySuccessGithub;
    }

    @Override
    @JsonProperty("textColorSuccessGithub")
    public String getTextColorSuccessGithub() {
        return textColorSuccessGithub;
    }

    @Override
    @JsonProperty("textFontSizeSuccessTeam")
    public Long getTextFontSizeSuccessTeam() {
        return textFontSizeSuccessTeam;
    }

    @Override
    public String getTextFontFamilySuccessTeam() {
        return textFontFamilySuccessTeam;
    }

    @Override
    @JsonProperty("textColorSuccessTeam")
    public String getTextColorSuccessTeam() {
        return textColorSuccessTeam;
    }

    @Override
    @JsonProperty("textFontSizeSuccessInstitution")
    public Long getTextFontSizeSuccessInstitution() {
        return textFontSizeSuccessInstitution;
    }

    @Override
    public String getTextFontFamilySuccessInstitution() {
        return textFontFamilySuccessInstitution;
    }

    @Override
    @JsonProperty("textColorSuccessInstitution")
    public String getTextColorSuccessInstitution() {
        return textColorSuccessInstitution;
    }

    @Override
    @JsonProperty("textFontSizeSuccessGraduation")
    public Long getTextFontSizeSuccessGraduation() {
        return textFontSizeSuccessGraduation;
    }

    @Override
    public String getTextFontFamilySuccessGraduation() {
        return textFontFamilySuccessGraduation;
    }

    @Override
    @JsonProperty("textColorSuccessGraduation")
    public String getTextColorSuccessGraduation() {
        return textColorSuccessGraduation;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}

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
    private String descriptionCard;
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
    private String placeholderPhone;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String testMask;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelBirthday;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String spanBirthday;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelCheckbox;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String msgZero;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String colorButtonZero;
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
    private String labelGithub;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String placeholderGithub;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String InvalidTextGithub;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String msgZeroS;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String colorButtonZeroS;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String backgroundButtonZeroS;
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
    private String msgTwo;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String colorButtonTwo;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String backgroundButtonTwo;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String msgThree;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String colorButtonThree;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String backgroundButtonThree;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelTeamname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String placeholderTeamname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String spanTeamname;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelInstitution;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String placeholderInstitution;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String spanInstitution;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String labelGraduation;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String placeholderGraduation;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String spanGraduation;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String msgOne;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String colorButtonOne;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String backgroundButtonOne;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleTextSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private Long fontSizeTitleSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilyTitleSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String titleColorSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String subTitleSuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String fontFamilySuccess;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String msgOneS;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String colorButtonOneS;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String backgroundButtonOneS;
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
    @JsonProperty("descriptionCard")
    public String getDescriptionCard() {
        return descriptionCard;
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
    @JsonProperty("placeholderPhone")
    public String getPlaceholderPhone() {
        return placeholderPhone;
    }

    @Override
    @JsonProperty("testMask")
    public String getTestMask() {
        return testMask;
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
    @JsonProperty("colorButtonZero")
    public String getColorButtonZero() {
        return colorButtonZero;
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
    @JsonProperty("labelGithub")
    public String getLabelGithub() {
        return labelGithub;
    }

    @Override
    @JsonProperty("placeholderGithub")
    public String getPlaceholderGithub() {
        return placeholderGithub;
    }

    @Override
    @JsonProperty("InvalidTextGithub")
    public String getInvalidTextGithub() {
        return InvalidTextGithub;
    }

    @Override
    @JsonProperty("msgZeroS")
    public String getMsgZeroS() {
        return msgZeroS;
    }

    @Override
    @JsonProperty("colorButtonZeroS")
    public String getColorButtonZeroS() {
        return colorButtonZeroS;
    }

    @Override
    @JsonProperty("backgroundButtonZeroS")
    public String getBackgroundButtonZeroS() {
        return backgroundButtonZeroS;
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
    @JsonProperty("msgTwo")
    public String getMsgTwo() {
        return msgTwo;
    }

    @Override
    @JsonProperty("colorButtonTwo")
    public String getColorButtonTwo() {
        return colorButtonTwo;
    }

    @Override
    @JsonProperty("backgroundButtonTwo")
    public String getBackgroundButtonTwo() {
        return backgroundButtonTwo;
    }

    @Override
    @JsonProperty("msgThree")
    public String getMsgThree() {
        return msgThree;
    }

    @Override
    @JsonProperty("colorButtonThree")
    public String getColorButtonThree() {
        return colorButtonThree;
    }

    @Override
    @JsonProperty("backgroundButtonThree")
    public String getBackgroundButtonThree() {
        return backgroundButtonThree;
    }

    @Override
    @JsonProperty("labelTeamname")
    public String getLabelTeamname() {
        return labelTeamname;
    }

    @Override
    @JsonProperty("placeholderTeamname")
    public String getPlaceholderTeamname() {
        return placeholderTeamname;
    }

    @Override
    @JsonProperty("spanTeamname")
    public String getSpanTeamname() {
        return spanTeamname;
    }

    @Override
    @JsonProperty("labelInstitution")
    public String getLabelInstitution() {
        return labelInstitution;
    }

    @Override
    @JsonProperty("placeholderInstitution")
    public String getPlaceholderInstitution() {
        return placeholderInstitution;
    }

    @Override
    @JsonProperty("spanInstitution")
    public String getSpanInstitution() {
        return spanInstitution;
    }

    @Override
    @JsonProperty("labelGraduation")
    public String getLabelGraduation() {
        return labelGraduation;
    }

    @Override
    @JsonProperty("placeholderGraduation")
    public String getPlaceholderGraduation() {
        return placeholderGraduation;
    }

    @Override
    @JsonProperty("spanGraduation")
    public String getSpanGraduation() {
        return spanGraduation;
    }

    @Override
    @JsonProperty("msgOne")
    public String getMsgOne() {
        return msgOne;
    }

    @Override
    @JsonProperty("colorButtonOne")
    public String getColorButtonOne() {
        return colorButtonOne;
    }

    @Override
    @JsonProperty("backgroundButtonOne")
    public String getBackgroundButtonOne() {
        return backgroundButtonOne;
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
    @JsonProperty("subTitleSuccess")
    public String getSubTitleSuccess() {
        return subTitleSuccess;
    }

    @Override
    public String getFontFamilySuccess() {
        return fontFamilySuccess;
    }

    @Override
    @JsonProperty("msgOneS")
    public String getMsgOneS() {
        return msgOneS;
    }

    @Override
    @JsonProperty("colorButtonOneS")
    public String getColorButtonOneS() {
        return colorButtonOneS;
    }

    @Override
    @JsonProperty("backgroundButtonOneS")
    public String getBackgroundButtonOneS() {
        return backgroundButtonOneS;
    }

    @Override
    public String getExportedType() {
        return resource.getResourceType();
    }

}

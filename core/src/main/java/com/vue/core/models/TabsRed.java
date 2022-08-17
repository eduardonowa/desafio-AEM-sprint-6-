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
import com.fasterxml.jackson.annotation.JsonProperty;
import org.osgi.annotation.versioning.ConsumerType;


/**
 * Defines the {@code TabsRed} Sling Model used for the {@code vue/components/tabs-red} component.
 * 
 */
@ConsumerType
public interface TabsRed
    extends ComponentExporter
{


    @JsonProperty("description")
    String getDescription();

    @JsonProperty("colorDescription")
    String getColorDescription();

    String getFontFamilyDescription();

    @JsonProperty("fontSizeDescription")
    Long getFontSizeDescription();

    @JsonProperty("textAlignHeader")
    String getTextAlignHeader();

    String getFontFamilyNav();

    @JsonProperty("bgColorSpanNav")
    String getBgColorSpanNav();

    @JsonProperty("textNavColor")
    String getTextNavColor();

    @JsonProperty("titleTextBasic")
    String getTitleTextBasic();

    @JsonProperty("fontSizeTitleBasic")
    Long getFontSizeTitleBasic();

    String getFontFamilyTitleBasic();

    @JsonProperty("titleColorBasic")
    String getTitleColorBasic();

    @JsonProperty("labelFullname")
    String getLabelFullname();

    @JsonProperty("placeholderFullname")
    String getPlaceholderFullname();

    @JsonProperty("spanFullname")
    String getSpanFullname();

    @JsonProperty("labelNickname")
    String getLabelNickname();

    @JsonProperty("placeholderNickname")
    String getPlaceholderNickname();

    @JsonProperty("LabelEmail")
    String getLabelEmail();

    @JsonProperty("PlaceholderEmail")
    String getPlaceholderEmail();

    @JsonProperty("InvalidTextEmail")
    String getInvalidTextEmail();

    @JsonProperty("LabelPhone")
    String getLabelPhone();

    @JsonProperty("labelCheckbox")
    String getLabelCheckbox();

    @JsonProperty("msgZero")
    String getMsgZero();

    @JsonProperty("backgroundButtonZero")
    String getBackgroundButtonZero();

    @JsonProperty("titleTextSocial")
    String getTitleTextSocial();

    @JsonProperty("fontSizeTitleSocial")
    Long getFontSizeTitleSocial();

    String getFontFamilyTitleSocial();

    @JsonProperty("titleColorSocial")
    String getTitleColorSocial();

    @JsonProperty("titleTextCertificates")
    String getTitleTextCertificates();

    @JsonProperty("fontSizeTitleCertificates")
    Long getFontSizeTitleCertificates();

    String getFontFamilyTitleCertificates();

    @JsonProperty("titleColorCertificates")
    String getTitleColorCertificates();

    @JsonProperty("labelCertificates")
    String getLabelCertificates();

    @JsonProperty("placeholderCertificates")
    String getPlaceholderCertificates();

    @JsonProperty("titleTextSuccess")
    String getTitleTextSuccess();

    @JsonProperty("fontSizeTitleSuccess")
    Long getFontSizeTitleSuccess();

    String getFontFamilyTitleSuccess();

    @JsonProperty("titleColorSuccess")
    String getTitleColorSuccess();

    @JsonProperty("textFontSizeSuccessFullName")
    Long getTextFontSizeSuccessFullName();

    String getTextFontFamilySuccessFullName();

    @JsonProperty("textColorSuccessFullName")
    String getTextColorSuccessFullName();

    @JsonProperty("textFontSizeSuccessNickname")
    Long getTextFontSizeSuccessNickname();

    String getTextFontFamilySuccessNickname();

    @JsonProperty("textColorSuccessNickname")
    String getTextColorSuccessNickname();

    @JsonProperty("textFontSizeSuccessEmail")
    Long getTextFontSizeSuccessEmail();

    String getTextFontFamilySuccessEmail();

    @JsonProperty("textColorSuccessEmail")
    String getTextColorSuccessEmail();

    @JsonProperty("textFontSizeSuccessPhone")
    Long getTextFontSizeSuccessPhone();

    String getTextFontFamilySuccessPhone();

    @JsonProperty("textColorSuccessPhone")
    String getTextColorSuccessPhone();

    @JsonProperty("textFontSizeSuccessBirthday")
    Long getTextFontSizeSuccessBirthday();

    String getTextFontFamilySuccessBirthday();

    @JsonProperty("textColorSuccessBirthday")
    String getTextColorSuccessBirthday();

    @JsonProperty("textFontSizeSuccessAge")
    Long getTextFontSizeSuccessAge();

    String getTextFontFamilySuccessAge();

    @JsonProperty("textColorSuccessAge")
    String getTextColorSuccessAge();

    @JsonProperty("textFontSizeSuccessLinkedin")
    Long getTextFontSizeSuccessLinkedin();

    String getTextFontFamilySuccessLinkedin();

    @JsonProperty("textColorSuccessLinkedin")
    String getTextColorSuccessLinkedin();

    @JsonProperty("textFontSizeSuccessGithub")
    Long getTextFontSizeSuccessGithub();

    String getTextFontFamilySuccessGithub();

    @JsonProperty("textColorSuccessGithub")
    String getTextColorSuccessGithub();

    @JsonProperty("textFontSizeSuccessTeam")
    Long getTextFontSizeSuccessTeam();

    String getTextFontFamilySuccessTeam();

    @JsonProperty("textColorSuccessTeam")
    String getTextColorSuccessTeam();

    @JsonProperty("textFontSizeSuccessInstitution")
    Long getTextFontSizeSuccessInstitution();

    String getTextFontFamilySuccessInstitution();

    @JsonProperty("textColorSuccessInstitution")
    String getTextColorSuccessInstitution();

    @JsonProperty("textFontSizeSuccessGraduation")
    Long getTextFontSizeSuccessGraduation();

    String getTextFontFamilySuccessGraduation();

    @JsonProperty("textColorSuccessGraduation")
    String getTextColorSuccessGraduation();

}

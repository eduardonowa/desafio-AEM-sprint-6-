<template>
  <div>
    <Header
      role="banner"
      :description="description"
      :colorDescription="colorDescription"
      :textAlignHeader="textAlignHeader"
      :fontFamilyDescription="fontFamilyDescription"
      :fontSizeDescription="fontSizeDescription"
      :titleTextBasic="titleTextBasic"
      :fontSizeTitleBasic="fontSizeTitleBasic"
      :fontFamilyTitleBasic="fontFamilyTitleBasic"
      :titleColorBasic="titleColorBasic"
      :titleTextSocial="titleTextSocial"
      :fontSizeTitleSocial="fontSizeTitleSocial"
      :fontFamilyTitleSocial="fontFamilyTitleSocial"
      :titleColorSocial="titleColorSocial"
      :titleTextCertificates="titleTextCertificates"
      :fontSizeTitleCertificates="fontSizeTitleCertificates"
      :fontFamilyTitleCertificates="fontFamilyTitleCertificates"
      :titleColorCertificates="titleColorCertificates"
      :titleTextSuccess="titleTextSuccess"
      :fontSizeTitleSuccess="fontSizeTitleSuccess"
      :fontFamilyTitleSuccess="fontFamilyTitleSuccess"
      :titleColorSuccess="titleColorSuccess"
    />
    <div class="card">
      <template v-if="actualTab !== 'success'">
        <h2 class="teamSign">{{descriptionCard}}</h2>
        <MenuComponent
          :bgColorSpanNav="bgColorSpanNav"
          :fontFamilyNav="fontFamilyNav"
        />

        <template v-if="getActualTab === 'basic'">
          <Basic
            :msgZero="msgZero"
            :colorButtonZero="colorButtonZero"
            :backgroundButtonZero="backgroundButtonZero"
            :labelFullname="labelFullname"
            :placeholderFullname="placeholderFullname"
            :spanFullname="spanFullname"
            :labelCheckbox="labelCheckbox"
            :labelNickname="labelNickname"
            :placeholderNickname="placeholderNickname"
            :PlaceholderEmail="PlaceholderEmail"
            :InvalidTextEmail="InvalidTextEmail"
            :LabelEmail="LabelEmail"
            :LabelPhone="LabelPhone"
            :testMask="testMask"
            :labelBirthday="labelBirthday"
            :spanBirthday="spanBirthday"
            :placeholderPhone="placeholderPhone"

          />
        </template>

        <template v-else-if="getActualTab === 'social'">
          <Social
            :msgZero="msgZeroS"
            :colorButtonZero="colorButtonZeroS"
            :backgroundButtonZero="backgroundButtonZeroS"
            :placeholderLinkedin="placeholderLinkedin"
            :labelLinkedin="labelLinkedin"
            :labelGithub="labelGithub"
            :placeholderGithub="placeholderGithub"
            :InvalidTextGithub="InvalidTextGithub"
          />
        </template>

        <template v-else-if="getActualTab === 'certificates'">
          <Certificates
            :msgOne="msgOne"
            :msgTwo="msgTwo"
            :msgThree="msgThree"
            :colorButtonOne="colorButtonOne"
            :backgroundButtonOne="backgroundButtonOne"
            :colorButtonTwo="colorButtonTwo"
            :backgroundButtonTwo="backgroundButtonTwo"
            :colorButtonThree="colorButtonThree"
            :backgroundButtonThree="backgroundButtonThree"
            :labelCertificates="labelCertificates"
            :placeholderCertificates="placeholderCertificates"
            :labelGraduation="labelGraduation"
            :spanGraduation="spanGraduation"
            :placeholderGraduation="placeholderGraduation"
            :labelInstitution="labelInstitution"
            :spanInstitution="spanInstitution"
            :placeholderInstitution="placeholderInstitution"
            :labelTeamname="labelTeamname"
            :spanTeamname="spanTeamname"
            :placeholderTeamname="placeholderTeamname"
            :dropdownBgColor = "dropdownBgColor"
          />
        </template>
      </template>

      <template v-else-if="getActualTab === 'success'">
        <Success
          :msgOne="msgOneS"
          :colorButtonOne="colorButtonOneS"
          :backgroundButtonOne="backgroundButtonOneS"
          :fontFamilySuccess="fontFamilySuccess"
          :subTitleSuccess="subTitleSuccess"
        />
      </template>
    </div>
  </div>
</template>

<script>
import MenuComponent from '@/components/Menu/Menu.vue'
import { mapActions } from 'vuex'
import Social from '@/components/containers/Tabs/Social/Social.vue'
import Basic from '@/components/containers/Tabs/Basic/Basic.vue'
import Certificates from '@/components/containers/Tabs/Certificates/Certificates.vue'
import Success from '@/components/containers/Tabs/Success/Success.vue'
import Header from '@/components/containers/Header/Header.vue'

export default {
  // eslint-disable-next-line
  name: 'Tabs',
  components: { MenuComponent, Social, Basic, Certificates, Success, Header },
  props: {
    dropdownBgColor: String,
    descriptionCard: {
      type: String,
      default: 'Team Sign Up'
    },
    placeholderPhone: String,
    placeholderTeamname: String,
    spanTeamname: String,
    labelTeamname: String,
    testMask: String,
    subTitleSuccess: String,
    fontFamilySuccess: String,
    textNavColor: String,
    fontFamilyNav: String,
    bgColorSpanNav: String,
    labelNickname: String,
    placeholderNickname: String,
    spanFullname: String,
    msgZeroS: String,
    colorButtonZeroS: String,
    backgroundButtonZeroS: String,
    msgOneS: String,
    colorButtonOneS: String,
    backgroundButtonOneS: String,
    labelFullname: String,
    placeholderFullname: String,
    placeholderCertificates: String,
    labelCertificates: String,
    PlaceholderEmail: String,
    InvalidTextEmail: String,
    LabelEmail: String,
    LabelPhone: String,
    description: String,
    labelBirthday: String,
    spanBirthday: String,
    placeholderLinkedin: String,
    labelLinkedin: String,
    labelGithub: String,
    placeholderGithub: String,
    InvalidTextGithub: String,
    labelGraduation: String,
    spanGraduation: String,
    placeholderGraduation: String,
    labelInstitution: String,
    spanInstitution: String,
    placeholderInstitution: String,

    colorDescription: {
      type: String
    },
    textAlignHeader: {
      type: String
    },
    fontFamilyDescription: {
      type: String
    },
    fontSizeDescription: {
      type: Number
    },
    titleTextBasic: {
      type: String
    },
    titleColorBasic: {
      type: String
    },
    fontFamilyTitleBasic: {
      type: String
    },
    fontSizeTitleBasic: {
      type: Number
    },
    titleTextSocial: {
      type: String
    },
    titleColorSocial: {
      type: String
    },
    fontFamilyTitleSocial: {
      type: String
    },
    fontSizeTitleSocial: {
      type: Number
    },
    titleTextCertificates: {
      type: String
    },
    titleColorCertificates: {
      type: String
    },
    fontFamilyTitleCertificates: {
      type: String
    },
    fontSizeTitleCertificates: {
      type: Number
    },
    titleTextSuccess: {
      type: String
    },
    titleColorSuccess: {
      type: String
    },
    fontFamilyTitleSuccess: {
      type: String
    },
    fontSizeTitleSuccess: {
      type: Number
    },
    colorButtonZero: {
      type: String
    },
    backgroundButtonZero: {
      type: String
    },
    colorButtonOne: {
      type: String
    },
    backgroundButtonOne: {
      type: String
    },
    colorButtonTwo: {
      type: String
    },
    backgroundButtonTwo: {
      type: String
    },
    colorButtonThree: {
      type: String
    },
    backgroundButtonThree: {
      type: String
    },
    msgZero: {
      type: String
    },
    msgOne: {
      type: String
    },
    msgTwo: {
      type: String
    },
    msgThree: {
      type: String
    },
    labelCheckbox: {
      type: String,
      default: 'terms'
    }
  },
  data () {
    return {
      actualTab: this.$store.state.actualTab
    }
  },
  beforeUpdate () {
    this.actualTab = this.$store.state.actualTab
  },
  computed: {
    getActualTab () {
      return this.$store.state.actualTab
    }
  },
  methods: {
    ...mapActions(['nextTab'])
  }
}
</script>

<style lang="scss" scoped>
@import './Tabs.scss';
</style>

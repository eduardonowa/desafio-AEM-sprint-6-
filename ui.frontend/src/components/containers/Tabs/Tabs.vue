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
        <h2 class="teamSign">Team Sign Up</h2>
        <MenuComponent
          :bgColorSpanNav="bgColorSpanNav"
          :fontFamilyNav="fontFamilyNav"
          :textNavColor="textNavColor"
        />

        <template v-if="getActualTab === 'basic'">
          <Basic
            :msgZero="msgZero"
            :colorButtonZero="colorButtonZero"
            :fontFamilyButtonZero="fontFamilyButtonZero"
            :formatButtonFontSizeZero="formatButtonFontSizeZero"
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

          />
        </template>

        <template v-else-if="getActualTab === 'social'">
          <Social
            :msgZero="msgZero"
            :colorButtonZero="colorButtonZero"
            :fontFamilyButtonZero="fontFamilyButtonZero"
            :formatButtonFontSizeZero="formatButtonFontSizeZero"
            :backgroundButtonZero="backgroundButtonZero"
            :placeholderLinkedin="placeholderLinkedin"
            :labelLinkedin="labelLinkedin"
          />
        </template>

        <template v-else-if="getActualTab === 'certificates'">
          <Certificates
            :msgOne="msgOne"
            :msgTwo="msgTwo"
            :msgThree="msgThree"
            :colorButtonOne="colorButtonOne"
            :fontFamilyButtonOne="fontFamilyButtonOne"
            :formatButtonFontSizeOne="formatButtonFontSizeOne"
            :backgroundButtonOne="backgroundButtonOne"
            :colorButtonTwo="colorButtonTwo"
            :fontFamilyButtonTwo="fontFamilyButtonTwo"
            :formatButtonFontSizeTwo="formatButtonFontSizeTwo"
            :backgroundButtonTwo="backgroundButtonTwo"
            :colorButtonThree="colorButtonThree"
            :fontFamilyButtonThree="fontFamilyButtonThree"
            :formatButtonFontSizeThree="formatButtonFontSizeThree"
            :backgroundButtonThree="backgroundButtonThree"
            :labelCertificates="labelCertificates"
            :placeholderCertificates="placeholderCertificates"
          />
        </template>
      </template>

      <template v-else-if="getActualTab === 'success'">
        <Success
          :msgOne="msgOne"
          :colorButtonOne="colorButtonOne"
          :fontFamilyButtonOne="fontFamilyButtonOne"
          :formatButtonFontSizeOne="formatButtonFontSizeOne"
          :backgroundButtonOne="backgroundButtonOne"
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
    testMask: String,
    placeholderPhone: String,
    subTitleSuccess: String,
    fontFamilySuccess: String,
    textNavColor: String,
    fontFamilyNav: String,
    bgColorSpanNav: String,
    labelNickname: String,
    placeholderNickname: String,
    spanFullname: String,
    labelFullname: {
      type: String,
      default: 'default'
    },
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
      type: String
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
      type: String
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
      type: String
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
      type: String
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
      type: String
    },
    colorButtonZero: {
      type: String
    },
    fontFamilyButtonZero: {
      type: String
    },
    formatButtonFontSizeZero: {
      type: String
    },
    backgroundButtonZero: {
      type: String
    },
    colorButtonOne: {
      type: String
    },
    fontFamilyButtonOne: {
      type: String
    },
    formatButtonFontSizeOne: {
      type: String
    },
    backgroundButtonOne: {
      type: String
    },
    colorButtonTwo: {
      type: String
    },
    fontFamilyButtonTwo: {
      type: String
    },
    formatButtonFontSizeTwo: {
      type: String
    },
    backgroundButtonTwo: {
      type: String
    },
    colorButtonThree: {
      type: String
    },
    fontFamilyButtonThree: {
      type: String
    },
    formatButtonFontSizeThree: {
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

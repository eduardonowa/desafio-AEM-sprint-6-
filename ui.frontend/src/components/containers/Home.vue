<template>
  <div id="homeContainer">
    <Header
      :description="description"
      :colorDescription="colorDescription"
      :textAlignHeader="textAlignHeader"
      :fontFamilyDescription="fontFamilyDescription"
      :fontSizeDescription="fontSizeDescription"
    />
    <Tabs :msgZero="msgZero" :msgOne="msgOne" :msgTwo="msgTwo" :msgThree="msgThree" :colorButtonZero="colorButtonZero" :fontFamilyButtonZero="fontFamilyButtonZero" :formatButtonFontSizeZero="formatButtonFontSizeZero" :backgroundButtonZero="backgroundButtonZero" :colorButtonOne="colorButtonOne" :fontFamilyButtonOne="fontFamilyButtonOne" :formatButtonFontSizeOne="formatButtonFontSizeOne" :backgroundButtonOne="backgroundButtonOne" :colorButtonTwo="colorButtonTwo" :fontFamilyButtonTwo="fontFamilyButtonTwo" :formatButtonFontSizeTwo="formatButtonFontSizeTwo" :backgroundButtonTwo="backgroundButtonTwo" :colorButtonThree="colorButtonThree" :fontFamilyButtonThree="fontFamilyButtonThree" :formatButtonFontSizeThree="formatButtonFontSizeThree" :backgroundButtonThree="backgroundButtonThree" />
  </div>
</template>

<script>
import Header from './Header/Header.vue'
import Tabs from './Tabs/Tabs.vue'

export default {
  name: 'Home',
  components: {
    Header,
    Tabs
  },
  props: {
    description: {
      type: String,
      default: 'Forms'
    },
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
    }
  }
}
</script>

<style lang="scss">
@import './Home.scss';
</style>

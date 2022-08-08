<template>
  <div id="homeContainer">
    <Header
      :description="description"
      :colorDescription="colorDescription"
      :textAlignHeader="textAlignHeader"
      :fontFamilyDescription="fontFamilyDescription"
      :fontSizeDescription="fontSizeDescription"
    />
    <Tabs />
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
    }
  }
}
</script>

<style lang="scss">
@import './Home.scss';
</style>

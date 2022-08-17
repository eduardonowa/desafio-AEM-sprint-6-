<template>
  <div class="containerTitle">
    <h1 class="title" :style="{ 'color': titleColor , 'font-family': fontFamilyTitle , 'font-size': formatTitleFontSize}">{{ titleText }}</h1>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line
  name: 'Title',
  props: {
    titleText: {
      type: String
    },
    titleColor: {
      type: String
    },
    fontFamilyTitle: {
      type: String
    },
    fontSizeTitle: {
      type: Number
    }
  },
  computed: {
    formatTitleFontSize () {
      return (this.fontSizeTitle / 16) + 'em'
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Title.scss';
</style>

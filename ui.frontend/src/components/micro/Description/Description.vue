<template>
  <h3
    :style="{
      'color': colorDescription,
      'font-family': fontFamilyDescription,
      'font-size': formatDescriptionFontSize
    }"
    id="description"
  >
    {{ description }}
  </h3>
</template>

<script>
export default {
  name: 'Description',
  props: {
    description: {
      type: String,
      default: 'Forms'
    },
    colorDescription: {
      type: String
    },
    fontFamilyDescription: {
      type: String,
      default: 'Inter'
    },
    fontSizeDescription: {
      type: Number
    }
  },
  computed: {
    formatDescriptionFontSize () {
      return (this.fontSizeDescription / 16) + 'em'
    }
  }
}
</script>

<style lang="scss">
@import './Description.scss';
</style>

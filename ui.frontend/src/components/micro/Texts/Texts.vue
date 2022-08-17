<template>
  <div class="text-container">
    <p :style="{ 'color': textColor , 'font-family': textFontFamily , 'font-size': textFontSize}">{{ description }} {{ text }}</p>
  </div>
</template>

<script>
export default {
  name: 'Texts',
  props: {
    description: {
      type: String
    },
    text: {
      type: String
    },
    textColor: {
      type: String
    },
    textFontFamily: {
      type: String
    },
    textFontSize: {
      type: String
    }
  }
}
</script>

<style lang="scss" scooped>
@import "./Texts.scss";
</style>

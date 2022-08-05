<template>
  <div class="text-container">
    <p>{{ description }} {{ text }}</p>
  </div>
</template>

<script>
export default {
  name: 'Texts',
  props: {
    description: String,
    text: String
  }
}
</script>

<style lang="scss" scooped>
@import "./Texts.scss";
</style>

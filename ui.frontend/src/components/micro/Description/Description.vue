<template>
    <h3 id="description">{{ description }}</h3>
</template>

<script>
export default {
  name: 'Description',
  props: {
    description: {
      type: String,
      default: ''
    }
  }
}
</script>

<style scoped lang="scss">
@import "./Description.scss";
</style>

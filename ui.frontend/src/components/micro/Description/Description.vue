<template>
    <h3 :style="{'color': colorDescription}" id="description">{{ description }}</h3>
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
    }

  }
}
</script>

<style scoped lang="scss">
@import "./Description.scss";
</style>

<template>
  <div id="homeContainer">
  <Header />
  <Tabs />
  </div>
</template>

<script>
import Header from './Header/Header.vue'
import Tabs from './Tabs/Tabs.vue'

export default {
  name: 'Home',
  components: {
    Header, Tabs
  }
}
</script>

<style lang="scss">
@import "./Home.scss";
</style>

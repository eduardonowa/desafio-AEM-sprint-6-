<template>
  <div id="homeContainer" :style="{ background: bgHome }">
    <Header :description="description" :colorDescription="colorDescription" />
    <Tabs 
    
    />
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
    bgHome: {
      type: String,
      default: 'white'
    },
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

<style lang="scss">
@import './Home.scss';
</style>

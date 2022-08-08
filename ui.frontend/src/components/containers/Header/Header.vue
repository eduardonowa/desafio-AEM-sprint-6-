<template>
  <div id="headerContainer">
    <Description :description="description" :colorDescription="colorDescription" />
    <div>
      <Title
        v-if="this.$store.state.actualTab === 'basic'"
        :tabNumber="tabNumberBasic"
      />
      <Title
        v-else-if="this.$store.state.actualTab === 'social'"
        :tabNumber="tabNumberSocial"
      />
      <Title
        v-else-if="this.$store.state.actualTab === 'certificates'"
        :tabNumber="tabNumberCertificates"
      />
      <Title
        v-else-if="this.$store.state.actualTab === 'success'"
        :tabNumber="tabNumberSuccess"
      />
    </div>
  </div>
</template>

<script>
import Title from '@/components/micro/Title/Title.vue'
import Description from '@/components/micro/Description/Description.vue'
export default {
  name: 'Header',
  components: {
    Title,
    Description
  },
  props: {
    tabNumberBasic: {
      type: String,
      default: 'First'
    },
    tabNumberSocial: {
      type: String,
      default: 'Second'
    },
    tabNumberCertificates: {
      type: String,
      default: 'Third'
    },
    tabNumberSuccess: {
      type: String,
      default: 'Success'
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

<style lang="scss" scooped>
@import './Header.scss';
</style>

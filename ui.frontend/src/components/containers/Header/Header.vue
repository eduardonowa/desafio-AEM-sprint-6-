<template>
  <div id="headerContainer" :style="{ 'align-items': textAlignHeader }">
    <Description
      :description="description"
      :colorDescription="colorDescription"
      :fontFamilyDescription="fontFamilyDescription"
      :fontSizeDescription="fontSizeDescription"
    />
    <div>
      <Title
        v-if="this.$store.state.actualTab === 'basic'"
        :titleText="titleTextBasic"
      />
      <Title
        v-else-if="this.$store.state.actualTab === 'social'"
        :titleText="titleTextSocial"
      />
      <Title
        v-else-if="this.$store.state.actualTab === 'certificates'"
        :titleText="titleTextCertificates"
      />
      <Title
        v-else-if="this.$store.state.actualTab === 'success'"
        :titleText="titleTextSuccess"
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
    titleTextBasic: {
      type: String,
      default: 'First'
    },
    titleTextSocial: {
      type: String,
      default: 'Second'
    },
    titleTextCertificates: {
      type: String,
      default: 'Third'
    },
    titleTextSuccess: {
      type: String,
      default: 'Success'
    },
    description: {
      type: String,
      default: 'Forms'
    },
    colorDescription: {
      type: String
    },
    fontFamilyDescription: {
      type: String
    },
    fontSizeDescription: {
      type: String
    },
    textAlignHeader: {
      type: String
    }
  }
}
</script>

<style lang="scss" scooped>
@import './Header.scss';
</style>

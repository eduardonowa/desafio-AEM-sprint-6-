<template>
  <div id="headerContainer" :style="{ 'align-items': textAlignHeader }">
    <Description
      :description="description"
      :colorDescription="colorDescription"
      :fontSizeDescription="fontSizeDescription"
      :fontFamilyDescription="fontFamilyDescription"
    />
    <div>
      <Title
        v-if="this.$store.state.actualTab === 'basic'"
        :titleText="titleTextBasic"
        :fontSizeTitle="fontSizeTitleBasic"
        :fontFamilyTitle="fontFamilyTitleBasic"
        :titleColor="titleColorBasic"
      />
      <Title
        v-else-if="this.$store.state.actualTab === 'social'"
        :titleText="titleTextSocial"
        :fontSizeTitle="fontSizeTitleSocial"
        :fontFamilyTitle="fontFamilyTitleSocial"
        :titleColor="titleColorSocial"
      />
      <Title
        v-else-if="this.$store.state.actualTab === 'certificates'"
        :titleText="titleTextCertificates"
        :fontSizeTitle="fontSizeTitleCertificates"
        :fontFamilyTitle="fontFamilyTitleCertificates"
        :titleColor="titleColorCertificates"
      />
      <Title
        v-else-if="this.$store.state.actualTab === 'success'"
        :titleText="titleTextSuccess"
        :fontSizeTitle="fontSizeTitleSuccess"
        :fontFamilyTitle="fontFamilyTitleSuccess"
        :titleColor="titleColorSuccess"
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
      default: 'First Tab'
    },
    titleTextSocial: {
      type: String,
      default: 'Second Tab'
    },
    titleTextCertificates: {
      type: String,
      default: 'Third Tab'
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
    },
    titleColorBasic: {
      type: String
    },
    fontFamilyTitleBasic: {
      type: String
    },
    fontSizeTitleBasic: {
      type: String
    },
    titleColorSocial: {
      type: String
    },
    fontFamilyTitleSocial: {
      type: String
    },
    fontSizeTitleSocial: {
      type: String
    },
    titleColorCertificates: {
      type: String
    },
    fontFamilyTitleCertificates: {
      type: String
    },
    fontSizeTitleCertificates: {
      type: String
    },
    titleColorSucess: {
      type: String
    },
    fontFamilyTitleSucess: {
      type: String
    },
    fontSizeTitleSucess: {
      type: String
    }
  }
}
</script>

<style lang="scss" scooped>
@import './Header.scss';
</style>

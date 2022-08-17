<template>
  <div id="headerContainer" :style="style">
    <Description :Text="descriptionText" :style="styleDescription" />
    <div>
      <Title :Text="titleText" :style="styleTitle" />
    </div>
  </div>
</template>

<script>
import './header.css'
import Description from '../Description/Description.vue'
import Title from '../Title/Title.vue'
export default {
  name: 'Header',
  components: {
    Title,
    Description
  },
  props: {
    descriptionText: {
      type: String,
      default: 'description'
    },
    titleText: {
      type: String,
      default: 'title'
    },
    fontFamily: {
      type: String,
      default: 'Inter',
      authenticator: function (value) {
        return ['Inter', 'Arial', 'Nunito'].indexOf(value) !== -1
      }
    },
    fontSizeTitle: {
      type: String
    },
    fontSizeDescription: {
      type: String
    },
    backgroundColor: {
      type: String
    },
    borderColor:String,
    borderWidth:String
  },

  computed: {
    style () {
      return {
        backgroundColor: this.backgroundColor,
        borderColor: this.borderColor,
        borderWidth: this.borderWidth + 'px'
      }
    },
    styleTitle () {
      return {
        fontSize: this.fontSizeTitle / 16 + 'em'
      }
    },
    styleDescription () {
      return {
        fontSize: this.fontSizeDescription / 16 + 'em'
      }
    }
  }
}
</script>

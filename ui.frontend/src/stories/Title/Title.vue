<template>
  <div class="containerTitle">
    <h1 class="title" :style="style">{{ Text }}</h1>
  </div>
</template>

<script>
import './title.css'
export default {
  // eslint-disable-next-line
  name: 'Title',
  props: {
    Text: {
      type: String,
      required: true,
      default: 'Text'
    },
    fontFamily: {
      type: String,
      default: 'Inter',
      authenticator: function (value) {
        return ['Inter', 'Arial', 'Nunito'].indexOf(value) !== -1
      }
    },
    color: {
      type: String
    },
    fontSize: {
      type: String
    }
  },
  computed: {
    style () {
      return {
        color: this.color,
        fontFamily: this.fontFamily,
        fontSize: this.fontSize / 16 + 'em'
      }
    }
  }
}
</script>

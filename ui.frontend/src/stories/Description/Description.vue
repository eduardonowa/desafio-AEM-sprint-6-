<template>
  <h3 :style="style" id="description">
    {{ Text }}
  </h3>
</template>

<script>
import './description.css'
export default {
  name: 'Description',

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

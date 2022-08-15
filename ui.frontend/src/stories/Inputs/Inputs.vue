<template>
  <div :style="style">
    <label :style="labelStyle" id="labelStory">{{ labelInput }} </label>
    <span id="spanStory" v-if="showSpan">{{ invalidText }}</span>
    <input
      :style="inputStyle"
      :type="type"
      :placeholder="placeholder"
      id="inputStory"
      @change="teste"
    />
  </div>
</template>

<script>
import './inputs.css'
import {} from 'jquery-mask-plugin'
export default {
  // eslint-disable-next-line
  name: 'Inputs',
  props: {
    labelInput: {
      type: String,
      required: true,
      default: 'Default Label'
    },
    invalidText: {
      type: String,
      default: 'Default Span'
    },
    color: {
      type: String
    },
    fontFamily: {
      type: String,
      default: 'Inter',
      authenticator: function (value) {
        return ['Inter', 'Arial', 'Nunito'].indexOf(value) !== -1
      }
    },
    fontSize: {
      type: String
    },
    showSpan: {
      type: Boolean,
      default: true
    },
    type: {
      type: String,
      default: 'text',
      authenticator: function (value) {
        return (
          ['text', 'date', 'email', 'tel'].indexOf(value) !== -1
        )
      }
    },
    placeholder: {
      type: String,
      default: 'placeholder'
    },
    borderColor: {
      type: String
    },
    labelColor: {
      type: String
    }
  },
  methods: {
    teste () {
      console.log('testee')
    }
  },
  computed: {
    style () {
      return {
        color: this.color,
        fontFamily: this.fontFamily,
        fontSize: this.fontSize / 16 + 'em'
      }
    },
    labelStyle () {
      return {
        color: this.labelColor
      }
    },
    inputStyle () {
      return {
        borderColor: this.borderColor
      }
    }
  }
}
</script>

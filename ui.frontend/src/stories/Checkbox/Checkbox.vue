<template>
  <div id="box-terms" :style="style">
    <label class="terms">
      <input type="checkbox" name="terms" class="chk" id="checkbox" required />
      <span class="geekmark"></span>
      <label class="label-text" :style="styleFont">{{ label }}</label>
    </label>
    <small
      id="chkError"
      class="classSpan"
      v-show="showSpan"
      :style="styleFont"
      >{{ spanText }}</small
    >
  </div>
</template>

<script>
import './checkbox.css'
export default {
  name: 'Checkbox',

  props: {
    label: {
      type: String,
      required: true,
      default: 'I accept the terms and privacy'
    },
    fontFamily: {
      type: String,
      default: 'Inter',
      authenticator: function (value) {
        return ['Inter', 'Arial', 'Nunito'].indexOf(value) !== -1
      }
    },
    showSpan: {
      type: Boolean,
      default: true
    },
    spanText: {
      type: String,
      default: 'Please confirm the terms'
    },
    fontSize: {
      type: String
    }
  },
  computed: {
    styleFont() {
      return {
        fontFamily: this.fontFamily
      }
    },

    style() {
      return {
        fontSize: this.fontSize / 16 + 'em'
      }
    }
  }
}
</script>

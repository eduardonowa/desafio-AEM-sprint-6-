<template>
  <div class="button-container">
    <button
      class="classButton"
      v-if="type === '0'"
      id="button0"
      @click.prevent="onClick"
      :style="style"
    >
      {{ Text }}
      <img class="img0" src="../assets/next.png" alt="next image" />
    </button>
    <button
      class="classButton"
      v-else-if="type === '1'"
      id="button1"
      @click.prevent="onClick"
      :style="style"
    >
      <img src="../assets/check.png" class="img1" alt="check image" />{{ Text }}
    </button>
    <button
      class="classButton"
      v-else-if="type === '2'"
      id="button2"
      @click.prevent="onClick"
      :style="style"
    >
      <img src="../assets/plus.png" class="img2" alt="plus image" />{{ Text }}
      <img src="../assets/next.png" class="img0" alt="next image" />
    </button>
    <button
      class="classButton"
      v-else-if="type === '3'"
      id="button2"
      @click.prevent="onClick"
      :style="style"
    >
      {{ Text }}
      <img src="../assets/vector.png" class="img0" alt="vector image" />
    </button>
  </div>
</template>

<script>
import './buttons.css'
export default {
  // eslint-disable-next-line
  name: 'Buttons',
  props: {
    type: {
      type: String,
      default: '0',
      authenticator: function (value) {
        return ['0', '1', '2', '3', '4'].indexOf(value) !== -1
      }
    },
    Text: {
      type: String,
      required: true,
      default: 'Text'
    },
    color: {
      type: String
    },
    backgroundColor: {
      type: String
    },
    width: {
      type: String
    },
    height: {
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
      type:String
    }
  },
  methods: {
    onClick() {
      this.$emit('onClick')
    }
  },
  computed: {
    style() {
      return {
        color: this.color,
        backgroundColor: this.backgroundColor,
        fontFamily: this.fontFamily,
        width: (this.width / 16) + 'em',
        height: (this.height / 16) + 'em',
        fontSize: (this.fontSize/16) + 'em'
      }
    }
  }
}
</script>

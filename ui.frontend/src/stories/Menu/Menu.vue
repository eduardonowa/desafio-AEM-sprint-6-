<template>
  <nav class="menu" :style="style">
    <div class="menu-tab" v-for="(tab, i) in menuTabs" :key="i">
      <button
        v-if="i === 0"
        :class="tab + ' focus'"
        @click="loadTab(tab)"
        :style="styleButton"
      >
        {{ capitalize(tab) }}
      </button>
      <button v-else :class="tab" @click="loadTab(tab)" :style="styleButton">
        {{ capitalize(tab) }}
      </button>
      <span :style="styleSpan" class="focus-border"></span>
    </div>
  </nav>
</template>

<script>
import './menu.css'
import $ from 'jquery'
import {} from 'jquery-mask-plugin'
export default {
  // eslint-disable-next-line
  name: 'Menu',
  props: {
    menuTabs: {
      type: Array,
      default: ['basic', 'social', 'certificates']
    },
    abledTabs: {
      type: Array,
      default: ['basic', 'social', 'certificates']
    },
    color: {
      type: String
    },
    borderColor: {
      type: String
    },
    spanColor: {
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
    }
  },
  methods: {
    focused(className) {
      this.abledTabs.forEach((tab) => {
        const el = document.querySelector(`.${tab.toLowerCase()}`)
        el.classList.remove('focus')
      })
      const el = document.querySelector(`.${className}`)
      el.classList.add('focus')
    },
    loadTab(tab) {
      this.focused(tab)
    },
    capitalize(word) {
      const letters = word.split('')
      const first = letters.shift()
      letters.unshift(first.toUpperCase())
      return letters.join('')
    }
  },
  computed: {
    style() {
      return {
        fontSize: this.fontSize / 16 + 'em'
      }
    },
    styleButton() {
      return {
        fontFamily: this.fontFamily,
        color: this.color,
        borderColor:this.borderColor
      }
    },
    styleSpan() {
      return {
        backgroundColor: this.spanColor
      }
    },
  }
}
</script>

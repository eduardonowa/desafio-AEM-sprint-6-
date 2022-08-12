<template>
  <div class="button-container">
    <button
      class="classButton"
      v-if="type === '0'"
      id="button0"
      @click.prevent="event"
      :style="{
      'color': colorButtonZero,
      'font-family': fontFamilyButtonZero,
      'font-size': formatButtonFontSizeZero,
      'background': backgroundButtonZero
    }"
    >
      {{ msgZero }} <img class="img0" src="/content/dam/vue/next.png" alt="next image" />
    </button>
    <button
      class="classButton"
      v-else-if="type === '1'"
      id="button1"
      @click.prevent="event"
      :style="{
      'color': colorButtonOne,
      'font-family': fontFamilyButtonOne,
      'font-size': formatButtonFontSizeOne,
      'background': backgroundButtonOne
    }"
    >
      <img src="/content/dam/vue/check.png" class="img1" alt="check image" />{{ msgOne }}
    </button>
    <button
      class="classButton"
      v-else-if="type === '2'"
      id="button2"
      @click.prevent="event"
      :style="{
      'color': colorButtonTwo,
      'font-family': fontFamilyButtonTwo,
      'font-size': formatButtonFontSizeTwo,
      'background': backgroundButtonTwo
    }"
    >
      <img src="/content/dam/vue/plus.png" class="img2" alt="plus image" />{{ msgTwo }}
      <img src="/content/dam/vue/next.png" class="img0" alt="next image" />
    </button>
    <button
      class="classButton"
      v-else-if="type === '3'"
      id="button3"
      @click.prevent="event"
      :style="{
      'color': colorButtonThree,
      'font-family': fontFamilyButtonThree,
      'font-size': formatButtonFontSizeThree,
      'background': backgroundButtonThree
    }"
    >
      {{ msgThree }}<img src="/content/dam/vue/vector.png" class="img3" alt="vector image" />
    </button>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line
  name: "Buttons",
  props: {
    type: String,
    event: {
      type: Function,
      required: true
    },
    colorButtonZero: {
      type: String
    },
    fontFamilyButtonZero: {
      type: String
    },
    formatButtonFontSizeZero: {
      type: String
    },
    backgroundButtonZero: {
      type: String
    },
    msgZero: {
      type: String
    },
    colorButtonOne: {
      type: String
    },
    fontFamilyButtonOne: {
      type: String
    },
    formatButtonFontSizeOne: {
      type: String
    },
    backgroundButtonOne: {
      type: String
    },
    msgOne: {
      type: String
    },
    colorButtonTwo: {
      type: String
    },
    fontFamilyButtonTwo: {
      type: String
    },
    formatButtonFontSizeTwo: {
      type: String
    },
    backgroundButtonTwo: {
      type: String
    },
    msgTwo: {
      type: String
    },
    colorButtonThree: {
      type: String
    },
    fontFamilyButtonThree: {
      type: String
    },
    formatButtonFontSizeThree: {
      type: String
    },
    backgroundButtonThree: {
      type: String
    },
    msgThree: {
      type: String
    }
  }
}
</script>

<style lang="scss" scooped>
@import "./Buttons.scss";
</style>

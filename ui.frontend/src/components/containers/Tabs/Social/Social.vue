<template>
  <div class="social-container" role="form">
    <Inputs
      :LabelInput="labelLinkedin"
      :Placeholder=placeholderLinkedin
      Type="linkedin"
      ClassInput="linkedin"
      :valueInput="linkedinValue"
      ClassField="linkedin"
      aria-label="Linkedin"
    />
    <Inputs
      :LabelInput="labelGithub"
      :InvalidText="InvalidTextGithub"
      :Placeholder="placeholderGithub"
      idSpan="spanGit"
      Type="git"
      ClassInput="git"
      :valueInput="githubValue"
      ClassField="github"
      aria-label="Github"
    />

    <div class="button">
      <Buttons
       type="0"
       :event="verify"
       :msgZero="msgZero"
       :colorButtonZero="colorButtonZero"
       :backgroundButtonZero="backgroundButtonZero" />
    </div>
  </div>
</template>

<script>
import Inputs from '@/components/Inputs/Inputs.vue'
import Buttons from '@/components/micro/Buttons/Buttons.vue'
import { mapActions } from 'vuex'
export default {
  name: 'Social',
  components: {
    Inputs,
    Buttons
  },
  props: {
    colorButtonZero: {
      type: String
    },
    backgroundButtonZero: {
      type: String
    },
    msgZero: {
      type: String,
      default: 'Next'
    },
    placeholderLinkedin: {
      type: String,
      default: 'https://www.linkedin.com/in/foo-bar-3a0560104/'
    },
    labelLinkedin: {
      type: String,
      default: 'Linkedin'
    },
    placeholderGithub: {
      type: String,
      default: 'https://github.com/foobar'
    },
    labelGithub: {
      type: String,
      default: 'GitHub *'
    },
    InvalidTextGithub: {
      type: String,
      default: 'Please enter your GitHub Link'
    }
  },
  data () {
    return {
      linkedinValue: '',
      githubValue: ''
    }
  },
  methods: {
    ...mapActions(['nextTab']),
    verify () {
      if (localStorage.getItem('github')) {
        document.getElementById('spanGit').style.visibility = 'hidden'
        this.nextTab()
      } else {
        document.getElementById('spanGit').style.visibility = 'visible'
      }
    }
  },
  mounted () {
    this.linkedinValue = localStorage.getItem('linkedin')
    this.githubValue = localStorage.getItem('github')
    document.title = `${process.env.VUE_APP_TITLE} | Social`
  },
  updated () {
    this.$store.state.labelLinkedin = this.labelLinkedin
  }
}
</script>

<style lang="scss" scoped>
@import "./Social.scss";
</style>

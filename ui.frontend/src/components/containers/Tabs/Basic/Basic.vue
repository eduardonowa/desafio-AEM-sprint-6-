<template>
  <div class="basic-container" role="form">
    <Inputs
      ClassField="fullname"
      Type="text"
      :LabelInput="labelFullname"
      :InvalidText="spanFullname"
      :valueInput="fullnameValue"
      :Placeholder="placeholderFullname"
      aria-label="Full name"
    />
    <Inputs
      ClassField="nickname"
      Type="text"
      :LabelInput="labelNickname"
      InvalidText="Invalid"
      :valueInput="nicknameValue"
      :Placeholder="placeholderNickname"
      aria-label="Nickname"
    />
    <Inputs
      ClassField="email"
      Type="email"
      :LabelInput="LabelEmail"
      :InvalidText="InvalidTextEmail"
      :valueInput="emailValue"
      :Placeholder="PlaceholderEmail"
      aria-label="Email"
    />
    <Inputs
      :ClassField="classPhone"
      :LabelInput="LabelPhone"
      InvalidText="Invalid"
      :valueInput="phoneValue"
      :Placeholder="placeholderPhone"
      Type="tel"
      aria-label="Phone"
      :testMask="testMask"
    />
    <Birthday
    aria-label="Birthday"
    :labelBirthday="labelBirthday"
    :spanBirthday="spanBirthday"
    />
    <div class="footer">
      <CheckBox aria-label="Contract terms" :labelCheckbox="labelCheckbox" />
      <div class="button-next">
        <Buttons
          :event="validate"
          type="0"
          :msgZero="msgZero"
          :colorButtonZero="colorButtonZero"
          :fontFamilyButtonZero="fontFamilyButtonZero"
          :formatButtonFontSizeZero="formatButtonFontSizeZero"
          :backgroundButtonZero="backgroundButtonZero"
          aria-label="Next Form"
        />
      </div>
    </div>
  </div>
</template>

<script>
import Inputs from '@/components/Inputs/Inputs.vue'
import CheckBox from '@/components/CheckBox/CheckBox.vue'
import Birthday from '@/components/containers/Birthday/Birthday.vue'
import { mapActions } from 'vuex'
import Buttons from '@/components/micro/Buttons/Buttons.vue'
import $ from 'jquery'
import {} from 'jquery-mask-plugin'
export default {
  // eslint-disable-next-line
  name: 'Basic',
  components: { Inputs, CheckBox, Birthday, Buttons },
  props: {
    testMask: String,
    labelNickname: {
      type: String,
      default: 'Nickname'
    },
    placeholderPhone: {
      type: String,
      default: '(83) 00000-0000'
    },
    placeholderNickname: {
      type: String,
      default: 'Juanito'
    },
    labelFullname: {
      type: String,
      default: 'Fullname *'
    },
    placeholderFullname: {
      type: String,
      default: 'Foo Bar'
    },
    spanFullname: {
      type: String,
      default: 'Please enter your name'
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
      type: String,
      default: 'Next'
    },
    labelCheckbox: {
      type: String,
      default: 'terms'
    },
    LabelEmail: {
      type: String,
      default: 'Email *'
    },
    InvalidTextEmail: {
      type: String,
      default: 'Please enter your email'
    },
    PlaceholderEmail: {
      type: String,
      default: 'foo@bar.com'
    },
    LabelPhone: {
      type: String,
      default: 'Phone'
    },
    labelBirthday: {
      type: String,
      default: 'Birthday *'
    },
    spanBirthday: {
      type: String,
      default: 'Please enter your age'
    }
  },
  data () {
    return {
      fullnameValue: '',
      nicknameValue: '',
      emailValue: '',
      phoneValue: '',
      classPhone: 'phone'
    }
  },
  mounted () {
    document.title = `${process.env.VUE_APP_TITLE} | Basic`
    this.fullnameValue = window.localStorage.fullname
    this.nicknameValue = window.localStorage.nickname
    this.emailValue = window.localStorage.email
    this.phoneValue = window.localStorage.phone
  },
  updated () {
    this.$store.state.labelName = this.labelFullname.replace('*', '') + ': '
    this.$store.state.labelEmail = this.LabelEmail.replace('*', '') + ': '
    this.$store.state.labelPhone = this.labelFullname.replace('*', '') + ': '
    this.$store.state.labelNickname = this.labelNickname.replace('*', '') + ': '
  },
  beforeUpdate () {
    if (this.classPhone === 'phone' && this.testMask === 'yes') {
      $(`.${this.classPhone} input`).mask('(00) 00000-0000')
      console.log(this.testMask)
    } else if (this.testMask === 'no') {
      console.log(this.testMask)
    }
  },
  methods: {
    ...mapActions(['nextTab']),
    validate () {
      if (
        window.localStorage.fullname &&
        window.localStorage.email &&
        window.localStorage.age &&
        window.localStorage.day &&
        window.localStorage.month &&
        window.localStorage.year &&
        JSON.parse(window.localStorage.terms)
      ) {
        if (
          (document.querySelector('.nickname input').value === '' ||
            localStorage.nickname !== '') &&
          (document.querySelector('.phone input').value === '' ||
            localStorage.phone !== '')
        ) {
          this.nextTab()
        } else {
          ;['nickname', 'phone'].forEach((input) => {
            const inpVal = document.querySelector(`.${input} input`).value
            const error = document.querySelector(`.${input} .ClassSpan`)
            if (inpVal !== '' && window.localStorage[input] === '') {
              error.style.visibility = 'visible'
            } else {
              error.style.visibility = 'hidden'
            }
          })
        }
      } else {
        ;['fullname', 'email'].forEach((input) => {
          const error = document.querySelector(`.${input} .ClassSpan`)
          if (!window.localStorage[input]) {
            error.style.visibility = 'visible'
          } else {
            error.style.visibility = 'hidden'
          }
        })
        ;['nickname', 'phone'].forEach((input) => {
          const inpVal = document.querySelector(`.${input} input`).value
          const error = document.querySelector(`.${input} .ClassSpan`)
          if (inpVal !== '' && window.localStorage[input] === '') {
            error.style.visibility = 'visible'
          } else {
            error.style.visibility = 'hidden'
          }
        })
      }
      if (!JSON.parse(window.localStorage.terms)) {
        document.getElementById('chkError').style.visibility = 'visible'
      } else {
        document.getElementById('chkError').style.visibility = 'hidden'
      }
      if (
        !window.localStorage.age ||
        !window.localStorage.day ||
        !window.localStorage.month ||
        !window.localStorage.year
      ) {
        document.getElementById('spanBirthday').style.visibility = 'visible'
      } else {
        document.getElementById('spanBirthday').style.visibility = 'hidden'
      }
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Basic.scss';
</style>

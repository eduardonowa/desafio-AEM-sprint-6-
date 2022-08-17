<template>
  <div class="certificate-container" role="form">
    <Inputs
      :LabelInput="labelCertificates"
      ClassField="certificates"
      :Placeholder="placeholderCertificates"
      Type="text"
      :valueInput="getCertificateValue"
      aria-label="Certificate addition"
    />
    <div class="buttons">
      <div class="certificates">
        <Buttons
          :msgThree="msgThree"
          type="3"
          class="certificateButton"
          :event="openCertificates"
          :colorButtonThree="colorButtonThree"
          :backgroundButtonThree="backgroundButtonThree"
        />
        <div
          v-show="isOpenCertificates"
          class="certificatesList"
          id="idList"
          :style="{
            'background': dropdownBgColor
          }"
        >
          <div
            id="listOfCertificates"
            v-for="(certificate, index) in certificates"
            :key="index + certificate"
          >
            <p>{{ certificate }}</p>
            <button class="removeButton" @click="removeFromCertificates(index)">
              <img src="/content/dam/vue/whitex.png" alt="white x" />
            </button>
          </div>
        </div>
      </div>
      <div class="more-span">
        <Buttons
          :msgTwo="msgTwo"
          type="2"
          class="moreButton"
          :event="addCertificates"
          :colorButtonTwo="colorButtonTwo"
          :backgroundButtonTwo="backgroundButtonTwo"
        />
        <span> {{ spanMsg }} </span>
      </div>
    </div>
    <Inputs
      :LabelInput="labelTeamname"
      idSpan="teamSpan"
      ClassField="team-name"
      :InvalidText="spanTeamname"
      :Placeholder="placeholderTeamname"
      Type="text"
      :valueInput="teamnameValue"
      aria-label="Team Name"
    />
    <Inputs
      :LabelInput="labelInstitution"
      idSpan="institutionSpan"
      ClassField="institution"
      :InvalidText="spanInstitution"
      :Placeholder="placeholderInstitution"
      Type="text"
      :valueInput="institutionValue"
      aria-label="Institution"
    />
    <Inputs
      :LabelInput="labelGraduation"
      idSpan="graduationSpan"
      ClassField="graduation"
      :InvalidText="spanGraduation"
      :Placeholder="placeholderGraduation"
      Type="text"
      :valueInput="graduationValue"
      aria-label="Graduation"
    />
    <div class="footer-certificates">
      <span> {{ spanGeneral }}</span>
      <Buttons
        class="finish"
        :msgOne="msgOne"
        type="1"
        :event="validate"
        :colorButtonOne="colorButtonOne"
        :backgroundButtonOne="backgroundButtonOne"
      />
    </div>
  </div>
</template>

<script>
import Inputs from '@/components/Inputs/Inputs.vue'
import Buttons from '@/components/micro/Buttons/Buttons.vue'
import { mapActions } from 'vuex'
export default {
  name: 'Certificates',
  components: { Inputs, Buttons },
  props: {
    dropdownBgColor: String,
    spanTeamname: {
      type: String,
      default: 'Please enter your Team Name'
    },
    placeholderTeamname: {
      type: String,
      default: 'https://www.linkedin.com/in/foo-bar-3a0560104/'
    },
    labelTeamname: {
      type: String,
      default: 'TeamName *'
    },
    labelCertificates: {
      type: String,
      default: 'Certificates'
    },
    placeholderCertificates: {
      type: String,
      default: 'https://www.linkedin.com/in/foo-bar-3a0560104/'
    },
    colorButtonOne: {
      type: String
    },
    backgroundButtonOne: {
      type: String
    },
    colorButtonTwo: {
      type: String
    },
    backgroundButtonTwo: {
      type: String
    },
    colorButtonThree: {
      type: String
    },
    backgroundButtonThree: {
      type: String
    },
    msgOne: {
      type: String,
      default: 'Finish'
    },
    msgTwo: {
      type: String,
      default: 'More'
    },
    msgThree: {
      type: String,
      default: 'Certificates'
    },
    labelGraduation: {
      type: String,
      default: 'Graduation *'
    },
    spanGraduation: {
      type: String,
      default: 'Please enter your Graduation'
    },
    placeholderGraduation: {
      type: String,
      default: 'Ciência da Computação'
    },
    labelInstitution: {
      type: String,
      default: 'Institution *'
    },
    spanInstitution: {
      type: String,
      default: 'Please enter your Institution'
    },
    placeholderInstitution: {
      type: String,
      default: 'Universidade Federal da Paraíba'
    }
  },
  data () {
    return {
      certificatesValue: '',
      teamnameValue: '',
      institutionValue: '',
      graduationValue: '',
      certificates: [],
      isOpenCertificates: false,
      spanMsg: '',
      moreButtonAppear: false,
      spanGeneral: ''
    }
  },
  methods: {
    ...mapActions(['nextTab']),
    validate () {
      const fullNameStorage = window.localStorage.fullname
      const emailStorage = window.localStorage.email
      const ageStorage = window.localStorage.age
      const githubStorage = window.localStorage.github
      const teamNameStorage = window.localStorage.teamName
      const institutionStorage = window.localStorage.institution
      const graduationStorage = window.localStorage.graduation
      if (teamNameStorage) {
        document.getElementById('teamSpan').style.visibility = 'hidden'
      } else {
        document.getElementById('teamSpan').style.visibility = 'visible'
      }
      if (institutionStorage) {
        document.getElementById('institutionSpan').style.visibility = 'hidden'
      } else {
        document.getElementById('institutionSpan').style.visibility = 'visible'
      }
      if (graduationStorage) {
        document.getElementById('graduationSpan').style.visibility = 'hidden'
      } else {
        document.getElementById('graduationSpan').style.visibility = 'visible'
      }
      if (
        fullNameStorage &&
        emailStorage &&
        ageStorage &&
        githubStorage &&
        teamNameStorage &&
        institutionStorage &&
        graduationStorage
      ) {
        this.$store.state.actualTab = 'success'
        this.spanGeneral = ''
      } else {
        this.spanGeneral = 'Ops, you miss some field'
      }
    },
    openCertificates () {
      this.isOpenCertificates = !this.isOpenCertificates
    },
    addCertificates () {
      if (
        this.$store.state.certificate &&
        this.certificates.length <= 4 &&
        // eslint-disable-next-line
        /^https?:\/\/(?:www\.)?[-a-zA-Z0-9@:%._\+~#=]{1,256}\.[a-zA-Z0-9()]{1,6}\b(?:[-a-zA-Z0-9()@:%_\+.~#?&\/=]*)$/.test(
          this.$store.state.certificate
        )
      ) {
        this.certificates.push(this.$store.state.certificate)
        this.spanMsg = ''
        this.$store.state.certificate = ''
      } else if (!this.$store.state.certificate) {
        this.spanMsg = `Empty ${this.labelCertificates.toLowerCase()} is not allowed.`
      } else if (this.certificates.length === 5) {
        this.spanMsg = `Sorry, only 5 ${this.labelCertificates.toLowerCase()} are allowed. You can remove one certificate instead.`
      } else if (
        // eslint-disable-next-line
        !/^https?:\/\/(?:www\.)?[-a-zA-Z0-9@:%._\+~#=]{1,256}\.[a-zA-Z0-9()]{1,6}\b(?:[-a-zA-Z0-9()@:%_\+.~#?&\/=]*)$/.test(
          this.$store.state.certificate
        )
      ) {
        this.spanMsg = 'Invalid certificate.'
      }
    },
    removeFromCertificates (indexRemove) {
      this.certificates = this.certificates.filter(
        (data, index) => index !== indexRemove
      )
    },
    canMoreAppear () {
      if (this.certificates.length >= 1) {
        document.getElementById('button3').style.visibility = 'visible'
        document.getElementById('idList').style.visibility = 'visible'
      } else {
        document.getElementById('button3').style.visibility = 'hidden'
        document.getElementById('idList').style.visibility = 'hidden'
      }
    },
    getCertificatesStorage () {
      if (localStorage.getItem('certificates')) {
        const certificatesStorage = JSON.parse(
          localStorage.getItem('certificates')
        )
        this.certificates = certificatesStorage
      }
    }
  },
  updated () {
    this.canMoreAppear()
    window.localStorage.setItem(
      'certificates',
      JSON.stringify(this.certificates)
    )
    this.$store.state.labelCertificates =
      this.labelCertificates.replace('*', '') + ': '
    this.$store.state.labelTeamname = this.labelTeamname.replace('*', '') + ': '
    this.$store.state.labelGraduation =
      this.labelGraduation.replace('*', '') + ': '
    this.$store.state.labelInstitution =
      this.labelInstitution.replace('*', '') + ': '
  },
  mounted () {
    document.title = `${process.env.VUE_APP_TITLE} | Certificates`
    this.certificatesValue = window.localStorage.certificate
    this.teamnameValue = window.localStorage.teamName
    this.institutionValue = window.localStorage.institution
    this.graduationValue = window.localStorage.graduation
    this.getCertificatesStorage()
  },
  computed: {
    getCertificateValue () {
      return this.$store.state.certificate
    }
  }
}
</script>

<style lang="scss" scoped>
@import './Certificates.scss';
</style>

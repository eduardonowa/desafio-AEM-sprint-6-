<template>
  <div
    class="success-container"
    aria-label="Success tab with all informations"
    role="main"
    :style="{'font-family':fontFamilySuccess}"
  >
    <Texts :description="subTitleSuccess" />
    <Texts :description="this.$store.state.labelName" :text="this.fullname" />
    <Texts
      v-if="this.nickname"
      :description="this.$store.state.labelNickname"
      :text="this.nickname"
    />
    <Texts :description="this.$store.state.labelEmail" :text="this.email" />
    <Texts v-if="this.phone" :description="this.$store.state.labelPhone" :text="this.phone" />
    <Texts :description="this.$store.state.labelBirthday" :text="this.birthday" />
    <Texts description="Age: " :text="this.age" />
    <Texts
      v-if="this.linkedin"
      :description="this.$store.state.labelLinkedin"
      :text="this.linkedin"
      id="hide"
    />
    <Texts description="Github: " :text="this.github" id="hide" />

    <div v-if="this.isCertificates" class="certificates">
      <div class="title">
        <p>{{this.$store.state.labelCertificates}}</p>
      </div>
      <div class="list">
        <p v-for="(certificate, index) in this.certificates" :key="index">
          {{ certificate }}
          <br />
        </p>
      </div>
    </div>
    <Texts :description="this.$store.state.labelTeamname" :text="this.teamName" id="hide" />
    <Texts :description="this.$store.state.labelInstitution" :text="this.institution" />
    <Texts :description="this.$store.state.labelGraduation" :text="this.graduation" />
    <div class="button">
      <Buttons
        type="1"
        :event="clearStorage"
        :msgOne="msgOne"
        :colorButtonOne="colorButtonOne"
        :fontFamilyButtonOne="fontFamilyButtonOne"
        :backgroundButtonOne="backgroundButtonOne"
      />
    </div>
  </div>
</template>

<script>
import Buttons from '@/components/micro/Buttons/Buttons.vue'
import Texts from '@/components/micro/Texts/Texts.vue'
export default {
  // eslint-disable-next-line
  name: 'Success',
  components: {
    Buttons,
    Texts
  },
  props: {
    fontFamilySuccess: String,
    subTitleSuccess: {
      type: String,
      default: 'Your data has been sent successfully!'
    },
    colorButtonOne: {
      type: String
    },
    fontFamilyButtonOne: {
      type: String
    },
    backgroundButtonOne: {
      type: String
    },
    msgOne: {
      type: String,
      default: 'Return'
    }
  },
  data () {
    return {
      fullname: '',
      nickname: '',
      email: '',
      phone: '',
      age: '',
      linkedin: '',
      github: '',
      birthday: '',
      teamName: '',
      institution: '',
      graduation: '',
      certificates: [],
      isCertificates: false
    }
  },
  methods: {
    getData () {
      const day = localStorage.getItem('day')
      const month = localStorage.getItem('month')
      const year = localStorage.getItem('year')
      this.birthday = `${day}/${month}/${year}`
      this.fullname = localStorage.getItem('fullname')
      this.email = localStorage.getItem('email')
      this.nickname = localStorage.getItem('nickname')
      this.phone = localStorage.getItem('phone')
      this.age = localStorage.getItem('age')
      this.linkedin = localStorage.getItem('linkedin')
      this.github = localStorage.getItem('github')
      this.teamName = localStorage.getItem('teamName')
      this.institution = localStorage.getItem('institution')
      this.graduation = localStorage.getItem('graduation')
      this.certificates = JSON.parse(localStorage.getItem('certificates'))
      if (this.certificates !== null && this.certificates.length !== 0) {
        this.isCertificates = true
      } else {
        this.isCertificates = false
      }
    },

    clearStorage () {
      localStorage.clear()
      this.$store.state.abledTabs = ['basic']
      this.$store.state.actualTab = 'basic'
    }
  },
  mounted () {
    this.getData()
  }
}
</script>

<style lang="scss" scooped>
@import './Success.scss';
</style>

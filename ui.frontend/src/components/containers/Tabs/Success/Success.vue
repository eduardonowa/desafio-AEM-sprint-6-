<template>
  <div class="success-container" aria-label="Success tab with all informations" role="main">
    <Texts description="Your data has been sent successfully!" />
    <Texts
    description="Full Name: "
    :text="this.fullname"
    :textColor="textColorSuccessFullName"
    :textFontFamily="textFontFamilySuccessFullName"
    :textFontSize="textFontSizeSuccessFullName"
    />
    <Texts
    v-if="this.nickname"
    description="Nickname: "
    :text="this.nickname"
    :textColor="textColorSuccessNickname"
    :textFontFamily="textFontFamilySuccessNickname"
    :textFontSize="textFontSizeSuccessNickname"
    />
    <Texts
    :description="emailSuccess"
    :text="this.email"
    :textColor="textColorSuccessEmail"
    :textFontFamily="textFontFamilySuccessEmail"
    :textFontSize="textFontSizeSuccessEmail"
    />
    <Texts
    v-if="this.phone"
    description="Phone: "
    :text="this.phone"
    :textColor="textColorSuccessPhone"
    :textFontFamily="textFontFamilySuccessPhone"
    :textFontSize="textFontSizeSuccessPhone"
    />
    <Texts
    description="Birthday: "
    :text="this.birthday"
    :textColor="textColorSuccessBirthday"
    :textFontFamily="textFontFamilySuccessBirthday"
    :textFontSize="textFontSizeSuccessBirthday"
    />
    <Texts
    description="Age: "
    :text="this.age"
    :textColor="textColorSuccessAge"
    :textFontFamily="textFontFamilySuccessAge"
    :textFontSize="textFontSizeSuccessAge"
    />
    <Texts
    v-if="this.linkedin"
    description="Linkedin: "
    :text="this.linkedin"
    id="hide"
    :textColor="textColorSuccessLinkedin"
    :textFontFamily="textFontFamilySuccessLinkedin"
    :textFontSize="textFontSizeSuccessLinkedin"
    />
    <Texts
    description="Github: "
    :text="this.github"
    id="hide"
    :textColor="textColorSuccessGithub"
    :textFontFamily="textFontFamilySuccessGithub"
    :textFontSize="textFontSizeSuccessGithub"
    />

    <div v-if="this.isCertificates" class="certificates">
      <div class="title">
        <p>Certificates:</p>
      </div>
      <div class="list">
        <p v-for="(certificate, index) in this.certificates" :key="index">
          {{ certificate }}
          <br />
        </p>
      </div>
    </div>
    <Texts
    description="TeamName: "
    :text="this.teamName"
    id="hide"
    :textColor="textColorSuccessTeam"
    :textFontFamily="textFontFamilySuccessTeam"
    :textFontSize="textFontSizeSuccessTeam"
    />
    <Texts
    description="Institution: "
    :text="this.institution"
    :textColor="textColorSuccessInstitution"
    :textFontFamily="textFontFamilySuccessInstitution"
    :textFontSize="textFontSizeSuccessInstitution"
    />
    <Texts
    description="Graduation: "
    :text="this.graduation"
    :textColor="textColorSuccessGraduation"
    :textFontFamily="textFontFamilySuccessGraduation"
    :textFontSize="textFontSizeSuccessGraduation"
    />
    <div class="button">
      <Buttons
        type="1"
        :event="clearStorage"
        :msgOne="msgOne"
        :colorButtonOne="colorButtonOne"
        :fontFamilyButtonOne="fontFamilyButtonOne"
        :formatButtonFontSizeOne="formatButtonFontSizeOne"
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
      type: String,
      default: 'Return'
    },
    emailSuccess: {
      type: String,
      default: 'Email: '
    },
    textColorSuccessFullName: {
      type: String
    },
    textFontFamilySuccessFullName: {
      type: String
    },
    textFontSizeSuccessFullName: {
      type: String
    },
    textColorSuccessNickname: {
      type: String
    },
    textFontFamilySuccessNickname: {
      type: String
    },
    textFontSizeSuccessNickname: {
      type: String
    },
    textColorSuccessEmail: {
      type: String
    },
    textFontFamilySuccessEmail: {
      type: String
    },
    textFontSizeSuccessEmail: {
      type: String
    },
    textColorSuccessPhone: {
      type: String
    },
    textFontFamilySuccessPhone: {
      type: String
    },
    textFontSizeSuccessPhone: {
      type: String
    },
    textColorSuccessBirthday: {
      type: String
    },
    textFontFamilySuccessBirthday: {
      type: String
    },
    textFontSizeSuccessBirthday: {
      type: String
    },
    textColorSuccessAge: {
      type: String
    },
    textFontFamilySuccessAge: {
      type: String
    },
    textFontSizeSuccessAge: {
      type: String
    },
    textColorSuccessLinkedin: {
      type: String
    },
    textFontFamilySuccessLinkedin: {
      type: String
    },
    textFontSizeSuccessLinkedin: {
      type: String
    },
    textColorSuccessGithub: {
      type: String
    },
    textFontFamilySuccessGithub: {
      type: String
    },
    textFontSizeSuccessGithub: {
      type: String
    },
    textColorSuccessTeam: {
      type: String
    },
    textFontFamilySuccessTeam: {
      type: String
    },
    textFontSizeSuccessTeam: {
      type: String
    },
    textColorSuccessInstitution: {
      type: String
    },
    textFontFamilySuccessInstitution: {
      type: String
    },
    textFontSizeSuccessInstitution: {
      type: String
    },
    textColorSuccessGraduation: {
      type: String
    },
    textFontFamilySuccessGraduation: {
      type: String
    },
    textFontSizeSuccessGraduation: {
      type: String
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

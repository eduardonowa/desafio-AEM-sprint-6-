<template>
  <div class="bodyType" :style="styleBody">
    <Header :style="styleHeader" />
    <div class="card" :style="styleCard">
      <h2 class="teamSign">Team Sign Up</h2>
      <Menu />
    </div>
  </div>
</template>

<script>
import './card.css'
import Header from '../Header/Header.vue'
import Menu from '../Menu/Menu.vue'
export default {
  name: 'Card',
  components: {
    Header, Menu
  },
  props: {
    descriptionText: {
      type: String,
      default: 'description'
    },
    titleText: {
      type: String,
      default: 'title'
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
    fontSizeTitle: {
      type: String
    },
    fontSizeDescription: {
      type: String
    },
    bodyBackground: {
      type: String
    },
    headerBackground: {
      type: String
    },
    cardBackground: {
      type: String
    }
  },

  computed: {
    styleBody () {
      return {
        backgroundColor: this.bodyBackground
      }
    },
    styleHeader () {
      return {
        backgroundColor: this.headerBackground
      }
    },
    styleCard () {
      return {
        backgroundColor: this.cardBackground
      }
    }
  }
}
</script>

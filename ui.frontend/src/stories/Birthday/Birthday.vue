<template>
  <div class="birthday-container" :style="style">
    <label class="titleBirthday">{{ labelTitle }}</label>
    <span id="spanBirthday" v-show="showSpan"> {{ textSpan }}</span>
    <div class="inputs-container">
      <div class="select">
        <label>{{ labelOne }}</label>
        <select name="day" id="day" @change="getDay($event)">
          <option>{{ optionOne }}</option>
          <option v-for="day in 31" :key="day">
            {{ padStart(day) }}
          </option>
        </select>
      </div>
      <div class="select">
        <label>{{ labelTwo }}</label>
        <select name="month" id="month" @change="getMonth($event)">
          <option>{{ optionTwo }}</option>
          <option v-for="month in 12" :key="month">
            {{ padStart(month) }}
          </option>
        </select>
      </div>
      <div class="select">
        <label>{{ labelThree }}</label>
        <select name="year" id="year" @change="getYear($event)">
          <option>{{ optionThree }}</option>
          <option v-for="year in this.rangeYears" :key="year">
            {{ year + 1900 }}
          </option>
        </select>
      </div>
      <div class="select">
        <label> {{ labelFour }} </label>
        <input class="age" type="text" disabled :value="age"/>
      </div>
    </div>
  </div>
</template>

<script>
import './birthday.css'
export default {
  // eslint-disable-next-line
  name: 'Birthday',
  data () {
    return {
      day: '',
      month: '',
      year: '',
      age: '',
      actualYear: '',
      rangeYears: 120
    }
  },
  props: {
    labelTitle: {
      type: String,
      required: true,
      default: 'Birthday'
    },
    labelOne: {
      type: String,
      default: 'Day'
    },
    labelTwo: {
      type: String,
      default: 'Month'
    },
    labelThree: {
      type: String,

      default: 'Year'
    },
    labelFour: {
      type: String,
      default: 'Age'
    },
    optionOne: {
      type: String,
      default: 'Day'
    },
    optionTwo: {
      type: String,
      default: 'Month'
    },
    optionThree: {
      type: String,
      default: 'Year'
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
    fontSize: {
      type: String
    },
    showSpan: {
      type: Boolean,
      default: true
    },
    textSpan: {
      type: String,
      default: 'default'
    }
  },
  methods: {
    getDay (event) {
      this.day = event.target.value
    },
    getMonth (event) {
      this.month = event.target.value
    },
    getYear (event) {
      this.year = event.target.value
      const date = new Date()
      let actualDay = date.getDate()
      let actualMonth = 1 + date.getMonth()
      this.actualYear = date.getUTCFullYear()
      const month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
      if (this.day > actualDay) {
        actualDay = actualDay + month[actualMonth - 1]
        actualMonth = actualMonth - 1
      }
      if (this.month > actualMonth) {
        actualMonth = actualMonth + 12
        this.actualYear = this.actualYear - 1
      }
      this.age = this.actualYear - this.year
    },
    padStart (date) {
      return String(date).padStart(2, '0')
    }
  },
  computed: {
    style () {
      return {
        color: this.color,
        fontFamily: this.fontFamily,
        fontSize: this.fontSize / 16 + 'em'
      }
    }
  }
}
</script>

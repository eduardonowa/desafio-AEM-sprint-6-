<template>
  <div class="birthday-container">
    <label class="title">{{ labelBirthday }}</label>
    <span id="spanBirthday">{{ spanBirthday }}</span>
    <div class="inputs-container">
      <div class="select">
        <label>Day</label>
        <select name="day" id="day" @change="getDay($event)">
          <option disabled value="">Day</option>
          <option
            v-for="day in 31"
            :key="day"
            :selected="selectedDay == day ? true : false"
          >
            {{ padStart(day) }}
          </option>
        </select>
      </div>
      <div class="select">
        <label>Month</label>
        <select name="month" id="month" @change="getMonth($event)">
          <option disabled value="">Month</option>
          <option
            v-for="month in 12"
            :key="month"
            :selected="selectedMonth == month ? true : false"
          >
            {{ padStart(month) }}
          </option>
        </select>
      </div>
      <div class="select">
        <label>Year</label>
        <select name="year" id="year" @change="getYear($event)">
          <option disabled value="">Year</option>
          <option
            v-for="year in this.rangeYears"
            :key="year"
            :selected="selectedYear == year + 1900 ? true : false"
          >
            {{ year + 1900 }}
          </option>
        </select>
      </div>
      <div class="select">
        <label> Age </label>
        <input class="age" type="text" disabled :value="age" />
      </div>
    </div>
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line
  name: 'Birthday',
  components: {},
  data () {
    return {
      day: '',
      month: '',
      year: '',
      age: '',
      actualYear: '',
      rangeYears: ''
    }
  },
  props: {
    labelBirthday: {
      type: String,
      default: 'Birthday *'
    },
    spanBirthday: {
      type: String,
      default: 'Please enter your age'
    }
  },
  methods: {
    getDay (event) {
      this.day = event.target.value
      window.localStorage.setItem('day', this.day)
    },
    getMonth (event) {
      this.month = event.target.value
      window.localStorage.setItem('month', this.month)
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
      window.localStorage.setItem('year', this.year)
      this.age = this.actualYear - this.year
      window.localStorage.setItem('age', this.age)
    },
    padStart (date) {
      return String(date).padStart(2, '0')
    },

    getActualYear () {
      const date = new Date()
      this.rangeYears = date.getFullYear() - 1900
    }
  },
  mounted () {
    this.getActualYear()
    this.age = window.localStorage.age
  },
  updated () {
    this.$store.state.labelBirthday = this.labelBirthday.replace('*', '') + ': '
  },
  computed: {
    selectedDay () {
      return window.localStorage.getItem('day')
        ? window.localStorage.getItem('day')
        : 0
    },
    selectedMonth () {
      return window.localStorage.getItem('month')
        ? window.localStorage.getItem('month')
        : 0
    },
    selectedYear () {
      return window.localStorage.getItem('year')
        ? window.localStorage.getItem('year')
        : 0
    }
  }
}
</script>

<style lang="scss" scooped>
@import './Birthday.scss';
</style>

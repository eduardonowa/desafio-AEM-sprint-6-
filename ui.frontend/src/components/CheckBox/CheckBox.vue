<template>
  <div id="box-terms">
    <label class="terms">
      <input
        type="checkbox"
        name="terms"
        class="chk"
        id="checkbox"
        required
        :checked="status"
        @change="getValue"
      />
      <span id="defaultMark"></span>
      <span>I accept the terms and privacy</span>
    </label>
    <small id="chkError" class="classSpan">Please confirm the terms</small>
  </div>
</template>

<script>
export default {
  name: 'CheckBox',
  data () {
    return {
      status: null
    }
  }
}
</script>

<style lang="scss" scooped>
@import "./CheckBox.scss";
</style>

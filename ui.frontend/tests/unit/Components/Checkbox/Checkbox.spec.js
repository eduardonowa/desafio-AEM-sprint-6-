import { shallowMount } from '@vue/test-utils'
import CheckBox from '@/components/CheckBox/CheckBox.vue'

describe('CheckBox wrapper', () => {
  test('Have input tag', () => {
    const wrapper = shallowMount(CheckBox)
    const input = wrapper.find('input')
    expect(input.exists()).toBe(true)
  }),
    test('Have label tag', () => {
      const wrapper = shallowMount(CheckBox)
      const label = wrapper.find('label')
      expect(label.exists()).toBe(true)
    }),
    test('Have span tag', () => {
      const wrapper = shallowMount(CheckBox)
      const span = wrapper.find('span')
      expect(span.exists()).toBe(true)
    }),
    test('Have small tag', () => {
      const wrapper = shallowMount(CheckBox)
      const small = wrapper.find('small')
      expect(small.exists()).toBe(true)
    })
})

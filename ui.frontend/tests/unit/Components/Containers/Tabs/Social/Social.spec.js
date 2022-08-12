import { mount } from '@vue/test-utils'
import Social from '@/components/containers/Tabs/Social/Social.vue'
import Inputs from '@/components/Inputs/Inputs.vue'
import Buttons from '@/components/micro/Buttons/Buttons.vue'

describe('Social wrapper', () => {
  const wrapper = mount(Social)
  test('Have Inputs component', () => {
    expect(wrapper.findComponent(Inputs).exists()).toBe(true)
  })

  test('Have Buttons component', () => {
    expect(wrapper.findComponent(Buttons).exists()).toBe(true)
  })
})

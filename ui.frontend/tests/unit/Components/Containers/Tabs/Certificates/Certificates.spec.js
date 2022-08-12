import { mount } from '@vue/test-utils'
import Certificates from '@/components/containers/Tabs/Certificates/Certificates.vue'
import Inputs from '@/components/Inputs/Inputs.vue'
import Buttons from '@/components/micro/Buttons/Buttons.vue'

describe('Certificates wrapper', () => {
  const wrapper = mount(Certificates, {
    mocks: {
      $store: {
        state: { certificate: 'google.com' }
      }
    }
  })
  test('Have Inputs component', () => {
    expect(wrapper.findComponent(Inputs).exists()).toBe(true)
  })

  test('Have Buttons component', () => {
    expect(wrapper.findComponent(Buttons).exists()).toBe(true)
  })

  test('Have label tag', () => {
    const label = wrapper.find('label')
    expect(label.exists()).toBe(true)
  })
})

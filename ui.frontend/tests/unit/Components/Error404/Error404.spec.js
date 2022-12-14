import { shallowMount } from '@vue/test-utils'
import Error404 from '@/components/Error404/Error404.vue'

describe('Description wrapper', () => {
  const wrapper = shallowMount(Error404)
  test('Have img tag', () => {
    const img = wrapper.find('img')
    expect(img.exists()).toBe(true)
  })
})

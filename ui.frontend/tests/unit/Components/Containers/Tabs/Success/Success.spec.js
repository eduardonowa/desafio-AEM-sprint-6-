import { mount } from '@vue/test-utils'
import Success from '@/components/containers/Tabs/Success/Success.vue'
import Texts from '@/components/micro/Texts/Texts.vue'
import Buttons from '@/components/micro/Buttons/Buttons.vue'

describe('Success wrapper', () => {
  const wrapper = mount(Success, {
    mocks: {
      $store: {
        state: {
          labelName: 'teste',
          labelEmail: 'teste',
          labelPhone: 'teste',
          labelBirthday: 'teste',
          labelNickname: 'teste',
          labelLinkedin: 'teste',
          labelGithub: 'teste',
          labelCertificates: 'teste',
          labelTeamname: 'teste',
          labelGraduation: 'teste',
          labelInstitution: 'teste'
        }
      }
    }
  })
  it('fulling data', async () => {
    await wrapper.setData({
      nickname: 'teste',
      phone: '54 99648 5010',
      linkedin: 'https://google.com',
      isCertificates: true
    })
  })

  test('Have Texts component', () => {
    expect(wrapper.findComponent(Texts).exists()).toBe(true)
  })

  test('Have all Texts with the full data', () => {
    const texts = wrapper.findAllComponents(Texts)
    expect(texts).toHaveLength(12)
  })

  test('Have p tag', () => {
    const p = wrapper.find('p')
    expect(p.exists()).toBe(true)
  })
  test('Have Buttons component', () => {
    expect(wrapper.findComponent(Buttons).exists()).toBe(true)
  })
})

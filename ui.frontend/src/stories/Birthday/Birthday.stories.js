import Birthday from './Birthday.vue'

export default {
  title: 'Desafio AEM/Components/Birthday',
  component: Birthday,
  decorators: [
    () => ({ template: '<div style="margin: 2em;"><story/></div>' })
  ],
  // More on argTypes: https://storybook.js.org/docs/vue/api/argtypes
  argTypes: {
    color: { control: 'color' },
    fontFamily: {
      control: { type: 'select' },
      options: ['Inter', 'Arial', 'Nunito']
    },
    type: {
      control: { type: 'select' },
      options: ['text', 'phone', 'date', 'email', 'textarea']
    },
    fontSize: { control: 'text' },
  }
}

const Template = (args, { argTypes }) => ({
  props: Object.keys(argTypes),
  components: { Birthday },
  template: '<Birthday v-bind="$props" />'
})

export const Type = Template.bind({})
Type.args = {}

import Inputs from './Inputs.vue'

export default {
  title: 'Desafio AEM/Components/Inputs',
  component: Inputs,
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
    fontSize: { control: 'text' },
    type: {
      control: { type: 'select' },
      options: ['text', 'date', 'email', 'tel']
    }
  }
}

const Template = (args, { argTypes }) => ({
  props: Object.keys(argTypes),
  components: { Inputs },
  template: '<Inputs v-bind="$props" />'
})

export const Type = Template.bind({})
Type.args = {}

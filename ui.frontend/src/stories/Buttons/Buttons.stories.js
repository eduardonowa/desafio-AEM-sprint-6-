import Buttons from './Buttons.vue'

export default {
  title: 'Desafio AEM/Components/Buttons',
  component: Buttons,
  decorators: [() => ({ template: '<div style="margin: 2em;"><story/></div>' })],
  // More on argTypes: https://storybook.js.org/docs/vue/api/argtypes
  argTypes: {
    color: { control: 'color' },
    backgroundColor: { control: 'color' },
    type: {
      control: { type: 'select' },
      options: ['0', '1', '2', '3']
    },
    fontFamily: {
      control: { type: 'select' },
      options: ['Inter', 'Arial', 'Nunito']
    },
    width: {control: 'text'},
    height:{control: 'text'},
    fontSize:{control: 'text'},
  }
}

const Template = (args, { argTypes }) => ({
  props: Object.keys(argTypes),
  components: { Buttons },
  template: '<Buttons @onClick="onClick" v-bind="$props" />'
})

export const Types = Template.bind({})
Types.args = {
  primary: true,
  type: '0'
}


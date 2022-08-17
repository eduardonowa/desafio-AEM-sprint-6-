import Header from './Header.vue'

export default {
  title: 'Desafio AEM/Components/Header',
  component: Header,
  decorators: [
    () => ({ template: '<div style="margin: 2em;"><story/></div>' })
  ],
  // More on argTypes: https://storybook.js.org/docs/vue/api/argtypes
  argTypes: {
    borderColor: { control: 'color' },
    fontFamily: {
      control: { type: 'select' },
      options: ['Inter', 'Arial', 'Nunito']
    }
  }
}

const Template = (args, { argTypes }) => ({
  props: Object.keys(argTypes),
  components: { Header },
  template: '<Header v-bind="$props" />'
})

export const Type = Template.bind({})
Type.args = {}

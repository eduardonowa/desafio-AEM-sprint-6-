import Menu from './Menu.vue'

export default {
  title: 'Desafio AEM/Components/Menu',
  component: Menu,
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
    spanColor: { control: 'color' },
    borderColor: { control: 'color' },
  }
}

const Template = (args, { argTypes }) => ({
  props: Object.keys(argTypes),
  components: { Menu },
  template: '<Menu v-bind="$props" />'
})

export const Type = Template.bind({})
Type.args = {}

import Card from './Card.vue'

export default {
  title: 'Desafio AEM/Components/Card',
  component: Card,
  // More on argTypes: https://storybook.js.org/docs/vue/api/argtypes
  argTypes: {
    bodyBackground: { control: 'color' },
    cardBackground: { control: 'color' },
    fontFamily: {
      control: { type: 'select' },
      options: ['Inter', 'Arial', 'Nunito']
    }
  }
}

const Template = (args, { argTypes }) => ({
  props: Object.keys(argTypes),
  components: { Card },
  template: '<Card v-bind="$props" />'
})

export const Type = Template.bind({})
Type.args = {

}

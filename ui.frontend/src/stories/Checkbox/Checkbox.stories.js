import Checkbox from './Checkbox.vue'

export default {
  title: 'Desafio AEM/Components/Checkbox',
  component: Checkbox,
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
    fontSize:{control: 'text'},
  },
};

const Template = (args, { argTypes }) => ({
  props: Object.keys(argTypes),
  components: { Checkbox },
  template: '<Checkbox v-bind="$props" />'
});

export const Type = Template.bind({});
Type.args = {
    Text: 'default text'
};

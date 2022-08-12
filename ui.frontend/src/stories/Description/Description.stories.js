import Description from './Description.vue'

export default {
  title: 'Description',
  component: Description,
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
  components: { Description },
  template: '<Description v-bind="$props" />'
});

export const Type = Template.bind({});
Type.args = {
    Text: 'default text'
};

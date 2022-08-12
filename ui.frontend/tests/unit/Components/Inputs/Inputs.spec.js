import { shallowMount } from "@vue/test-utils";
import Inputs from "@/components/Inputs/Inputs.vue";

describe("Inputs wrapper", () => {
  const wrapper = shallowMount(Inputs);
  test("Have input tag", () => {
    const input = wrapper.find("input");
    expect(input.exists()).toBe(true);
  });

  test("Have span tag", () => {
    const span = wrapper.find("span");
    expect(span.exists()).toBe(true);
  });

  test("Have label tag", () => {
    const label = wrapper.find("label");
    expect(label.exists()).toBe(true);
  });
});

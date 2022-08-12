import { shallowMount } from "@vue/test-utils";
import Texts from "@/components/micro/Texts/Texts.vue";

describe("Text wrapper", () => {
  test("Have p tag", () => {
    const wrapper = shallowMount(Texts);
    const p = wrapper.find("p");

    expect(p.exists()).toBe(true);
  });
});

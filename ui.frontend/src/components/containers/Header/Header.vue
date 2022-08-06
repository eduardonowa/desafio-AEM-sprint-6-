<template>
    <div id="headerContainer">
        <Description description="Forms" />
        <div>
            <Title v-if="this.$store.state.actualTab === 'basic'" tabNumber="First" />
            <Title v-else-if="this.$store.state.actualTab === 'social'" tabNumber="Second" />
            <Title v-else-if="this.$store.state.actualTab === 'certificates'" tabNumber="Third" />
            <Title v-else-if="this.$store.state.actualTab === 'success'" tabNumber="Success" />
        </div>
    </div>
</template>

<script>
import Title from "@/components/micro/Title/Title.vue";
import Description from "@/components/micro/Description/Description.vue";
export default {
    name: "Header",
    components: {
        Title,
        Description
    },
};
</script>

<style lang="scss" scooped>
@import "./Header.scss";
</style>
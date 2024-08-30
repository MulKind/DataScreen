<template>
    <div>
        <iframe
            ref="myIframe"
            :src="src"
            width="100%"
            height="900"
        ></iframe>
    </div>
</template>

<script>

export default {
    name: "LDA",
    data() {
        return{
            src: "/static/lda_pass4.html"
        }
    }
}
</script>

<style scoped>
</style>
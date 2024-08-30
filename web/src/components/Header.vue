<template>
    <div class="header">
        <a>情感分析数据大屏</a>
    </div>

</template>

<script>
export default {
    name: "Header"
}
</script>

<style scoped>
.header{
    height: 60px;
    width: 100%;
    /*background-color: rgba(0, 0, 0, 0.4);*/
    position: relative;
    margin: 0;
    padding: 0;
}
a{
    left: 0;
    right: 0;
    top: 0;
    bottom: 0;
    position: absolute;
    margin: auto;
    text-align: center;
    color: white;
    font-size: 30px;
}
</style>
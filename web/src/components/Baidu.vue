<template>
  <div class="parent">
      <img src="../resource/baidu/chatgpt-reddit-comments饼图（Textblob）.png">
      <img src="../resource/baidu/chatgpt-reddit-comments饼图（百度）.png">
      <img src="../resource/baidu/chatgpt_Twitter密度图（Textblob）.png" style="margin-top: 70px">
      <img src="../resource/baidu/chatgpt_Twitter条形图（百度）.png" style="margin-top: 40px">
      <img src="../resource/baidu/chatgpt_Twitter条形图（阿里云与百度的对比）.png">
      <img src="../resource/baidu/GenerativeAI-tweets折线图（Textblob）.png" style="margin-top: 40px">
      <img src="../resource/baidu/GenerativeAI-tweets折线图（百度）.png">
  </div>
</template>

<script>
export default {
    name: "Baidu"
}
</script>

<style scoped>
::v-deep img{
    max-width: 100%;
}
.parent{
    width: 100%;
    text-align: center;
    display: flex;
    flex-flow: row wrap;
    align-content: flex-start;
}
img{
    height: 33%;
    width: 33%;
}
</style>
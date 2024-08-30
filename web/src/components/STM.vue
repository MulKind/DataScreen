<template>
  <div class="parent">
      <img src="../resource/STMModel/gai评价.png">
      <img src="../resource/STMModel/gai4.png">
      <img src="../resource/STMModel/评价_rdt.png">
      <img src="../resource/STMModel/rdt8.png">
  </div>
</template>

<script>
export default {
    name: "STM"
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
    height: 50%;
    width: 50%;
}
</style>
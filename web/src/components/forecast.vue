<template>
  <div class="parent">
      <img src="../resource/STM/output4.png">
      <img src="../resource/STM/output5.png">
  </div>
</template>

<script>
export default {
    name: "forecast"
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
    flex-flow: column wrap;
    align-content: flex-start;
}
img{
    flex: 1;
    height: 50%;
    width: 50%;
}
</style>
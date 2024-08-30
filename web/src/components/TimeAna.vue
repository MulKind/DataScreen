<template>
  <div class="parent">
      <img src="../resource/STM/output1.png">
      <img>
      <img src="../resource/STM/output2.png">
      <img src="../resource/STM/output3.png">

  </div>
</template>

<script>

export default {
    name: "TimeAna"
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
    height: 45%;
    width: 45%;
}
</style>
<template>
  <el-menu background-color="rgb(0,51,0)"
           text-color="white"
           active-text-color="#ffd04b"
           style="height: 100vh"
           default-active="/Body"
           :collapse-transition="false"
           router
  >
      <el-menu-item index="/Body">
          <i class="el-icon-pie-chart"></i>
          <span>ChatGPT情感分析</span>
      </el-menu-item>

      <el-menu-item index="/LDA">
          <i class="el-icon-pie-chart"></i>
          <span>LDA主题建模</span>
      </el-menu-item>

      <el-menu-item index="/Baidu">
          <i class="el-icon-pie-chart"></i>
          <span>百度API情感分析</span>
      </el-menu-item>

      <el-menu-item index="/TimeAna">
          <i class="el-icon-pie-chart"></i>
          <span>时序分析</span>
      </el-menu-item>

      <el-menu-item index="/forecast">
          <i class="el-icon-pie-chart"></i>
          <span>时序预测</span>
      </el-menu-item>

      <el-menu-item index="/STM">
          <i class="el-icon-pie-chart"></i>
          <span>STM主题建模</span>
      </el-menu-item>

  </el-menu>

</template>

<script>
export default {
    name: "Aside"
}
</script>

<style scoped>

</style>
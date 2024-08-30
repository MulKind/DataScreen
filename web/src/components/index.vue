<template>
    <el-container style="height: 100vh; border: 1px solid #eee">
        <el-aside width="200px" style=";height: 100vh">
            <Aside></Aside>
        </el-aside>

        <el-container  style="height: 100vh;">
            <el-header style="height:10%;text-align: center; font-size: 12px;align-content: center">
                <Header></Header>
            </el-header>

            <el-main style="height: 100%;background-color: white">
                <router-view></router-view>
            </el-main>
        </el-container>
    </el-container>

</template>

<script>
import Aside from "@/components/Aside.vue"
// import Body from "@/components/Body.vue";
import Header from "@/components/Header.vue";
export default {
    name:"Index",
    components: {
        Aside,
        Header
    },

};
</script>

<style scoped>
.el-header {
    background-color: #33cc33;
    color: #333;
    line-height: 60px;
    margin: 0;
    padding: 0;
}
.el-main{
    padding: 0px;
}
.el-aside {
    color: #333;
}
</style>
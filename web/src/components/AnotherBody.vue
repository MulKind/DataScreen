<template>
  <div>
      <div ref="charts"></div>
  </div>
</template>

<script>
import axios from "axios";
import * as echarts from "echarts";
var data;
var xData = [];
var Date = [];
export default {
    name: "AnotherBody",
    methods: {
        initCharts() {
            let myChart = echarts.init(this.$refs.chart);
            axios.get('http://localhost:8081/data/getdata').then(function (res) {
                data = res
                for(var i=0; i<data.length;i++){
                    if(data[i].tweets_sentiment_score>0)
                        xData.push(data[i].tweets_sentiment_score)
                    Date.push(data[i].datetime);
                }
            })
            myChart.setOption({
                title:{
                    text:'test'
                },
                legend:{},
                xAxis:{
                    data: xData
                },
                yAxis:{},
                series:{
                    name:'test',
                    type:'category',
                    data:Date
                }
            })
        }
    },
    mounted() {
        this.initCharts()
    }
}
</script>

<style scoped>

</style>
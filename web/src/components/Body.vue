<template>
    <div>
        <div style="display: flex">
            <div id="GPTChart" class="charts" style="float: left"></div>
            <div id="CommentNum" class="charts" style="float: right"></div>
        </div>
        <div class="parent" style="display: flex;flex-flow: row wrap;align-content: flex-start;">
            <img src="../resource/emotion/1a952df773565aebd62afe456aed0ea.png">
            <img src="../resource/emotion/a67965c140b0beddad4eabd3c6e4a22.png">
        </div>
    </div>
</template>

<script>
import * as echarts from "echarts";
export default {
    name: "Body",
    data(){
        return {
            xAxis:[],
            yAxis:[]
        }
    },
    mounted(){
        this.GPTCharts();
        this.CommentCharts();
    },
    methods:{
        loadGet() {
            this.$axios.get("http://localhost:8081/data/getdata")
                .then(res=>res.data)
                .then(res=>{
                    this.xAxis = res.time;
                    this.yAxis = res.emotion;
                })
        },
        GPTCharts() {
            var GPTChart = echarts.init(document.getElementById("GPTChart"));
            GPTChart.setOption(
                {
                    title:
                        {
                            text:"对GPT评论的情感分析"
                        },
                    legend: {},
                    xAxis:
                        {
                            name: "月",
                            type: "category",
                            data: ["2022/04",
                                "2022/05",
                                "2022/06",
                                "2022/07",
                                "2022/08",
                                "2022/09",
                                "2022/10",
                                "2022/11",
                                "2022/12",
                                "2023/01",
                                "2023/02",
                                "2023/03",
                                "2023/04"
                            ]
                        },
                    yAxis:
                        {
                            type: "value"
                        },
                    series:
                        [
                            {
                                name:"月平均分Afinn",
                                type:"line",
                                data:[1.826086957,
                                    0.471153846,
                                    0.68852459,
                                    0.836363636,
                                    1.440298507,
                                    1.737327189,
                                    1.451612903,
                                    1.975830816,
                                    2.412658228,
                                    1.498677249,
                                    1.274758344,
                                    1.260354086,
                                    1.216457667
                                ],
                                labelLine: {
                                    lineStyle: {
                                        type: "dashed",
                                        cap: "square"
                                    }
                                },
                                areaStyle: {
                                    color: "rgba(100,149,237,0.2)",
                                    origin: "start"
                                },
                                smooth: 0.4
                            },
                            {
                                name: "月平均分Vader",
                                type: "line",
                                data:[0.305013043,
                                    0.167973077,
                                    0.192996721,
                                    0.235929091,
                                    0.288838806,
                                    0.304247005,
                                    0.243258065,
                                    0.369023142,
                                    0.419521063,
                                    0.281232834,
                                    0.259783549,
                                    0.254967941,
                                    0.25083303
                                ],
                                labelLine: {
                                    lineStyle: {
                                        type: "dashed",
                                        cap: "square"
                                    }
                                },
                                areaStyle: {
                                    color: "rgba(49, 250, 123, 0.2)",
                                    origin: "start"
                                },
                                smooth: 0.4
                            }
                        ]
                }
            )
        },
        CommentCharts() {
            var CommentNum = echarts.init(document.getElementById("CommentNum"));
            CommentNum.setOption(
                {
                    title:
                        {
                            text:"按月计评论量"
                        },
                    legend: {},
                    xAxis:
                        {
                            name: "月",
                            type: "category",
                            data: ["2022/04",
                                "2022/05",
                                "2022/06",
                                "2022/07",
                                "2022/08",
                                "2022/09",
                                "2022/10",
                                "2022/11",
                                "2022/12",
                                "2023/01",
                                "2023/02",
                                "2023/03",
                                "2023/04"
                            ]
                        },
                    yAxis:
                        {
                            type:"value"
                        },
                    series:
                        [
                            {
                                name:"评论量",
                                type:"line",
                                data:[24,
                                    105,
                                    61,
                                    55,
                                    135,
                                    219,
                                    630,
                                    1670,
                                    3977,
                                    6881,
                                    11108,
                                    19003,
                                    12353
                                ],
                                labelLine: {
                                    lineStyle: {
                                        type: "dashed",
                                        cap: "square"
                                    }
                                },
                                areaStyle: {
                                    color: "rgba(100,149,237,0.2)",
                                    origin: "start"
                                },
                                smooth: 0.4
                            }
                        ]
                }
            );
        }
    }
}
</script>

<style scoped>
.charts {
    width: 700px;
    height: 300px
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
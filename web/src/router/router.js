import VueRouter from 'vue-router'

const routes =[
    {
        path:'/',
        name:'',
        component:()=>import("../components/hello.vue")
    }
    ,{
        path: '/index',
        name: 'Index',
        component: ()=>import('../components/index.vue'),
        children:[
            {
                path:'/Body',
                name:'Body',
                meta:{
                    title:'Body'
                },
                component:()=>import('../components/Body.vue')
            },
            {
                path:'/STM',
                name:'STM',
                meta:{
                    title:'STM'
                },
                component:()=>import('../components/STM.vue')
            },
            {
                path:'/Baidu',
                name:'Baidu',
                meta:{
                    title:'Baidu'
                },
                component:()=>import('../components/Baidu.vue')
            },
            {
                path:'/forecast',
                name:'forecast',
                meta:{
                    title:'forecast'
                },
                component:()=>import('../components/forecast.vue')
            },
            {
                path:'/TimeAna',
                name:'TimeAna',
                meta:{
                    title:'TimeAna'
                },
                component:()=>import('../components/TimeAna.vue')
            },
            {
                path:'/LDA',
                name:'LDA',
                meta:{
                    title:'LDA'
                },
                component:()=>import('../components/LDA.vue')
            }
        ]
    }
]

const router = new VueRouter({
    mode:'history',
    routes
})
const VueRouterPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(to){
    return VueRouterPush.call(this,to).catch(err=>err)
}

export  default  router;
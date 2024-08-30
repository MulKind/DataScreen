import Vue from 'vue';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import './assets/global.css';
import axios from 'axios';
import VueRouter from 'vue-router';
import router from './router/router';
import App from './App.vue';
import 'jquery';

Vue.use(ElementUI);
Vue.prototype.$httpUrl='http://localhost:8081';
Vue.config.productionTip = false;
Vue.prototype.$axios = axios;
Vue.use(VueRouter);
new Vue({
    router,
    render: h => h(App),
}).$mount('#app')

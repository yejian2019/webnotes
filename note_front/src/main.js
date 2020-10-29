import Vue from 'vue'
import App from './App'
import router from './router'

import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

import axios from 'axios'
import VueAxios from 'vue-axios'

import store from './store'

Vue.config.productionTip = false
Vue.use(ElementUI)

axios.defaults.baseURL = "/api"
axios.defaults.withCredentials = true
Vue.use(VueAxios, axios)

/* eslint-disable no-new */
new Vue({ 
  el: '#app',
  router,
  store,
  render: h => h(App)
})

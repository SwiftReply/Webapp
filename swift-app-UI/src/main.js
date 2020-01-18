import Vue from 'vue'
import App from './App.vue'
import router from './router'
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'
import  Axios  from  'axios'
import 'vue-awesome/icons'
import Icon from 'vue-awesome/components/Icon'
window.$ = require('jquery')
window.JQuery = require('jquery')
Vue.config.productionTip = false
Vue.component('v-icon', Icon)

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')

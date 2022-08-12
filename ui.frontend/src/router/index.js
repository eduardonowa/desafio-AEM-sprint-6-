import Vue from 'vue'
import VueRouter from 'vue-router'
import Tabs from '../components/containers/Tabs/Tabs.vue'
import Error404 from '../components/Error404/Error404.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Tabs',
    component: Tabs
  },
  {
    path: '*',
    name: 'Error 404',
    component: Error404
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router

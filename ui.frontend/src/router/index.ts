import Vue from 'vue'
import VueRouter from 'vue-router'
import Error404 from '@/components/routesComponents/error404/Error404.vue'
import Tabs from '@/components/containers/Tabs/Tabs.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Tabs',
    component: Tabs
  },
  {
    path: '*',
    name: 'Error404',
    component: Error404
  }

]

const router = new VueRouter({
  routes
})

export default router

import { createRouter, createWebHistory } from 'vue-router'
import InicioView from '@/views/InicioView.vue'
import CadastrarView from '@/views/CadastrarView.vue'
import CafesListView from '@/views/CafesListView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: InicioView
    },
    {
      path: '/sobre',
      name: 'sobre',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/SobreView.vue')
    },
    {
      path: '/cafes',
      name: 'cafes',
      component: CafesListView
    },
    {
      path: '/cadastrar',
      name: 'cadastrar',
      component: CadastrarView
    },
  ]
})

export default router

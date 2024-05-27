import { createRouter, createWebHistory } from '@ionic/vue-router';
import { RouteRecordRaw } from 'vue-router';
import HomePage from '../views/HomePage.vue';
import LoginPage from '../views/LoginPage.vue';
import DasboardPage from '../views/DasboardPage.vue';
import CreateAccountPage from '../views/CreateAccountPage.vue';
import ForgotPasswordPage from '../views/ForgotPasswordPage.vue';

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    redirect: '/home'
  },
  {
    path: '/home',
    name: 'Home',
    component: HomePage
  },
  {
    path: '/login',
    name: 'Login',
    component: LoginPage
  },
  {
    path: '/dashboard',
    name: 'Dashboard',
    component: DasboardPage
  },
  {
    path: '/createaccount',
    name: 'Createaccount',
    component: CreateAccountPage
  },
  {
    path: '/forgotpassword',
    name: 'Forgotpassword',
    component: ForgotPasswordPage
  }
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes
})


export default router

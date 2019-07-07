import Vue from 'vue';
import Router from 'vue-router';
import Home from '../components/Home'
import Board from '@/components/page/Board';
import BoardWrite from '@/components/page/BoardWrite';
import BoardItemView from '@/components/page/BoardItemView';

Vue.use(Router);

export default new Router({
  mode:"history",
  routes: [
    {path: '/',name: 'home',component: Home},
    {path: '/board/:category',name: 'board',component: Board},
    {path: '/write',name: 'write',component: BoardWrite},
    {path: '/board/detail/:id',name: 'view',component: BoardItemView}
  ],
});

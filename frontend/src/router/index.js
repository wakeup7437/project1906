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
    {path: '/board',name: 'board',component: Board},
    {path: '/board/write',name: 'write',component: BoardWrite},
    {path: '/board/:id',name: 'view',component: BoardItemView}
  ],
});

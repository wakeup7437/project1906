import Vue from 'vue';
import Router from 'vue-router';
import Board from '@/components/Board';
import BoardWrite from '@/components/page/BoardWrite';
import BoardItemView from '@/components/page/BoardItemView';

Vue.use(Router);

export default new Router({
  mode:"history",
  routes: [
    {path: '/board',name: 'board',component: Board},
    {path: '/write',name: 'write',component: BoardWrite},
    {path: '/view',name: 'view',component: BoardItemView}
  ],
});

<template>
<div class="jumbotron">
  <div class="container">
    <div class="col-md-4">
      <SideBar></SideBar>
    </div>
    <div class="col-md-8">
      <Nav></Nav>
      <BoardList></BoardList>
    </div>
  </div>
</div>
</template>
<script>
import Nav from '@/components/common/Nav.vue'
import BoardList from '@/components/board/BoardList.vue'
import SideBar from '@/components/common/SideBar.vue'
export default {
  name: 'board',
  components:{
    Nav,BoardList,SideBar
  }
}
</script>
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
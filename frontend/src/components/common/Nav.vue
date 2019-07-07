<template>
<nav class="container navbar navbar-default">
  <ul class="nav nav-pills">
    <li class="navbar-header"><h3>전체</h3></li>
    <form class="navbar-form navbar-right"><router-link class="btn btn-success" to="/write">글쓰기</router-link></form>
  </ul>
  <ul class="nav nav-pills">
  <li role="presentation"><a href="#">인기</a></li>
  <li role="presentation"><a href="#">최신</a></li>
  <li role="presentation"><a href="#">TOP</a></li>
  <li role="presentation"><a href="#">10추</a></li>
  
  <form class="navbar-form navbar-right" role="search">
    <select class="btn dropdown">
      <option value="title" selected>제목</option>
      <option value="user_name">작성자</option>
    </select>
    <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Go</button>
  </form>
  </ul>

</nav>
</template>
<script>
export default {
    
}
</script>
<style scoped>
input {
  size: 10
}
</style>
<template>
<div class="jumbotron">
  <div class="container">
    <div class="col-md-4">
      <SideBar></SideBar>
    </div>
    <div class="col-md-8">
      <div class="container">
        <form>
            <div class="form-group">
            <h3 class="pull-left">글쓰기</h3><br><br><br>
            </div>
            <div class="row form-group col-xs-3">
                <select class="btn dropdown form-control">
                <option value="1">카테고리</option>
                <option value="2">작성자</option>
                <option value="3">제목</option>
                <option value="4">작성자</option>
                <option value="5">제목</option>
                <option value="6">작성자</option>
                </select>
            </div>
            <div class="form-group">
            <input type="text" class="form-control" id="title" placeholder="제목">
            <input type="url" class="form-control" id="link" placeholder="동영상 또는 사이트 링크를 입력해주세요.(선택)">
            </div>
            <div class="form-group">
                <textarea class="form-control" rows="15" placeholder="contents">
                
                </textarea>
    
            </div>
            <div class="form-group">
            <button class="btn btn-default col-xs-2">취 소</button>
            <button class="btn btn-success col-xs-2 pull-right">작성완료</button>
            </div>
        </form>
    </div>
    </div>
  </div>
</div>
    
</template>

<script>

import BoardList from '@/components/basic/BoardList.vue'
import SideBar from '@/components/common/SideBar.vue'
export default {
    name: 'board',
    components:{
        BoardList,SideBar
    }
}
</script>

<style scoped>
</style>

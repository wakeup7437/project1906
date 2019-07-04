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
                <select class="btn dropdown form-control" v-model="category">
                  <option disabled value="">카테고리</option> 
                  <option value="기획">기획</option>
                  <option value="유저 뉴스">유저 뉴스</option>
                  <option value="팁과 노하우">팁과 노하우</option>
                  <option value="자유">자유</option>
                  <option value="유머">유머</option>
                </select>
            </div>
            <div class="form-group">
            <input type="text" class="form-control" v-model="writer" placeholder="작성자" >
            <input type="text" class="form-control" v-model="title" placeholder="제목" >
            <input type="url" class="form-control" placeholder="동영상 또는 사이트 링크를 입력해주세요.(선택)">
            </div>
            <div class="form-group">
                <textarea class="form-control" v-model="content" rows="15" placeholder="contents">
                </textarea>
    
            </div>
            <div class="form-group">
            <button class="btn btn-default col-xs-2">취 소</button>
            <button class="btn btn-success col-xs-2 pull-right" @click="save">작성완료</button>
            </div>
        </form>
    </div>
    </div>
  </div>
</div>
    
</template>

<script>

import BoardList from '@/components/board/BoardList.vue'
import SideBar from '@/components/common/SideBar.vue'
import axios from 'axios'
export default {
    name: 'board',
    components:{
        BoardList,SideBar
    },
    data(){
      return {
        writer:'',
        category: '',
        title:'',
        content:''
      }
    },
    methods:{
      save(){
        let data={
          writer: this.writer,
          category: this.category,
          title:this.title,
          content:'testtest',
        }
        axios.post('http://localhost:9000/board/write',data)
        .then(res=>{
          alert('success:'+res.data)
        })
        .catch(e=>{
          alert('error:'+e.data)
        })
      }
    }
}
</script>

<style scoped>
textarea{
  resize: vertical
}
</style>

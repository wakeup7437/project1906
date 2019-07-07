<template>
    <div class="jumbotron">
        <div class="container">
            <div class="col-md-4">
                <SideBar></SideBar>
            </div>
            <div class="col-md-8">
                <Nav></Nav>
                <div class="container">
                   <div class="panel panel-default">
                    <div class="panel-heading"><h4>{{arr.title}}</h4></div>
                    <div class="panel-body">
                        
                        <div v-if="mod" class="row form-group col-md-4">
                            <select class="btn dropdown form-control" v-model="arr.category">
                            <option disabled value="">카테고리</option> 
                            <option value="기획">기획</option>
                            <option value="유저 뉴스">유저 뉴스</option>
                            <option value="팁과 노하우">팁과 노하우</option>
                            <option value="자유">자유</option>
                            <option value="유머">유머</option>
                            </select>
                        </div>
                        <td v-else class="col-md-2">{{arr.category}}</td>
                        <td class="col-md-4 pull rigit">{{arr.writer}}</td>
                        <td class="col-md-4 pull rigit">{{arr.regdate}}</td> 
                    </div>
                    <textarea v-if="mod" v-model="arr.content" rows="10" class="col-md-12"></textarea>
                    <div v-else class="panel-body" >
                        
                            <br><br><br><br><br><br><br><br>{{arr.content}}<br><br><br><br><br><br><br><br><br><br><br>
                        
                    </div>
                    <div class="panel-footer">
                        <button class="btn btn-default col-xs-2" @click="modify()">수 정</button>
                        <button v-if="mod" class="btn btn-success col-xs-2 pull-right" @click="cancel">취소</button>
                        <button v-else class="btn btn-success col-xs-2 pull-right" @click="del">삭 제</button>
                    </div>
                    </div>
                      
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import BoardList from '@/components/board/BoardList.vue'
import SideBar from '@/components/common/SideBar.vue'
import axios from 'axios'

export default {
    name: 'boardView',
    data(){
        return {
            arr:[],
            mod:false
        }
    },
    components:{
        Nav,BoardList,SideBar
    },
    
    created:function(){
        axios.get("http://localhost:9000/board/detail/"+this.$route.params.id)
        .then(res=>{
            this.arr=res.data
        })
        .catch(e=>{
            alert(e)
        })

    },
    methods:{
        del(){
            let flag=confirm("삭제하시겠습니까?")
            if(flag){
                axios.delete("http://localhost:9000/board/detail/"+this.$route.params.id)
                .then(()=>{
                    alert(this.$route.params.id+"번 글을 삭제했습니다.")
                    this.$router.push("/board")
                    })
            }
        },
        modify(){
            if(!this.mod){
               this.mod = !this.mod;
            }else{
                axios.put("http://localhost:9000/board/detail/"+this.$route.params.id,this.arr)
                .then((d)=>{alert("수정성공:"+d.data);this.$router.push("/board")})
                .catch((e)=>{alert("수정실패:"+e)})
            }
        },
        cancel(){
            let flag=confirm("수정 취소 하시겠습니까?")
            if(flag) this.$router.push("/board")
        }
    }
}
</script>

<style scoped>
textarea{
  resize: vertical
}
</style>

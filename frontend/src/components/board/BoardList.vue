<template>
    <div class="list">
        <div class="list-group">
        <div v-for="item in arr" v-bind:key="item.text">
            
                <BoardListItem v-bind:udata="item" @click="view(item)"></BoardListItem>
        
        </div>
        </div>
    <div>
        <nav>
            <ul class="pager">
                <li><a href="#">이전</a></li>
                <li><a href="#" @click="view(item)">다음</a></li>
            </ul>
        </nav>
    </div>
    </div>
</template>

<script>
import BoardListItem from "./BoardListItem"
import axios from 'axios'
export default {
    components:{
        BoardListItem
    },
    data(){
        return{
            arr: []
        }
    },
    methods:{
        view(d){
            alert("ddddd");
            $router.push(d.bno)
            
        }
    },
    created:function(){
        axios.get("http://localhost:9000/board/"+this.$route.params.category)
        .then(res=>{
            this.arr=res.data
        })
        .catch(e=>{
            alert(e)
        })
    }
}

</script>

<style scoped>
.info {
    float: left;
}
label {
    margin-right: 10px;
}
</style>

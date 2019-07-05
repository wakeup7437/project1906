<template>
    <div class="list">
        <div class="list-group">
        <slot v-for="item in arr" :text="item.text">
            <router-link to="">
                <BoardListItem v-bind:udata="item"></BoardListItem>
            </router-link>
        </slot>
        </div>
    <div>
        <nav>
            <ul class="pager">
                <li><a href="#">이전</a></li>
                <li><a href="#">다음</a></li>
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
        
    },
    created:function(){
        axios.get("http://localhost:9000/board/all")
        .then(res=>{
            // for(item in res.data){
            //     console.log("dddd:"+item)
            // }
            this.arr=res.data
        })
        .catch(e=>{
            alert("xxxxx"+e)
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

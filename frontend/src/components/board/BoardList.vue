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
            arr: [{recommand:"0",writer:"1",title : 'ptitle1',category : 'pcategory1'},
                {recommand:"0",writer:"2",title : 'ptitle2',category : 'pcategory2'},
                {recommand:"0",writer:"3",title : 'ptitle3',category : 'pcategory3'},
                {writer:"5"}]
        }
    },
    methods:{
        created:function(){
        axios.get("http://localhost:9000/board/all")
        .then(res=>{
            console.log(res.data)
        })
        .catch(e=>{
            alert(e.data)
        })()
        }
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

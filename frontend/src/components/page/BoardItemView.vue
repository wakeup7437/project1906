<template>
    <div class="jumbotron">
        <div class="container">
            <div class="col-md-4">
                <SideBar></SideBar>
            </div>
            <div class="col-md-8">
                <Nav></Nav>
                <div class="container">
                    <div class="list">
                        <div class="list-group">
                            <div class="list-group-item">
                                <div class="panel">
                                <div class="pull-heading pull-left"><h4>제목</h4><label></label></div>
                                <div class="panel-body"><div class=" nav nav-justified"> <span>카테고리</span> <span>작성시간 </span> <span>작성자</span></div></div>
                                <div class="panel-body" >
                                    
                                        <br><br><br><br><br><br><br><br>내용<br><br><br><br><br><br><br><br><br><br><br>
                                    
                                </div>
                                <div class="panel-footer"><div class=" pull-right"><span>공유하기 </span><span>| 신고</span></div></div>
                                </div>
                                
                            </div>
                        </div>
                        <div class="list-group">

                        </div>
                    </div>
                </div>
                <BoardList></BoardList>
            </div>
        </div>
    </div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import BoardList from '@/components/basic/BoardList.vue'
import SideBar from '@/components/common/SideBar.vue'

export default {
    name: 'boardView',
    components:{
        Nav,BoardList,SideBar
    },
}
</script>

<style scoped>

</style>

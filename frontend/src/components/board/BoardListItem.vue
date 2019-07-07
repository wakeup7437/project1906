<template>
    <a @click="view(udata.bno)" class="media list-group-item">
        <div class="media-left col-md-1">{{udata.category}}</div>
        <div class="media-body">
            <div class="info"><h5>{{udata.title}}</h5></div>
            <div>{{udata.writer}}</div>
        </div>
        <div class="media-right pull-right col-md-3">{{udata.regdate.split('T')[0]}}</div>
    </a>
</template>

<script>
export default {
    props:['udata'],
    methods:{
        view(bno){
            this.$router.push('/board/detail/'+bno)
        }
    }
}
</script>

<style>

</style>

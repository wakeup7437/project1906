<template>
    <div class=""><a href="#" class="media list-group-item">
                <div class="media-left media-middle">{{udata.writer}}</div>
                <div class="media-body align-left"><div class="info"><h5>{{udata.title}}</h5> <label>{{udata.category}}</label> <label>{{udata.regTime}} </label> <label>{{udata.writer}}</label></div></div>
                <div class="media-right media-middle">{{udata.photoLink}}</div>
                </a>
    </div>
</template>

<script>
export default {
    props:['udata'],
    data(){
        return {
            
        }
    }
}
</script>

<style>

</style>

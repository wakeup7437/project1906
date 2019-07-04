<template>
    <div>
        <router-link to="/board"><h1>{{msg}}</h1></router-link>
    </div>
</template>

<script>
export default {
  data () {
    return {
      msg: '게시판'
    }
  }
}
</script>

<style scoped>

</style>

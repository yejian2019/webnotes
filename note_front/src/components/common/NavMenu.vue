<template>
  <div>
    <el-menu
      class="el-menu-demo"
      mode="horizontal"
      router
      default-active="/home"
      background-color=""
      text-color=""
      active-text-color=""
    >
      <el-menu-item v-for="(item,i) in navList" :index="item.url" :key="i">{{item.name}}</el-menu-item>

    </el-menu>
  </div>
</template>

<script>
export default {
  name: "NavMenu",
  data() {
    return {
     navList: [
       {name:"首页", url:"/home"},
       {name:"书架", url:"/bookshelf"},
       {name:"个人中心", url:"/"}
     ]
    };
  },

  mounted() {},

  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    }
  }
};
</script>

<style scoped>

</style>

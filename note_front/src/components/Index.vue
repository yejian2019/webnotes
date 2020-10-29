<template>
  <div>
    <el-container>
      <el-header><nav-menu></nav-menu></el-header>
      <el-main><router-view /></el-main>
      <el-footer>Footer</el-footer>
    </el-container>
  </div>
</template>

<script>
import NavMenu from "./common/NavMenu";
export default {
  name: "Index",
  components: { NavMenu }
};
</script>

<style scoped>
.el-header,.el-footer {
  padding: 0;
}
.el-main {
  width: 1200px;
  margin: 0 auto;
  padding: 20px 0;
}
</style>
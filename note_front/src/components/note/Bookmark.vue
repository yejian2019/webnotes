<template>
    <div style="margin-top: 100px;margin-left: 10px">
      <el-menu class="el-menu-vertical-demo bookmark-area">
        <el-menu-item class="bookmark-item">
          <a class="title-index title-h">标题1</a>
          <span slot="title" style="vertical-align: center"></span>
        </el-menu-item>
        <el-menu-item class="bookmark-item">
          <a class="title-index title-h">标题2</a>
          <span slot="title" style="vertical-align: center"></span>
        </el-menu-item>
        <el-menu-item class="bookmark-item">
          <a class="title-index title-h">标题3</a>
          <span slot="title" style="vertical-align: center"></span>
        </el-menu-item>
      </el-menu>
    </div>
</template>

<script>
    export default {
      name: "Bookmark",
      data() {
        return {
          
        }
      },
      methods: {
       
      }
    }
</script>

<style>
  .el-scrollbar {
    overflow-x: hidden!important;
  }
  .el-scrollbar__wrap{
    overflow-x: hidden!important;
  }
  .bookmark-area{
    border-right: 0px;
    height: 425px;
    padding-top: 5px;
    overflow-y: auto;
   }
  .bookmark-area::-webkit-scrollbar{
    width: 2px;
    height: 2px;
  }
  .bookmark-area::-webkit-scrollbar-thumb{
    border-radius: 10px;
    -webkit-box-shadow: inset 0 0 2px rgba(0,0,0,0.2);
    background: #535353;
  }
  .bookmark-area::-webkit-scrollbar-track{
    -webkit-box-shadow: inset 0 0 2px rgba(0,0,0,0.2);
    border-radius: 10px;
    background: #EDEDED;
    height: 150px;
  }
  .bookmark-item{
    padding-left: 5px!important;
    padding-right: 5px!important;
    height: 20px!important;
    line-height: 20px!important;
    text-align: left!important;
  }
  .bookmark-item:hover{
    background-color: rgba(0,0,0,0.1);
  }
  .title-index{
    color: #2c3e50;
    font-style:normal;
    font-weight: lighter;
    font-size: 11px;
    text-decoration: none;
  }
  .title-index:hover{
    font-size: 12px
  }
  .el-tooltip{
    padding: 0px!important;
  }
  .title-h1 {
    padding-left: 0px;
  }
  .title-h2 {
    padding-left: 0px;
  }
  .title-h3 {
    padding-left: 0px;
  }
  .title-h4 {
    padding-left: 0px;
  }
  .title-h5 {
    padding-left: 0px;
  }
  .title-h6 {
    padding-left: 0px;
  }

</style>

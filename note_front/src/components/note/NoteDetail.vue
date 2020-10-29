<template>
  <div>
   
  </div>

</template>

<script>
  import Bookmark from "./Bookmark";
    export default {
      name: "NoteDetail",
      components: {Bookmark},
      data() {
        return {
          
        }
      },
      mounted() {
       
      },

      watch:{
       
      },

      methods: {
        
        
      }
    }
</script>

<style scoped>
  .note {
    border: 0px solid #EBEEF5!important;
    width: 95%;
    text-align: left;
    margin: auto;
  }
  .note-html{
    height: 450px;
  }
  .back{
    background-color: #585858!important;
    border: 0px;
    position: absolute;
    margin-top: 10px;
    margin-bottom: 5px;
    left: 10px;
    padding: 5px 5px;
    z-index: 99;
  }
  .op-btn{
    cursor: pointer;
  }
</style>

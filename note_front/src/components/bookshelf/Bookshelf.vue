<template>
  <div>
    <div class="category-bar">
      <el-tabs v-model="activeCid" type="card" @tab-click="handleClick">
        <el-tab-pane
          v-for="(item,i) in categories"
          :key="i"
          :label="item.name"
          :name="item.id.toString()"
        ></el-tab-pane>
      </el-tabs>
    </div>
    <div class="notes">
      <el-card class="box-card" v-for="o in 10" :key="o">
        <div slot="header" class="clearfix">
          <span>卡片名称</span>
          <el-button class="btn-i" type="text" @click="noteFormVisible = true">
            <i class="el-icon-edit"></i>
          </el-button>
          <el-button class="btn-i" type="text">
            <i class="el-icon-edit-outline"></i>
          </el-button>
          <el-button class="btn-i" type="text">
            <i class="el-icon-delete"></i>
          </el-button>
        </div>
        <div class="text item">就开始放假会计师的会计付款，加快分解空间可就就开始叫，OK镜放开我今儿颗粒金风科技看未付款，借几万块克拉克。</div>
      </el-card>
    </div>
    <div class="category-form">
      <el-dialog title="收货地址" :visible.sync="categoryFormVisible">
        <el-form :model="categoryForm">
          <el-form-item label="活动名称" :label-width="formLabelWidth">
            <el-input v-model="categoryForm.name" autocomplete="off"></el-input>
          </el-form-item>
          <el-form-item label="活动区域" :label-width="formLabelWidth">
            <el-select v-model="categoryForm.region" placeholder="请选择活动区域">
              <el-option label="区域一" value="shanghai"></el-option>
              <el-option label="区域二" value="beijing"></el-option>
            </el-select>
          </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button @click="categoryFormVisible = false">取 消</el-button>
          <el-button type="primary" @click="categoryFormVisible = false">确 定</el-button>
        </div>
      </el-dialog>
    </div>
    <div class="note-form">
      <el-dialog title="收货地址" :visible.sync="noteFormVisible">
        <el-form :model="noteForm">
          <el-form-item label="活动名称" :label-width="formLabelWidth">
            <el-input v-model="noteForm.name" autocomplete="off"></el-input>
          </el-form-item>
          <el-form-item label="活动区域" :label-width="formLabelWidth">
            <el-select v-model="noteForm.region" placeholder="请选择活动区域">
              <el-option label="区域一" value="shanghai"></el-option>
              <el-option label="区域二" value="beijing"></el-option>
            </el-select>
          </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button @click="noteFormVisible = false">取 消</el-button>
          <el-button type="primary" @click="noteFormVisible = false">确 定</el-button>
        </div>
      </el-dialog>
    </div>
  </div>
</template>

<script>
export default {
  name: "Bookshelf",
  data() {
    return {
      activeCid: "1",
      categories: [
        { id: 1, name: "分类1" },
        { id: 2, name: "分类2" },
        { id: 3, name: "分类3" }
      ],
      notes: [],
      categoryFormVisible: false,
      categoryForm: {
        name: "",
        region: "",
        date1: "",
        date2: "",
        delivery: false,
        type: [],
        resource: "",
        desc: ""
      },
      noteFormVisible: false,
      noteForm: {
        name: "",
        region: "",
        date1: "",
        date2: "",
        delivery: false,
        type: [],
        resource: "",
        desc: ""
      },
      formLabelWidth: "120px"
    };
  },
  mounted() {
    // this.axios.get("/categories").then(res => {
    //   if (res.data.code == 666) {
    //     this.categories = res.data.data;
    //   } else {
    //     console.log(res.data.message);
    //   }
    // });
  },
  methods: {
    getNotes(cid) {
      this.axios.get("/categories/" + cid + "/notes").then(res => {
        if (res.data.code == 666) {
          this.notes = res.data.data;
        } else {
          console.log(res.data.message);
        }
      });
    }
  }
};
</script>

<style scoped>
.text {
  font-size: 14px;
}

.item {
  margin-bottom: 18px;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}
.clearfix:after {
  clear: both;
}

.box-card {
  width: 360px;
  float: left;
  margin-right: 20px;
  margin-bottom: 20px;
}

.btn-i {
  float: right;
  margin-left: 10px;
  font-size: 18px;
  padding: 0;
}
</style>
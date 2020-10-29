import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const store = new Vuex.Store({

    state: {
        currentUser: localStorage.getItem("user") == null?"": JSON.parse(localStorage.getItem("user"))
    },

    mutations: {
        login(state, user){
            state.currentUser = user;
            localStorage.setItem("user", JSON.stringify(user));
        }
    }

})

export default store
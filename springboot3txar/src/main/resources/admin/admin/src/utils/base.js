const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot3txar/",
            name: "springboot3txar",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot3txar/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于小程序的物流管理系统"
        } 
    }
}
export default base

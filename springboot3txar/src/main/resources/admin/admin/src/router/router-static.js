import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yuangong from '@/views/modules/yuangong/list'
    import aboutus from '@/views/modules/aboutus/list'
    import peisongxinxi from '@/views/modules/peisongxinxi/list'
    import wupinfenlei from '@/views/modules/wupinfenlei/list'
    import yunshuxinxi from '@/views/modules/yunshuxinxi/list'
    import zhuangxiebanyun from '@/views/modules/zhuangxiebanyun/list'
    import cangchuxinxi from '@/views/modules/cangchuxinxi/list'
    import systemintro from '@/views/modules/systemintro/list'
    import yonghu from '@/views/modules/yonghu/list'
    import wuliugongsi from '@/views/modules/wuliugongsi/list'
    import bumen from '@/views/modules/bumen/list'
    import shouhuoxinxi from '@/views/modules/shouhuoxinxi/list'
    import config from '@/views/modules/config/list'
    import wuliuxinxi from '@/views/modules/wuliuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '物流资讯',
        component: news
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/peisongxinxi',
        name: '配送信息',
        component: peisongxinxi
      }
      ,{
	path: '/wupinfenlei',
        name: '物品分类',
        component: wupinfenlei
      }
      ,{
	path: '/yunshuxinxi',
        name: '运输信息',
        component: yunshuxinxi
      }
      ,{
	path: '/zhuangxiebanyun',
        name: '装卸搬运',
        component: zhuangxiebanyun
      }
      ,{
	path: '/cangchuxinxi',
        name: '仓储信息',
        component: cangchuxinxi
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/wuliugongsi',
        name: '物流公司',
        component: wuliugongsi
      }
      ,{
	path: '/bumen',
        name: '部门',
        component: bumen
      }
      ,{
	path: '/shouhuoxinxi',
        name: '收货信息',
        component: shouhuoxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/wuliuxinxi',
        name: '物流信息',
        component: wuliuxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;

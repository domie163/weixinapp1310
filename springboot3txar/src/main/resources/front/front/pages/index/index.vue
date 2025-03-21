<template>
<view class="content">
	<view :style='{"minHeight":"100vh","width":"100%","padding":"24rpx 0 0px","background":"url() fixed,#ffffff","height":"auto"}'>
		<swiper :style='{"padding":"0px 0 0px ","boxShadow":"inset 0px 0px 0px 0px #f4ead8","borderColor":"#21d5ae","outline":"0px solid #bbb","margin":"0px auto 24rpx","borderRadius":"24rpx","background":"rgba(255,255,255,1)","borderWidth":"16rpx","width":"calc(100% - 40rpx)","borderStyle":"dotted","height":"420rpx"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='false'>
			<swiper-item :style='{"width":"calc(100% - 0px)","margin":"0 auto","position":"relative","borderRadius":"24rpx","background":"none","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"calc(100% - 40rpx)","margin":"16rpx auto","objectFit":"cover","borderRadius":"24rpx","display":"block","height":"360rpx"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"padding":"0 20rpx 32rpx","color":"#333","left":"20rpx","textAlign":"center","background":"rgba(255,255,255,.6)","bottom":"0px","width":"calc(100% - 40rpx)","lineHeight":"60rpx","fontSize":"28rpx","position":"absolute"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>


		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"20rpx 0 20rpx","boxShadow":"inset 0px 0px 0px 0px #87acf1","margin":"48rpx auto 60rpx","borderColor":"#21d5ae","display":"flex","outline":"0px solid #ccc","borderRadius":"24rpx","flexWrap":"wrap","background":"linear-gradient(180deg, rgba(255,255,255,.1) 0%, rgba(143,232,213,.3) 80%, rgba(27,208,169,.6) 100%)","borderWidth":"8rpx 2rpx 8rpx 2rpx","width":"calc(100% - 40rpx)","borderStyle":"dashed dashed dashed dashed","height":"auto"}'>
            <block v-for="item in menuList" v-bind:key="item.roleName">
                <block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
                    <block v-bind:key="sort" v-for=" (child,sort) in menu.child">
                        <block v-bind:key="sort2" v-for=" (button,sort2) in child.buttons">
                            <view :style='{"width":"25%","padding":"12rpx 0","margin":"10rpx 0","height":"auto"}' class="menu-list" v-if="button=='查看' && child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' " @tap="onPageTap2('../'+child.tableName+'/list')">
                                <view class="iconarr" :class="child.appFrontIcon" :style='{"padding":"0","margin":"0px auto","color":"#333","borderRadius":"100%","background":"none","display":"block","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","height":"64rpx"}'></view>
                                <view :style='{"padding":"0","margin":"12rpx auto 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"28rpx","fontSize":"28rpx"}'>{{child.menu.split("列表")[0]}}</view>
                            </view>
                        </block>
                    </block>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		

		<!-- 商品推荐 -->
		<view class="listBox recommend">
			<view v-if="false && 1 == 1" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"padding":"0px 0","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"80rpx auto 40rpx","overflow":"hidden","borderRadius":"0","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221223/5bce14e160f54b0789ffe8844f630e15.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20221223/316e41fd4a6f4d14aa0ba79790fd6d12.png) no-repeat right top / auto 100%,url(http://codegen.caihongy.cn/20221223/794be9c86de146ba8bf596bed96d3bd7.png) repeat-x center top / auto 100%","width":"calc(100% - 40rpx)","lineHeight":"104rpx","height":"104rpx"}'>
				<view :style='{"padding":"0 100rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.2)","margin":"0","color":"#333","textAlign":"center","display":"inline-block","borderRadius":"0","background":"none","width":"auto","fontSize":"32rpx","lineHeight":"80rpx","fontWeight":"600","height":"80rpx"}'>物流公司推荐</view>
			</view>
			
			<view v-if="false && 1 == 2" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<!-- 样式1 -->
			<view class="list-box style1" :style='{"padding":"160rpx 0 160rpx","boxShadow":"0 0px 0px rgba(0,0,0,.1)","margin":"0 auto","borderColor":"#21d5ae","display":"flex","justifyContent":"space-between","borderRadius":"0px","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20221223/869602be22f342bf8136d5a9f62af2f7.gif) no-repeat right top,url(http://codegen.caihongy.cn/20221223/a3dca8908c4c40b68f285ba0a3226a99.png) no-repeat left top / 100% auto,url(http://codegen.caihongy.cn/20221223/5100c3e4960949eeaacbc47dc102c484.png) no-repeat left bottom / 100% auto","borderWidth":"2rpx 0px","width":"calc(100% - 0px)","borderStyle":"dashed","height":"auto"}'>
				<view @tap="onDetailTap('wuliugongsi',product.id)" v-for="(product,index) in wuliugongsilist" :key="index" class="list-item" :style='{"border":"0px solid #f7de91","boxShadow":"0 0px 0px rgba(0,0,0,.1),inset 0px 0px 0px 0px #ffef92","padding":"0px 0 0px","margin":"40rpx 3% 40rpx","borderColor":"#83ddca","textAlign":"center","display":"flex","borderRadius":"24rpx","flexWrap":"wrap","background":"linear-gradient(180deg, rgba(255,255,255,.1) 0%, rgba(143,232,213,.1) 80%, rgba(27,208,169,.6) 100%)","borderWidth":"2rpx","width":"44%","position":"relative","borderStyle":"solid","height":"auto"}'>
					<view :style='{"padding":"0px 20rpx","margin":"0 auto","whiteSpace":"nowrap","overflow":"hidden","color":"#333","textAlign":"center","background":"none","width":"96%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","order":"2"}' class="list-item-title ">{{product.gongsimingcheng}}</view>
					<image :style='{"padding":"0","margin":"16rpx auto 0px","objectFit":"cover","borderRadius":"0px","display":"block","width":"260rpx","height":"260rpx","order":"1"}' class="list-item-image" mode="aspectFill" v-if="product.gongsitupian.substring(0,4)=='http'" :src="product.gongsitupian"></image>
					<image :style='{"padding":"0","margin":"16rpx auto 0px","objectFit":"cover","borderRadius":"0px","display":"block","width":"260rpx","height":"260rpx","order":"1"}' class="list-item-image" mode="aspectFill" v-else :src="product.gongsitupian?baseUrl+product.gongsitupian.split(',')[0]:''"></image>
				</view>
			</view>
			
			
			
			  
			
			
			  
			
			  
			<view v-if="false && 1 == 3" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
		<!-- 商品推荐 -->
		
		<!-- 系统简介 -->
		<view :style='{"padding":"0px","boxShadow":"0 0px 0px rgba(0,0,0,.2)","margin":"40rpx auto 40rpx","borderRadius":"24rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 48rpx)","position":"relative","justifyContent":"center","height":"auto"}'>
		  <view :style='{"padding":"0 40rpx","margin":"0","overflow":"hidden","color":"#333","borderRadius":"0px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221223/5bce14e160f54b0789ffe8844f630e15.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20221223/316e41fd4a6f4d14aa0ba79790fd6d12.png) no-repeat right top / auto 100%,url(http://codegen.caihongy.cn/20221223/794be9c86de146ba8bf596bed96d3bd7.png) repeat-x center top / auto 100%","width":"100%","lineHeight":"104rpx","fontSize":"32rpx","fontWeight":"600","height":"104rpx"}'>{{systemIntroductionDetail.title}}</view>
		  <view :style='{"padding":"0px 80rpx 0 16rpx","margin":"0","overflow":"hidden","color":"#fff","borderRadius":"0","textAlign":"center","background":"url() no-repeat right top / auto 100%,#5489ed","display":"none","width":"auto","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'>{{systemIntroductionDetail.subtitle}}</view>
		  <view :style='{"padding":"60rpx 20rpx 40rpx","margin":"60rpx 0 0 0","borderColor":"#1bd0a9","borderRadius":"0px","background":"url(http://codegen.caihongy.cn/20221223/869602be22f342bf8136d5a9f62af2f7.gif) no-repeat right top","borderWidth":"2rpx 2rpx 0px 2rpx","display":"flex","width":"100%","position":"relative","borderStyle":"solid","justifyContent":"space-between","height":"auto"}'>
		    <img :style='{"padding":"20rpx","boxShadow":"inset 0px 0px 0px 0px #edf3fe","margin":"0","borderColor":"#60dfc4","objectFit":"cover","borderRadius":"0px 0 0 0px","borderWidth":"2rpx 0px 2rpx 0px","display":"block","width":"48%","borderStyle":"solid","height":"240rpx"}' v-if="systemIntroductionDetail.picture1" :src="baseUrl+systemIntroductionDetail.picture1">
		    <img :style='{"padding":"20rpx","boxShadow":"inset 0px 0px 0px 0px #edf3fe","margin":"0","borderColor":"#60dfc4","objectFit":"cover","borderRadius":"0 0px 0px 0","borderWidth":"0px 2rpx 0px 2rpx","display":"block","width":"48%","borderStyle":"solid","height":"240rpx"}' v-if="systemIntroductionDetail.picture2" :src="baseUrl+systemIntroductionDetail.picture2">
		    <img :style='{"padding":"24rpx","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","objectFit":"cover","display":"none","right":"12rpx","borderRadius":"10%","borderWidth":"8rpx 4rpx 4rpx 4rpx","width":"30%","position":"absolute","borderStyle":"solid","height":"400rpx"}' v-if="systemIntroductionDetail.picture3" :src="baseUrl+systemIntroductionDetail.picture3">
		  </view>
		  <view :style='{"padding":"0px 20rpx 40rpx","boxShadow":"inset 0px 0px 0px 0px #87acf1","margin":"0px 0 20rpx 0","borderColor":"#1bd0a9","color":"#333","textIndent":"2em","borderRadius":"0px","background":"url(http://codegen.caihongy.cn/20221223/869602be22f342bf8136d5a9f62af2f7.gif) no-repeat right top","borderWidth":"0px 2rpx 2rpx 2rpx","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","borderStyle":"double solid solid solid","height":"auto"}' v-html="systemIntroductionDetail.content"></view>
		  <view :style='{"width":"82%","position":"absolute","top":"152rpx","background":"url(http://codegen.caihongy.cn/20221223/27ba3300b15d4fc98d5d648662bf1ef6.png) no-repeat","display":"block","height":"36rpx"}' />
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		</view>

		<!-- 新闻资讯 -->
																																																		<view class="listBox news">
			<view v-if="false && 1 == 1" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"padding":"0px 0","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"0 auto 0px","overflow":"hidden","borderRadius":"0","background":"url(http://codegen.caihongy.cn/20221223/5bce14e160f54b0789ffe8844f630e15.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20221223/316e41fd4a6f4d14aa0ba79790fd6d12.png) no-repeat right top / auto 100%,url(http://codegen.caihongy.cn/20221223/794be9c86de146ba8bf596bed96d3bd7.png) repeat-x center top / auto 100%","display":"flex","width":"calc(100% - 40rpx)","lineHeight":"104rpx","justifyContent":"space-between","height":"104rpx"}'>
				<view :style='{"padding":"0 0 0 120rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.2)","margin":"0px 0 0","color":"#333","textAlign":"center","display":"inline-block","minWidth":"240rpx","borderRadius":"0px","background":"url() no-repeat right top / auto 100%","width":"calc(100% - 160rpx)","fontSize":"32rpx","lineHeight":"104rpx","fontWeight":"600","height":"104rpx"}'>物流资讯</view>
				<text :style='{"padding":"0 20rpx 0 0","margin":"0px 0px 0 0","fontSize":"28rpx","color":"#999","background":"none"}' @tap="onPageTap('news')">查看更多</text>
			</view>
			
			<view v-if="false && 1 == 2" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
					  
						
						<!-- 样式3 -->
			<view class="list-box style3" :style='{"padding":"160rpx 0px 160rpx","margin":"40rpx auto 0","borderColor":"#21d5ae","background":"url(http://codegen.caihongy.cn/20221223/869602be22f342bf8136d5a9f62af2f7.gif) no-repeat right top,url(http://codegen.caihongy.cn/20221223/a3dca8908c4c40b68f285ba0a3226a99.png) no-repeat left top / 100% auto,url(http://codegen.caihongy.cn/20221223/5100c3e4960949eeaacbc47dc102c484.png) no-repeat left bottom / 100% auto","borderWidth":"2rpx 0","width":"calc(100% - 0px)","borderStyle":"dashed","height":"auto"}'>
				<view @tap="onNewsDetailTap(item.id)" v-for="(item,index) in news" :key="index" class="list-item" :style='{"boxShadow":"0 0px 0px rgba(0,0,0,.3)","padding":"56rpx 20rpx 56rpx","margin":"0 0 20rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20221223/eeb1d8003bcf41b0acd7cd88f736e734.png) no-repeat left top / 100% auto,url(http://codegen.caihongy.cn/20221223/bc76a8b5867243299dc80d79ed1de844.png) no-repeat left bottom / 100% auto,rgba(238,238,238,.6)","display":"flex","width":"100%","height":"auto"}'>
					<image v-if="item.picture" :style='{"width":"200rpx","objectFit":"cover","borderRadius":"0px","display":"block","height":"200rpx"}' class="list-item-image" mode="aspectFill" :src="baseUrl+item.picture"></image>
					<view class="list-item-body" :style='{"width":"calc(100% - 200rpx)","padding":"0","margin":"0","height":"auto"}'>
						<view :style='{"width":"100%","padding":"0 20rpx","margin":"0","lineHeight":"48rpx","fontSize":"28rpx","color":"#333"}' class="list-item-title">{{item.title}}</view>
						<view :style='{"padding":"0 20rpx","margin":"0","color":"#999","textAlign":"right","width":"100%","lineHeight":"48rpx","fontSize":"28rpx"}' class="list-item-pirce">发布时间：{{item.addtime}}</view>
					</view>
				</view>
			</view>
						
		  <!-- 样式4 -->
		  		  
		  <!-- 样式5 -->
		  		  
		  <!-- 样式6 -->
		  		  
		  <!-- 样式7 -->
		  		  
		  <!-- 样式8 -->
		  		  
		  <!-- 样式9 -->
		  			
			<view v-if="false && 1 == 3" class="idea newsIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
														<!-- 新闻资讯 -->
				
		<!-- 关于我们 -->
		<view :style='{"padding":"0px 24rpx 0px","boxShadow":"0 0px 0px rgba(0,0,0,0)","margin":"60rpx auto 40rpx","borderRadius":"0px","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 0px)","position":"relative","justifyContent":"center","height":"auto"}'>
		  <view :style='{"padding":"0 104rpx","margin":"0","overflow":"hidden","color":"#333","borderRadius":"0px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221223/5bce14e160f54b0789ffe8844f630e15.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20221223/316e41fd4a6f4d14aa0ba79790fd6d12.png) no-repeat right top / auto 100%,url(http://codegen.caihongy.cn/20221223/794be9c86de146ba8bf596bed96d3bd7.png) repeat-x center top / auto 100%","width":"100%","lineHeight":"104rpx","fontSize":"32rpx","fontWeight":"600","height":"104rpx"}'>{{aboutUsDetail.title}}</view>
		  <view :style='{"padding":"0px 80rpx 0 16rpx","margin":"0px 0 0","overflow":"hidden","color":"#fff","borderRadius":"0","textAlign":"center","background":"url() no-repeat right top / auto 100%,#5489ed","display":"none","width":"auto","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}'>{{aboutUsDetail.subtitle}}</view>
		  <view :style='{"border":"0px double #ffeeba","padding":"0px","boxShadow":"0px 0px 0px rgba(0,0,0,.2)","margin":"-336rpx 0 0 0px","display":"flex","float":"right","justifyContent":"space-between","borderRadius":"0","flexWrap":"wrap","background":"none","width":"90%","height":"auto","order":"1"}'>
		    <img :style='{"padding":"0px","boxShadow":"inset 0px 0px 112rpx 0px #fff","margin":"0","borderColor":"#e9be70","objectFit":"cover","borderRadius":"0 0 24rpx 24rpx","borderWidth":"0px","display":"inline-block","width":"100%","borderStyle":"solid","height":"300rpx"}' v-if="aboutUsDetail.picture1" :src="baseUrl+aboutUsDetail.picture1">
		    <img :style='{"border":"0px dotted #f7de91","padding":"0px","margin":"0px","objectFit":"cover","borderRadius":"16rpx","display":"none","width":"48%","height":"200rpx"}' v-if="aboutUsDetail.picture2" :src="baseUrl+aboutUsDetail.picture2">
		    <img :style='{"width":"48%","margin":"0px","objectFit":"cover","borderRadius":"16rpx","display":"none","height":"160rpx"}' v-if="aboutUsDetail.picture3" :src="baseUrl+aboutUsDetail.picture3">
		  </view>
		  <view :style='{"padding":"76rpx 40rpx 360rpx","boxShadow":"0px 0px 0px #ccc","margin":"48rpx 0px 0 0","borderColor":"#1bd0a9","color":"rgb(102, 102, 102)","textIndent":"2em","float":"left","borderRadius":"0 0 40rpx 40rpx","background":"url(http://codegen.caihongy.cn/20221223/869602be22f342bf8136d5a9f62af2f7.gif) no-repeat right top,linear-gradient(180deg, rgba(255,255,255,.1) 0%, rgba(143,232,213,.1) 80%, rgba(27,208,169,.1) 100%)","borderWidth":"2rpx","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","borderStyle":"solid","height":"auto","order":"0"}' v-html="aboutUsDetail.content"></view>
		  <view :style='{"width":"80%","position":"absolute","top":"140rpx","background":"url(http://codegen.caihongy.cn/20221223/27ba3300b15d4fc98d5d648662bf1ef6.png) no-repeat","display":"block","height":"36rpx "}' />
		  <view :style='{"width":"50%","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"160rpx"}' />
		</view>

		<!-- 商品列表 -->
																						<view class="listBox list">
			<view v-if="false && 1 == 1" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"padding":"0px 0","boxShadow":"0px 0px 0px rgba(0,0,0,.1)","margin":"0 auto 0px","overflow":"hidden","borderRadius":"0","background":"url(http://codegen.caihongy.cn/20221223/5bce14e160f54b0789ffe8844f630e15.png) no-repeat left top / auto 100%,url(http://codegen.caihongy.cn/20221223/316e41fd4a6f4d14aa0ba79790fd6d12.png) no-repeat right top / auto 100%,url(http://codegen.caihongy.cn/20221223/794be9c86de146ba8bf596bed96d3bd7.png) repeat-x center top / auto 100%","display":"flex","width":"calc(100% - 40rpx)","lineHeight":"104rpx","justifyContent":"space-between","height":"104rpx"}'>
				<view :style='{"padding":"0 0 0 120rpx","boxShadow":"0px 0px 0px rgba(0,0,0,.2)","margin":"0px 0 0","color":"#333","textAlign":"center","display":"inline-block","minWidth":"240rpx","borderRadius":"0px","background":"url() no-repeat right top / auto 100%","width":"calc(100% - 160rpx)","fontSize":"32rpx","lineHeight":"104rpx","fontWeight":"600","height":"104rpx"}'>物流公司</view>
				<text :style='{"padding":"0 20rpx 0 0","margin":"0px 0px 0 0","fontSize":"28rpx","color":"#999","background":"none"}' @tap="onPageTap('wuliugongsi')">查看更多</text>
			</view>
			
			<view v-if="false && 1 == 2" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  
		  		  
		  		  <!-- 样式3 -->
		  <view v-if="3 == 3" class="list-box style3" :style='{"padding":"160rpx 0px 172rpx","boxShadow":"0 0px 0px rgba(0,0,0,.1)","margin":"40rpx auto","borderColor":"#21d5ae","borderRadius":"0px","background":"url(http://codegen.caihongy.cn/20221223/869602be22f342bf8136d5a9f62af2f7.gif) no-repeat right top,url(http://codegen.caihongy.cn/20221223/a3dca8908c4c40b68f285ba0a3226a99.png) no-repeat left top / 100% auto,url(http://codegen.caihongy.cn/20221223/5100c3e4960949eeaacbc47dc102c484.png) no-repeat left bottom / 100% auto","borderWidth":"2rpx 0px","width":"calc(100% - 0px)","borderStyle":"dashed","height":"auto"}'>
			<view @tap="onDetailTap('wuliugongsi',product.id)" v-for="(product,index) in homewuliugongsilist" :key="index" class="list-item" :style='{"border":"0px solid #83ddca","padding":"56rpx 20rpx 56rpx","boxShadow":"0 0px 0px rgba(0,0,0,.1),inset 0px 0px 0px 0px #ffef92","margin":"0 auto 40rpx","borderRadius":"0px","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20221223/eeb1d8003bcf41b0acd7cd88f736e734.png) no-repeat left top / 100% auto,url(http://codegen.caihongy.cn/20221223/bc76a8b5867243299dc80d79ed1de844.png) no-repeat left bottom / 100% auto,rgba(238,238,238,.6)","display":"flex","width":"calc(100% - 0px)","justifyContent":"space-between","height":"auto"}'>
			  			  			  			  			  			  			  			  			  			  			  			  			  <image :style='{"width":"200rpx","objectFit":"cover","borderRadius":"0px","display":"block","height":"200rpx"}' class="list-item-image" mode="aspectFill" v-if="product.gongsitupian.substring(0,4)=='http'" :src="product.gongsitupian"></image>
			  <image :style='{"width":"200rpx","objectFit":"cover","borderRadius":"0px","display":"block","height":"200rpx"}' class="list-item-image" mode="aspectFill" v-else :src="product.gongsitupian?baseUrl+product.gongsitupian.split(',')[0]:''"></image>
			  			  			  			  			  <view class="list-item-body" :style='{"border":"0px dotted #f7de91","padding":"0","margin":"0","overflow":"hidden","borderRadius":"16rpx","background":"none","width":"calc(100% - 224rpx)","position":"relative","height":"192rpx"}'>
				                				<view :style='{"padding":"0 20rpx","margin":"0","whiteSpace":"nowrap","overflow":"hidden","color":"#333","borderRadius":"16rpx","background":"none","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="list-item-title">{{product.gongsimingcheng}}</view>
								                				                				                				                				                				                																																																																			  </view>
			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 1 == 3" class="idea listIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box1"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#fff","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																																										<!-- 商品列表 -->
		
		

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
				iconArr: [
				  'cuIcon-same',
				  'cuIcon-deliver',
				  'cuIcon-evaluate',
				  'cuIcon-shop',
				  'cuIcon-ticket',
				  'cuIcon-cascades',
				  'cuIcon-discover',
				  'cuIcon-question',
				  'cuIcon-pic',
				  'cuIcon-filter',
				  'cuIcon-footprint',
				  'cuIcon-pulldown',
				  'cuIcon-pullup',
				  'cuIcon-moreandroid',
				  'cuIcon-refund',
				  'cuIcon-qrcode',
				  'cuIcon-remind',
				  'cuIcon-profile',
				  'cuIcon-home',
				  'cuIcon-message',
				  'cuIcon-link',
				  'cuIcon-lock',
				  'cuIcon-unlock',
				  'cuIcon-vip',
				  'cuIcon-weibo',
				  'cuIcon-activity',
				  'cuIcon-friendadd',
				  'cuIcon-friendfamous',
				  'cuIcon-friend',
				  'cuIcon-goods',
				  'cuIcon-selection'
				],
                role : '',
                aboutUsDetail: {},
                systemIntroductionDetail: {},
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				wuliugongsilist: [],
				homewuliugongsilist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            this.role = uni.getStorageSync("role");
            let table = uni.getStorageSync("nowTable");
            let res = await this.$api.session(table);
            this.user = res.data;
            this.tableName = table;
            let menus = menu.list();
            this.menuList = menus;
            this.menuList.forEach((item,key) => {
                if(this.role==item.roleName) {
                    item.frontMenu.forEach((item2,key2) => {
                        if(item2.child[0].buttons.indexOf("查看")>-1) {
                            this.swiperMenuList.push(item2);
                        }
                    })
                }
            })
        },
		async onShow() {
			// 轮播图
			let swiperList = []
			let res = await this.$api.page('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
            this.getAboutUs();
            this.getSystemIntroduction();
			// 物流资讯
			res = await this.$api.list('news', {
				page: 1,
				limit: 6
			});
			this.news = res.data.list

			// 推荐信息
			res = await this.$api.recommend('wuliugongsi', {                                              
                page: 1,
                limit: 4
            });
			this.wuliugongsilist = res.data.list

			res = await this.$api.list('wuliugongsi', {
				page: 1,

				limit: 6
			});
			this.homewuliugongsilist = res.data.list
		},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
            async getAboutUs() {
                let res = await this.$api.info('aboutus', 1)
                this.aboutUsDetail = res.data;
            },
            async getSystemIntroduction() {
                let res = await this.$api.info('systemintro', 1)
                this.systemIntroductionDetail = res.data;
            },
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
            onPageTap2(url) {
                uni.setStorageSync("useridTag",0);
                uni.navigateTo({
                    url: url,
                    fail: function() {
                        uni.switchTab({
                            url: url
                        });
                    }
                });
            }
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>

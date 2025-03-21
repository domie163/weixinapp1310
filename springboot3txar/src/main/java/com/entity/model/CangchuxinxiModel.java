package com.entity.model;

import com.entity.CangchuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 仓储信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
public class CangchuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
	/**
	 * 物品分类
	 */
	
	private String wupinfenlei;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 重量kg
	 */
	
	private Float zhongliang;
		
	/**
	 * 费用
	 */
	
	private Float feiyong;
		
	/**
	 * 收件人
	 */
	
	private String shoujianren;
		
	/**
	 * 收件地址
	 */
	
	private String shoujiandizhi;
		
	/**
	 * 联系手机
	 */
	
	private String lianxishouji;
		
	/**
	 * 取货方式
	 */
	
	private String quhuofangshi;
		
	/**
	 * 支付类别
	 */
	
	private String zhifuleibie;
		
	/**
	 * 到达时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daodashijian;
		
	/**
	 * 仓储员
	 */
	
	private String cangchuyuan;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 物流信息
	 */
	
	private String wuliuxinxi;
		
	/**
	 * 运输路线4
	 */
	
	private String yunshuluxian;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：物品名称
	 */
	 
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
				
	
	/**
	 * 设置：物品分类
	 */
	 
	public void setWupinfenlei(String wupinfenlei) {
		this.wupinfenlei = wupinfenlei;
	}
	
	/**
	 * 获取：物品分类
	 */
	public String getWupinfenlei() {
		return wupinfenlei;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：重量kg
	 */
	 
	public void setZhongliang(Float zhongliang) {
		this.zhongliang = zhongliang;
	}
	
	/**
	 * 获取：重量kg
	 */
	public Float getZhongliang() {
		return zhongliang;
	}
				
	
	/**
	 * 设置：费用
	 */
	 
	public void setFeiyong(Float feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public Float getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：收件人
	 */
	 
	public void setShoujianren(String shoujianren) {
		this.shoujianren = shoujianren;
	}
	
	/**
	 * 获取：收件人
	 */
	public String getShoujianren() {
		return shoujianren;
	}
				
	
	/**
	 * 设置：收件地址
	 */
	 
	public void setShoujiandizhi(String shoujiandizhi) {
		this.shoujiandizhi = shoujiandizhi;
	}
	
	/**
	 * 获取：收件地址
	 */
	public String getShoujiandizhi() {
		return shoujiandizhi;
	}
				
	
	/**
	 * 设置：联系手机
	 */
	 
	public void setLianxishouji(String lianxishouji) {
		this.lianxishouji = lianxishouji;
	}
	
	/**
	 * 获取：联系手机
	 */
	public String getLianxishouji() {
		return lianxishouji;
	}
				
	
	/**
	 * 设置：取货方式
	 */
	 
	public void setQuhuofangshi(String quhuofangshi) {
		this.quhuofangshi = quhuofangshi;
	}
	
	/**
	 * 获取：取货方式
	 */
	public String getQuhuofangshi() {
		return quhuofangshi;
	}
				
	
	/**
	 * 设置：支付类别
	 */
	 
	public void setZhifuleibie(String zhifuleibie) {
		this.zhifuleibie = zhifuleibie;
	}
	
	/**
	 * 获取：支付类别
	 */
	public String getZhifuleibie() {
		return zhifuleibie;
	}
				
	
	/**
	 * 设置：到达时间
	 */
	 
	public void setDaodashijian(Date daodashijian) {
		this.daodashijian = daodashijian;
	}
	
	/**
	 * 获取：到达时间
	 */
	public Date getDaodashijian() {
		return daodashijian;
	}
				
	
	/**
	 * 设置：仓储员
	 */
	 
	public void setCangchuyuan(String cangchuyuan) {
		this.cangchuyuan = cangchuyuan;
	}
	
	/**
	 * 获取：仓储员
	 */
	public String getCangchuyuan() {
		return cangchuyuan;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：物流信息
	 */
	 
	public void setWuliuxinxi(String wuliuxinxi) {
		this.wuliuxinxi = wuliuxinxi;
	}
	
	/**
	 * 获取：物流信息
	 */
	public String getWuliuxinxi() {
		return wuliuxinxi;
	}
				
	
	/**
	 * 设置：运输路线4
	 */
	 
	public void setYunshuluxian(String yunshuluxian) {
		this.yunshuluxian = yunshuluxian;
	}
	
	/**
	 * 获取：运输路线4
	 */
	public String getYunshuluxian() {
		return yunshuluxian;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}

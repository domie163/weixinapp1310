package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 收货信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
@TableName("shouhuoxinxi")
public class ShouhuoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShouhuoxinxiEntity() {
		
	}
	
	public ShouhuoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 快递单号
	 */
					
	private String kuaididanhao;
	
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
	 * 收货账号
	 */
					
	private String shouhuozhanghao;
	
	/**
	 * 收货姓名
	 */
					
	private String shouhuoxingming;
	
	/**
	 * 收货日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shouhuoriqi;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：快递单号
	 */
	public void setKuaididanhao(String kuaididanhao) {
		this.kuaididanhao = kuaididanhao;
	}
	/**
	 * 获取：快递单号
	 */
	public String getKuaididanhao() {
		return kuaididanhao;
	}
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
	 * 设置：收货账号
	 */
	public void setShouhuozhanghao(String shouhuozhanghao) {
		this.shouhuozhanghao = shouhuozhanghao;
	}
	/**
	 * 获取：收货账号
	 */
	public String getShouhuozhanghao() {
		return shouhuozhanghao;
	}
	/**
	 * 设置：收货姓名
	 */
	public void setShouhuoxingming(String shouhuoxingming) {
		this.shouhuoxingming = shouhuoxingming;
	}
	/**
	 * 获取：收货姓名
	 */
	public String getShouhuoxingming() {
		return shouhuoxingming;
	}
	/**
	 * 设置：收货日期
	 */
	public void setShouhuoriqi(Date shouhuoriqi) {
		this.shouhuoriqi = shouhuoriqi;
	}
	/**
	 * 获取：收货日期
	 */
	public Date getShouhuoriqi() {
		return shouhuoriqi;
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

package com.entity.view;

import com.entity.ShouhuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 收货信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
@TableName("shouhuoxinxi")
public class ShouhuoxinxiView  extends ShouhuoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShouhuoxinxiView(){
	}
 
 	public ShouhuoxinxiView(ShouhuoxinxiEntity shouhuoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shouhuoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

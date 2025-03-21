package com.entity.view;

import com.entity.YunshuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 运输信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
@TableName("yunshuxinxi")
public class YunshuxinxiView  extends YunshuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YunshuxinxiView(){
	}
 
 	public YunshuxinxiView(YunshuxinxiEntity yunshuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yunshuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.ZhuangxiebanyunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 装卸搬运
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
@TableName("zhuangxiebanyun")
public class ZhuangxiebanyunView  extends ZhuangxiebanyunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuangxiebanyunView(){
	}
 
 	public ZhuangxiebanyunView(ZhuangxiebanyunEntity zhuangxiebanyunEntity){
 	try {
			BeanUtils.copyProperties(this, zhuangxiebanyunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

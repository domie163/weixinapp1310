package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangxiebanyunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangxiebanyunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangxiebanyunView;


/**
 * 装卸搬运
 *
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
public interface ZhuangxiebanyunService extends IService<ZhuangxiebanyunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangxiebanyunVO> selectListVO(Wrapper<ZhuangxiebanyunEntity> wrapper);
   	
   	ZhuangxiebanyunVO selectVO(@Param("ew") Wrapper<ZhuangxiebanyunEntity> wrapper);
   	
   	List<ZhuangxiebanyunView> selectListView(Wrapper<ZhuangxiebanyunEntity> wrapper);
   	
   	ZhuangxiebanyunView selectView(@Param("ew") Wrapper<ZhuangxiebanyunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangxiebanyunEntity> wrapper);
   	

}


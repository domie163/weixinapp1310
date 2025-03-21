package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouhuoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouhuoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouhuoxinxiView;


/**
 * 收货信息
 *
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
public interface ShouhuoxinxiService extends IService<ShouhuoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouhuoxinxiVO> selectListVO(Wrapper<ShouhuoxinxiEntity> wrapper);
   	
   	ShouhuoxinxiVO selectVO(@Param("ew") Wrapper<ShouhuoxinxiEntity> wrapper);
   	
   	List<ShouhuoxinxiView> selectListView(Wrapper<ShouhuoxinxiEntity> wrapper);
   	
   	ShouhuoxinxiView selectView(@Param("ew") Wrapper<ShouhuoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouhuoxinxiEntity> wrapper);
   	

}


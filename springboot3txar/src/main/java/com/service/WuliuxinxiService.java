package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuliuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuliuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuliuxinxiView;


/**
 * 物流信息
 *
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
public interface WuliuxinxiService extends IService<WuliuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuliuxinxiVO> selectListVO(Wrapper<WuliuxinxiEntity> wrapper);
   	
   	WuliuxinxiVO selectVO(@Param("ew") Wrapper<WuliuxinxiEntity> wrapper);
   	
   	List<WuliuxinxiView> selectListView(Wrapper<WuliuxinxiEntity> wrapper);
   	
   	WuliuxinxiView selectView(@Param("ew") Wrapper<WuliuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuliuxinxiEntity> wrapper);
   	

}


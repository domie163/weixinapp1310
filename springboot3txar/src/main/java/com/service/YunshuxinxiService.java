package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YunshuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YunshuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YunshuxinxiView;


/**
 * 运输信息
 *
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
public interface YunshuxinxiService extends IService<YunshuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YunshuxinxiVO> selectListVO(Wrapper<YunshuxinxiEntity> wrapper);
   	
   	YunshuxinxiVO selectVO(@Param("ew") Wrapper<YunshuxinxiEntity> wrapper);
   	
   	List<YunshuxinxiView> selectListView(Wrapper<YunshuxinxiEntity> wrapper);
   	
   	YunshuxinxiView selectView(@Param("ew") Wrapper<YunshuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YunshuxinxiEntity> wrapper);
   	

}


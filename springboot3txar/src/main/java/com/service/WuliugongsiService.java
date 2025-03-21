package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuliugongsiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuliugongsiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuliugongsiView;


/**
 * 物流公司
 *
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
public interface WuliugongsiService extends IService<WuliugongsiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuliugongsiVO> selectListVO(Wrapper<WuliugongsiEntity> wrapper);
   	
   	WuliugongsiVO selectVO(@Param("ew") Wrapper<WuliugongsiEntity> wrapper);
   	
   	List<WuliugongsiView> selectListView(Wrapper<WuliugongsiEntity> wrapper);
   	
   	WuliugongsiView selectView(@Param("ew") Wrapper<WuliugongsiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuliugongsiEntity> wrapper);
   	

}


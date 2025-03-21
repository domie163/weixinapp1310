package com.dao;

import com.entity.WuliugongsiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuliugongsiVO;
import com.entity.view.WuliugongsiView;


/**
 * 物流公司
 * 
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
public interface WuliugongsiDao extends BaseMapper<WuliugongsiEntity> {
	
	List<WuliugongsiVO> selectListVO(@Param("ew") Wrapper<WuliugongsiEntity> wrapper);
	
	WuliugongsiVO selectVO(@Param("ew") Wrapper<WuliugongsiEntity> wrapper);
	
	List<WuliugongsiView> selectListView(@Param("ew") Wrapper<WuliugongsiEntity> wrapper);

	List<WuliugongsiView> selectListView(Pagination page,@Param("ew") Wrapper<WuliugongsiEntity> wrapper);
	
	WuliugongsiView selectView(@Param("ew") Wrapper<WuliugongsiEntity> wrapper);
	

}

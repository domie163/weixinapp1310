package com.dao;

import com.entity.ShouhuoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouhuoxinxiVO;
import com.entity.view.ShouhuoxinxiView;


/**
 * 收货信息
 * 
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
public interface ShouhuoxinxiDao extends BaseMapper<ShouhuoxinxiEntity> {
	
	List<ShouhuoxinxiVO> selectListVO(@Param("ew") Wrapper<ShouhuoxinxiEntity> wrapper);
	
	ShouhuoxinxiVO selectVO(@Param("ew") Wrapper<ShouhuoxinxiEntity> wrapper);
	
	List<ShouhuoxinxiView> selectListView(@Param("ew") Wrapper<ShouhuoxinxiEntity> wrapper);

	List<ShouhuoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShouhuoxinxiEntity> wrapper);
	
	ShouhuoxinxiView selectView(@Param("ew") Wrapper<ShouhuoxinxiEntity> wrapper);
	

}

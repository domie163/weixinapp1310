package com.dao;

import com.entity.ZhuangxiebanyunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangxiebanyunVO;
import com.entity.view.ZhuangxiebanyunView;


/**
 * 装卸搬运
 * 
 * @author 
 * @email 
 * @date 2023-01-20 18:50:56
 */
public interface ZhuangxiebanyunDao extends BaseMapper<ZhuangxiebanyunEntity> {
	
	List<ZhuangxiebanyunVO> selectListVO(@Param("ew") Wrapper<ZhuangxiebanyunEntity> wrapper);
	
	ZhuangxiebanyunVO selectVO(@Param("ew") Wrapper<ZhuangxiebanyunEntity> wrapper);
	
	List<ZhuangxiebanyunView> selectListView(@Param("ew") Wrapper<ZhuangxiebanyunEntity> wrapper);

	List<ZhuangxiebanyunView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangxiebanyunEntity> wrapper);
	
	ZhuangxiebanyunView selectView(@Param("ew") Wrapper<ZhuangxiebanyunEntity> wrapper);
	

}

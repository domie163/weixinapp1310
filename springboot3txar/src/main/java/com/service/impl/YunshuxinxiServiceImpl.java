package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YunshuxinxiDao;
import com.entity.YunshuxinxiEntity;
import com.service.YunshuxinxiService;
import com.entity.vo.YunshuxinxiVO;
import com.entity.view.YunshuxinxiView;

@Service("yunshuxinxiService")
public class YunshuxinxiServiceImpl extends ServiceImpl<YunshuxinxiDao, YunshuxinxiEntity> implements YunshuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YunshuxinxiEntity> page = this.selectPage(
                new Query<YunshuxinxiEntity>(params).getPage(),
                new EntityWrapper<YunshuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YunshuxinxiEntity> wrapper) {
		  Page<YunshuxinxiView> page =new Query<YunshuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YunshuxinxiVO> selectListVO(Wrapper<YunshuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YunshuxinxiVO selectVO(Wrapper<YunshuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YunshuxinxiView> selectListView(Wrapper<YunshuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YunshuxinxiView selectView(Wrapper<YunshuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

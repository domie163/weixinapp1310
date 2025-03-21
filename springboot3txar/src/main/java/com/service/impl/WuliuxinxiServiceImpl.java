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


import com.dao.WuliuxinxiDao;
import com.entity.WuliuxinxiEntity;
import com.service.WuliuxinxiService;
import com.entity.vo.WuliuxinxiVO;
import com.entity.view.WuliuxinxiView;

@Service("wuliuxinxiService")
public class WuliuxinxiServiceImpl extends ServiceImpl<WuliuxinxiDao, WuliuxinxiEntity> implements WuliuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuliuxinxiEntity> page = this.selectPage(
                new Query<WuliuxinxiEntity>(params).getPage(),
                new EntityWrapper<WuliuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuliuxinxiEntity> wrapper) {
		  Page<WuliuxinxiView> page =new Query<WuliuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuliuxinxiVO> selectListVO(Wrapper<WuliuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuliuxinxiVO selectVO(Wrapper<WuliuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuliuxinxiView> selectListView(Wrapper<WuliuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuliuxinxiView selectView(Wrapper<WuliuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

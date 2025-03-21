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


import com.dao.ShouhuoxinxiDao;
import com.entity.ShouhuoxinxiEntity;
import com.service.ShouhuoxinxiService;
import com.entity.vo.ShouhuoxinxiVO;
import com.entity.view.ShouhuoxinxiView;

@Service("shouhuoxinxiService")
public class ShouhuoxinxiServiceImpl extends ServiceImpl<ShouhuoxinxiDao, ShouhuoxinxiEntity> implements ShouhuoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouhuoxinxiEntity> page = this.selectPage(
                new Query<ShouhuoxinxiEntity>(params).getPage(),
                new EntityWrapper<ShouhuoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouhuoxinxiEntity> wrapper) {
		  Page<ShouhuoxinxiView> page =new Query<ShouhuoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouhuoxinxiVO> selectListVO(Wrapper<ShouhuoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouhuoxinxiVO selectVO(Wrapper<ShouhuoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouhuoxinxiView> selectListView(Wrapper<ShouhuoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouhuoxinxiView selectView(Wrapper<ShouhuoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

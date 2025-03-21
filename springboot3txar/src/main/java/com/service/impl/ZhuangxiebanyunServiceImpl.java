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


import com.dao.ZhuangxiebanyunDao;
import com.entity.ZhuangxiebanyunEntity;
import com.service.ZhuangxiebanyunService;
import com.entity.vo.ZhuangxiebanyunVO;
import com.entity.view.ZhuangxiebanyunView;

@Service("zhuangxiebanyunService")
public class ZhuangxiebanyunServiceImpl extends ServiceImpl<ZhuangxiebanyunDao, ZhuangxiebanyunEntity> implements ZhuangxiebanyunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuangxiebanyunEntity> page = this.selectPage(
                new Query<ZhuangxiebanyunEntity>(params).getPage(),
                new EntityWrapper<ZhuangxiebanyunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuangxiebanyunEntity> wrapper) {
		  Page<ZhuangxiebanyunView> page =new Query<ZhuangxiebanyunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuangxiebanyunVO> selectListVO(Wrapper<ZhuangxiebanyunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuangxiebanyunVO selectVO(Wrapper<ZhuangxiebanyunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuangxiebanyunView> selectListView(Wrapper<ZhuangxiebanyunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuangxiebanyunView selectView(Wrapper<ZhuangxiebanyunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

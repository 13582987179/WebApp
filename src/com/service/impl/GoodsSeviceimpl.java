package com.service.impl;

import com.dao.GoodsDao;
import com.dao.GoodsDaoImpl;
import com.po.GoodsBean;
import com.service.GoodsService;

public class GoodsSeviceimpl implements GoodsService {

	@Override
	public int add(GoodsBean GoodsBean) {
		GoodsDao goodsDao=new GoodsDaoImpl();
		return goodsDao.add(GoodsBean);
	}

	@Override
	public GoodsBean findbyid(int id) {
		GoodsDao goodsDao=new GoodsDaoImpl();
		return goodsDao.findbyid(id);
	}

	@Override
	public int updata(GoodsBean p) {
		GoodsDao goodsDao=new GoodsDaoImpl();
		return goodsDao.updata(p);
	}

}

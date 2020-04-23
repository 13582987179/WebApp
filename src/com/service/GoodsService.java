package com.service;

import com.po.GoodsBean;


public interface GoodsService {
	int add(GoodsBean goodsBean) ;
	GoodsBean findbyid(int id);
	int updata(GoodsBean p);

}

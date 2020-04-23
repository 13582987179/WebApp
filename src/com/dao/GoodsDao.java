package com.dao;

import com.po.GoodsBean;

public interface GoodsDao {
	int add(GoodsBean GoodsBean) ;

	GoodsBean findbyid(int id);

	int updata(GoodsBean p);
}

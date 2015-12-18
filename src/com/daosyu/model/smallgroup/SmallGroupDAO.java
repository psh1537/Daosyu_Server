package com.daosyu.model.smallgroup;

import java.util.List;

public interface SmallGroupDAO {
	public void insert(SmallGroup smg);
	public List selectAll();
	public SmallGroup seletOne(int small_group_id);
	
}

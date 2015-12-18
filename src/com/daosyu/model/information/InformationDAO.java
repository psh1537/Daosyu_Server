package com.daosyu.model.information;

import java.util.List;

public interface InformationDAO {
	public void insert(Information info);
	public Information selectOne(int info_id);
	public List selectAll();
	public void update(Information info);
	public void delete(int info_id);
}

package com.daosyu.model.notice;

import java.util.List;

public interface NoticeService {
	public void insert(Notice notice);
	public List selectAll();
	public Notice seletOne(int notice_id);
	public void delete(int notice_id);
	public void update(Notice notice);
}

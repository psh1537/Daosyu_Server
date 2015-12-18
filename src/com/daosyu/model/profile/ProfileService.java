package com.daosyu.model.profile;

import java.util.List;

public interface ProfileService {
	public void insert(Profile profile);
	public Profile selectOne(int profile_id);
	public List selectAll();
	public void update(Profile profile);
	public void delete(int profile_id);
}

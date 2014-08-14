package userinfo.dao;

import domain.userinfo.UserInfo;

public interface IUserInfoDao {
	public void insertUserInfo(UserInfo userinfo);
	public void deleteUserInfo(UserInfo userinfo);
	public void updateUserInfo(UserInfo userinfo);
}

package userinfo.dao.oracle;

import userinfo.dao.IUserInfoDao;
import domain.userinfo.UserInfo;

public class UserInfoOracleDao implements IUserInfoDao {
	public void insertUserInfo(UserInfo userInfo){
		System.out.println("Insert user info oracle with userid = " + userInfo.getId());
	}
	
	//public void insertUserInfo(int id, String name, String address){
	//	 이렇게 오버로딩 해주면 좋지만 일단은 스킵 
	//}
	
	public void deleteUserInfo(UserInfo userInfo){
		System.out.println("Delete user info oracle with userid = " + userInfo.getId());
	}
	
	public void updateUserInfo(UserInfo userInfo){
		System.out.println("Update user info oracle with userid = " + userInfo.getId());
	}
}

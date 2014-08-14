package userinfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import userinfo.dao.IUserInfoDao;
import userinfo.dao.mysql.UserInfoMysqlDao;
import userinfo.dao.oracle.UserInfoOracleDao;
import domain.userinfo.UserInfo;

public class UserInfoWebClient {

	
	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		FileInputStream in = new FileInputStream("db.properties");
		props.load(in);
		String dbtype = props.getProperty("dbType");
		IUserInfoDao dao = new UserInfoOracleDao();
	
		if(dbtype.equals("MYSQL")) {
			dao = new UserInfoMysqlDao();
		}
		UserInfo userInfo = new UserInfo(100, "Tomas", "Seoul");
		
		
		dao.insertUserInfo(userInfo);
		dao.deleteUserInfo(userInfo);
		dao.updateUserInfo(userInfo);
		in.close();

	}

}

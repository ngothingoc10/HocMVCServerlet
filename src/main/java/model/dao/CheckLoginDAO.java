package model.dao;

import java.util.ArrayList;

import model.bean.Wife;
import java.util.ArrayList;


public class CheckLoginDAO {
	public boolean isExistUser( String userName, String password) {
		//COnnect Database
		return true;
		
	}
	
	public ArrayList<Wife> getWifeList(String userName) {
		
		ArrayList<Wife> result = new ArrayList<Wife>();
		//Connect Database
		Wife wife = new Wife();
		wife.setName("Nguyen Thi No");
		wife.setAddress("Lo gach");
		wife.setAlive(false);
		result.add(wife);
		
		wife = new Wife();
		wife.setName("Chi Pheo");
		wife.setAddress("Ho ca");
		wife.setAlive(true);
		result.add(wife);
		
		return result;
		
			
		}
}

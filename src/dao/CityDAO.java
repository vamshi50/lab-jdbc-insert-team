package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO
{
	 City city;
	public City getCityByName(String a) throws SQLException, Exception {
		// TODO Auto-generated method stub
			ConnectionManager con=new ConnectionManager();
			@SuppressWarnings("static-access")
			Statement st=con.getConnection().createStatement();
			
			String name = null;
			ResultSet rs=st.executeQuery("SELECT * from CITY where cityname="+name+"");
			System.out.println(rs);
			
			while(rs.next()) {
				Long id=rs.getLong("ID");
				String city_name=rs.getString("NAME");
				
				city=new City(id,city_name);
				
			}
			return city;
			
	}
	public void createCity(City city) throws Exception {
		Long cityId=city.getCityld();
		String cityName=city.getCityName();
		
		@SuppressWarnings("unused")
		ConnectionManager cm=new ConnectionManager();
		String sql="insert into CITY(CITY_ID,CITY_NAME)VALUES(?,?)";
		PreparedStatement st=ConnectionManager.getConnection().prepareStatement(sql);
		
		st.setLong(1, cityId);
		st.setString(2, cityName);
		
		st.executeUpdate();
		ConnectionManager.getConnection().close();
	}
	
}
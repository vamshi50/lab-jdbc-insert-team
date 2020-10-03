package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO
{
	 public void createTeam(Team team) throws SQLException, Exception
	 {
		Statement stm = ConnectionManager.getConnection().createStatement();

		String name = team.getName();
		String coach = team.getCoach();
		// City city = team.getCityId();
		String cityid=team.getCity();
	//	String sql1 = "INSERT INTO CITY VALUES(" + team.getCityId() + "," + "'" + team.getCityName() + "'" + ")";
		String sql = "insert into TEAM1( NAME,COACH,CITY)VALUES(?,?,?)";
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1,name);
		st.setString(2,coach);
		st.setString(3,cityid);
		st.executeUpdate();
		ConnectionManager.getConnection().close();
			
	 }
}

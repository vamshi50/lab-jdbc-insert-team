package model;



public class Team
{
	private String  name;
	private String coach;
	private String city;    
   
	
   public String getName() {
		return name;
	}

   public void setName(String name) {
		this.name = name;
	}

    public String getCoach() {
		return coach;
	}

    public void setCoach(String coach) {
		this.coach = coach;
	}

    
   public String getCity() {
		return city;
	}

   public void setCity(String city) {
		this.city = city;
	}
   public Team(String name, String coach,  City city)
   {
	   super();
	   
   }
}


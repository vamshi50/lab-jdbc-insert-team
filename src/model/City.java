package model;






public class City
{
  private long cityld;
  private	String cityName ;
	public long getCityld() {
		return cityld;
	}
	public void setCityld(long cityld) {
		this.cityld = cityld;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	 public City(long cityld,String cityName)
	 {
		 super();
		 this.cityld = cityld;
		 this.cityName = cityName;
		 
	 }
}

package com.fiedlercooper.softwareDeveloperClubProject;

public class ClubMember {

	private String name;
	private String city;
	private String state;
	private String favProLang;

	public ClubMember(String name, String city, String state, String favProLang) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.favProLang = favProLang;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getFavProLang() {
		return favProLang;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setFavProLang(String favProLang) {
		this.favProLang = favProLang;
	}

	@Override
	public String toString() {
		return "\nMember Name: " + name + "\nLocation: " + city + ", " + state + "\nFavorite Language: " + favProLang;
	}

}

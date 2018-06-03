package com.personalinfo;

public  class TestProfile {
public static	void printProfile(IProfile profile) {
	profile.myBasicInfo();
	profile.myHobbies();
}
public static void main(String args[]) {
	IProfile myProfile;
	myProfile = new MohanProfile();
	IProfile friendProfile = new sakthiProfile();
	 printProfile(myProfile);
	 printProfile(friendProfile);
	
	
}
	
}
	

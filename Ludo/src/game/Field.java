package game;

import java.util.HashMap;

public class Field {
	
	private String circleID;
	public HashMap<String, String> circleFree = new HashMap<String, String>();
	private String beginField;
	private String aimField;
	
	//void initField(String circleID, HashMap<String, String> circleFree, String beginField, String aimField) {
	//}
	
	public String getcircleID() {
		return circleID;
	}
	
	public void setcircleID (String circleID) {
		this.circleID = circleID;
	}
	
	public HashMap<String, String> getcircleFree() {
		return circleFree;
	}
	
	public void setcircleID (HashMap<String, String> circleFree) {
		this.circleFree = circleFree;
	}
	
	public String getbeginField() {
		return beginField;
	}
	
	public void setbeginField (String beginField) {
		this.beginField = beginField;
	}
	
	public String getaimField() {
		return aimField;
	}
	
	public void setaimField (String aimField) {
		this.aimField = aimField;
	}

}

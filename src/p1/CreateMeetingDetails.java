package p1;

import java.util.HashSet;

public class CreateMeetingDetails {
	
	private String provision;
	private int room_name;
	private int capacity;
	private int  floor;
	private String[] fecilityRequired;
	
	public String[] getFecilityRequired() {
		return fecilityRequired;
	}

	public void setFecilityRequired(String[] fecilityRequired) {
		this.fecilityRequired = fecilityRequired;
	}

	
	private boolean status;

	public String getProvision() {
		return provision;
	}

	public void setProvision(String provision) {
		this.provision = provision;
	}

	

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	
	public int getRoom_name() {
		return room_name;
	}

	public void setRoom_name(int room_name) {
		this.room_name = room_name;
	}

	

	



	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}

package lakehouse.model;

public class Status {
	
	private boolean isTrashDay;
	private boolean isRecyclingWeek;
	
	public boolean isTrashDay() {
		return isTrashDay;
	}
	
	public void setTrashDay(boolean isTrashDay) {
		this.isTrashDay = isTrashDay;
	}
	
	public boolean isRecyclingWeek() {
		return isRecyclingWeek;
	}
	
	public void setRecyclingWeek(boolean isRecyclingWeek) {
		this.isRecyclingWeek = isRecyclingWeek;
	}

}

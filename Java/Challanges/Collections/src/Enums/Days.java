package Enums;


// method 1 : 
//public enum Days {
//	MON("Weekday"),TUS("Weekday"),WED("Weekday"),THU("Weekday"),FRI("Weekday"),SAT("Weekend"),SUN("Weekend");
//	
//	private String type;
//
//	Days(String type) {
//		this.type = type;
//	}
//
//	public String getType() {
//		return type;
//	}
//}


// method 2:
public enum Days {
	MON(true),TUS(true),WED(true),THU(true),FRI(true),SAT(false),SUN(false);
	
	private boolean isWeekday;

	Days(boolean isWeekday) {
		this.isWeekday = isWeekday;
	}

	public String getType() {
		return isWeekday ? "WeekDay" : "WeekEnd";
	}
}


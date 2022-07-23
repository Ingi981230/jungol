package mainpackage;

public class API_VO2 {
	static API_VO2 apivo2;
	private String arrPlaceNm, arrPlandTime, charge, depPlaceNm, depPlandTime, gradeNm, routeId;

	public API_VO2() {

	}
	
	public API_VO2(String depPlaceNm) {
		this.depPlaceNm = depPlaceNm;
	}

	public API_VO2(String arrPlaceNm, String depPlaceNm) {
		this.arrPlaceNm = arrPlaceNm;
		this.depPlaceNm = depPlaceNm;
	}
	
	public API_VO2(String arrPlaceNm, String arrPlandTime, String charge,String depPlaceNm,String depPlandTime,String gradeNm,String routeId) {
		this.arrPlaceNm = arrPlaceNm;
		this.arrPlandTime = arrPlandTime;
		this.charge = charge;
		this.depPlaceNm = depPlaceNm;
		this.depPlandTime = depPlandTime;
		this.gradeNm = gradeNm;
		this.routeId = routeId;
	}

	public String getArrPlaceNm() {
		return arrPlaceNm;
	}

	public void setArrPlaceNm(String arrPlaceNm) {
		this.arrPlaceNm = arrPlaceNm;
	}

	public String getArrPlandTime() {
		return arrPlandTime;
	}

	public void setArrPlandTime(String arrPlandTime) {
		this.arrPlandTime = arrPlandTime;
	}

	public String getCharge() {
		return charge;
	}

	public void setCharge(String charge) {
		this.charge = charge;
	}

	public String getDepPlaceNm() {
		return depPlaceNm;
	}

	public void setDepPlaceNm(String depPlaceNm) {
		this.depPlaceNm = depPlaceNm;
	}

	public String getDepPlandTime() {
		return depPlandTime;
	}

	public void setDepPlandTime(String depPlandTime) {
		this.depPlandTime = depPlandTime;
	}

	public String getGradeNm() {
		return gradeNm;
	}

	public void setGradeNm(String gradeNm) {
		this.gradeNm = gradeNm;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	
}

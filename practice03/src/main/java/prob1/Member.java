package prob1;

public class Member {
	private String memberName; // 회원의 이름
	private String id; // 회원의 id
	private int point; // 회원의 point
	
	public String getName() {
		return memberName;
	}
	
	public void setName(String inputName) {
		memberName = inputName;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String inputId) {
		id = inputId;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int inputPoint) {
		point = inputPoint;
	}
}

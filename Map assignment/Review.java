package m1;

import java.util.Objects;

public class Review {

	
	private String userName;
	private int point;
	private String comments;
	
	public Review() {
	
	}
	
	public Review(String userName, int point, String comments) {
		super();
		this.userName = userName;
		this.point = point;
		this.comments = comments;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comments, point, userName);
	}

	@Override
	public boolean equals(Object obj) {
        if(obj instanceof Review) {
		Review review= (Review)obj;
		boolean a = review.userName.equals(this.getUserName());
		boolean b = review.point==this.point;
		boolean c = review.comments.equals(this.getComments());
		return a && b && c;
	
		}
	else {
           return false;
	}
}

	@Override
	public String toString() {
		return "Review [userName=" + userName + ", point=" + point + ", comments=" + comments + "]";
	}
}

	

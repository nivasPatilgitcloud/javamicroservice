package ratingservice.ratingservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rating_tb")
public class RatingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ratingid;
	@Column
	private Long userid;
	@Column
	private Long hotelid;
	@Column
	private int rating;
	@Column
	private String feedback;
	public RatingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RatingEntity(Long ratingid, Long userid, Long hotelid, int rating, String feedback) {
		super();
		this.ratingid = ratingid;
		this.userid = userid;
		this.hotelid = hotelid;
		this.rating = rating;
		this.feedback = feedback;
	}
	public Long getRatingid() {
		return ratingid;
	}
	public void setRatingid(Long ratingid) {
		this.ratingid = ratingid;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getHotelid() {
		return hotelid;
	}
	public void setHotelid(Long hotelid) {
		this.hotelid = hotelid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "RatingEntity [ratingid=" + ratingid + ", userid=" + userid + ", hotelid=" + hotelid + ", rating="
				+ rating + ", feedback=" + feedback + "]";
	}
	
	
}

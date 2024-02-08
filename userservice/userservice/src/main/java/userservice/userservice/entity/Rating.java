package userservice.userservice.entity;


public class Rating {

	private Long ratingid;
	private Long userid;
	private Long hotelid;
	private Long rating;
	private String feedback;
	private Hotel hotel;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(Long ratingid, Long userid, Long hotelid, Long rating, String feedback, Hotel hotel) {
		super();
		this.ratingid = ratingid;
		this.userid = userid;
		this.hotelid = hotelid;
		this.rating = rating;
		this.feedback = feedback;
		this.hotel = hotel;
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
	public Long getRating() {
		return rating;
	}
	public void setRating(Long rating) {
		this.rating = rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "Rating [ratingid=" + ratingid + ", userid=" + userid + ", hotelid=" + hotelid + ", rating=" + rating
				+ ", feedback=" + feedback + ", hotel=" + hotel + "]";
	}
	
	
	
}

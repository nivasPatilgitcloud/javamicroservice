package userservice.userservice.entity;


public class Hotel {
	
	private Long hotelid;
	private String hotelname;
	private String address;
	private String about;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(Long hotelid, String hotelname, String address, String about) {
		super();
		this.hotelid = hotelid;
		this.hotelname = hotelname;
		this.address = address;
		this.about = about;
	}
	public Long getHotelid() {
		return hotelid;
	}
	public void setHotelid(Long hotelid) {
		this.hotelid = hotelid;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "Hotel [hotelid=" + hotelid + ", hotelname=" + hotelname + ", address=" + address + ", about=" + about
				+ "]";
	}
	
	
}

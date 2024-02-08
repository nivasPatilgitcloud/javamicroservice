package hotelservice.hotelservice.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="hotel_tb")
public class HotelEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long hotelid;
	@Column
	private String hotelname;
	@Column	
	private String address;
	@Column
	private String about;
	
	public HotelEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelEntity(Long hotelid, String hotelname, String address, String about) {
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
		return "HotelEntity [hotelid=" + hotelid + ", hotelname=" + hotelname + ", address=" + address + ", about="
				+ about + "]";
	}
	
	
	
}

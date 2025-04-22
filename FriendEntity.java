import java.util.Arrays;
import java.util.Date;

public class FriendEntity {
	private int id;
	private String name,lastname, mobno,email,address;
	private String[] hobbies;
	private Date bdate;
	
	public FriendEntity(int id, String name, String lastname, String mobno, String email, String address,
			String[] hobbies, Date bdate) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.mobno = mobno;
		this.email = email;
		this.address = address;
		this.hobbies = hobbies;
		this.bdate = bdate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public String getMobno() {
		return mobno;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	@Override
	public String toString() {
		return "FirendEntity [id=" + id + ", name=" + name + ", lastname=" + lastname + ", mobno=" + mobno + ", email="
				+ email + ", address=" + address + ", hobbies=" + Arrays.toString(hobbies) + ", bdate=" + bdate + "]";
	}
	
	
	

}

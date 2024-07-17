package caraccidentdpoperations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Car {

	@Id
	@Column(name="id") //  <<---  this line becoz to match the id and cid names//
	int cid;
	String company;
	String ownerName;
	String cost;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String company, String ownerName, String cost) {
		super();
		this.company = company;
		this.ownerName = ownerName;
		this.cost = cost;
	}
	public Car(int cid, String company, String ownerName, String cost) {
		super();
		this.cid = cid;
		this.company = company;
		this.ownerName = ownerName;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", company=" + company + ", ownerName=" + ownerName + ", cost=" + cost + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
}

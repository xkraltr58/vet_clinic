package vet_clinic;
import java.sql.Timestamp;

public class treatments {
	private String treatmentName;
	private String description;
	private float price;
	private int duration;
	private String category;
	private Boolean active;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private int vetID;
	
	public treatments(String treatmentName, String description, float price, int duration, String category, Boolean active, Timestamp createdAt, Timestamp updatedAt, int vetID) {
		this.treatmentName=treatmentName;
		this.description=description;
		this.price=price;
		this.duration=duration;
		this.category=category;
		this.active=active;
		this.createdAt=createdAt;
		this.updatedAt=updatedAt;
		this.vetID=vetID;
	}
	
	public String getTreatmentName() {
		return treatmentName;
	}
	public void setTreatment_name(String treatmentName) {
		this.treatmentName=treatmentName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active=active;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt=createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt=updatedAt;
	}
	public int getVetID(int vetID) {
		return vetID;
	}
	public void setVetID(int vetID) {
		this.vetID=vetID;
	}
	

}

package example.domain;

import java.util.Date;

public class Carpool {
private String carpoolId;
private String userId;
private int seatsAvailable;
private String carInfo;
private String price;
private Date carpoolDate;
private String startCity;
private String endCity;
private String startPoint;
private String dropPoint;

public String getCarpoolId() {
	return carpoolId;
}
public void setCarpoolId(String carpoolId) {
	this.carpoolId = carpoolId;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public int getSeatsAvailable() {
	return seatsAvailable;
}
public void setSeatsAvailable(int seatsAvailable) {
	this.seatsAvailable = seatsAvailable;
}
public String getCarInfo() {
	return carInfo;
}
public void setCarInfo(String carInfo) {
	this.carInfo = carInfo;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public Date getCarpoolDate() {
	return carpoolDate;
}
public void setCarpoolDate(Date carpoolDate) {
	this.carpoolDate = carpoolDate;
}
public String getStartCity() {
	return startCity;
}
public void setStartCity(String startCity) {
	this.startCity = startCity;
}
public String getEndCity() {
	return endCity;
}
public void setEndCity(String endCity) {
	this.endCity = endCity;
}
public String getStartPoint() {
	return startPoint;
}
public void setStartPoint(String startPoint) {
	this.startPoint = startPoint;
}
public String getDropPoint() {
	return dropPoint;
}
public void setDropPoint(String dropPoint) {
	this.dropPoint = dropPoint;
}

}

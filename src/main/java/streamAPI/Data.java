package streamAPI;

public class Data {
private int id;
private String name;
private String city;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Data [id=" + id + ", name=" + name + ", city=" + city + "]";
}
public Data() {
	super();
	// TODO Auto-generated constructor stub
}
public Data(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}

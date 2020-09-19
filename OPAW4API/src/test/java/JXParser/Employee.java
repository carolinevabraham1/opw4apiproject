package JXParser;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employee")
public class Employee {

	String name, gender;
	int age, id;
	
	public Employee(String name, String gender, int age, int id)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
	}
	
	public Employee()
	{
		
	}
	@XmlElement
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	@XmlAttribute
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	@XmlElement
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@XmlAttribute
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "name is : " + name + "\n" + "gender is : " + gender + "\n" + "age is : " + age 
				+ "\n" + "id is : " + id;
 	}
}













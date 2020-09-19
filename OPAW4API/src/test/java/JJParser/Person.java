package JJParser;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
	"name",
	"id",
	"age",
	"gender"
})
public class Person {

	String name, gender;
	int id , age;
	
	public Person(String name, String gender, int id , int age)
	{
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : " + name + "\n" + "id : " + id + "\n" + "age : " + age + "\n" 
				+ "gender : " + gender;
	}
	public Person()
	{	}
}















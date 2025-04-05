package compareableAndComparitive;

public class Person {
String name;
int age;
public Person(String name, int age) {
	this.name = name;
	this.age = age;
}
public String toString() {
	return name+" "+age;
}
public int compareTo(Object o) {
	Person p =(Person)o;
	if(this.name.compareTo(p.name)!= 0) {
		return this.name.compareTo(p.name);
	}
	if(this.age - p.age != 0) {
		return this.age-p.age;
	}
	return 0;
}
}

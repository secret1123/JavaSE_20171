package java1702.javase.java1707;

//实体类
public class Person
{
	private String _name;
	private int _age;
	private String _phone;
	private String _address;
	
	public Person()
	{}
	public Person(String _name, int _age, String _phone, String _address) {
		this._name = _name;
		this._age = _age;
		this._phone = _phone;
		this._address = _address;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public int get_age() {
		return _age;
	}
	public void set_age(int _age) {
		this._age = _age;
	}
	public String get_phone() {
		return _phone;
	}
	public void set_phone(String _phone) {
		this._phone = _phone;
	}
	public String get_address() {
		return _address;
	}
	public void set_address(String _address) {
		this._address = _address;
	}
	
	
	
	
}

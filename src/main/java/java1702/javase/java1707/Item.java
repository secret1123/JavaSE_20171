package java1702.javase.java1707;

//商品类
public class Item
{
	private String _name;
	private double _price;
	private String _desc;
	private String _expiration;
	private Classify _classify;
	
	
	public Item()
	{
		
	}

	public Item(String _name, double _price, String _desc, String _expiration) {
		super();
		this._name = _name;
		this._price = _price;
		this._desc = _desc;
		this._expiration = _expiration;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public String get_desc() {
		return _desc;
	}

	public void set_desc(String _desc) {
		this._desc = _desc;
	}

	public String get_expiration() {
		return _expiration;
	}

	public void set_expiration(String _expiration) {
		this._expiration = _expiration;
	}

	
	
	public Classify get_classify() {
		return _classify;
	}

	public void set_classify(Classify _classify) {
		this._classify = _classify;
	}

	@Override
	public String toString() {
		return "Item [_name=" + _name + ", _price=" + _price + ", _desc=" + _desc + ", _expiration=" + _expiration
				+ "]";
	}
	
}

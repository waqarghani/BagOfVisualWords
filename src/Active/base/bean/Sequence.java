package Active.base.bean;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Sequence {
	@Id
	private String Key;
	
	private Long Counter;
	
	public String getKey() {
		return Key;
	}
	//default constructor 
	public Sequence(){}
	
	// constructor that takes Collection name
	
	public Sequence(String CollectionName)
	{
		this.Key = CollectionName;
	}
	
	public void setKey(String key) {
		Key = key;
	}
	public Long getCounter() {
		return Counter;
	}
	public void setCounter(Long Counter) {
		this.Counter = Counter;
	}
	

}
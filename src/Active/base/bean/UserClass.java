package Active.base.bean;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("Classes")
public class UserClass {
	
	//DB
	@Id
	private Long UserClassId;
	//user
	private String Label;
	//user
	private String Description;
	
	/**
	 * keep an empty constructor so that morphia 
	 * can recreate this entity when you want to 
	 * fetch it from the database
	 */
	public UserClass(){}
	
	/**
	 * full constructor 
	 * (without objectId, we let morphia generate this one for us) 
	 * 
	 * @param Label
	 * @param Description
	 */
	

	public UserClass(String label, String description) {
		super();
		Label = label;
		Description = description;
	}

	public Long getUserClassId() {
		return UserClassId;
	}

	public void setUserClassId(Long UserClassId) {
		this.UserClassId = UserClassId;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "UserClassId~" + UserClassId + "# Label~" + Label + "# Description~" + Description + "#";
	}

	
}

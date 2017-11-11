package Active.base.bean;

import java.util.List;
import java.util.ArrayList;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

@Entity("Images")
public class Images implements Comparable<Images>{

	@Id
	private Long ImageId;
	
	private List<Integer> Dimensions;
	
	private String ImageTitle;

	private String Path;

	private String ImageType;
	
	@Reference("ImageROIS")
    private List<ROI> Rois = new ArrayList<ROI>();
	
	
	/**
	 * keep an empty constructor so that morphia 
	 * can recreate this entity when you want to 
	 * fetch it from the database
	 */
	public Images(){}
	
	/**
	 * full constructor 
	 * (without objectId, we let morphia generate this one for us) 
	 * 
	 * @param rois
	 * @param clazzes
	 * @param isvalid
	 */

	public Images(String Path, String ImageType, String ImageTitle, List<Integer> Dimensions) {
		super();
		this.ImageTitle = ImageTitle;
		this.Dimensions = Dimensions;
		this.Path = Path;
		this.ImageType = ImageType;
}

	public Images(String Path)
	{
		super();
		this.Path = Path;
	}
	public Long getImageId() {
		return ImageId;
	}

	public void setImageId(Long ImageId) {
		this.ImageId = ImageId;
	}

	public List<Integer> getDimensions() {
		return Dimensions;
	}

	public void setDimensions(List<Integer> Dimensions) {
		this.Dimensions = Dimensions;
	}

	public String getPath() {
		return Path;
	}

	public void setPath(String Path) {
		this.Path = Path;
	}

	public String getImageType() {
		return ImageType;
	}

	public void setImageType(String ImageType) {
		this.ImageType = ImageType;
	}

	public List<ROI> getRois() {
		// TODO Auto-generated method stub
		return Rois;
	}
	
	@Override
	public String toString() {
		return  "ImageId~" + ImageId + "# Dimensions~" + Dimensions + "# Path~" + Path + "# ImageType~"+ ImageType + "#" + Rois ;
	}
	
	@Override
	public int compareTo(Images another) {
		return this.Path.compareTo(another.getPath());
	}

	 public boolean equals(Object obj) {
	        if (obj == null) return false;
	        if (obj instanceof Images) {
	            Images another = (Images) obj;
	            if (this.Path.equals(another.getPath())) {
	                return true;
	            }
	        }
	 
	        return false;
	    }
	 
	    public int hashCode() {
	        return this.Path.hashCode();
	    }

	
}



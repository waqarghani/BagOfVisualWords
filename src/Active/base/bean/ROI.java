package Active.base.bean;

import java.util.ArrayList;
import java.util.List;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;




@Entity("ROI")
public class ROI {
	
	@Id
	private Long ROIId;
	
	private String RoiType;
	
	private List<Integer> RoiDimensions;
	
	@Reference("RegionFeatures")
    private List<Features>  RoiFeatures = new ArrayList<Features>();
	
	@Reference("ImageClasses")
    private List<UserClass>  Clazzes = new ArrayList<UserClass>();

	public ROI(){}
	
	
	public ROI(String roiType, List<Integer> roiDimensions) {
		super();
		RoiType = roiType;
		RoiDimensions = roiDimensions;
	}



	public List<UserClass> getClazzes() {
		return Clazzes;
	}
	public void setClazzes(List<UserClass> clazzes) {
		Clazzes = clazzes;
	}
	public List<Features> getRoiFeatures() {
		return RoiFeatures;
	}
	public void setRoiFeatures(List<Features> roiFeatures) {
		RoiFeatures = roiFeatures;
	}
	public Long getROIId() {
		return ROIId;
	}
	public void setROIId(Long ROIId) {
		this.ROIId = ROIId;
	}
	public List<Integer> getRoiDimensions() {
		return RoiDimensions;
	}
	public void setRoiDimensions(List<Integer> RoiDimensions) {
		this.RoiDimensions = RoiDimensions;
	}
	public String getRoiType() {
		return RoiType;
	}
	public void setRoiType(String roiType) {
		RoiType = roiType;
	}
	

	@Override
	public String toString() {
		return "ROIId~" + ROIId + "# RoiType~" + RoiType + "# RoiDimensions~" + RoiDimensions + "#" 
				+ RoiFeatures + "#" + Clazzes ;

	}

	
}

package Active.base.bean;

import java.util.List;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("Features")
public class Features {
	@Id
	private Long FeaturesId;
	 // Zernike , But can be LOG,BOG etc
	private String FeatureType;           
	
	private List<Double> ParameterValues; //  Real valued 2D term
	
	private List<Double> FeatureValues;  // original Zernike Value for that Region 
	
	public Features(){}
	
	public Features(String featureType, List<Double> parameterValues, List<Double> featureValues) {
		super();
		FeatureType = featureType;
		ParameterValues = parameterValues;
		FeatureValues = featureValues;
	}
	public List<Double> getParameterValues() {
		return ParameterValues;
	}
	public void setParameterValues(List<Double> ParameterValues) {
		this.ParameterValues = ParameterValues;
	}
	public List<Double> getFeatureValues() {
		return FeatureValues;
	}
	public void setFeatureValues(List<Double> FeatureValues) {
		this.FeatureValues = FeatureValues;
	}
	public Long getFeaturesId() {
		return FeaturesId;
	}
	public void setFeaturesId(Long FeaturesId) {
		this.FeaturesId = FeaturesId;
	}
	public String getType() {
		return FeatureType;
	}
	public void setType(String FeatureType) {
		this.FeatureType = FeatureType;
	}
	@Override
	public String toString() {
		return "FeaturesId~" + FeaturesId + "# FeatureType~" + FeatureType + "# ParameterValues~"
				+ ParameterValues + "# FeatureValues~" + FeatureValues;
	}
	
}

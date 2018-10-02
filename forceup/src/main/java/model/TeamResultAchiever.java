package model;

import java.util.HashMap;

public class TeamResultAchiever {

	HashMap<String,Long> salesAchiever = new HashMap<>();
	HashMap<String,Long> pipeline = new HashMap<>();
	HashMap<String,Long> faceToFace = new HashMap<>();
	
	public HashMap<String, Long> getSalesAchiever() {
		return salesAchiever;
	}
	public void setSalesAchiever(HashMap<String, Long> salesAchiever) {
		this.salesAchiever = salesAchiever;
	}
	public HashMap<String, Long> getPipeline() {
		return pipeline;
	}
	public void setPipeline(HashMap<String, Long> pipeline) {
		this.pipeline = pipeline;
	}
	public HashMap<String, Long> getFaceToFace() {
		return faceToFace;
	}
	public void setFaceToFace(HashMap<String, Long> faceToFace) {
		this.faceToFace = faceToFace;
	}
}

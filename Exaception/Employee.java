package Exaception;

public class Employee {
	private int pId;
	private String pName;
	private int nofproduct;
	private int  weightoproduct;
	
	Employee()
	{
		
	}

	public Employee(int pId, String pName, int nofproduct, int weightoproduct) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.nofproduct = nofproduct;
		this.weightoproduct = weightoproduct;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getOnofproduct() {
		return nofproduct;
	}

	public void setOnofproduct(int onofproduct) {
		this.nofproduct = onofproduct;
	}

	public int getWeightoproduct() {
		return weightoproduct;
	}

	public void setWeightoproduct(int weightoproduct) {
		this.weightoproduct = weightoproduct;
	}
	
	public double product()
	{
		return nofproduct*weightoproduct;
	}

	@Override
	public String toString() {
		return "Employee [pId=" + pId + ", pName=" + pName + ", nofproduct=" + nofproduct + ", weightoproduct="
				+ weightoproduct + ", product()=" + product() + "]";
	}
	
	
	

}

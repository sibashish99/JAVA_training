package com.training;

public class VehicleInsurance extends Insurance {
      private String vehicleType;

	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("inside 0para sub class");
	}

	public VehicleInsurance(int policyNumber, String policyHolder, double policyAmount,String vehicleType) {
		super(policyNumber, policyHolder, policyAmount);
		// TODO Auto-generated constructor stub
		System.out.println("inside 4 para sub class...");
		this.vehicleType= vehicleType;
	}

	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

    
	@Override
	public String toString() {
		return "VehicleInsurance [vehicleType=" + vehicleType + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium= 500;
		
		switch(vehicleType.toLowerCase()) {
		case "car":
			if(getPolicyAmount()>50000) {
				premium=1000;
			}
		
	    case "bike":
		    if(getPolicyAmount()>50000) {
			 premium=800;
		  }
	    }
	    return premium;
     }

}

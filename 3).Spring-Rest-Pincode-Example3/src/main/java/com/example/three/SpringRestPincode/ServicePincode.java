package com.example.three.SpringRestPincode;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ServicePincode implements PinService {
	
	List<Pincode> pin;

	public ServicePincode() {
		pin = new ArrayList<>();
		pin.add(new Pincode(263149,"LONDON","Jawahar Bose","LONDON"));
		pin.add(new Pincode(263145,"JERMANY","DARK STREET","EUROPE"));
		pin.add(new Pincode(263139,"UNITED STATES","NEWYORK","AMERICA"));
		pin.add(new Pincode(263666,"UAE","BULLAH","ABUDUBAI"));
		pin.add(new Pincode(263108,"AP","BHIMAVARAM","INDIA"));
		pin.add(new Pincode(110049,"BANGLADESH","SONAR BANGLA","BANGLADESH"));
		pin.add(new Pincode(110069,"LANKA","LANKA","SRILANKA"));
		pin.add(new Pincode(113149,"GR","LOSANGELES","AMERICA"));
		pin.add(new Pincode(269949,"TN","CHENNAI","India"));
		pin.add(new Pincode(999149,"TS","HYD","India"));
		pin.add(new Pincode(163149,"PB","Ludhiyana","India"));		
	}
	
	public Pincode getDetails(int pincodeS) {
		for(Pincode p : pin)
			{
			if(p.getPin()==pincodeS)
				{
				System.out.println(p);
			    return p;
			    }
			}
		return null;
		
	}
	
	
	

}

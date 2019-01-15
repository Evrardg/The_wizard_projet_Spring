package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theMagician")
public class Dumbledore implements WizardInterface {
	
private OutfitAdviceInterface myOutfit;
	
	@Autowired
	public Dumbledore (@Qualifier("blueOutfit") OutfitAdviceInterface theOutfit) {
		myOutfit = theOutfit;
	}

	@Override
	public String giveAdvice() {
		return "Good luck , Harry";
	}

	@Override
	public String changeDress() {
		return this.myOutfit.sendOutfit();
	}

}

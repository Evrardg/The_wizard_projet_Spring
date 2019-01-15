package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("theWizard")
public class Gandalf implements WizardInterface {
	
	private OutfitAdviceInterface myOutfit;
	
	@Autowired
	public Gandalf (@Qualifier("greyOutfit")OutfitAdviceInterface theOutfit) {
		myOutfit = theOutfit;
	}
	
	@Override
	public String giveAdvice() {
		return "Run, you fools";
	}

	@Override
	public String changeDress() {
		return this.myOutfit.sendOutfit();
	}

}

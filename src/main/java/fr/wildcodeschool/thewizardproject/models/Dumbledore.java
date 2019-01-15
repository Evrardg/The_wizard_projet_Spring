package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
private OutfitAdviceInterface myOutfit;
	
	public Dumbledore (OutfitAdviceInterface theOutfit) {
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

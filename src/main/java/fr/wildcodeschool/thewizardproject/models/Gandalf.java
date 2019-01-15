package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
	
	private OutfitAdviceInterface myOutfit;
	
	public Gandalf (OutfitAdviceInterface theOutfit) {
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

package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class GreyOutfit implements OutfitAdviceInterface {

	@Override
	public String sendOutfit() {
		return "The wizard dress is grey";
	}

}

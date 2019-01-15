package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class BlueOutfit implements OutfitAdviceInterface {

	@Override
	public String sendOutfit() {
		return "The wizard dress is blue";
	}

}

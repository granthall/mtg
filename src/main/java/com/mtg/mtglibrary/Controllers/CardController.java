package com.mtg.mtglibrary.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mtg.mtglibrary.Init;
import com.mtg.mtglibrary.models.Cards;

@RestController
@RequestMapping("/api")
public class CardController {
	
	@RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<Cards> home() {
		return Init.cards;
    }

}

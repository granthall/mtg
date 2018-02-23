package com.mtg.mtglibrary.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class Cards {

	@Getter
	@Setter
	private String id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private String manaCost;
	
	@Getter
	@Setter
	private String[] colors;
	
	@Getter
	@Setter
	private String type;
	
	@Getter
	@Setter
	private String[] types;
	
	@Getter
	@Setter
	private String[] subtypes;
	
	@Getter
	@Setter
	private String rarity;
	
	@Getter
	@Setter
	private String set;
	
	@Getter
	@Setter
	private String setName;
	
	@Getter
	@Setter
	private String text;
	
	@Getter
	@Setter
	private String artist;
	
	@Getter
	@Setter
	private String number;
	
	@Getter
	@Setter
	private String power;
	
	@Getter
	@Setter
	private String toughness;
	
	@Getter
	@Setter
	private String layout;
	
	@Getter
	@Setter
	private Long multiverseid;
	
	@Getter
	@Setter
	private String imageUrl;
	
	@Getter
	@Setter
	private String[] printings;
	
	@Getter
	@Setter
	private String originalText;
	
	@Getter
	@Setter
	private String originalType;
	
	@Getter
	@Setter
	private Legalities[] legalities;
}

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
public class Legalities {

	@Getter
	@Setter
	private String format;
	
	@Getter
	@Setter
	private String legality;
	
}

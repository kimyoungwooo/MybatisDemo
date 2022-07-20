package com.example.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CityVo {
	private int id;
	private String name;
	private String countryCode;
	private String district;
	private int population;
	
	
}

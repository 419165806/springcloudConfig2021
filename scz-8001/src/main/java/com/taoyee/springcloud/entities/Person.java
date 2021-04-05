package com.taoyee.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class Person implements Serializable {
	private Long userId;
	private String userName;
	private Integer age;
	private char gender ;
}

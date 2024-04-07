package com.project.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer 
{
	private int cusId;
	private String cusPass;
	private String cusContact;
	private String cusEmail;
}

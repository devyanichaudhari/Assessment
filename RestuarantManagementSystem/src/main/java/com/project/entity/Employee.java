package com.project.entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Eid;
	private String Ename;
	private String Edesignation;
	private String Econtact;
}

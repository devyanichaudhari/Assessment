package com.onetomany.model;

import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="Mobile")
@Data
@RequiredArgsConstructor
public class Mobile 
{
	public Mobile(String mobileName, String mobileCompany) {
		super();
		this.mobileName = mobileName;
		this.mobileCompany = mobileCompany;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="mobile_name",length=255)
	private String mobileName;
	@Column(name="mobile_company",length=255)
	private String mobileCompany;
	@OneToMany(mappedBy="mobile",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Apps> apps;
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileName=" + mobileName + ", mobileCompany=" + mobileCompany + ", apps=" + apps
				+ "]";
	}
}

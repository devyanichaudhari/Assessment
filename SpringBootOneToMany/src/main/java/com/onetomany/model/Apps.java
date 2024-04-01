package com.onetomany.model;

import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Apps")
@Data
@NoArgsConstructor
public class Apps 
{
	public Apps(String appName, long appSize, Mobile mobile) {
		super();
		this.appName = appName;
		this.appSize = appSize;
		this.mobile = mobile;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="app_name",length=255)
	private String appName;
	@Column(name="app_size",length=255)
	private long appSize;
	@ManyToOne
	@JoinColumn(name="mobile_id",nullable=false)
	private Mobile mobile;
	
	public long getMobile_Id()
	{
		return mobile.getId();
	}
	public String getMobile_Name()
	{
		return mobile.getMobileName();
	}
	@Override
	public String toString() {
		return "Apps [id=" + id + ", appName=" + appName + ", appSize=" + appSize + ", mobile=" + mobile + "]";
	}
}

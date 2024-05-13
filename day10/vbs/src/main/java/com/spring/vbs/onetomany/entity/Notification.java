package com.spring.vbs.onetomany.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="notification")
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "notification_id")
	private int notification_id;
	
	@Column(name = "notification_type")
	private String notification_type;
	
	@Column(name = "message")
	private int message;
	
	@Column(name = "sent_datetime")
	private int sent_datetime;
	
	@Column(name = "is_value")
	private int is_value;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
}

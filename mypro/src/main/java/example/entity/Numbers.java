package example.entity;
import javax.persistence.Table;
import javax.persistence.Version;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

/** Entity Numbers having two columns : version and value*/
@Entity
@Table(name="Numbers")
public class Numbers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id_int;
	
@Column(name="val_int")
int value;

public Numbers() {
	
}

public Numbers(int value) {
	this.value=value;
}

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public Integer getId_int() {
	return id_int;
}

public void setId_int(Integer id_int) {
	this.id_int = id_int;
}

@Version
Integer version;



}

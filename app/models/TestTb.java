package models;

import javax.persistence.Entity;
import javax.persistence.Table;

import play.db.jpa.Model;


@Entity
@Table(name="testTb")
public class TestTb extends Model {
	public Long userId;
	public String userName;
	
	public TestTb(Long userId,String userName){
		this.userId=userId;
		this.userName=userName;
	}
}

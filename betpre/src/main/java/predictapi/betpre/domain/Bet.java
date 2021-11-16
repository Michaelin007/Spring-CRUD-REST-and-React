package predictapi.betpre.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bettips")
public class Bet {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Lob
	private String tips;
	
	Date date=new Date();
	
	
	public long getId() {

		return id;
	}
	public void setId(long id) {

		this.id = id;
	}
	public String getTips() {

		return tips;
	}
	public void setTips(String tips) {

		this.tips = tips;
	}
	public Date getDate() {

		return date;
	}
	public void setDate(Date date) {

		this.date = date;
	}
	
	
	
	
	

}

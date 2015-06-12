package models;

import java.util.Date;

import javax.persistence.*;

import org.joda.time.DateTime;

import play.db.ebean.*;
import play.data.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class OmsOrder extends Model {
	
	@Id
	public Long orderId;
	  
	@Constraints.Required
	public String orderNr;
	
	@Constraints.Required
	public String productName;
	
	public String createdAt;
	
	public static Finder<Long,OmsOrder> find = new Finder<Long, OmsOrder>(
      Long.class, OmsOrder.class
	);

}

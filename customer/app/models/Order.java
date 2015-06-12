package models;

import java.util.Date;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Order extends Model {
	
	@Id
	public Long orderId;
	  
	@Constraints.Required
	public String orderNr;
	
	@Constraints.Required
	public String productName;
	
	@Formats.DateTime(pattern="dd/MM/yyyy")
	public Date createdAt = new Date();
	
	public static Finder<Long,Order> find = new Finder<Long, Order>(
      Long.class, Order.class
	);

}

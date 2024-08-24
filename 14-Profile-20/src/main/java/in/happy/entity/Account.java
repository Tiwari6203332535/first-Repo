package in.happy.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;
@Entity
@Data
public class Account {
	
	private String holderNAme;
	private String branch;
	
	@EmbeddedId
	private AccountPK pk;
}

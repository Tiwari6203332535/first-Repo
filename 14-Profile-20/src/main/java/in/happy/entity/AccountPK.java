package in.happy.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK {
	private Integer accountNum;
	private String accType;
}

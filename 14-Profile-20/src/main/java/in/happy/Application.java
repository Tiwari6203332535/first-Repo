package in.happy;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.happy.entity.Account;
import in.happy.entity.AccountPK;
import in.happy.repo.AccRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		  AccRepo repo = ctx.getBean(AccRepo.class);
		
		AccountPK pk = new AccountPK();
		pk.setAccountNum(245687980);
		pk.setAccType("saving");
		
		Account acc = new Account();
		acc.setBranch("seorahi");
		acc.setHolderNAme("happy");
		acc.setPk(pk);
		
	        repo.save(acc);
	           
	System.out.println("record saved");
	
	
	AccountPK pk1 = new AccountPK();
	pk1.setAccountNum(245687980);
	pk1.setAccType("saving");
	 Optional<Account> id = repo.findById(pk1);
	 if(id.isPresent()) {
		 System.out.println(id.get());
	}

	}}

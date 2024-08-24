package in.happy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.happy.entity.Account;
import in.happy.entity.AccountPK;

public interface AccRepo extends JpaRepository<Account, AccountPK> {

}

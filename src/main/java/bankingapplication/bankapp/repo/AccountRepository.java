package bankingapplication.bankapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import bankingapplication.bankapp.entity.Account;

public interface AccountRepository extends  JpaRepository <Account,Long> {

}

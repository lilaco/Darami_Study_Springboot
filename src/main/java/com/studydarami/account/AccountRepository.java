package com.studydarami.account;

import com.studydarami.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface AccountRepository extends JpaRepository<Account, Long> {
    boolean existsByEmail(String mail);

    boolean existsByNickname(String nickname);

    Account findByEmail(String email);
}

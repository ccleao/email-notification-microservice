package com.ms.emailnotification.repositories;

import com.ms.emailnotification.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}

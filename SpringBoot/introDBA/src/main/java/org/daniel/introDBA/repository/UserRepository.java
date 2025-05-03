package org.daniel.introDBA.repository;

import org.daniel.introDBA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {


}

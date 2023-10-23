package com.calculadoraDeFrete.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //projection
    @Query("""
    select new com.calculadoraDeFrete.user.UserDto(u.email, u.username, u.senha)
     from Usuario u where u.username = :username
    """)
    Optional<UserDto> findByUserName(@Param("userName") String userName);

}

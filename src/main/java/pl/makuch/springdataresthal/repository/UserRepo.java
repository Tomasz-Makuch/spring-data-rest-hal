package pl.makuch.springdataresthal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import pl.makuch.springdataresthal.model.User;
import java.util.List;


@RestResource
public interface UserRepo extends JpaRepository<User, Long> {
    User findFirstByName(@Param("name")String name);
    List<User> findAllByAgeBetween(@Param("startAge")int startAge, @Param("endAge")int endAge);
}

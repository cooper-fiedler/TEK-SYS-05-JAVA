package com.fiedlercooper.bikeBuilder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.fiedlercooper.bikeBuilder.entity.User;
import com.fiedlercooper.bikeBuilder.repository.UserRepository;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class BikeBuilderUserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepository userRepository;
     
    @Test
    public void testCreateUser() {
        User user = new User();
        user.setEmail("cooper@email.com");
        user.setPassword("password");
        user.setFirstName("Cooper");
        user.setLastName("Fiedler");
         
        User savedUser = userRepository.save(user);
         
        User existUser = entityManager.find(User.class, savedUser.getId());
         
        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
         
    }
}
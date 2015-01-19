package so.reap.blade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import so.reap.blade.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
	
}



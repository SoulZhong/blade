package so.reap.blade.dao.user;

import java.util.List;

import so.reap.blade.dao.Dao;
import so.reap.blade.entity.User;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserDao extends Dao<User, Long>, UserDetailsService
{

	User findByName(String name);

	List<User> listUsers();
}
package com.axsos.authentication.Service;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.axsos.authentication.Models.LoginUser;
import com.axsos.authentication.Models.User;
import com.axsos.authentication.Repositiores.UserRepositiory;

@Service
public class UserService {

	private final UserRepositiory userRepositiory;

	public UserService(UserRepositiory userRepositiory) {
		super();
		this.userRepositiory = userRepositiory;
	}

	public List<User> allUser() {
		return userRepositiory.findAll();
	}

	public User createUser(User u) {
		return userRepositiory.save(u);
	}
	
	  public User findById(Long id) {
	    	Optional<User> potentialUser = userRepositiory.findById(id);
	    	if(potentialUser.isPresent()) {
	    		return potentialUser.get();
	    	}
	    	return null;
	    }
	

	public User register(User newUser, BindingResult result) {
		Optional<User> potentialUser = userRepositiory.findByEmail(newUser.getEmail());

		if (potentialUser.isPresent()) {
			result.rejectValue("email", "Matches", "An account with that email already exists!");
		}

		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
		}

		if (result.hasErrors()) {
			return null;
		}

		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		return userRepositiory.save(newUser);

	}

	// This method will be called from the controller
	// whenever a user submits a login form.
	public User login(LoginUser newLoginObject, BindingResult result) {

		Optional<User> potentialUser = userRepositiory.findByEmail(newLoginObject.getEmail());

		// Find user in the DB by email
		if (!potentialUser.isPresent()) {
			result.rejectValue("email", "Matches", "User not found!");
			return null;
		}
		User user = potentialUser.get();
		if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
			result.rejectValue("password", "Matches", "Invalid Password!");
		}
		if (result.hasErrors()) {
			return null;
		}

		return user;
	}

}

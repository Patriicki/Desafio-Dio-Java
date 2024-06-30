package api.patrick.service;

import api.patrick.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}

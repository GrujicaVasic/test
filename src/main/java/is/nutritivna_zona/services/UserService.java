package is.nutritivna_zona.services;

import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.requests.UserRequest;
import is.nutritivna_zona.models.User;
import is.nutritivna_zona.models.UserFull;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> findAll();
    User findById(Integer id) throws NotFoundException;

    void delete(Integer id);
    User insert(UserRequest userRequest) throws NotFoundException;
    User update(Integer id, UserRequest userRequest) throws NotFoundException;

    List<UserFull> findAllFull();
}

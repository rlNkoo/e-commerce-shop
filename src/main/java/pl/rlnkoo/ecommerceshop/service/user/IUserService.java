package pl.rlnkoo.ecommerceshop.service.user;

import pl.rlnkoo.ecommerceshop.model.User;
import pl.rlnkoo.ecommerceshop.request.CreateUserRequest;
import pl.rlnkoo.ecommerceshop.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
}

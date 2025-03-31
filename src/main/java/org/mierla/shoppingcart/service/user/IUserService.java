package org.mierla.shoppingcart.service.user;

import org.mierla.shoppingcart.dto.UserDto;
import org.mierla.shoppingcart.model.User;
import org.mierla.shoppingcart.request.CreateUserRequest;
import org.mierla.shoppingcart.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}

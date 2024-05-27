package estudos.railwayTest.service;

import estudos.railwayTest.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}

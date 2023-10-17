package kernel.hackerthon.library.service;

import kernel.hackerthon.library.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;
}

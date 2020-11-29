package gregad.eventmanager.usersservice.service;

import gregad.eventmanager.usersservice.dto.NetworkCredentialDto;
import gregad.eventmanager.usersservice.dto.UserDto;

import java.util.List;

/**
 * @author Greg Adler
 */
public interface UserService {
    UserDto addUser(String telegramId);
    UserDto getUser(long id);
    UserDto deleteUser(long id);
    UserDto updateUser(UserDto userDto);
    UserDto saveOrUpdateNetwork(NetworkCredentialDto networkCredential);
    UserDto deleteNetwork(long id,String network);
    List<String> getNetworks(long id);

}

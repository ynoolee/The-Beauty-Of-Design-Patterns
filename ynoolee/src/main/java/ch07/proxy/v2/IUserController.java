package ch07.proxy.v2;

import ch07.proxy.dto.UserVo;

public interface IUserController {

    UserVo login(String telephone, String password);

    UserVo register(String telephone, String password);
}

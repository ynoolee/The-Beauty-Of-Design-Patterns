package ch07.proxy.v2;

import ch07.proxy.dto.UserVo;

public class UserController implements IUserController {

    @Override
    public UserVo login(final String telephone, final String password) {
        // login 기능만 수행
        return null;
    }

    @Override
    public UserVo register(final String telephone, final String password) {
        // 회원 register 기능만 수행
        return null;
    }
}

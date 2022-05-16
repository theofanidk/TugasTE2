import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserServiceImplTest {
    User user = Mockito.mock(User.class);
    SecurityService securityService = Mockito.mock(SecurityService.class);
    UserDAO userDaO = Mockito.mock(UserDAO.class);

    @Test

    public void tesAsPass() throws Exception {
        UserServiceImpl sut = new UserServiceImpl(userDaO, securityService);
        //Cek pass baru
        sut.assignPassword(user);
        verify(user).getPassword();
    }
    @Test
    public void tesmethod() throws Exception{
        UserServiceImpl sut2 = new UserServiceImpl(userDaO, securityService);
        sut2.assignPassword(user);
        verify(userDaO).updateUser(user);
        //Tes 2
        //userDaO.updateUser(user);
        //verify(userDaO).updateUser(user);


    }
}
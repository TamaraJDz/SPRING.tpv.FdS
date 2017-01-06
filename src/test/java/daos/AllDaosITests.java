package daos;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    TokenDaoITest.class,
    UserDaoITest.class,
    AuthorizationDaoITest.class
})
public class AllDaosITests {

}
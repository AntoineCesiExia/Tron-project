package allTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ modelTest.AllTest.class, controllerTest.AllTest.class, viewTest.AllTest.class })

public class AllTest {
} 

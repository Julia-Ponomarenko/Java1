import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, new int[]{1,2,1,1,1,4,4,}},
                {true, new int[]{1,4,1,4,1,4}},
                {true, new int[]{4,4,4,4}},
                {true, new int[]{1,1,1,1}},
                {true, new int[]{1,4}},
        });
    }
    private MainClass mainClass;
    private boolean x;
    private int[] y;
    public Test2(boolean x, int[] y) {
        this.x = x;
        this.y = y;
    }

    @Before
    public void init() {
        mainClass = new MainClass();
    }

    @Test
    public void test1() {
        Assert.assertEquals(x, mainClass.check1And4(y));
    }
}

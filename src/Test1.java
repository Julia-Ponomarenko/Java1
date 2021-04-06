import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test1 {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{8, 8}, new int[]{1, 3, 5, 4, 8, 8}},
                {new int[]{8, 2}, new int[]{1, 3, 5, 4, 8, 8}},
                {new int[]{2, 3, 7, 0}, new int[]{6, 4, 2, 3, 7, 1}},
                {new int[]{2, 3, 7, 1}, new int[]{6, 4, 2, 3, 7, 1}},
                {new int[]{2, 3}, new int[]{6, 2, 2, 3, 7, 1}},
        });
    }
    private MainClass mainClass;
    private int[] x;
    private int[] y;
    public Test1(int[] x, int[] y) {
        this.x = x;
        this.y = y;
    }

    @Before
    public void init() {
        mainClass = new MainClass();
    }

    @Test
    public void test1() {
        Assert.assertTrue("Массивы не совпадают", Arrays.equals(x, mainClass.getPartAfter4(y)));
    }
}

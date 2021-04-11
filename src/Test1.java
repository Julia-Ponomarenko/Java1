public class Test1 {
    public static void notTest (){System.out.println("NotTest");}
    @BeforeSuite
    public static void beforeSuite (){System.out.println("BeforeSuite");}
    @Test (priority = 3)
    public static void test1 (){System.out.println("Test1");}
    @Test
    public static void test2 (){System.out.println("Test2");}
    @Test (priority = 9)
    public static void test3 (){System.out.println("Test3");}
    @AfterSuite
    public static void afterSuite (){System.out.println("AfterSuite");}
}

import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber (){
        int a = getLocalNumber();
        if (a == 14) {
        System.out.println("этот тест вернул значение и оно равно " + a);
        } else { System.out.println( "что-то пошло не так");
         }

    }
}
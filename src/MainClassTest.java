import org.junit.Assert;
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
    @Test
    public void testGetClassNumber () {
        int a;
        a = getClassNumber();
        if (a > 45) {
            System.out.println("Значение параметра  а больше 45б а именно a=" + a);
        } else {
            System.out.println("Значение парамерта а меньше 45 (или = 45), а именно a=" + a);
        }
    }

    @Test

    public void testGetClassString () {
        String string = getClassString();
        String substring = "Hello";
        System.out.println(string.toLowerCase().contains(substring.toLowerCase()));

         if (string.toLowerCase().contains(substring.toLowerCase()) == true ) {
           System.out.println("Слово 'Hello' присутствует в строке");
       } else {
            Assert.fail("В строке нет слова 'Hello'");
            }
        }
}


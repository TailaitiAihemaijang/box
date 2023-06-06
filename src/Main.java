/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/6/2023 12:14 PM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
         Fighter f1 = new Fighter("A",20,120,100);
         Fighter f2 = new Fighter("B",20,130,100);
         Match match = new Match(f1,f2,100,100);
         match.run();
    }
}

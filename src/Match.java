/**
 * ClassName: Match
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/6/2023 12:17 PM
 * @Version 1.0
 */
public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

     void run(){
        if (ischeck()){
            while(this.f1.health > 0 && this.f2.health > 0){
                this.f2.health = this.f1.hit(f2);
                if (isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(f1);
                if (isWin()){
                    break;
                }

            }
        }else {
            System.out.println("sporcularin sikletleri uymuyor");
        }
    }
    boolean ischeck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " kazandi.");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandi");
            return true;
        }
        return false;
    }
}

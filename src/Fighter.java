/**
 * ClassName: Fighter
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/6/2023 12:14 PM
 * @Version 1.0
 */
public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    Fighter(String name,int damage,int health,int weight){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }

    int hit(Fighter foe){
        System.out.println(this.name + "=>" + foe.name + this.damage + " hasar burdu.");
        return 0;
    }
}

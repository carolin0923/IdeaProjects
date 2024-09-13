
public class Main {
    public static void main(String[] args){
        Player player = new Player();

        System.out.println(player.getXp());
        System.out.println(player.getHealth());


        player.ganharXp(104);
        player.equipShield();
        System.out.println(player.getXp());
        System.out.println(player.getHealth());
        System.out.println(player.getDefense());
        System.out.println(player.getAttack());
        player.equipSword();

    }
}
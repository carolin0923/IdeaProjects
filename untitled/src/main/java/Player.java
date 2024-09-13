public class Player {
    private Integer heath=100;
    private Integer attack=10;
    private Integer defense=10;
    private Integer xp=0;
    private boolean hasShield= false;  //tem escudo
    private boolean hasSword= false;  //tem espada


    public void subirNivel(Integer niveis){
         int novoStatus= 5 * niveis;
         heath += novoStatus;
         attack += novoStatus;
         defense += novoStatus;
    }

    public void ganharXp(Integer x) {
         xp =x;

         if (xp >= 10){
             int niveisSubir = x /10;
             subirNivel(niveisSubir);
        }
    }
    public Integer getXp(){
         return xp;

    }
    public Integer getHealth() {
        return heath;
    }
    public Integer getDefense(){
        if (hasShield){
            return defense * 2;
        }
        return defense;
    }
    public Integer getAttack() {
        if (hasSword) {
            return attack * 2;
        }
        return attack;
    }
    public void equipShield() {
        hasShield = true;
    }
    public void desequipShield() {
        hasShield = false;
    }
    public void equipSword() {
        hasSword = true;
    }
    public void desequipSword() {
        hasSword = false;
    }


}


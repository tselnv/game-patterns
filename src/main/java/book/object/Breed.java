package book.object;

public class Breed {

    private int health;
    private String attack;

    public Breed(Breed parent, Integer health, String attack) {
        this.health = (int) health;
        this.attack = attack;

        if(parent != null){
            if(health == 0){
                this.health = parent.getHealth();
            }
            if(attack == null){
                this.attack = parent.getAttack();
            }
        }

        if(this.attack == null){
            this.attack = "";
        }
    }

    Monster newMonster(){
        return new Monster(this);
    }

    int getHealth() {
        return health;
    }

    String getAttack() {
        return attack;
    }
}

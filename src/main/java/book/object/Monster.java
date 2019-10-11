package book.object;

class Monster {
    private int health;
    private Breed breed;

    public Monster(Breed breed) {
        this.health = breed.getHealth();
        this.breed = breed;
    }

    public String getAttack(){
        return breed.getAttack();
    }
}

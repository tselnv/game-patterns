package book.observer;

public class PhysicsBody implements Entity {

    public boolean isOnSurface(){
        return true;
    }

    public void accelerate( double gravity){

    }

    public void update(){

    }

    @Override
    public boolean isHero() {
        return true;
    }
}

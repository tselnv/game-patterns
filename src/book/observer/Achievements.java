package book.observer;

public class Achievements implements Observer {

    private boolean heroIsOnBridge = true;

    @Override
    public void onNotify(Entity entity, Event event) {

        switch (event){
            case EVENT_START_FALL:
                if(entity.isHero() && heroIsOnBridge){
                    unlock(Achievement.ACHIEVEMENT_FELL_OFF_BRIDGE);
                }
                break;
        }
    }

    private void unlock(Achievement achievement){

    }
}

package book.observer;

public class Physics {

    double GRAVITY = 9.81;
    Subject subject = new Subject();


    private void updateBody(PhysicsBody	body) {
        boolean wasOnSurface = body.isOnSurface();

        body.accelerate(GRAVITY);
        body.update();
        if (wasOnSurface && !body.isOnSurface()) {
            subject.notify(body, Event.EVENT_START_FALL);
        }
    }


//    private void notify(Entity body, Event event) {
//        subject.notify(body, event);
//    }


}

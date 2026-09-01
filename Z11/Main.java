package practice_15.Z11;

public class Main {
    static void main(String[] args) {

        DoorFacade doorFacade = new DoorFacade();
        doorFacade.doorOpen.open();
        doorFacade.doorClose.close();
        doorFacade.doorLock.lock();
    }
}

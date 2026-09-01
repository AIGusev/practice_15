package practice_15.Z11;

public class DoorFacade {

    DoorOpen doorOpen;
    DoorClose doorClose;
    DoorLock doorLock;

    public DoorFacade() {
        this.doorOpen = new DoorOpen();
        this.doorClose = new DoorClose();
        this.doorLock = new DoorLock();
    }

    public void openDoor() {
        doorOpen.open();
    }

    public void closeDoor() {
        doorClose.close();
    }

    public void lockDoor() {
        doorLock.lock();
    }
}

public class ExternalButtons {

    ExternalDispatcher dispatcher;

    public void setDispatcher(ExternalDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    void pressButton(int currentFloor, Direction dir) {
        dispatcher.submitExternalRequest(currentFloor, dir);
        controlElevator();
    }

    void controlElevator(){
        dispatcher.elevatorControllerList.get(0).controlElevator();
    }
}

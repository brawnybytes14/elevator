public class ExternalButtons {

    ExternalDispatcher dispatcher;
    void pressButton(int currentFloor, Direction dir) {
        dispatcher.submitExternalRequest(currentFloor, dir);
        controlElevator();
    }

    void controlElevator(){
        dispatcher.elevatorControllerList.get(0).controlElevator();
    }

    public void setDispatcher(ExternalDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
}

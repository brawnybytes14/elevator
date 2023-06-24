
public class InternalButtons {

    InternalDispatcher dispatcher;

    public void setDispatcher(InternalDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    void pressButton(int destination, ElevatorCar elevatorCar) {
        dispatcher.submitInternalRequest(destination, elevatorCar);
        controlElevator();
    }

    void controlElevator(){
        dispatcher.elevatorControllerList.get(0).controlElevator();
    }
}

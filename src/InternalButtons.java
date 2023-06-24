
public class InternalButtons {

    InternalDispatcher dispatcher = new InternalDispatcher();

    void pressButton(int destination, ElevatorCar elevatorCar) {
        dispatcher.submitInternalRequest(destination, elevatorCar);
    }
}

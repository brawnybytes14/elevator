public class ExternalButtons {

    ExternalDispatcher dispatcher = new ExternalDispatcher();
    void pressButton(int currentFloor, Direction dir) {
        dispatcher.submitExternalRequest(currentFloor, dir);
    }
}

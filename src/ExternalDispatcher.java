import java.util.List;

public class ExternalDispatcher {

    List<ElevatorController>  elevatorControllerList;
    public void setElevatorControllerList(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public void submitExternalRequest(int floor, Direction direction){
        elevatorControllerList.get(0).submitExternalRequest(floor, direction);
    }
}

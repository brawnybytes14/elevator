import java.util.List;

public class ExternalDispatcher {
    public void setElevatorControllerList(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    List<ElevatorController>  elevatorControllerList;

    public void submitExternalRequest(int floor, Direction direction){
        for(ElevatorController elevatorController : elevatorControllerList) {
           elevatorController.submitExternalRequest(floor, direction);
        }
    }
}

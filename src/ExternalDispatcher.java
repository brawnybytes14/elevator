import java.util.List;

public class ExternalDispatcher {

//    ElevatorStrategy elevatorStrategy;
    List<ElevatorController>  elevatorControllerList;
    public void setElevatorControllerList(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public void submitExternalRequest(int floor, Direction direction){
        elevatorControllerList.get(0).submitExternalRequest(floor, direction);

    }
}

//class EvenOddStrategy {
//     ElevatorController getElevatorController(c){
//         if()
//         return
//     }
//}


import java.util.List;

public class InternalDispatcher {

    public void setElevatorControllerList(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    List<ElevatorController>  elevatorControllerList;

    public void submitInternalRequest(int floor, ElevatorCar elevatorCar){
        elevatorControllerList.get(0).submitInternalRequest(floor, elevatorCar);
    }
}

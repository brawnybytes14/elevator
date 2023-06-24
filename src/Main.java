

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        ElevatorController controller1 = new ElevatorController(new ElevatorCar(1));
        ElevatorController controller2 = new ElevatorController(new ElevatorCar(2));

        ExternalDispatcher externalDispatcher = new ExternalDispatcher();
        InternalDispatcher internalDispatcher = new InternalDispatcher();

        externalDispatcher.setElevatorControllerList(List.of(controller1, controller2));
        internalDispatcher.setElevatorControllerList(List.of(controller1, controller2));

        List<Floor> floorList = new ArrayList<>();
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Floor floor3 = new Floor(3);
        Floor floor4 = new Floor(4);
        Floor floor5 = new Floor(5);

        floorList.add(floor1);
        floorList.add(floor2);
        floorList.add(floor3);
        floorList.add(floor4);
        floorList.add(floor5);

        Building building = new Building(floorList);

        externalDispatcher.submitExternalRequest(0, Direction.UP);

    }
}

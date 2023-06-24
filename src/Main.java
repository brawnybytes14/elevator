

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        ElevatorController controller1 = new ElevatorController(new ElevatorCar(1));

        ExternalDispatcher externalDispatcher = new ExternalDispatcher();
        InternalDispatcher internalDispatcher = new InternalDispatcher();

        List<ElevatorController> elevatorControllerList = new ArrayList<>();
        elevatorControllerList.add(controller1);

        externalDispatcher.setElevatorControllerList(elevatorControllerList);
        internalDispatcher.setElevatorControllerList(elevatorControllerList);

        List<Floor> floorList = new ArrayList<>();
        Floor floor1 = new Floor(1);
        floorList.add(floor1);

        Building building = new Building(floorList);

        ExternalButtons externalButtons = new ExternalButtons();
        externalButtons.setDispatcher(externalDispatcher);

        InternalButtons internalButtons = new InternalButtons();
        internalButtons.setDispatcher(internalDispatcher);


        externalButtons.pressButton(2, Direction.UP);
        internalButtons.pressButton(5, new ElevatorCar(2));


        Thread t = new Thread(() -> {
            for (ElevatorController ec : elevatorControllerList) {
                ec.controlElevator();
            }
        });

        t.start();

        externalButtons.pressButton(2, Direction.DOWN);
    }
}

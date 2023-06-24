import java.util.Date;
import java.util.PriorityQueue;

public  class ElevatorController {
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b) -> b-a);
    }
     public void submitExternalRequest(int floor, Direction direction){
        if(direction == Direction.DOWN) {
            downMaxPQ.offer(floor);
        } else {
            upMinPQ.offer(floor);
        }
     }

    public void submitInternalRequest(int floor, ElevatorCar car){
        if(car.elevatorDirection == Direction.DOWN) {
            downMaxPQ.offer(floor);
        } else {
            upMinPQ.offer(floor);
        }
    }

    public void controlElevator(){
        while(true){
            if(elevatorCar.elevatorDirection == Direction.UP){
                if(upMinPQ.isEmpty()){
                    elevatorCar.elevatorDirection = Direction.DOWN;
                    continue;
                }
                elevatorCar.moveElevator(Direction.UP, upMinPQ.poll());
            } else {
                if(downMaxPQ.isEmpty()){
                    elevatorCar.elevatorDirection = Direction.UP;
                    continue;
                }
                elevatorCar.moveElevator(Direction.DOWN, downMaxPQ.poll());
            }
        }
    }
}

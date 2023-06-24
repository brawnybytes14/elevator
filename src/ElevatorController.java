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
        if(car.elevatorDirection == Direction.UP) {
            downMaxPQ.offer(floor);
        } else {
            upMinPQ.offer(floor);
        }
    }

    public void controlElevator(){
        if(elevatorCar.elevatorDirection == Direction.UP){
            elevatorCar.moveElevator(Direction.UP, upMinPQ.poll());
        } else {
            elevatorCar.moveElevator(Direction.DOWN, downMaxPQ.poll());
        }
    }
}

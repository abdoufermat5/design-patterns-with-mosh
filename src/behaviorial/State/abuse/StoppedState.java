package behaviorial.State.abuse;

public class StoppedState implements State{
    private StopWatch sw;
    public StoppedState(StopWatch stopWatch){
        sw = stopWatch;
    }
    @Override
    public void click() {
        sw.setCurrentState(new RunningState(sw));
        System.out.println("Running");
    }
}

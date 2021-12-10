package behaviorial.State.abuse;

public class RunningState implements State{
    private StopWatch sw;
    public RunningState(StopWatch stopWatch){
        sw = stopWatch;
    }
    @Override
    public void click() {
        sw.setCurrentState(new StoppedState(sw));
        System.out.println("Stopped");
    }
}

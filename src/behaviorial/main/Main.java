package behaviorial.main;

public class Main {
    public static void main(String[] args) {
        // uncomment to test behaviorial.memento pattern
        /*History history = new History();
        Editor editor = new Editor();

        editor.setContent("lundi");
        history.push(editor.createState());
        editor.setContent("mardi");
        history.push(editor.createState());
        editor.setContent("mercredi");
        editor.restoreState(history.pop()); // return to last state "mardi"
        editor.restoreState(history.pop()); // return to last state "lundi"
        editor.restoreState(history.pop()); // return to last state "lundi" because it's the first
        System.out.println(editor.getContent());
        System.out.println("--------THAT'S ALL FOR MEMENTO--------");*/

        // uncomment to test behaviorial.State pattern
        /*
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new EraseTool());
        canvas.mouseDown();
        canvas.mouseUp();*/

        /*
        // NO MAINTAINABILITY ISSUE NO EXTENSIBILITY ISSUE NOTHING THAT'S AN ABUSE OF STATE
        StopWatch stopWatch = new StopWatch();

        stopWatch.click();
        stopWatch.setCurrentState(new RunningState(stopWatch));
        stopWatch.click();
        stopWatch.setCurrentState(new StoppedState(stopWatch));
        stopWatch.click();
        stopWatch.setCurrentState(new RunningState(stopWatch));
        stopWatch.click();*/
    }
}

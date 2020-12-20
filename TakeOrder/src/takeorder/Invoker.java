package takeorder;

public class Invoker {
    private TakeCommand takeCommand = null;

    public Invoker(TakeCommand takeCommand){
        this.takeCommand = takeCommand;
    }

    public void action(){
        takeCommand.execute();
    }
}

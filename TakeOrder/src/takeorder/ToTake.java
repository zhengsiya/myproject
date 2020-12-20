package takeorder;

public class ToTake implements TakeCommand{
    private Delivary delivary = null;
    public ToTake(Delivary delivary){
        this.delivary = delivary;
    }

    @Override
    public void execute(){
        delivary.action();
        //
    }
}

public class DishWasher{
    private boolean hasWorkToDo;

    protected void doDishes(){
        if (hasWorkToDo) System.out.println("Doing the dishes");
        hasWorkToDo=false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

public class Refrigerator{
    private boolean hasWorkToDo;

    protected void orderFood(){
        if(hasWorkToDo==true) System.out.println("Ordering food from fridge");
        hasWorkToDo=false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

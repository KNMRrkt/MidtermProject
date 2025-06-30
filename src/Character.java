public abstract class Character implements Creature{

    String name;
    int hp;

    public final boolean isAlive(){
        System.out.print(this.name + "は生きている: ");
        if(this.hp > 0){
            return true;
        }else{
            return false;
        }
    }

    public void showStatus(){
        System.out.println(this.name + "：HP " + this.hp);
    }
}

public abstract class Character implements Creature{
    String name;
    int hp;
    public abstract void attack(Character target);

    public final boolean isAlive() {
        if (0 >= hp) {
            return false;
        }else{
            return true;
        }
    }

    public void showStatus(){
        System.out.println(name + "：HP " + hp);
    }
}
public final class Slime extends Character{
    @Override
    public void attack(Character target) {
        System.out.println(this.name + "は体当たりで攻撃！" + target.name + "に5のダメージを与えた！」");
        target.hp = target.hp - 5;
    }
}

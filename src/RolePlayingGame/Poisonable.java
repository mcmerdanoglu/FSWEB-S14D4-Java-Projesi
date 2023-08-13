package RolePlayingGame;

public interface Poisonable {
    public double poison();

    //Aşağıdaki gibi farklı overload edilmiş methodlarla methodu istediğimiz gibi kullanmak için Interfacelerde tutmak daha mantıklı

    /*
    public double poison(double poisonQuantity);

    public double poison(int monsterLevel);

    */
}

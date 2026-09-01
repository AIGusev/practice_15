package practice_15.Z8;

public class Main {
   static void main(String[] args) {

       Game game = new Game();

       Character character = game.createCharacter(
               new Builder()
                       .setHealth(100)
                       .setArmor(100)
                       .setDamage(100)
                       .setMagic(100)

       );

       System.out.println(character);


    }
}

//Тут мне помог ИИ. Я долго не могу понять в чем дело. Почему не ищет .set после new Builder().
// В итоге у меня методы в Builder возвращают void, а должны возвращать Builder, чтобы работала цепочка вызовов.
//Печально, но я сам этого не заметил((
// Еще он мне поля в Builder сделал приватными, а я это не сразу заметил)) И из-за этого код не запускался.
// в Character я поменял builder.health() на builder.getHealth(); и все заработало
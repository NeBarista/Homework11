public class Main {
     final static boolean isTodayFriday = true;
    final static boolean aLotOfMoney = true;
    public static void main(String[] args) {
        weekends("I");
    }
    public static void weekends(String Me) {
        if(isTodayFriday) {
            if(aLotOfMoney) {
                println(Me + "'m going to the bar for a beer");
            }
            if (!aLotOfMoney) {
                println(Me + "'ll borrow money from a friend and have a beer with him");
            }
        }
        else {
            println(Me + "`m going home to eat buckwheat");
        }
    }
    public static void println(String text) {
        System.out.println(text);
    }
}
public class Main {

    public static void main(String[] args) {

        ForLoop.printTotalAsscociatesNames(new String[]{"Peter", "Kyle", "Phillip", "Chase", "Rose"});


        String[] associates = {"Tracie","Abbey","Torsk"};
        System.out.println(ForLoop.printTotalAsscociatesNames(associates));

        WhileLoops.printFirst2Indexes(associates);

        DoWhile doWhile = new DoWhile();
        doWhile.printValueifTrue();

        SwitchStatemetns switchStatemetns = new SwitchStatemetns();
        switchStatemetns.gradeCalculator(78);
    }
}

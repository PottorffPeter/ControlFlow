public class ForLoop {

    public ForLoop() {

    }

    public static void printAsscociatesNames(String[] names) {

        for (int i = 3; i < names.length; i++) {

            System.out.println(names[i]);
        }
    }

    public static int printTotalAsscociatesNames(String[] associatesArray){

        int counter = 0;

        for(String singleAssociate: associatesArray){

            counter += singleAssociate.length();
        }

        return counter;
    }

}

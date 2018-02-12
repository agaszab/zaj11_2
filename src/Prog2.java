public class Prog2 {

    public static void main(String[] args) {
        Para2 <Integer, Integer> pair1= new Para2 <>(4,8);
        Para2 <Double, Double> pair2= new Para2 <> (4.3,8.1);
        Integer first = pair1.getFirst();
        Double first2 = pair2.getSecont();


        double sum= first+first2;

        System.out.println(sum);

    }
}


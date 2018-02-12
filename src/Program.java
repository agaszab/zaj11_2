public class Program {

    public static void main(String[] args) {
        Pair pair1= new Pair (4,8);
        Pair pair2= new Pair (4.3,8.1);
        Object o1 = pair1.getFirst();
        Object o2 = pair2.getSecont();





        double sum= ((Integer)o1)+((Double)o2);
        System.out.println(o2);
        System.out.println(o1);
        System.out.println(sum);

    }
}

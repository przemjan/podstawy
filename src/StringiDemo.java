public class StringiDemo {
    public static void main(String[] args) {

        String name = "Zdzisek";

        char inicjal = name.charAt(5);

        System.out.println(inicjal);

        int dlugosc = name.length();

        String  male;

        name = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(" "+  male + " orig: " + name);

    }
}

public class HomeAppliancesStore {

    static String companyName;
    static String address;
    static int numberOfEmployees;

    public static void main(String args[])  {

        try {
            companyName = args[0];
            address = args[1];
            numberOfEmployees = Integer.parseInt(args[2]);
        } catch (Exception e) {
            System.out.println("Please Specify Company Name");
        }

        if (companyName == null) {
            System.out.println("Please Specify Company Name");
        } else {
        }
    }

    public static void increaseNumberOfEmployees(int newEmployees) {

    }


}

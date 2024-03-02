public class TestMovie {
    public static void main(String[] args) {
        Movie silence = new Movie("The silence of the lambs", 1991,
                "Jodie Foster", "Anthony Hopkins");
        System.out.println(silence);

        Movie extremely = new Movie("Extremely Loud and Incredibly Close",
                2011);
        System.out.println(extremely);

        Movie gravity = new Movie("Gravity");
        System.out.println(gravity);

        Movie.Actor leadingRole = gravity.new Actor("Sandra Bullock");
        Movie.Actor supportingRole = gravity.new Actor("George Clooney");

        gravity.setYear(2013);
        gravity.setLeadingRole(leadingRole);
        gravity.setSupportingRole(supportingRole);
        System.out.println(gravity);

        Movie fast = new Movie("Fast & Furious 6");
        Movie.Actor vin = gravity.new Actor("Vin Diesel");
        fast.setLeadingRole(vin);
        System.out.println(fast);
    }
}
public class FitnessTracker {
    public static void main(String[] args) {
         User user1 = new User("Marta", 23,10,1991, "martad@gmail.com", "09954227685", "Decher", 60, 74, 4500);
         user1.printAccountInfo();

         User user2 = new User("Tom",5,5,1998, "jonatont@gmail.com", "06758345678", "Jonaton", 83, 61,10234);
         user2.printAccountInfo();

         User user3 = new User("Kate", 30,12,2001, "kateek@gmail.com", "05678643477", "Smith", 56, 69, 11095);
         user3.printAccountInfo();

         user1.setPressure(67);
         user1.setNumOfSteps(9870);
         user1.setSurname("Dorph");
         user3.setWeight(81);
         user3.setNumOfSteps(11000);

         user1.printAccountInfo();
         user3.printAccountInfo();
    }
}

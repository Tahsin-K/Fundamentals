package se.lexicon;
  public class Person {

      //fields

      String firstName;
      String lastName;
      String agE;
      String hobby;

          // methods
      public String getPersoInformation () {
          return firstName + " " + lastName + " " + "is " + agE +" " + "years old and likes to" + " " + hobby;
      }

      public String getFullName(){
          return firstName + " " + lastName;
      }


      }








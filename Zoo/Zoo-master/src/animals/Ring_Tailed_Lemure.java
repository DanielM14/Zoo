package animals;
import main.*;
import types.Primate;
public class Ring_Tailed_Lemure extends Primate{
        // instance variables - replace the example below with your own
        private String age;

        /**
         * Constructor for objects of class animals.Orangutan
         */
        public Ring_Tailed_Lemure() {
            super("animals.Ring_Tailed_Lemure", "brown and sometimes mean");
            this.age = "very young";
        }

        /**
         * An example of a method - replace this comment with your own
         */
        @Override
        public String makeNoise() {
            // put your code here
            return "screetches and throws feces.";
        }

        public String eat() {
            return "Loves to chew on sticks ";
        }
    }


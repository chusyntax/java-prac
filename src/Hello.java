public class Hello {
        public static void main(String[] args) {
            System.out.println("Hello, Chu!");
            boolean isAlien = false;
            if(isAlien == false) {
                System.out.println("Not an Alien");
                System.out.println("I don't like aliens");
            }
            int topScore = 100;
            int secondTopScore = 60;
            if((secondTopScore < topScore) && (topScore >= 100)){
                System.out.println("There is the highest score");
            }
            if((topScore > 90) || (secondTopScore < 90)){
                System.out.print("Atleast one condition was true");
                // ! = Logical Compliment operator
            }

            //With the ternary operator, the first operand is a boolean test but the other two don't have to be
            String makeOfCar = "Volkswagen";
            boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

            if(isDomestic){
                System.out.println("This car is domestic to our country");
            }

            double twenty = 20.00;
            double eighty = 80.00;
            double result = (twenty + eighty) * 100.00d;
            double nextResult = result % 40.00d;

            boolean isZero = (nextResult == 0.00) ? true : false;
            System.out.println(isZero);
            if(!isZero){
                System.out.println("got some error");
            } else{
                System.out.println("No errors");
            }
        }
    }


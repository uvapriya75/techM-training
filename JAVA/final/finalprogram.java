package abc;

final class FinalClass {



        final int CONSTANT_VALUE = 100;


        public FinalClass() {
            System.out.println("FinalClassConstructor: CONSTANT_VALUE = " + CONSTANT_VALUE);
        }


        public final void displayMessage() {
            System.out.println(" final method in a final class.");
        }
    }


    class ParentClass {
        // Final method: Cannot be overridden
        public final void finalMethod() {
            System.out.println("final method in ParentClass.");
        }
    }


    class ChildClass extends ParentClass {

    }

     class FinalKeywordDemo {
        public static void main(String[] args) {
            // Demonstrate final class usage
            FinalClass obj1 = new FinalClass();
            obj1.displayMessage();

            ParentClass obj2 = new ParentClass();
            obj2.finalMethod();
            ChildClass obj3 = new ChildClass();
            obj3.finalMethod();
        }
    }



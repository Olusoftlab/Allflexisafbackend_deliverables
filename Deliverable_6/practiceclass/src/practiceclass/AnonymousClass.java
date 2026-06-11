package practiceclass;

@SuppressWarnings("java:S106")

public class AnonymousClass {

    interface Vehicle {

        void useGear();

        int numberOfWheel(int addWheel);

    }

    public void anonyExample() {

        // local class declaration

        class Toyota implements Vehicle {

            String userName = "bob";

            public void useGear() {

                System.out.println("use the gear function " + userName);

            }

            public int numberOfWheel(int addWheel) {

                return addWheel + 10;

            }

        }

        // Anonyclass example
        Vehicle camry = new Vehicle() {

            String userName = "peter";

            public void useGear() {

                System.out.println("use the gear function " + userName);
            }

            public int numberOfWheel(int addWheel) {

                return addWheel + 10;

            }

        };

        Vehicle kia = new Vehicle() {

            String userName = "sterling";

            public void useGear() {

                System.out.println("use the gear functiion " + userName);

            }

            public int numberOfWheel(int addWheel) {

                return addWheel + 10;

            }

        };

        kia.useGear();
        System.out.println(kia.numberOfWheel(45));

        camry.useGear();

        System.out.println(camry.numberOfWheel(56));

        Toyota myCar = new Toyota();

        myCar.useGear();
        System.out.println(myCar.numberOfWheel(45));

    }

}
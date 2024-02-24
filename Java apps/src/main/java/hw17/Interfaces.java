package hw17;

public class Interfaces {
    interface Smartphones {
        void call();

        void sms();

        void internet();
    }

    interface LinuxOS {
        void runLinuxCommands();
    }

    interface iOS {
        void runiOSCommands();
    }

    // The Androids class, which extends the Smartphones class and implements LinuxOS
    public static class Androids implements Smartphones, LinuxOS {
        @Override
        public void call() {
            System.out.println("Android is making a call");
        }

        @Override
        public void sms() {
            System.out.println("Android is sending an SMS");
        }

        @Override
        public void internet() {
            System.out.println("Android is browsing the internet");
        }

        @Override
        public void runLinuxCommands() {
            System.out.println("Android is running Linux commands");
        }
    }

    // The iPhones class, which extends the Smartphones class and implements iOS
    public static class iPhones implements Smartphones, iOS {
        @Override
        public void call() {
            System.out.println("iPhone is making a call");
        }

        @Override
        public void sms() {
            System.out.println("iPhone is sending an SMS");
        }

        @Override
        public void internet() {
            System.out.println("iPhone is browsing the internet");
        }

        @Override
        public void runiOSCommands() {
            System.out.println("iPhone is running iOS commands");
        }
    }

    // Main class for creating instances and calling methods
    public static class Main {
        public static void main(String[] args) {
            // Androids instance
            Androids androidPhone = new Androids();
            System.out.println("Android Phone:");
            callAndPrint(androidPhone);

            // iPhones instance
            iPhones iPhone = new iPhones();
            System.out.println("\niPhone:");
            callAndPrint(iPhone);
        }

        // A method to call smartphone methods
        public static void callAndPrint(Smartphones phone) {
            phone.call();
            phone.sms();
            phone.internet();

            // Checking whether the object implements LinuxOS or iOS and calling the appropriate method
            if (phone instanceof LinuxOS) {
                ((LinuxOS) phone).runLinuxCommands();
            } else if (phone instanceof iOS) {
                ((iOS) phone).runiOSCommands();
            }
        }
    }
}

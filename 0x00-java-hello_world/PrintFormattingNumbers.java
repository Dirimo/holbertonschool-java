  public class PrintFormattingNumbers {
        public static void main(String[] args) {
            float tax = 0.2456f;
            float value = 7654.321f;
            System.out.println("Total: $" + String.format("%.2f", value) + "\nTax: " + String.format("%.3f", tax));
        }
    }

package greeter;

public class Greeter {
    public static void main(String[] args) {
        private String format;

        public String greet(String guest) {
            return String.format(format, guest);
        }

        public void setFormat(String format) {
            this.format = format;
        }
    }
}

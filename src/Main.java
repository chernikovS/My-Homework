public class Main {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();

        ConsolePrinter.Message message1 =
                new ConsolePrinter.Message("Hello", "Alexander");
        printer.print(message1);

        ConsolePrinter.Message message2 =
                new ConsolePrinter.Message("Hello", null);
        printer.print(message2);

        ConsolePrinter.Message message3 =
                new ConsolePrinter.Message(null, null);
        printer.print(message3);
    }
}
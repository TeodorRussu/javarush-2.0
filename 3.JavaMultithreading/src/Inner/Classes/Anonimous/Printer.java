package Inner.Classes.Anonimous;

public interface Printer {
    void printText();
}

class TextPrinter  implements Printer{
    private String text;


    public String getText() {
        return text;
    }

    public TextPrinter(String text) {

        this.text = text;
    }

    @Override
    public void printText() {
        System.out.println(text);
    }
}

class AdvTextPrinter extends TextPrinter{

    @Override
    public void printText() {
        super.printText();
    }

    public AdvTextPrinter(String text) {
        super(text);
    }
}

class Starter{

    public static void main(String[] args) {
        final Printer textPrinter = new TextPrinter("Text-to-print");
        textPrinter.printText();
//        final Printer advTextPrinter = new AdvTextPrinter("Text-to-print in advanced mode");
//        advTextPrinter.printText();

        final Printer advancedTextPrinter = new TextPrinter("Print!"){
            @Override
            public void printText() {
                System.out.println("advanced mode");
                super.printText();
            }
        };
        advancedTextPrinter.printText();
    }


}
import interpreterPattern.IExpression;
import interpreterPattern.Interpreter;
import mementoPattern.History;
import mementoPattern.TextEditor;
import observerPattern.NewsAgency;
import observerPattern.NewsChannel;


public class Main {
    public static void main(String[] args) {
        // Interpreter Pattern
        String input = "5 + 3 - 2";
        int result = Interpreter.interpret(input);
        System.out.println("Result: " + result);

        // Memento Pattern
        TextEditor editor = new TextEditor("Initial");
        History history = new History();

        editor.setState("Hello");
        history.save(editor.save());

        editor.setState("Hello Guys");
        history.save(editor.save());

        editor.setState("Hello Aman");
        System.out.println("Current State: " + editor.getState());

        editor.restore(history.undo());
        System.out.println("Undo 1: " + editor.getState());

        editor.restore(history.undo());
        System.out.println("Undo 2: " + editor.getState());

        // Observer Pattern
        NewsAgency agency = new NewsAgency();
        NewsChannel channel1 = new NewsChannel();
        NewsChannel channel2 = new NewsChannel();


        agency.addObserver(channel1);
        agency.addObserver(channel2);


        agency.setHeadline("Weather Update: Sunny Day Ahead!");

        agency.removeObserver(channel1);

        agency.setHeadline("Sports News: Local Team Wins Championship!");



    }
}

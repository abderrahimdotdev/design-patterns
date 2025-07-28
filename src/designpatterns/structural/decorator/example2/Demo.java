package designpatterns.structural.decorator.example2;

import designpatterns.structural.decorator.example2.components.PlainText;
import designpatterns.structural.decorator.example2.components.Text;
import designpatterns.structural.decorator.example2.decorators.BoldDecorator;
import designpatterns.structural.decorator.example2.decorators.EncryptionDecorator;
import designpatterns.structural.decorator.example2.decorators.ItalicDecorator;

public class Demo {
    public static void main(String[] args) {

        /*
         *************
         * Decorator *
         *************
         *
         * The Decorator Design Pattern is a structural pattern that allows you to add
         * new behavior to an object dynamically, without altering its structure. It is
         * a flexible alternative to subclassing, letting you "decorate" an object with
         * additional functionality.
         */


        // Create plain text

        Text text = new PlainText("Welcome to the Decorator Design Pattern.");
        System.out.println(text.getContent()); // OUTPUT: Welcome to the Decorator Design Pattern.

        // Add bold formatting

        text = new BoldDecorator(text);
        System.out.println(text.getContent()); // OUTPUT: <b>Welcome to the Decorator Design Pattern.</b>

        // Add italic formatting

        text = new ItalicDecorator(text);
        System.out.println(text.getContent()); // OUTPUT: <i><b>Welcome to the Decorator Design Pattern.</b></i>

        // Add text encryption

        text = new EncryptionDecorator(text);
        System.out.println(text.getContent()); // OUTPUT: >i/<>b/<.nrettaP ngiseD rotaroceD eht ot emocleW>b<>i<
    }
}

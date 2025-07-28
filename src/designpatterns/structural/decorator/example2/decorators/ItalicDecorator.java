package designpatterns.structural.decorator.example2.decorators;

import designpatterns.structural.decorator.example2.components.Text;

/*
 * This is a concrete decorator that adds additional behavior or
 * responsibilities to the base component (PlainText) by overriding the
 * base Text interface's methods.
 */
public class ItalicDecorator extends TextDecorator {
   
    public ItalicDecorator(Text text) {
        super(text);
    }

    @Override
    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }
}

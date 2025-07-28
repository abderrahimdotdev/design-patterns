package designpatterns.structural.decorator.example2.decorators;

import designpatterns.structural.decorator.example2.components.Text;

/*
 * This is a concrete decorator that adds additional behavior or
 * responsibilities to the base component (PlainText) by overriding the
 * base Text interface's methods.
 */
public abstract class TextDecorator implements Text {

    private Text decoratedText;

    protected TextDecorator(Text text) {
        this.decoratedText = text;
    }

    public String getContent() {
        return decoratedText.getContent();
    }
}

package designpatterns.structural.decorator.example2.components;

/*
 * This is the component and the base object that we will be decorating. It implements the common
 * interface Text and provides the actual functionality.
 */
public class PlainText implements Text {
    
    String content;

    public PlainText(String content){
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

}

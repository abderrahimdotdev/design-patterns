package designpatterns.behavioral.iterator.custom.iterators;

import designpatterns.behavioral.iterator.custom.entities.Media;

public interface MediaIterator {
    
    boolean hasNext();
    Media next();
}

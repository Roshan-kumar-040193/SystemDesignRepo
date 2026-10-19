package org.example;

//eg- java.util.concurrent.Flow (Reactive Streams), Spring's ApplicationEventPublisher.

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        NewsPaperReader reader1 = new Reader1();
        NewsPaperReader reader2 = new Reader2();
        NewsPaperReader reader3 = new Reader3();

        NewspaperRoute route = new Route();

        route.addReaders(reader1);
        route.addReaders(reader2);

        route.deliver();

        reader1.read();
        reader2.read();
        reader3.read();
    }
}

interface NewspaperRoute{
    public void addReaders(NewsPaperReader reader);
    public void removeReaders(NewsPaperReader reader);
    public void deliver();
}

class Route implements NewspaperRoute{

    List<NewsPaperReader> readers = new ArrayList<>();

    @Override
    public void addReaders(NewsPaperReader reader) {
        readers.add(reader);
    }

    @Override
    public void removeReaders(NewsPaperReader reader) {
        readers.remove(reader);
    }

    @Override
    public void deliver() {
        readers.stream().forEach(r->r.updateIsDelivered());
    }
}

interface NewsPaperReader {
    void updateIsDelivered();
    void read();
}

class Reader1 implements NewsPaperReader{
    final String name = "Mr White";
    boolean isReadable=false;

    @Override
    public void updateIsDelivered() {
        isReadable=true;
        System.out.println(name+" can read the news paper");
    }

    @Override
    public void read() {
        if(isReadable) System.out.println(name+" is reading the news paper");
        else System.out.println("Newspaper not yet delivered for "+name);
    }
}

class Reader2 implements NewsPaperReader{
    final String name = "Mr Black";
    boolean isReadable=false;

    @Override
    public void updateIsDelivered() {
        isReadable=true;
        System.out.println(name+" can read the news paper");
    }

    @Override
    public void read() {
        if(isReadable) System.out.println(name+" is reading the news paper");
        else System.out.println("Newspaper not yet delivered for "+name);
    }
}

class Reader3 implements NewsPaperReader{
    final String name = "Mr Pink";
    boolean isReadable=false;

    @Override
    public void updateIsDelivered() {
        isReadable=true;
        System.out.println(name+" can read the news paper");
    }

    @Override
    public void read() {
        if(isReadable) System.out.println(name + " is reading the news paper");
        else System.out.println("Newspaper not yet delivered for "+name+" , also why do i have to be mr pink ?");
    }
}

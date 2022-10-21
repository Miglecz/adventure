package org.miglecz.adventure;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Game {
    private final Map<Integer, Page> pages;

    public Game() {
        this(
            Page.of(0, "Meghaltál! Vége a játéknak..."),
            Page.of(1, "Melyik a kedvenc gyümid?", Option.of(2, "alma"), Option.of(3, "körte")),
            Page.of(2, "Szereted az almát", Option.of(0, "tovább")),
            Page.of(3, "Szereted a körtét", Option.of(0, "tovább"))
        );
    }

    public Game(Path file) {
        //TODO read from file
        this();
    }

    public Game(final Page... pages) {
        this.pages = Arrays.stream(pages).collect(Collectors.toMap(Page::getIndex, Function.identity()));
    }

    public void run() {
        for (int i = 1; i != 0; i = pages.get(i).next()) {
            pages.get(i).show();
        }
        pages.get(0).show();
    }
}

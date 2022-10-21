package org.miglecz.adventure.game;

import java.nio.file.Path;
import java.util.List;

public class Game {
    private final List<Page> pages;

    public Game() {
        this(List.of(
            Page.of("Meghaltál! Vége a játéknak..."),
            Page.of("Melyik a kedvenc gyümid?", Option.of(2, "alma"), Option.of(3, "körte")),
            Page.of("Szereted az almát", Option.of(0, "tovább")),
            Page.of("Szereted a körtét", Option.of(0, "tovább"))
        ));
    }

    public Game(Path file) {
        //TODO read from file
        this(List.of());
    }

    public Game(final List<Page> pages) {
        this.pages = pages;
    }

    public void run() {
        for (int i = 1; i != 0; i = pages.get(i).next()) {
            pages.get(i).show();
        }
        pages.get(0).show();
    }
}

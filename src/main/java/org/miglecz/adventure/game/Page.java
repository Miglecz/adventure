package org.miglecz.adventure.game;

import java.util.List;
import java.util.Scanner;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Page {
    final static Scanner SCANNER = new Scanner(System.in);
    private final String text;
    private final List<Option> options;

    public void show() {
        System.out.println(text);
        for (int i = 0; i < options.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, options.get(i).getText());
        }
    }

    public int next() {
        System.out.println("?");
        try {
            return options.get(readSelection() - 1).getPage();
        } finally {
            System.out.println();
        }
    }

    private int readSelection() {
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static Page of(final String text, final Option... options) {
        return new Page(text, List.of(options));
    }
}

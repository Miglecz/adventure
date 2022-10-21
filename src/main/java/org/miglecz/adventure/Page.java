package org.miglecz.adventure;

import java.util.List;
import java.util.Scanner;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Page {
    final static Scanner SCANNER = new Scanner(System.in);
    @Getter
    private final int index;
    @Getter
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

    public static Page of(final int index, final String text, final Option... options) {
        return new Page(index, text, List.of(options));
    }
}

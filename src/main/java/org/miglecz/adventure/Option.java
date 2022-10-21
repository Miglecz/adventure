package org.miglecz.adventure;

import lombok.Value;

@Value
public class Option {
    int page;
    String text;

    public static Option of(int page, String text) {
        return new Option(page, text);
    }
}

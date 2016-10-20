package com.pug.demo.utils;

import org.pegdown.PegDownProcessor;

public class MarkdownUtils {

    /**
     * Converts Markdown into HTML using the {@link PegDownProcessor} library.
     * Creates a new instance of the {@link PegDownProcessor} each time because it isn't thread safe.
     *
     * //TODO: Is there a way we can make this better? Singleton?
     *
     * @param markdown Markdown text to be converted into html
     *
     * @return A String of the converted text in html format
     */
    public static String convertMarkdownToHtml(String markdown) {
        return new PegDownProcessor().markdownToHtml(markdown);
    }
}

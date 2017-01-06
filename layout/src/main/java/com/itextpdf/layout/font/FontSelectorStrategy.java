package com.itextpdf.layout.font;

import com.itextpdf.io.font.otf.Glyph;
import com.itextpdf.kernel.font.PdfFont;

import java.util.List;

/**
 * {@link FontSelectorStrategy} responsible for splitting text into sub texts with font.
 * {@link #nextGlyphs()} will create next sub text and set current font.
 */
public abstract class FontSelectorStrategy {

    protected String text;
    protected int index;
    protected FontProvider provider;

    protected FontSelectorStrategy(String text, FontProvider provider) {
        this.text = text;
        this.index = 0;
        this.provider = provider;
    }

    public boolean EndOfText() {
        return text == null || index >= text.length();
    }

    public abstract PdfFont getCurrentFont();

    public abstract List<Glyph> nextGlyphs();
}
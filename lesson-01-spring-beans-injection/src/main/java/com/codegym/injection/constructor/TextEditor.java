package com.codegym.injection.constructor;
//(Trong DI bằng constructor, cả đối tượng phụ thuộc và đối tượng cấp sự phụ thuộc
//        đều phải định nghĩa là Bean trong 1 file xml trong thư mục resources)
public class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}

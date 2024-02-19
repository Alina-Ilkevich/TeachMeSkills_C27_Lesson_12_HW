package com.teachmeskills.lesson12.task2.consts;

/**
 * This class contains regular expressions for the phone number,
 * document number and email in the line
 */
public interface Consts {
    public static final String REGEXP_EMAIL = "\\b([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z]{3})\\b";
    public static final String REGEXP_PHONE_NUMBER = "\\+\\(\\d{2}\\)\\d{10}";
    public static final String REGEXP_DOC_NUMBER = "\\b\\d{4}\\-\\d{4}\\-\\d{2}\\b";
}

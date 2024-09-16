package xyz.sadiulhakim.mail;

public record Mail(String subject, String mail) {
    public Mail() {
        this("", "");
    }
}

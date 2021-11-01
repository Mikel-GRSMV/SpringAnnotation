package ru.folder;

public class MessageRenderer implements MessageRendererInterface{
    private Message message;

    public MessageRenderer(Message message) {
        this.message = message;
    }

    @Override
    public void printMsg() {
        System.out.println(message.getText());
    }

}

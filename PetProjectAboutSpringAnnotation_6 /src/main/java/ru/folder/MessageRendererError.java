package ru.folder;

public class MessageRendererError implements MessageRendererInterface{
    @Override
    public void printMsg() {
        System.err.println(message.getText());
    }
    private Message message;

    public MessageRendererError(Message message) {
        this.message = message;
    }

}

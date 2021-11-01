package ru.folder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndependentMessageRenderer {

    private MessageRendererInterface rendererInterface;

    @Autowired
    public IndependentMessageRenderer(MessageRendererInterface rendererInterface) {
        this.rendererInterface = rendererInterface;
    }

    public void print(){
        rendererInterface.printMsg();
    }
}

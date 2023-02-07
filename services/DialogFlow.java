package services;

import repository.IServiceOffering;

public class DialogFlow implements IServiceOffering {
    @Override
    public boolean detect(String service) {
        return service.equals("dialogflow");
    }

    @Override
    public String getOffering() {
        return "/dialogflow";
    }
}

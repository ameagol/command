package services;

import repository.IServiceOffering;

public class Bot implements IServiceOffering {
    @Override
    public boolean detect(String service) {
        return service.equals("bot");
    }

    @Override
    public String getOffering() {
        return "/products/bot-services/";
    }
}

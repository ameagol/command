package services;

import repository.IServiceOffering;

public class Lambda implements IServiceOffering {
    @Override
    public boolean detect(String service) {
        return service.equals("lambda");
    }

    @Override
    public String getOffering() {
        return "/lambda";
    }
}

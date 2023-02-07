package services;

import repository.IServiceOffering;

public class Vertex implements IServiceOffering {
    @Override
    public boolean detect(String service) {
        return service.equals("vertex");
    }

    @Override
    public String getOffering() {
        return "/vertex-ai";
    }
}

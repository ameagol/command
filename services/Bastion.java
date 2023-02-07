package services;

import clouds.Microsoft;
import repository.IServiceOffering;

public class Bastion implements IServiceOffering  {

    @Override
    public boolean detect(String service) {
        return service.equals("bastion");
    }

    @Override
    public String getOffering() {
        return "/services/azure-bastion/";
    }

    @Override
    public void runCommand(String data) {

    }
}

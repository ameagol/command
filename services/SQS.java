package services;

import repository.IServiceOffering;

public class SQS implements IServiceOffering {
    @Override
    public boolean detect(String service) {
        return service.equals("lambda");
    }

    @Override
    public String getOffering() {
        return "/sqs";
    }
}

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
    
    @Override
    public void runCommand(String data) {
        aws lambda update-function-code --function-name my-function --zip-file fileb:data//my-function.zip
    }
}

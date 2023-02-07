package clouds;

import repository.ICloudProvider;

public class Microsoft implements ICloudProvider {
    @Override
    public boolean detect(String cloud) {
        return cloud.equals("azzure");
    }

    @Override
    public String getProvider() {
        return "https://azure.microsoft.com";
    }
}

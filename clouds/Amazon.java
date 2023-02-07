package clouds;

import repository.ICloudProvider;

public class Amazon implements ICloudProvider {
    @Override
    public boolean detect(String cloud) {
        return cloud.equals("amazon");
    }

    @Override
    public String getProvider() {
        return "https://docs.aws.amazon.com";
    }
}

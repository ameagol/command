package clouds;

import repository.ICloudProvider;

public class Google implements ICloudProvider {
    @Override
    public boolean detect(String cloud) {
        return cloud.equals("gcp");
    }

    @Override
    public String getProvider() {
        return "https://cloud.google.com";
    }
}

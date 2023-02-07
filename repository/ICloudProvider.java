package repository;

public interface ICloudProvider {
    public boolean detect(String cloud);

    public String getProvider();
}

package repository;

public interface IServiceOffering {
    public boolean detect(String cloud);
    public String getOffering();
    public void runCommand(String data);
}
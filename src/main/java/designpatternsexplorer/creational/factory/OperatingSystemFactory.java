package designpatternsexplorer.creational.factory;

public class OperatingSystemFactory {

    private OperatingSystemFactory(){

    }

    public static OperatingSystem getInstance(String osType){

        if(osType.equals("windows")){
            return new WindowsOS();
        }

        if(osType.equals("mac")){
            return new MacOS();
        }
        return null;
    }

}

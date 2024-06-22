import factories.LinuxOperatingSystem;
import factories.OperatingSystem;
import factories.WindowsOperatingSysten;

public class OperatingSystemFactory {

    private OperatingSystemFactory() {

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type){
            case "WINDOWS":
                return new WindowsOperatingSysten(version,architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version,architecture);
            default:
                throw new IllegalArgumentException("OS Not supported");
        }
    }
}

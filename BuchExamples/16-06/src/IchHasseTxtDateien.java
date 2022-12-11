import java.io.File;

class IchHasseTxtDateien {

    public static void main(String args[]) {

        File folder = new File(".");
        for (File file : folder.listFiles()) {
            if (file.getName().endsWith(".txt")) {
                file.delete();
            }
        }
    }
}

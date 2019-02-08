import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FileObserve tst1 = new FileObserve("C:\\projects\\Task1_SPLAT", ".log");
        ArrayList<String> files = new ArrayList(tst1.getFilesList());
       files = (ArrayList<String>) tst1.getFilesList().clone();
        for(String file : files){
            System.out.println(file);
        }
        System.out.println("---------------------------------------------------------------");
        FileProcess fp = new FileProcess("C:\\projects\\Task1_SPLAT", ".txt", "1");
        fp.findFiles();
        files = fp.getProcessedFilesList();
        for(String file : files){
            System.out.println(file);
        }


    }
}

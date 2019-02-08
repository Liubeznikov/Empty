import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileProcess extends FileObserve {
    private ArrayList<String> scanFiles = new ArrayList<String>();
    String desiredText;

    FileProcess(String rootPath, String fileType, String desiredText){
        super(rootPath,fileType);
        this.desiredText = desiredText;
    }

    FileProcess(String rootPath,  String desiredText){
        super(rootPath);
        this.desiredText = desiredText;
    }

    public ArrayList<String> getProcessedFilesList(){
        return scanFiles;
    }


    public void findFiles() {
        Pattern p = Pattern.compile(desiredText);
        for (String fname : this.getFilesList()) {
            try {
                String a = new String(Files.readAllBytes(Paths.get(fname)));
                Matcher m = p.matcher(a);
                while (m.find()) {
                    scanFiles.add(fname);
                    break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

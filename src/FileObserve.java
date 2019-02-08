import java.io.File;
import java.util.ArrayList;

public class FileObserve {
    private ArrayList<String> filePath = new ArrayList<String>();
    private String rootPath;
    private String fileType;

    FileObserve(String rootPath,String fileType){
        this.rootPath = rootPath;
        this.fileType = fileType;
        createList(rootPath);
    }

    FileObserve(String rootPath){
        this.rootPath = rootPath;
        this.fileType =".log";
        createList(rootPath);
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    public void RefreshList(){
        createList(rootPath);
    }

    private static String getFileExtension(File file) {

            String[] sp = file.getName().split("\\.");
            return "." + sp[sp.length - 1];

    }

    public ArrayList<String> getFilesList(){
        return filePath;
    }

    public void createList(String path){
        File dir= new File(path);
        if(dir.isDirectory())
        {

            for(File item : dir.listFiles()){

                if(item.isDirectory()){

                   // System.out.println(dir.toString() + "\\" + item.getName() + "  \t folder");
                    createList(dir.toString() + "\\" + item.getName());
                }
                else{

                    if (getFileExtension(item).equals(fileType)){
                        filePath.add(dir.toString() + "\\" +item.getName());
                    }

                    //System.out.println(dir.toString() + "\\" +item.getName() + "\t file");
                }
            }
        }


    }

}

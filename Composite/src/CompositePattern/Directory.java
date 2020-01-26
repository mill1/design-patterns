package CompositePattern;

import java.util.ArrayList;
import java.util.List;

//Directory implements the "lowest common denominator"
class Directory implements AbstractFile {
 private String name;
 private List<AbstractFile> includedFiles = new ArrayList<AbstractFile>();

 public Directory(String name) {
     this.name = name;
 }

 public void add(AbstractFile obj) {
     includedFiles.add(obj);
 }

 public void ls() {
     System.out.println(CompositeDemo.compositeBuilder + name);
     CompositeDemo.compositeBuilder.append("   ");
     for (AbstractFile includedFile : includedFiles) {
         // Leverage the "lowest common denominator"
         includedFile.ls();
     }
     CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
   }
}

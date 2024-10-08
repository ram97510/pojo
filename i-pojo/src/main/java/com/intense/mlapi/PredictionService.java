
// //PredictionService.java
// package com.intense.mlapi;

// import hex.genmodel.easy.EasyPredictModelWrapper;
// import hex.genmodel.easy.RowData;
// import hex.genmodel.easy.prediction.MultinomialModelPrediction;

// import java.io.File;

// import org.springframework.stereotype.Service;

// @Service
// public class PredictionService {

//     private final EasyPredictModelWrapper model;

//     public PredictionService() throws Exception {
//         String modelClassName = "com.intense.mlapi.models.gbm_b298713c_a0ac_4c98_9f7c_c574162eac3a"; 
//         // String modelClassName = "com.example.mlapi.my_new_code";

//         // String directoryPath = "D:\\nxtml-pojo-api\\my-java-api-master\\src\\main\\java\\com\\intense\\mlapi";
//         // File latestFile = getLatestFilefromDir(directoryPath);
//         // String modelClassName = "com.example.mlapi." + latestFile ;

//         System.out.println("######### modelClassName ########" + modelClassName);

//         Class<?> modelClass = Class.forName(modelClassName);
//         this.model = new EasyPredictModelWrapper((hex.genmodel.GenModel) modelClass.getDeclaredConstructor().newInstance());
//     }

//     public MultinomialModelPrediction predict(RowData rowData) throws Exception {
//         return model.predictMultinomial(rowData);
//     }


//     private File getLatestFilefromDir(String dirPath){
//         File dir = new File(dirPath);
//         File[] files = dir.listFiles();
//         if (files == null || files.length == 0) {
//             return null;
//         }
    
//         File lastModifiedFile = files[0];
//         for (int i = 1; i < files.length; i++) {
//            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
//                lastModifiedFile = files[i];
//            }
//         }
//         return lastModifiedFile;
//     }
// }


package com.intense.mlapi;

import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.prediction.MultinomialModelPrediction;

import java.io.File;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {

    private final EasyPredictModelWrapper model;

    public PredictionService() throws Exception {
        // Path to the models directory
        String modelsPath = "src\\main\\java\\com\\intense\\mlapi\\models";
        
        // Get the file name of the model Java file (without the .java extension)
        String modelFileName = getModelFileName(modelsPath);

        if (modelFileName == null) {
            throw new Exception("Model file not found in the directory: " + modelsPath);
        }

        // Construct the class name based on the file name
        // String modelClassName = modelsPath.replace("/", ".") + modelFileName;

        String modelClassName = "com.intense.mlapi.models." + modelFileName;
        

        System.out.println("######### modelClassName ######## " + modelClassName);

        // Load the class dynamically
        Class<?> modelClass = Class.forName(modelClassName);
        this.model = new EasyPredictModelWrapper((hex.genmodel.GenModel) modelClass.getDeclaredConstructor().newInstance());
    }

    // Method to find the model file name in the models directory (without .java extension)
    private String getModelFileName(String modelsPath) {
        File dir = new File(modelsPath);
        File[] files = dir.listFiles((dir1, name) -> name.endsWith(".java"));

        if (files != null && files.length > 0) {
            // Extract the filename without the extension
            return files[0].getName().replace(".java", "");
        }
        return null;
    }

    public MultinomialModelPrediction predict(RowData rowData) throws Exception {
        return model.predictMultinomial(rowData);
    }
}


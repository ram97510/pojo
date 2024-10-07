
//PredictionService.java
package com.example.mlapi;

import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.prediction.MultinomialModelPrediction;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {

    private final EasyPredictModelWrapper model;

    public PredictionService() throws Exception {
        String modelClassName = "com.example.mlapi.gbm_b298713c_a0ac_4c98_9f7c_c574162eac3a"; 
        // String modelClassName = "com.example.mlapi.my_new_code";
        Class<?> modelClass = Class.forName(modelClassName);
        this.model = new EasyPredictModelWrapper((hex.genmodel.GenModel) modelClass.getDeclaredConstructor().newInstance());
    }

    public MultinomialModelPrediction predict(RowData rowData) throws Exception {
        return model.predictMultinomial(rowData);
    }
}


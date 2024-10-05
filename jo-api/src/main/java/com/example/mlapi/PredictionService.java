
//PredictionService.java
package com.example.mlapi;

import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.prediction.BinomialModelPrediction;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {

    private final EasyPredictModelWrapper model;

    public PredictionService() throws Exception {
        String modelClassName = "com.example.mlapi.gbm_45c9cf11_1fcf_4a80_8b0a_f2558074a1ec"; // Ensure this is correct
        Class<?> modelClass = Class.forName(modelClassName);
        this.model = new EasyPredictModelWrapper(
                (hex.genmodel.GenModel) modelClass.getDeclaredConstructor().newInstance());
    }

    public BinomialModelPrediction predict(RowData rowData) throws Exception {
        return model.predictBinomial(rowData);
    }
}

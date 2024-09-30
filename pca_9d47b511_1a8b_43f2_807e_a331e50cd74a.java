/*
  Licensed under the Apache License, Version 2.0
    http://www.apache.org/licenses/LICENSE-2.0.html

  AUTOGENERATED BY H2O at 2024-09-30T13:07:30.180+05:30
  3.47.0.99999
  
  Standalone prediction code with sample test data for PCAModel named pca_9d47b511_1a8b_43f2_807e_a331e50cd74a

  How to download, compile and execute:
      mkdir tmpdir
      cd tmpdir
      curl http://172.16.0.18:54321/3/h2o-genmodel.jar > h2o-genmodel.jar
      curl http://172.16.0.18:54321/3/Models.java/pca-9d47b511-1a8b-43f2-807e-a331e50cd74a > pca_9d47b511_1a8b_43f2_807e_a331e50cd74a.java
      javac -cp h2o-genmodel.jar -J-Xmx2g -J-XX:MaxPermSize=128m pca_9d47b511_1a8b_43f2_807e_a331e50cd74a.java

     (Note:  Try java argument -XX:+PrintCompilation to show runtime JIT compiler behavior.)
*/
import java.util.Map;
import hex.genmodel.GenModel;
import hex.genmodel.annotations.ModelPojo;

@ModelPojo(name="pca_9d47b511_1a8b_43f2_807e_a331e50cd74a", algorithm="pca")
public class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a extends GenModel {
  public hex.ModelCategory getModelCategory() { return hex.ModelCategory.DimReduction; }
  public boolean isSupervised() { return false; }
  public int nfeatures() { return 9; }
  public int nclasses() { return 1; }

  // Names of columns used by model.
  public static final String[] NAMES = NamesHolder_pca_9d47b511_1a8b_43f2_807e_a331e50cd74a.VALUES;

  // Column domains. The last array contains domain of response column.
  public static final String[][] DOMAINS = new String[][] {
    /* S.NO */ null,
    /* CURRENT  in mA */ null,
    /* I/O */ null,
    /* CRC */ null,
    /* MONDATA */ null,
    /* SONDATA */ null,
    /* LIMIT */ null,
    /* AMSRBS */ null,
    /* M/A */ null
  };

  public pca_9d47b511_1a8b_43f2_807e_a331e50cd74a() { super(NAMES,DOMAINS,null); }
  public String getUUID() { return Long.toString(1563847195828989056L); }

  // Pass in data in a double[], pre-aligned to the Model's requirements.
  // Jam predictions into the preds[] array; preds[0] is reserved for the
  // main prediction (class for classifiers or value for regression),
  // and remaining columns hold a probability distribution for classifiers.
  public final double[] score0( double[] data, double[] preds ) {
    java.util.Arrays.fill(preds,0);
    final int nstart = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS.VALUES[pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS.VALUES.length-1];
    for(int i = 0; i < 1; i++) {
      for(int j = 0; j < 0; j++) {
        double d = data[pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_PERMUTE.VALUES[j]];
        if(Double.isNaN(d)) continue;
        int last = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS.VALUES[j+1]-pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS.VALUES[j]-1;
        int c = (int)d-1;
        if(c < 0 || c > last) continue;
        preds[i] += pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS.VALUES[pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS.VALUES[j]+c][i];
      }
      for(int j = 0; j < 9; j++) {
        preds[i] += (data[pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_PERMUTE.VALUES[j]]-pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMSUB.VALUES[j])*pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMMUL.VALUES[j]*pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS.VALUES[j][i];
      }
    }
    return preds;
  }
}
// Standardization/Normalization scaling factor for numerical variables.
class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMMUL implements java.io.Serializable {
  public static final double[] VALUES = new double[9];
  static {
    pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMMUL_0.fill(VALUES);
  }
  static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMMUL_0 implements java.io.Serializable {
    static final void fill(double[] sa) {
      sa[0] = 1.0;
      sa[1] = 1.0;
      sa[2] = 1.0;
      sa[3] = 1.0;
      sa[4] = 1.0;
      sa[5] = 1.0;
      sa[6] = 1.0;
      sa[7] = 1.0;
      sa[8] = 1.0;
    }
  }
}
// Standardization/Normalization offset for numerical variables.
class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMSUB implements java.io.Serializable {
  public static final double[] VALUES = new double[9];
  static {
    pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMSUB_0.fill(VALUES);
  }
  static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMSUB_0 implements java.io.Serializable {
    static final void fill(double[] sa) {
      sa[0] = 0.0;
      sa[1] = 0.0;
      sa[2] = 0.0;
      sa[3] = 0.0;
      sa[4] = 0.0;
      sa[5] = 0.0;
      sa[6] = 0.0;
      sa[7] = 0.0;
      sa[8] = 0.0;
    }
  }
}
// Categorical column offsets.
class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS implements java.io.Serializable {
  public static final int[] VALUES = new int[1];
  static {
    pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS_0.fill(VALUES);
  }
  static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS_0 implements java.io.Serializable {
    static final void fill(int[] sa) {
      sa[0] = 0;
    }
  }
}
// Permutation index vector.
class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_PERMUTE implements java.io.Serializable {
  public static final int[] VALUES = new int[9];
  static {
    pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_PERMUTE_0.fill(VALUES);
  }
  static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_PERMUTE_0 implements java.io.Serializable {
    static final void fill(int[] sa) {
      sa[0] = 0;
      sa[1] = 1;
      sa[2] = 2;
      sa[3] = 3;
      sa[4] = 4;
      sa[5] = 5;
      sa[6] = 6;
      sa[7] = 7;
      sa[8] = 8;
    }
  }
}
// Eigenvector matrix.
class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS implements java.io.Serializable {
  public static final double[][] VALUES = new double[9][];
  static {
    pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0.fill(VALUES);
  }
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_0 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_0_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_0_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -0.9999996942278847;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_1 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_1_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_1_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -7.783786360360805E-4;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_2 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_2_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_2_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.851205377571811E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_3 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_3_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_3_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.8477536877781143E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_4 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_4_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_4_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.8460278428812665E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_5 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_5_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_5_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.845164920432842E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_6 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_6_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_6_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.8447334592086304E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_7 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_7_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_7_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.844517728695095E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_8 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_8_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_8_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.8444098632904684E-5;
      }
    }
}
  static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0 implements java.io.Serializable {
    static final void fill(double[][] sa) {
      sa[0] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_0.VALUES;
      sa[1] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_1.VALUES;
      sa[2] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_2.VALUES;
      sa[3] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_3.VALUES;
      sa[4] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_4.VALUES;
      sa[5] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_5.VALUES;
      sa[6] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_6.VALUES;
      sa[7] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_7.VALUES;
      sa[8] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_8.VALUES;
    }
  }
}
// The class representing training column names
class NamesHolder_pca_9d47b511_1a8b_43f2_807e_a331e50cd74a implements java.io.Serializable {
  public static final String[] VALUES = new String[9];
  static {
    NamesHolder_pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_0.fill(VALUES);
  }
  static final class NamesHolder_pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "S.NO";
      sa[1] = "CURRENT  in mA";
      sa[2] = "I/O";
      sa[3] = "CRC";
      sa[4] = "MONDATA";
      sa[5] = "SONDATA";
      sa[6] = "LIMIT";
      sa[7] = "AMSRBS";
      sa[8] = "M/A";
    }
  }
}

/*
  Licensed under the Apache License, Version 2.0
    http://www.apache.org/licenses/LICENSE-2.0.html

  AUTOGENERATED BY H2O at 2024-09-30T13:07:30.181+05:30
  3.47.0.99999
  
  Standalone prediction code with sample test data for PCAModel named pca_9d47b511_1a8b_43f2_807e_a331e50cd74a

  How to download, compile and execute:
      mkdir tmpdir
      cd tmpdir
      curl http://172.16.0.18:54321/3/h2o-genmodel.jar > h2o-genmodel.jar
      curl http://172.16.0.18:54321/3/Models.java/pca-9d47b511-1a8b-43f2-807e-a331e50cd74a > pca_9d47b511_1a8b_43f2_807e_a331e50cd74a.java
      javac -cp h2o-genmodel.jar -J-Xmx2g -J-XX:MaxPermSize=128m pca_9d47b511_1a8b_43f2_807e_a331e50cd74a.java

     (Note:  Try java argument -XX:+PrintCompilation to show runtime JIT compiler behavior.)
*/
import java.util.Map;
import hex.genmodel.GenModel;
import hex.genmodel.annotations.ModelPojo;

@ModelPojo(name="pca_9d47b511_1a8b_43f2_807e_a331e50cd74a", algorithm="pca")
public class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a extends GenModel {
  public hex.ModelCategory getModelCategory() { return hex.ModelCategory.DimReduction; }
  public boolean isSupervised() { return false; }
  public int nfeatures() { return 9; }
  public int nclasses() { return 1; }

  // Names of columns used by model.
  public static final String[] NAMES = NamesHolder_pca_9d47b511_1a8b_43f2_807e_a331e50cd74a.VALUES;

  // Column domains. The last array contains domain of response column.
  public static final String[][] DOMAINS = new String[][] {
    /* S.NO */ null,
    /* CURRENT  in mA */ null,
    /* I/O */ null,
    /* CRC */ null,
    /* MONDATA */ null,
    /* SONDATA */ null,
    /* LIMIT */ null,
    /* AMSRBS */ null,
    /* M/A */ null
  };

  public pca_9d47b511_1a8b_43f2_807e_a331e50cd74a() { super(NAMES,DOMAINS,null); }
  public String getUUID() { return Long.toString(1563847195828989056L); }

  // Pass in data in a double[], pre-aligned to the Model's requirements.
  // Jam predictions into the preds[] array; preds[0] is reserved for the
  // main prediction (class for classifiers or value for regression),
  // and remaining columns hold a probability distribution for classifiers.
  public final double[] score0( double[] data, double[] preds ) {
    java.util.Arrays.fill(preds,0);
    final int nstart = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS.VALUES[pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS.VALUES.length-1];
    for(int i = 0; i < 1; i++) {
      for(int j = 0; j < 0; j++) {
        double d = data[pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_PERMUTE.VALUES[j]];
        if(Double.isNaN(d)) continue;
        int last = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS.VALUES[j+1]-pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS.VALUES[j]-1;
        int c = (int)d-1;
        if(c < 0 || c > last) continue;
        preds[i] += pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS.VALUES[pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS.VALUES[j]+c][i];
      }
      for(int j = 0; j < 9; j++) {
        preds[i] += (data[pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_PERMUTE.VALUES[j]]-pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMSUB.VALUES[j])*pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMMUL.VALUES[j]*pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS.VALUES[j][i];
      }
    }
    return preds;
  }
}
// Standardization/Normalization scaling factor for numerical variables.
class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMMUL implements java.io.Serializable {
  public static final double[] VALUES = new double[9];
  static {
    pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMMUL_0.fill(VALUES);
  }
  static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMMUL_0 implements java.io.Serializable {
    static final void fill(double[] sa) {
      sa[0] = 1.0;
      sa[1] = 1.0;
      sa[2] = 1.0;
      sa[3] = 1.0;
      sa[4] = 1.0;
      sa[5] = 1.0;
      sa[6] = 1.0;
      sa[7] = 1.0;
      sa[8] = 1.0;
    }
  }
}
// Standardization/Normalization offset for numerical variables.
class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMSUB implements java.io.Serializable {
  public static final double[] VALUES = new double[9];
  static {
    pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMSUB_0.fill(VALUES);
  }
  static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_NORMSUB_0 implements java.io.Serializable {
    static final void fill(double[] sa) {
      sa[0] = 0.0;
      sa[1] = 0.0;
      sa[2] = 0.0;
      sa[3] = 0.0;
      sa[4] = 0.0;
      sa[5] = 0.0;
      sa[6] = 0.0;
      sa[7] = 0.0;
      sa[8] = 0.0;
    }
  }
}
// Categorical column offsets.
class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS implements java.io.Serializable {
  public static final int[] VALUES = new int[1];
  static {
    pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS_0.fill(VALUES);
  }
  static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_CATOFFS_0 implements java.io.Serializable {
    static final void fill(int[] sa) {
      sa[0] = 0;
    }
  }
}
// Permutation index vector.
class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_PERMUTE implements java.io.Serializable {
  public static final int[] VALUES = new int[9];
  static {
    pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_PERMUTE_0.fill(VALUES);
  }
  static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_PERMUTE_0 implements java.io.Serializable {
    static final void fill(int[] sa) {
      sa[0] = 0;
      sa[1] = 1;
      sa[2] = 2;
      sa[3] = 3;
      sa[4] = 4;
      sa[5] = 5;
      sa[6] = 6;
      sa[7] = 7;
      sa[8] = 8;
    }
  }
}
// Eigenvector matrix.
class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS implements java.io.Serializable {
  public static final double[][] VALUES = new double[9][];
  static {
    pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0.fill(VALUES);
  }
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_0 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_0_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_0_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -0.9999996942278847;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_1 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_1_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_1_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -7.783786360360805E-4;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_2 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_2_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_2_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.851205377571811E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_3 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_3_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_3_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.8477536877781143E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_4 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_4_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_4_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.8460278428812665E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_5 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_5_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_5_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.845164920432842E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_6 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_6_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_6_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.8447334592086304E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_7 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_7_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_7_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.844517728695095E-5;
      }
    }
}
  static class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_8 implements java.io.Serializable {
    public static final double[] VALUES = new double[1];
    static {
      pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_8_0.fill(VALUES);
    }
    static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_8_0 implements java.io.Serializable {
      static final void fill(double[] sa) {
        sa[0] = -2.8444098632904684E-5;
      }
    }
}
  static final class pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0 implements java.io.Serializable {
    static final void fill(double[][] sa) {
      sa[0] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_0.VALUES;
      sa[1] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_1.VALUES;
      sa[2] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_2.VALUES;
      sa[3] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_3.VALUES;
      sa[4] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_4.VALUES;
      sa[5] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_5.VALUES;
      sa[6] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_6.VALUES;
      sa[7] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_7.VALUES;
      sa[8] = pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_EIGVECS_0_8.VALUES;
    }
  }
}
// The class representing training column names
class NamesHolder_pca_9d47b511_1a8b_43f2_807e_a331e50cd74a implements java.io.Serializable {
  public static final String[] VALUES = new String[9];
  static {
    NamesHolder_pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_0.fill(VALUES);
  }
  static final class NamesHolder_pca_9d47b511_1a8b_43f2_807e_a331e50cd74a_0 implements java.io.Serializable {
    static final void fill(String[] sa) {
      sa[0] = "S.NO";
      sa[1] = "CURRENT  in mA";
      sa[2] = "I/O";
      sa[3] = "CRC";
      sa[4] = "MONDATA";
      sa[5] = "SONDATA";
      sa[6] = "LIMIT";
      sa[7] = "AMSRBS";
      sa[8] = "M/A";
    }
  }
}


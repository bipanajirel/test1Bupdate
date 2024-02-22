module com.example.updatetest1b {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.updatetest1b to javafx.fxml;
    exports com.example.updatetest1b;
}
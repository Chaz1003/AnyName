module com.example.anyname {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.anyname to javafx.fxml;
    exports com.example.anyname;
}
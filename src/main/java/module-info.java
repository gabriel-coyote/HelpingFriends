module com.example.cs2365_assignment_3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.cs2365_assignment_3 to javafx.fxml;
    exports com.example.cs2365_assignment_3;
}
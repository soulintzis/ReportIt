module org.ReportIt {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.ReportIt to javafx.fxml;
    exports org.ReportIt;
}
module org.ReportIt {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.ReportIt to javafx.fxml;
    opens org.ReportIt.Controllers to javafx.fxml;
    exports org.ReportIt;
    exports org.ReportIt.Controllers;
}
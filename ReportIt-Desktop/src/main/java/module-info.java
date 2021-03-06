module org.ReportIt {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;
    requires com.jfoenix;
    requires GMapsFX;

    opens org.ReportIt to javafx.fxml;
    opens org.ReportIt.Controllers.Mobile to javafx.fxml;
    exports org.ReportIt;
    exports org.ReportIt.Controllers.Mobile;
    opens org.ReportIt.Controllers.Desktop to javafx.fxml;
    exports org.ReportIt.Controllers.Desktop;
}
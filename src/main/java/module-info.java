module Lowe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens lowe.schoolnames to javafx.fxml;
    exports lowe.schoolnames;
}
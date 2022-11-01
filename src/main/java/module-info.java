module csc211.fxmlexample {
    requires javafx.controls;
    requires javafx.fxml;

    opens csc211.fxmlexample to javafx.fxml;
    exports csc211.fxmlexample;
}

module unit4.ui.demos {
    requires javafx.controls;
    requires javafx.fxml;


    opens unit4.ui.demos to javafx.fxml;
    exports unit4.ui.demos;
}
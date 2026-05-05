module be.odisee.demo4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.odisee.demo4 to javafx.fxml;
    exports be.odisee.demo4;
}
module dylan_and_gavin {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens dylan_and_gavin to javafx.fxml;
    exports dylan_and_gavin;
}
module com.louie.oodp_rest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;


    opens com.louie.oodp_rest to javafx.fxml;
    exports com.louie.oodp_rest;
    exports com.louie.oodp_rest.data_class;
}
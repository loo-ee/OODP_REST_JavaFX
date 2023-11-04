module com.louie.oodp_rest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.datatype.jsr310;


    opens com.louie.oodp_rest to javafx.fxml;
    exports com.louie.oodp_rest;
    exports com.louie.oodp_rest.data_class;
}
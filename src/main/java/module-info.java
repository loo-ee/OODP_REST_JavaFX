module com.louie.oodp_rest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.datatype.jsr310;


    opens com.louie.oodp_rest to javafx.fxml;
    opens com.louie.oodp_rest.data_class to com.fasterxml.jackson.databind;
//    opens com.louie.oodp_rest.data_class to javafx.fxml;
    exports com.louie.oodp_rest;
    exports com.louie.oodp_rest.data_class;
    exports com.louie.oodp_rest.data_class.SearchSeralizer;
    opens com.louie.oodp_rest.data_class.SearchSeralizer to com.fasterxml.jackson.databind;
    exports com.louie.oodp_rest.data_class.AllStudentsSerializer;
    opens com.louie.oodp_rest.data_class.AllStudentsSerializer to com.fasterxml.jackson.databind;
}
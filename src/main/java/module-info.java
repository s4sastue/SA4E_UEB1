module com.SA4E.UEB {
    requires javafx.controls;
    requires javafx.fxml;
    requires io.grpc;
    requires java.logging;
    requires com.google.protobuf;
    requires io.grpc.stub;
    requires io.grpc.protobuf;
    requires com.google.common;
    requires javax.annotation.api;


    opens com.SA4E.UEB1.T1 to javafx.fxml;
    exports com.SA4E.UEB1.T1;

    opens com.SA4E.UEB1.T2.Server to javafx.fxml;
    exports com.SA4E.UEB1.T2.Server;
    exports com.SA4E.UEB1;
    opens com.SA4E.UEB1 to javafx.fxml;
}
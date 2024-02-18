import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.geometry.*;


public class App extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        
        primaryStage.setTitle("Arithmetic Operations");
        
        GridPane layout = new GridPane();

        Scene myscene = new Scene(layout);

        primaryStage.setHeight(500);
        primaryStage.setWidth(500);

        Label l1 = new Label("Enter First Number: ");
        Label l2 = new Label("Enter Second Number: ");
        Label l3 = new Label();

        Button b1 = new Button("Calculate");

        ComboBox<String> cb = new ComboBox<String>();
        cb.getItems().addAll("Add","Subtract","Multiply","Divide");

        TextField t1 = new TextField();
        TextField t2 = new TextField();

        layout.add(l1,0,0);
        layout.add(t1,1,0);
        layout.add(l2,0,1);
        layout.add(t2,1,1);
        layout.add(cb,0,2);
        layout.add(b1,0,3);
        layout.add(l3,0,4);

        b1.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                if(cb.getValue() == null)
                    l.setText("Please select an option...");
                if(cb.getValue().equals("Add"))
                    l3.setText(String.valueOf(Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText())));
                if(cb.getValue().equals("Subtract"))
                    l3.setText(String.valueOf(Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText())));
                if(cb.getValue().equals("Multiply"))
                    l3.setText(String.valueOf(Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText())));
                if(cb.getValue().equals("Divide"))
                    l3.setText(String.valueOf(Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText())));
            }
        });


        layout.setAlignment(Pos.CENTER);

        primaryStage.setScene(myscene);

        primaryStage.show();
    }
}




























/*import javax.swing.Action;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.geometry.*;


public class App extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage primaryStage){
        primaryStage.setTitle("I AM GAY");

        FlowPane layout = new FlowPane(10,10);

        layout.setAlignment(Pos.CENTER);

        Scene newScene = new Scene(layout, 400, 400);

        Label response = new Label("Push a button");

        Button Alpha = new Button("Alpha");
        Button Beta = new Button("Beta");

        Alpha.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae){
                response.setText("Alpha was pressed");
            }
        });

        Beta.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae){
                response.setText("Beta was pressed");
            }
        });


        layout.getChildren().addAll(Beta, Alpha, response);    

        primaryStage.setScene(newScene);
        
        primaryStage.show();
    }
}

*/
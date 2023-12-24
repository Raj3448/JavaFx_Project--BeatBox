// import javafx.animation.TranslateTransition;
// import javafx.application.Application;
// import javafx.geometry.Insets;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.VBox;
// import javafx.scene.text.Font;
// import javafx.stage.Stage;
//import javafx.util.Duration;


// public class Meditation extends Application {

//     // public static void main(String[] args) {
//     //     launch(args);
//     // }

//     @Override
//     public void start(Stage primaryStage) {
        
//         primaryStage.setTitle("Meditation Home Page");

//         Label text = new Label("Be kind to your soul");
//         text.setStyle("-fx-font-size: 45px;-fx-font-weight: bold;-fx-text-fill: #131345;");
//         text.setAlignment(Pos.CENTER_LEFT);
//         text.setFont(Font.font("Arial", 24));
//         text.setPadding(new Insets(60,380, 0, 0));

//         Label text1 = new Label("Spend your time with your soul and body together, so that\nyou will see yourself absorbed and connected towards everthing");
//         text1.setStyle("-fx-font-size: 25px;");

//         VBox container = new VBox(10);
//         container.getChildren().addAll(text,text1);
//         container.setPadding(new Insets(0, 0, 0, 30));


        // //  "Let's Go" 
        // Button letsGoButton = new Button("Get Started");
        // letsGoButton.setMinWidth(300);
        // letsGoButton.setStyle("-fx-font-size: 35px;-fx-font-weight: bold;-fx-text-fill: white;");
        // letsGoButton.setFont(Font.font("Arial", 24));
        // letsGoButton.getStyleClass().add("rounded-button");
        
        
//        // Create an HBox for layout
//        VBox vbox = new VBox(650);
//        vbox.setPadding(new Insets(10, 10, 10, 10));
    //    vbox.setStyle("-fx-background-image: url('/Images/welcomeImage.jpg'); " +
    //            "-fx-background-size: cover; " +
    //            "-fx-alignment: CENTER;");
 
//        HBox.setMargin(letsGoButton, new Insets(700, 0, 10, 0));

//        vbox.getChildren().addAll(container,letsGoButton);
       
//         Scene scene = new Scene(vbox, 1300, 1000);
//         letsGoButton.setOnAction(e->{
//             Screens.Categories.display(primaryStage,scene);
//         });
//         scene.getStylesheets().add("/ThemeProvider.css");

        
//         primaryStage.setScene(scene);

//         TranslateTransition transition = new TranslateTransition(Duration.seconds(2), container);
//         transition.setByX(30);  
//         transition.setCycleCount(TranslateTransition.INDEFINITE); 
//         transition.setAutoReverse(true); 

//         transition.play();
      
//         primaryStage.show();
//     }

   
// }
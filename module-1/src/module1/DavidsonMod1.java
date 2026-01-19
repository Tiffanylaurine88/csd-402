package module1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * Tiffany Laurine Davidson
 * CSD 402
 * Module 1 Assignment
 * Program: Water Heating Energy Calculator (JavaFX)
 * Formula: Q = waterMass * (finalTemperature - initialTemperature) * 4184
 */

public class DavidsonMod1 extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("Water Heating Energy Calculator (Joules)");

        Label massLabel = new Label("Water mass (kg):");
        TextField massField = new TextField();

        Label initialLabel = new Label("Initial temperature (C):");
        TextField initialField = new TextField();

        Label finalLabel = new Label("Final temperature (C):");
        TextField finalField = new TextField();

        Button calcButton = new Button("Calculate");

        Label resultTextLabel = new Label("Energy (Q) in Joules:");
        Label resultValueLabel = new Label("");

        Label errorLabel = new Label("");

        calcButton.setOnAction(e -> {
            errorLabel.setText("");
            resultValueLabel.setText("");

            try {
                double waterMass = Double.parseDouble(massField.getText().trim());
                double initialTemp = Double.parseDouble(initialField.getText().trim());
                double finalTemp = Double.parseDouble(finalField.getText().trim());

                double q = waterMass * (finalTemp - initialTemp) * 4184;

                resultValueLabel.setText(String.format("%,.2f", q));
            } catch (NumberFormatException ex) {
                errorLabel.setText("Please enter valid numbers in all fields.");
            }
        });

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(18));
        grid.setHgap(12);
        grid.setVgap(10);

        grid.add(title, 0, 0, 2, 1);

        grid.add(massLabel, 0, 1);
        grid.add(massField, 1, 1);

        grid.add(initialLabel, 0, 2);
        grid.add(initialField, 1, 2);

        grid.add(finalLabel, 0, 3);
        grid.add(finalField, 1, 3);

        grid.add(calcButton, 0, 4);

        grid.add(resultTextLabel, 0, 5);
        grid.add(resultValueLabel, 1, 5);

        grid.add(errorLabel, 0, 6, 2, 1);

        Scene scene = new Scene(grid, 520, 260);
        stage.setTitle("CSD 402 Module 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package housewithwindowpaneslab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud 6298805
 * 2025/10/15
 * https://github.com/waffleprinter/HouseWithWindowPanesLab.git
 */
public class HouseWithWindowPanesLab extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        final double SCENE_WIDTH = 500;
        final double SCENE_HEIGHT = 500;
        
        Pane root = new Pane();
        
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        
        stage.setScene(scene);
        stage.show();
    }
}

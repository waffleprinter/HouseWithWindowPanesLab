/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package housewithwindowpaneslab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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
        
        final double GRASS_HEIGHT = 50;
        
        final double WALLS_X = 125;
        final double WALLS_WIDTH = 250, WALLS_HEIGHT = 250;
        
        Rectangle grass = new Rectangle(0, SCENE_HEIGHT - GRASS_HEIGHT, SCENE_WIDTH, GRASS_HEIGHT);
        grass.setFill(Color.GREEN);
        
        Rectangle walls = new Rectangle(WALLS_X, SCENE_HEIGHT - GRASS_HEIGHT - WALLS_HEIGHT, WALLS_WIDTH, WALLS_HEIGHT);
        walls.setFill(Color.LIGHTGRAY);
        walls.setStroke(Color.BLACK);
        
        Pane root = new Pane();
        root.getChildren().addAll(
                grass, walls
        );
        
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        
        stage.setScene(scene);
        stage.setTitle("House with Window Panes");
        stage.show();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package housewithwindowpaneslab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
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
        final double GRASS_X = 0, GRASS_Y = SCENE_HEIGHT - GRASS_HEIGHT;
        
        final double WALLS_WIDTH = 250, WALLS_HEIGHT = 200;
        final double WALLS_X = 125, WALLS_Y = GRASS_Y - WALLS_HEIGHT;
        
        final double DOORSTEP_HEIGHT = 10;
        
        final double ROOF_HEIGHT = 120;
        
        final double DOOR_WIDTH = 50, DOOR_HEIGHT = 100;
        
        Rectangle grass = new Rectangle(GRASS_X, GRASS_Y, SCENE_WIDTH, GRASS_HEIGHT);
        grass.setFill(Color.GREEN);
        
        Rectangle walls = new Rectangle(WALLS_X, WALLS_Y, WALLS_WIDTH, WALLS_HEIGHT);
        walls.setFill(Color.LIGHTGRAY);
        walls.setStroke(Color.BLACK);
        
        Rectangle doorstep = new Rectangle(WALLS_X, GRASS_Y, WALLS_WIDTH, DOORSTEP_HEIGHT);
        doorstep.setFill(Color.BEIGE);
        
        Polygon roof = new Polygon(
                WALLS_X, WALLS_Y,
                WALLS_X + WALLS_WIDTH, WALLS_Y,
                WALLS_X + WALLS_WIDTH / 2, WALLS_Y - ROOF_HEIGHT
        );
        roof.setFill(Color.RED);
        
        Rectangle door = new Rectangle(WALLS_X + WALLS_WIDTH / 2 - DOOR_WIDTH / 2, GRASS_Y - DOOR_HEIGHT, DOOR_WIDTH, DOOR_HEIGHT);
        door.setFill(Color.BROWN);
        
        Pane root = new Pane();
        root.getChildren().addAll(
                grass, walls, doorstep, roof, door
        );
        
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        
        stage.setScene(scene);
        stage.setTitle("House with Window Panes");
        stage.show();
    }
}

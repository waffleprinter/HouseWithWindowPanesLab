/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package housewithwindowpaneslab;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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
        
        final double WINDOW_WIDTH = 50, WINDOW_HEIGHT = 50;
        final double WINDOW_HORIZONTAL_OFFSET = 30;
        final double WINDOW1_X = WALLS_X + WINDOW_HORIZONTAL_OFFSET;
        final double WINDOW2_X = WALLS_X + WALLS_WIDTH - WINDOW_WIDTH - WINDOW_HORIZONTAL_OFFSET;
        final double WINDOW_Y = GRASS_Y - DOOR_HEIGHT - WINDOW_HEIGHT;
        
        final double LINE1_X1 = WINDOW1_X;
        final double LINE1_X2 = WINDOW1_X + WINDOW_WIDTH;
        final double LINE1_Y = WINDOW_Y + WINDOW_HEIGHT / 2;
        
        final double LINE2_X = WINDOW1_X + WINDOW_WIDTH / 2;
        final double LINE2_Y1 = WINDOW_Y;
        final double LINE2_Y2 = WINDOW_Y + WINDOW_HEIGHT;
        
        final double LINE3_X1 = WINDOW2_X;
        final double LINE3_X2 = WINDOW2_X + WINDOW_WIDTH;
        final double LINE3_Y = WINDOW_Y + WINDOW_HEIGHT / 2;
        
        final double LINE4_X = WINDOW2_X + WINDOW_WIDTH / 2;
        final double LINE4_Y1 = WINDOW_Y;
        final double LINE4_Y2 = WINDOW_Y + WINDOW_HEIGHT;
        
        final double SUN_X = SCENE_WIDTH - 70, SUN_Y = 70;
        final double SUN_RADIUS = 40;
        
        final double CHIMNEY_WIDTH = 30, CHIMNEY_HEIGHT = 80;
        final double CHIMNEY_X = WALLS_X + 50, CHIMNEY_Y = WALLS_Y - CHIMNEY_HEIGHT - 20;
        
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
        
        Rectangle window1 = new Rectangle(WINDOW1_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        window1.setFill(Color.LIGHTBLUE);
        
        Line line1 = new Line(LINE1_X1, LINE1_Y, LINE1_X2, LINE1_Y);
        Line line2 = new Line(LINE2_X, LINE2_Y1, LINE2_X, LINE2_Y2);
        
        Rectangle window2 = new Rectangle(WINDOW2_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        window2.setFill(Color.LIGHTBLUE);
        
        Line line3 = new Line(LINE3_X1, LINE3_Y, LINE3_X2, LINE3_Y);
        Line line4 = new Line(LINE4_X, LINE4_Y1, LINE4_X, LINE4_Y2);
        
        Circle sun = new Circle(SUN_X, SUN_Y, SUN_RADIUS);
        sun.setFill(Color.YELLOW);
        
        Rectangle chimney = new Rectangle(CHIMNEY_X, CHIMNEY_Y, CHIMNEY_WIDTH, CHIMNEY_HEIGHT);
        chimney.setFill(Color.GRAY);
        
        Pane root = new Pane();
        root.getChildren().addAll(
                grass, walls, doorstep, roof, door, window1, window2, line1, line2, line3, line4, sun, chimney
        );
        
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
        
        stage.setScene(scene);
        stage.setTitle("House with Window Panes");
        stage.show();
    }
}

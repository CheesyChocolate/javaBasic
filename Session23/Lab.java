package Session23;

import java.io.File;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/** main class */
public class Lab extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
        //appType appName = new appType();
        //appName.start(primaryStage);
    }
}

/** The following app shows a ball tracing your cursor 
while leaving mark behind. Observe that the top-left 
corner of the ball coincides with the cursor at the 
stable state. Modify the program so that stabilization 
occurs at the center of the ball instead. */
class funnyBall extends Application {
    double mouseX, mouseY;
    double ballX, ballY;
    double ballSpeed = .1;
    double ballSize = 30;
    Color bg = Color.WHITE;
    Color ballColor = Color.BLACK;
    public void start(Stage stage) {
        Pane root = new Pane();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(300, 300);
        root.getChildren().add(canvas);
        GraphicsContext g = canvas.getGraphicsContext2D();
        canvas.setOnMouseMoved(e -> {
            mouseX = e.getX();
            mouseY = e.getY();
        });
        AnimationTimer timer = new AnimationTimer() {
            public void handle(long now) {
                // erase old ball
                g.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                // draw new ball
                ballX += (mouseX - ballX) * ballSpeed;
                ballY += (mouseY - ballY) * ballSpeed;
                g.setFill(ballColor);
                g.fillOval(ballX-ballSize/2, ballY-ballSize/2, ballSize, ballSize);
            }
        };
        timer.start();
        stage.setScene(scene);
        stage.show();
    }
}

/** Observe that the speed of the ball depends on its 
distance from the cursor. Modify the app in the 
previous question so that the ball approaches the 
cursor with a constant speed instead. */
class constantBall extends Application  {
    double mouseX, mouseY;
    double ballX, ballY;
    double ballSpeed = .1;
    double ballSize = 30;
    Color bg = Color.WHITE;
    Color ballColor = Color.BLACK;
    public void start(Stage stage) {
        Pane root = new Pane();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(300, 300);
        root.getChildren().add(canvas);
        GraphicsContext g = canvas.getGraphicsContext2D();
        canvas.setOnMouseMoved(e -> {
            mouseX = e.getX();
            mouseY = e.getY();
        });
        // avoid divide by zero
        ballX = 150;
        ballY = 150;
        AnimationTimer timer = new AnimationTimer() {
            public void handle(long now) {
                // erase old ball
                g.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                // draw new ball
                double normalizer = Math.sqrt(Math.pow((mouseX - ballX), 2) + Math.pow((mouseY - ballY), 2));
                ballX += (mouseX - ballX)/normalizer * ballSpeed;
                ballY += (mouseY - ballY)/normalizer * ballSpeed;
                g.setFill(ballColor);
                g.fillOval(ballX-ballSize/2, ballY-ballSize/2, ballSize, ballSize);
            }
        };
        timer.start();
        stage.setScene(scene);
    }
}

/** The following is a simple explorer app which 
traverses a directory tree and displays it visually. 
Modify it so that the font size decreases with deeper 
hierarchy level. */
class flieExplorer extends Application  {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 500);
        File f = new File("path-to-a-dir");
        Accordion accordion = new Accordion();
        root.getChildren().add(accordion);
        dirTraversal(f, accordion, 0);
        stage.setScene(scene);
        stage.show();
    }
    public double computeFont(int depth) {
        return 16 - 1.5*depth;
    }
    public void dirTraversal(File f, Accordion a, int depth) {
        if(f.isDirectory()) {
            Accordion aNew = new Accordion();
            TitledPane t = new TitledPane(f.getName(), aNew);
            t.setFont(Font.font(computeFont(depth)));
            a.getPanes().add(t);
            for(File i: f.listFiles())
                dirTraversal(i, aNew, depth+1);
        }
        else {
            TitledPane t = new TitledPane(f.getName(), null);
            t.setTextFill(Color.BROWN);
            t.setFont(Font.font(computeFont(depth)));
            a.getPanes().add(t);
        }
    }
}
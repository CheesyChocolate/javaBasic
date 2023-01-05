import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/** main class */
public class Lab extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
        annoyingApp app1 = new annoyingApp();
		TodoApp app2 = new TodoApp();
        TextEditor app3 = new TextEditor();

		app1.start(primaryStage);
		app2.start(primaryStage);
		app3.start(primaryStage);
	}
}

/** The following app annoys its user by tempting her to
click a button and moves the button as soon as she
hovers the cursor over it.
Modify it and make it even more annoying. Make
sure that the button escapes to a random corner of  */
class annoyingApp extends Application {

        public void start(Stage stage) {
        Button b = new Button("Click if you can!");
        HBox root = new HBox(b);
        root.setAlignment(Pos.CENTER_RIGHT);
        Set<Pos> unwanted = new HashSet<>();
        unwanted.add(Pos.BASELINE_CENTER);
        unwanted.add(Pos.BASELINE_LEFT);
        unwanted.add(Pos.BASELINE_RIGHT);
        b.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Pos initP = root.getAlignment();
                Pos p;
                unwanted.add(initP);
                while(unwanted.contains( p = pickRandom(Pos.values()) ));
                root.setAlignment(p);
                unwanted.remove(initP);
            }
        });
        Scene scene = new Scene(root, 500, 300);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    public <T> T pickRandom(T[] arr) {
        int randIndex = (int) (Math.random()*arr.length);
        return arr[randIndex];
    }
}

/** Load and run the todo app. Modify the code so that
registering a new item automatically clears the text box */

class TodoApp extends Application {

	final double width = 400;
	final double height = 300;

	int numItems = 0;
	BorderPane root;
	VBox content;


	public void start(Stage stage) {
		Button addButton = new Button("Add");
		TextField field = new TextField();

		root = new BorderPane();
		content = new VBox();
		HBox bottom = new HBox(field, addButton);
		bottom.setAlignment(Pos.CENTER);

		root.setBottom(bottom);
		root.setCenter(content);

		addButton.setOnAction(e -> {
			String text = field.getText();
			if(text.length() > 0) {
				addRow(text);
			}

		});

		cosmetics();
		finalize(stage);
	}

	public void addRow(String text) {
		Button delButton = new Button("done");
		Label id = new Label(numItems+1+"");
		Label item = new Label(text);
		HBox row = new HBox(30, id, item, delButton);
		row.setAlignment(Pos.CENTER);
		content.getChildren().add(row);

		delButton.setOnAction(e -> {
			updateNums(row);
			content.getChildren().remove(row);
			numItems--;
		});

		numItems++;
    }

    public void addRow(String text, TextField field) {
        Button delButton = new Button("done");
        Label id = new Label(numItems+1+"");
        Label item = new Label(text);
        HBox row = new HBox(30, id, item, delButton);
        row.setAlignment(Pos.CENTER);
        content.getChildren().add(row);
        numItems++;
        field.setText("");
        delButton.setOnAction(e -> {
            updateNums(row);
            content.getChildren().remove(row);
            numItems--;
        });
    }

	public void updateNums(Node row) {
		int rowIndex = content.getChildren().indexOf(row);
		for(int i=rowIndex+1; i<content.getChildren().size(); i++) {
			HBox box = (HBox) content.getChildren().get(i);
			Label l = (Label) box.getChildren().get(0);
			l.setText(i+""); // decrement by one
		}
	}

	public void cosmetics() {
		content.setAlignment(Pos.CENTER);
		BorderPane.setAlignment(content, Pos.CENTER);
		BorderPane.setMargin(content, new Insets(20));

	}


	public void finalize(Stage stage) {
		Scene scene = new Scene(root, width, height);
		stage.setScene(scene);
		stage.setTitle("ToDo App");
		stage.show();
	}
}

/**  Load and run the simple text editor app. Modify the
code so that the user can pick custom fonts. */
class TextEditor extends Application {
    final double width = 400;
	final double height = 300;

	TextArea text;
	BorderPane root;
	boolean ctrlPressed;

	public void start(Stage stage) {
		text = new TextArea();
		root = new BorderPane(text);
		ctrlPressed = false;

		text.setOnKeyPressed(e -> {
			if( e.getCode() == KeyCode.CONTROL )
				ctrlPressed = true;

			if( ctrlPressed)    {
				if(e.getCode() == KeyCode.S)
					try {
						save();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				else if(e.getCode() == KeyCode.O)
					try {
						load(stage);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
            }
		});

        ComboBox<String> box = new ComboBox<>();
        box.getItems().addAll("times new roman", "verdana", "arial");
        root.setBottom(box);
        BorderPane.setAlignment(box, Pos.CENTER);
        box.setOnAction(e -> {
            String fontName = box.getValue();
            double fontSize = text.getFont().getSize();
            Font font = new Font(fontName, fontSize);
            text.setFont(font);
        });

		text.setOnKeyReleased(e -> {
			if(e.getCode() == KeyCode.CONTROL)
				ctrlPressed = false;
		});

		finalize(stage);
	}

	public void load(Stage stage) throws FileNotFoundException  {
		FileChooser fc = new FileChooser();
		fc.setTitle("Open a file");
		File f = fc.showOpenDialog(stage);
		if(f == null)
			return;
		Scanner sc = new Scanner(f);
		StringBuilder s = new StringBuilder();
		while(sc.hasNextLine())
			s.append(sc.nextLine());

		text.setText(s.toString());
        sc.close();
	}

	public void save() throws IOException {
		try (FileWriter out = new FileWriter("text.txt")) {
            out.write(text.getText());
        }
	}

	public void finalize(Stage stage) {
		Scene scene = new Scene(root, width, height);
		stage.setScene(scene);
		stage.setTitle("Text Editor");
		stage.show();
	}
}

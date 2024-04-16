import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.FontStyle;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsObject;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;
import edu.macalester.graphics.Point;
import edu.macalester.graphics.ui.TextField;
import java.awt.Color;


public class FileGUI {
    private CanvasWindow canvas;
    private TextField inputText;
    private GraphicsText title;

    public FileGUI() {
        canvas = new CanvasWindow("File Compressor Program", 900, 800);
        inputText = new TextField();
        title = new GraphicsText();
        setUpUI();


    }

    public void setUpUI() {
        inputText.setPosition(450, 400);
        inputText.setBackground(Color.LIGHT_GRAY);
        title.setText("File Compressor Program");
        title.setFont(FontStyle.BOLD_ITALIC, 40);
        title.setPosition(200, 75);
        canvas.add(title);
        canvas.add(inputText);
        String str = inputText.getText();
        System.out.println("str" + str);
    }

    public static void main(String[] args) {
        FileGUI window = new FileGUI();
    }


}

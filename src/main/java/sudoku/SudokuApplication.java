package sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;


    @Override
    public void start(Stage primaryStage) throws IOException {
        uiImpl = new UserIntefaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
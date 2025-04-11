package pe.edu.upeu.calcfx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalcFxApplication extends Application {

	public static void main(String[] args) { // valore de cambio
		SpringApplication.run(CalcFxApplication.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {

	}
}

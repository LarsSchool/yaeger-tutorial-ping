package ping.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Waterworld;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import ping.Ping;
import ping.entities.buttons.StartButton;

public class titelScherm extends StaticScene{
	private Ping ping;

	public titelScherm(Ping ping){
	    this.ping = ping;
	}

	
	@Override
	public void setupScene(){

	}

	@Override
	public void setupEntities(){
	    var pingText = new TextEntity(
	        new Coordinate2D(getWidth() / 2, getHeight() / 8),
	        "Ping"
	    );
	    StartButton startButton = new StartButton(new Coordinate2D((getWidth()/8 *2)-15, (getHeight()/6 * 4) + 40), ping);

	    pingText.setAnchorPoint(AnchorPoint.CENTER_CENTER);

	    pingText.setFill(Color.ORANGE);

	    pingText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));

	    addEntity(pingText);

	    addEntity(startButton);
	}

	
	
}

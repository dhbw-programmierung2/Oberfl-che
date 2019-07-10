package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javafx.scene.shape.Circle;

public class GameBoard {
			
	public static void newCircle (List<Field> circleList, String circleID, HashMap circleFree, String beginField, String aimField) {
		Field field = new Field();
		field.circleID = circleID;
		field.beginField = beginField;
		field.aimField = aimField;
		circleList.add(field);
	}
	
	
	
	
	
	

}

package com.pan;

import com.pan.composite.component.GraphicComponent;
import com.pan.composite.compotite.Picture;
import com.pan.composite.leaf.Image;
import com.pan.composite.leaf.Text;

public class Client {

	public static void main(String[] args) {
		GraphicComponent pic = new Picture();
		GraphicComponent image = new Image();
		GraphicComponent text = new Text();
		pic.add(image);
		pic.add(text);
		
		pic.draw();
	}   

}

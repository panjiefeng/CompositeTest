package com.pan.composite.compotite;

import java.util.ArrayList;
import java.util.List;

import com.pan.composite.component.GraphicComponent;

public class Picture extends GraphicComponent {
	List<GraphicComponent> graphics = new ArrayList<GraphicComponent>();
	private final String name = "Picture";
	@Override
	public int draw() {
		System.out.println("Picture draw()");
		try{
			for(int i=0; i<graphics.size(); i++){
				graphics.get(i).draw();
			}
		} catch (Exception e){
			return RESULT_FAIL;
		}
		return RESULT_SUCCESS;
	}

	@Override
	public boolean add(GraphicComponent graphic) {
		return graphics.add(graphic);
	}

	@Override
	public boolean remove(GraphicComponent graphic) {
		return graphics.remove(graphic);
	}

	@Override
	public GraphicComponent getChild(int index) {
		return graphics.get(index);
	}

}

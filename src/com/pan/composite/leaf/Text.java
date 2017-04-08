package com.pan.composite.leaf;

import com.pan.composite.component.GraphicComponent;

public class Text extends GraphicComponent {
	private final String name = "Text";
	@Override
	public int draw() {
		System.out.println("Text draw()");
		return 0;
	}

	@Override
	public boolean add(GraphicComponent graphic) {
		System.out.println("Image does not have child graphic");
		return false;
	}

	@Override
	public boolean remove(GraphicComponent graphic) {
		System.out.println("Image does not have child graphic");
		return false;
	}

	@Override
	public GraphicComponent getChild(int index) {
		System.out.println("Text does not have child graphic");
		return null;
	}

}

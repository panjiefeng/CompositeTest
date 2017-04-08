package com.pan.composite.leaf;

import com.pan.composite.component.GraphicComponent;

public class Image extends GraphicComponent {
	private final String name = "Image";
	@Override
	public int draw() {
		System.out.println("Image draw()");
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
		System.out.println("Image does not have child graphic");
		return null;
	}

}

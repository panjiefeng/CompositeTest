package com.pan.composite.component;

public abstract class GraphicComponent {
	public static final int RESULT_SUCCESS = 1;
	public static final int RESULT_FAIL = -1;
	public abstract int draw();
	public abstract boolean add(GraphicComponent graphic);
	public abstract boolean remove(GraphicComponent graphic);
	public abstract GraphicComponent getChild(int index);
}

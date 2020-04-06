package ch.fhnw.oop2.module07.ab2;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Slidernum {
	private DoubleProperty slidernum = new SimpleDoubleProperty();
	
	public Slidernum() {}
	
	public final double getSlidernum() {
		return slidernum.get();
	}
	
	public final void setSlidernum(double value) {
		slidernum.set(value);
	}
	
	public DoubleProperty slidernumProperty() {
		return slidernum;
	}
	@Override
	public final String toString() {
		return slidernum + "";
	}
}

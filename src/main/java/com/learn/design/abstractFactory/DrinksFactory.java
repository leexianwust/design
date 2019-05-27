package com.learn.design.abstractFactory;

public class DrinksFactory extends AbstractFactory {

	@Override
	public Drinks chooseDrinks(String yourChoice) {
		// TODO Auto-generated method stub
		if (yourChoice.equals("greenTea")) {
			return new GreenTea();
		} else if (yourChoice.equals("redTea")) {
			return new RedTea();
		} else {
			return null;
		}
	}

	@Override
	public Wine chooseWine(String yourChoice) {
		// TODO Auto-generated method stub
		return null;
	}

}

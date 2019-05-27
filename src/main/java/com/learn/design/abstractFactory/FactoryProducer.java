package com.learn.design.abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory){
		if(factory.equals("wine")){
			return new WineFactory();
		}else if(factory.equals("drinks")){
			return new DrinksFactory();
		}else{
			return null;
		}
	}
	
	public static void main(String[] args) {
		//æ∆≥ß
		AbstractFactory wineFactory = FactoryProducer.getFactory("wine");
		Wine liquor = wineFactory.chooseWine("liquor");
		liquor.choose();
		Wine red = wineFactory.chooseWine("redWine");
		red.choose();
		
		//“˚¡œ≥ß
		AbstractFactory drinkFactory = FactoryProducer.getFactory("drinks");
		Drinks green = drinkFactory.chooseDrinks("greenTea");
		green.choose();
		Drinks redTea = drinkFactory.chooseDrinks("redTea");
		redTea.choose();
	}
}

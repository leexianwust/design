package com.learn.design.abstractFactory;

public class WineFactory extends AbstractFactory {

	@Override
	public Drinks chooseDrinks(String yourChoice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wine chooseWine(String yourChoice) {
		// TODO Auto-generated method stub
		if(yourChoice.contentEquals("liquor")){
			return new Liquor();
		}else if(yourChoice.contentEquals("redWine")){
			return new RedWine();
		}else{
			return null;
		}
	}

}

package be_study.quiz.quiz34;

import java.util.ArrayList;

import be_study.cls.cls12.Desk;

public class KitchenSpace {

	double area; // 평  
	String wallPaperColor; // 벽지컬러  
	int height; // 층고
	
	Refrigerator refrigerator;
	Gasstove gasstove;
	Sink sink;
	ArrayList<Trashcan>trashcanList =new ArrayList<Trashcan>();
	ArrayList<Cup>cup =new ArrayList<Cup>();
	

	
	public KitchenSpace() {  
		area = 0;
		wallPaperColor = null;
		height = 0;
		refrigerator = null;
		gasstove = null;
		sink = null;
		trashcanList = null;
		cup = null;
	}

	
	
	
}

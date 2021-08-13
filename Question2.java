package com.Techment.Assignment2;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyzer
{
	private LinkedList<Integer> RunsData = new LinkedList<Integer>();

	
	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.RunsData = runsData;
	}

	public LinkedList<Integer> getRunsData() {
		return RunsData;
	}

	public void setRunsData(LinkedList<Integer> runsData) {
		RunsData = runsData;
	}
	
public void addRunsToList()
{
	System.out.println("run scored by players :");
	
	for(Integer i : RunsData)
	{
		System.out.println(i+"- ");
	}
}
public void RunRate()
{
	int runs =1,balls=0 ;
	float runRate = (float)(1.0f*runs / balls);
	System.out.println("Runrate :"+ runRate);
	
}
	
public void lowestRunsScored()
{
		System.out.println("lowest run scored is :"+Collections.min(RunsData));
	
}	
public void displayRuns()
{
	for(Integer i : RunsData)
	{
		System.out.println("Run Score by all players :"+RunsData);
		
	}
}
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of players: ");
		int number =scanner.nextInt();
		LinkedList<Integer> list= new LinkedList<Integer>();
	
		for(int i=0; i<number; i++)
		{
			System.out.println("Enter the"+(i+1)+"player score :");
			list.add(scanner.nextInt());
		}
		
		ScoreAnalyzer sa = new  ScoreAnalyzer(list);
		sa.addRunsToList();
		sa.displayRuns();
		sa.lowestRunsScored();
		sa.getRunsData();
		sa.RunRate();
		System.out.println("number of batsman played :"+number);
		
	}
}

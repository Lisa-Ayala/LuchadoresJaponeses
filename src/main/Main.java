package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import dao.TextFileDAO;

import bussinesObject.LuchadoresBO;
import entitys.*;

import entitys.Torneo;

public class Main {

	/**
	 * @param args
	 */
	static public void main(String args[])
	{
		///leo y guardo el archivo en memoria
		Torneo group = TextFileDAO.readFile();
		
		///realizo la logica del ejercicio
		LuchadoresBO.processData(group);
		
		///grabo el archivo de salida
		TextFileDAO.printFile(group);
		
	}


}
package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import entitys.Luchador;
import entitys.Torneo;

public class TextFileDAO {

	static public Torneo readFile() {
		File name = new File("sumo.txt");
		Torneo group = new Torneo();
		FileReader file = null;
		BufferedReader re = null;
		try {
			file = new FileReader(name);
			re = new BufferedReader(file);
			String line = re.readLine();
			Luchador localFighter;
			String localdata[];
			group.setCantLuchadores(Integer.parseInt(line));
			for(int x=0; x<group.getCantLuchadores(); x++)
			{
				line=re.readLine();
				if(line!=null){
				localdata=line.split(" ");
				localFighter = new Luchador();
				localFighter.setId(x);
				localFighter.setPeso(Double.parseDouble(localdata[0]));
				localFighter.setAltura(Double.parseDouble(localdata[1]));
				group.getLuchadores().add(localFighter);
				}
			}
			
		} catch (IOException e) {
		} finally {
			try {
				file.close();
				re.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			return group;
		}
	
	static public void printFile(Torneo group)
	{
		File file = new File("Sumo.out");
		PrintWriter writer = null;
		Iterator<Luchador> listaITLuchadores = group.getLuchadores().iterator();
		try {
			writer = new PrintWriter(file);
			while(listaITLuchadores.hasNext()){
				writer.print(listaITLuchadores.next().getDomina()); 
				writer.printf("\n");
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(writer!=null)
				writer.close();
		}
	}
		
	}
	

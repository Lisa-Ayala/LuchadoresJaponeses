package bussinesObject;

import java.util.ListIterator;

import entitys.Luchador;
import entitys.Torneo;

public class LuchadoresBO {
	static public void processData(Torneo group)
	{
		ListIterator<Luchador> groupIt=group.getLuchadores().listIterator();
		ListIterator<Luchador> subgroupIt;
		Luchador comparingFighter,readingFighter;
		while(groupIt.hasNext())
		{
			comparingFighter=groupIt.next(); ///luchador que lei ahora
			subgroupIt=group.getLuchadores().listIterator(0);///me voy al principio de la lista
				while(subgroupIt.hasNext())
				{
					readingFighter=subgroupIt.next();///luchador que leo ahora
					if(comparingFighter.getId()!=readingFighter.getId() &&
							((comparingFighter.getAltura()>readingFighter.getAltura() && comparingFighter.getPeso()>=readingFighter.getPeso())||
									(comparingFighter.getAltura()>=readingFighter.getAltura() &&comparingFighter.getPeso()>readingFighter.getPeso())))
									{
										comparingFighter.setDomina(comparingFighter.getDomina()+1);///se le suma un punto de dominacion al luchador que lei antes
									}
				}
		}
	}
}

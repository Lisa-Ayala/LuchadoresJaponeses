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
			comparingFighter=groupIt.next();
			subgroupIt=group.getLuchadores().listIterator(0);
				while(subgroupIt.hasNext())
				{
					readingFighter=subgroupIt.next();
					if(comparingFighter.getId()!=readingFighter.getId() &&
							((comparingFighter.getAltura()>readingFighter.getAltura() && comparingFighter.getPeso()>=readingFighter.getPeso())||
									(comparingFighter.getAltura()>=readingFighter.getAltura() &&comparingFighter.getPeso()>readingFighter.getPeso())))
									{
										comparingFighter.setDomina(comparingFighter.getDomina()+1);
									}
				}
		}
	}
}

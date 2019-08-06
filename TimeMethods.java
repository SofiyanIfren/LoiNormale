import java.util.Date;

public class TimeMethods {
		
	/**
	 * @author Sofiyan Ifren
	 * @return Retourne la date minimale entre deux temps donnés (Date)
	 */
	public Date getMinimalDate(Date date1, Date date2){
		Date dateFinale = null;
		if (date1.after(date2)){
			dateFinale = date2;
		} else {
			dateFinale = date1;
		}	
		return dateFinale;	
	}
	/**
	 * @author Sofiyan Ifren
	 * @return Retourne la date maximale entre deux temps donnés (Date)
	 */
	public Date getMaximalDate(Date date1, Date date2){
		Date dateFinale = null;
		if (date1.before(date2)){
			dateFinale = date2;
		} else {
			dateFinale = date1;
		}	
		return dateFinale;
	}
	
}

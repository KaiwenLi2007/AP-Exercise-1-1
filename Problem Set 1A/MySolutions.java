
/*
 * AP CSA Problem Set 1.1.
 *
 * Keivn Li
 * Sept 12, 2023
 */
public class MySolutions{
    
    public void CelsiustoFahrenheit(){
        double celsiustemp, fahrenheittemp;
        celsiustemp = 30.0;
        fahrenheittemp = celsiustemp * 9.0 / 5.0 + 32;
        System.out.println(celsiustemp + "°C = " + fahrenheittemp + "°F");
    }

    public void elasedTime(){
        int hours, minutes, seconds;
        hours = 16;
        minutes = 0;
        seconds = 0;
        
        System.out.println("The current time is " + hours + ":" + minutes + ":" + seconds + ". It has been " + (hours*3600+minutes*60+seconds) + " since the day began.\nThere are " + ((23-hours)*3600+(59-minutes)*60+ (60-seconds)) +" left in the day.\nThe day is " + ((23-hours)*3600+(59-minutes)*60+ (60-seconds))/86400.0*100 + "% done" );
    }
    
    public void secondstoHMS(){
        int seconds;
        seconds = 5000;
        System.out.println(seconds+ "seconds = " + seconds/3600 + " hours, " + (seconds%3600)/60 + " minutes, and " + seconds%60 + "seconds.");
    }
}

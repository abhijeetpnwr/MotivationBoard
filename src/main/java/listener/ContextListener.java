package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import themotivationboard.QuotesReader;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
@WebListener
public class ContextListener implements ServletContextListener 
{
    /**
     * Default constructor. 
     */
    public ContextListener()  
    {
        // TODO Auto-generated constructor stub
    }
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) 
    { 
         // TODO Auto-generated method stub
    }
	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) 
    { 
         System.out.println("Servlet context has been initialized");
         
         QuotesReader qObj = new QuotesReader();
         
         for(String quote : qObj.getmessages())
         {
        	 System.out.println(" : "+quote);
         }
         
    }
	
}
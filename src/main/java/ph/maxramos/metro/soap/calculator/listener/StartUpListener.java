package ph.maxramos.metro.soap.calculator.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.sun.xml.ws.transport.http.HttpAdapter;

@WebListener
public class StartUpListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		HttpAdapter.dump = true;
		HttpAdapter.dump_threshold = 8192;
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}

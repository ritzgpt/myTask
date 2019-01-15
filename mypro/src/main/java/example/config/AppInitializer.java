package example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
/** AppInitializer class responsible for initializing the application.
 * It is dispatcherServlet which handles request then decides where to send it.  */
public class AppInitializer extends 
AbstractAnnotationConfigDispatcherServletInitializer{

@Override
protected Class<?>[] getRootConfigClasses() {
   return new Class[]{AppConfig.class};
}

@Override
protected Class<?>[] getServletConfigClasses() {
   return null;
}

@Override
protected String[] getServletMappings() {
   return new String[]{"/"};
}
}
package ufv.dis.final2020.TEST_JPP_ORDINARIO;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
    	Inventario inventario = new Inventario();
    	
    	Grid<Producto> gridcontactos = new Grid<>(Producto.class);
        gridcontactos.setItems(inventario.getlistaProductos()); 
    	
        final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("name:");
        
        final TextField surname = new TextField();
        surname.setCaption("cat:");
        
        final TextField age = new TextField();
        age.setCaption("price:");
        
        final TextField dni = new TextField();
        dni.setCaption("ean:");
        

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
            try {
            	Producto p = new Producto(name.getValue(), surname.getValue(), dni.getValue(),(age.getValue()));
            	inventario.addProducto(p);
                gridcontactos.setItems(inventario.getlistaProductos());
				GeneradorEAN13.generar(p);
	        	Notification.show("imagen generado");
			} catch (Exception e1) {
				// TODO Auto-generated catch block;
				e1.printStackTrace();
				Notification.show("error al generar la imagen");
			}
        });
        
        layout.addComponents(name,surname,age,dni, button,gridcontactos);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}

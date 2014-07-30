package aiss.client.maps;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.maps.gwt.client.GoogleMap;
import com.google.maps.gwt.client.InfoWindow;
import com.google.maps.gwt.client.InfoWindowOptions;
import com.google.maps.gwt.client.LatLng;
import com.google.maps.gwt.client.MapOptions;
import com.google.maps.gwt.client.MapTypeId;
import com.google.maps.gwt.client.Marker;
import com.google.maps.gwt.client.MarkerOptions;
import com.google.maps.gwt.client.MouseEvent;
import com.google.maps.gwt.client.Marker.ClickHandler;

public class SchoolMap {
	
	static LatLng location;
	static GoogleMap map;
	
	public static void showMap() {
		/** TODO: Mostrar mapa */

	    showSchool();
	}

	private static void showSchool() {
		
		/** TODO: Mostrar marcador y ventana de información */
	}
}

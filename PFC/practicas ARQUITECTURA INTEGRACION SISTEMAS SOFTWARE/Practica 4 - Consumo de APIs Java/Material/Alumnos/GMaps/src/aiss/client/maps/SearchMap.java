package aiss.client.maps;

import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.maps.gwt.client.GoogleMap;
import com.google.maps.gwt.client.LatLng;
import com.google.maps.gwt.client.MapOptions;
import com.google.maps.gwt.client.MapTypeId;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.Window;
import com.google.maps.gwt.client.Geocoder;
import com.google.maps.gwt.client.GeocoderRequest;
import com.google.maps.gwt.client.GeocoderResult;
import com.google.maps.gwt.client.GeocoderStatus;
import com.google.maps.gwt.client.Marker;
import com.google.maps.gwt.client.MarkerOptions;
import com.google.maps.gwt.client.Geocoder.Callback;

public class SearchMap {
	
	private static HorizontalPanel panel = new HorizontalPanel();
	private static TextBox searchTextBox = new TextBox();
	private static Button searchButton = new Button("Search!");
	private static Geocoder geocoder= Geocoder.create();
	private static GoogleMap map;
	
	public static void showMap() {
		/** TODO: Mostrar mapa */
	}
	
	public static Widget getControls() {
		
		searchButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				showAddress();
			}
		});
		
		panel.add(searchTextBox);
		panel.add(searchButton);
		return panel;
	}
	
	private static void showAddress() {
		/** TODO: Mostrar marcador en la dirección indicada por el usuario */
	}
}

package aiss.client;

import aiss.client.maps.AsynchronousMap;
import aiss.client.maps.CustomizedMap;
import aiss.client.maps.GeoMap;
import aiss.client.maps.KmlMap;
import aiss.client.maps.SchoolMap;
import aiss.client.maps.SearchMap;
import aiss.client.maps.SimpleMap;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;

public class GMaps implements EntryPoint {
	HorizontalPanel mapSelectorPanel = new HorizontalPanel();
	Label statusLabel = new Label();

	// GWT module entry point method.
	public void onModuleLoad() {

		final ListBox widget = new ListBox();
		widget.addItem("Ex1 - Simple Map", "basicMap");
		widget.addItem("Ex2 - Asynchronous Map", "asyncMap");
		widget.addItem("Ex3 - Customized Map", "customizedMap");
		widget.addItem("Ex4 - School Map", "schoolMap");
		widget.addItem("Ex5 - Geolocation Map", "geoMap");
		widget.addItem("Ex6 - Search Map", "searchMap");
		widget.addItem("Ex7 - KML Layer Map", "kmlMap");

		widget.addChangeHandler(new ChangeHandler() {

			@Override
			public void onChange(ChangeEvent event) {
				statusLabel.setText("Loading Map...");
				RootPanel.get("map_canvas").clear();
				showMap(widget.getValue(widget.getSelectedIndex()));
			}
		});

		mapSelectorPanel.add(widget);

		// Add the widget to the HTML host page
		RootPanel.get("mapselector").add(mapSelectorPanel);
		RootPanel.get("mapselector").add(statusLabel);

		// Show basic map
		showMap("basicMap");
	}

	private void showMap(final String mapType) {

		statusLabel.setText("Loading map...");
		
		if (mapType.equalsIgnoreCase("basicMap"))
			SimpleMap.showMap();
		else if (mapType.equalsIgnoreCase("asyncMap"))
			AsynchronousMap.showMap();
		else if (mapType.equalsIgnoreCase("customizedMap"))
			CustomizedMap.showMap();
		else if (mapType.equalsIgnoreCase("schoolMap"))
			SchoolMap.showMap();
		else if (mapType.equalsIgnoreCase("geoMap"))
			GeoMap.showMap();
		else if (mapType.equalsIgnoreCase("kmlMap"))
			KmlMap.showMap();
		else if (mapType.equalsIgnoreCase("searchMap")) {
			RootPanel.get("mapselector").add(SearchMap.getControls());
			SearchMap.showMap();
		}
		
		statusLabel.setText("Map loaded");
	}
}

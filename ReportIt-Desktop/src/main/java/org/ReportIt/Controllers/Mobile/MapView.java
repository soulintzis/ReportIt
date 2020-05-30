package org.ReportIt.Controllers.Mobile;


import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.javascript.object.GoogleMap;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.MapTypeIdEnum;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MapView implements Initializable {

    @FXML
    private GoogleMapView googleMapView;

    private GoogleMap map;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        googleMapView.addMapInializedListener(() -> configureMap());
    }

    protected void configureMap() {
        MapOptions mapOptions = new MapOptions();

        mapOptions.center(new LatLong(38.246639, 21.734573))
                .mapType(MapTypeIdEnum.HYBRID)
                .zoom(15);
        map = googleMapView.createMap(mapOptions, false);

    }
}
package com.twoFMonopoly.models.Buildings;

import com.twoFMonopoly.models.Locations.Property;
import com.twoFMonopoly.models.Player;

import java.util.ArrayList;

public class PropertyRegion {

    //Attributes
    private ArrayList<Property> properties;

    //Constructor
    public PropertyRegion(ArrayList<Property> properties) {
        this.properties = properties;
    }

    //Operations
    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    //Add property to the property region
    public boolean addProperty(Property property) {
        if(properties.contains(property))
            return false;
        properties.add(property);
        return true;
    }

    // Check whether all properties in the property region belong to the same player.
    public boolean checkPropertyRegion() {
        Player owner = properties.get(0).getOwner();

        if(owner == null) return false;

        for( Property property : properties) {
            if(property.getOwner() == null || property.getOwner() != owner)
                return false;
        }
        return true;
    }
}

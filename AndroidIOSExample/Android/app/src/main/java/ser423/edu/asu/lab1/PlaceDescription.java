package ser423.edu.asu.lab1;

import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;


public class PlaceDescription {
    String name;
    String description;
    String category;
    String addressTitle;
    String addressStreet;
    Double elevation;
    Double latitude;
    Double longitude;




    public PlaceDescription(String jsonStr){
        try {
            JSONObject place = new JSONObject(jsonStr);
            name = place.getString("name");
            description = place.getString("description");
            category = place.getString("category");
            addressTitle = place.getString("address-title");
            addressStreet = place.getString("address-street");
            elevation = place.getDouble("elevation");
            latitude = place.getDouble("latitude");
            longitude = place.getDouble("longitude");
        }
        catch (JSONException e) {
            Log.d(this.getClass().getSimpleName(), "PlaceDescription creation failed.");
        }
    }
    public String toJsonString(){
        JSONObject jPlace = new JSONObject();
        try{

            jPlace.put("name",name);
            jPlace.put("description",description);
            jPlace.put("category",category);
            jPlace.put("address-title",addressTitle);
            jPlace.put("address-street",addressStreet);
            jPlace.put("elevation",elevation);
            jPlace.put("latitude",latitude);
            jPlace.put("longitude",longitude);

        }catch (Exception ex){
            android.util.Log.w(this.getClass().getSimpleName(),
                    "error converting to/from json");
        }
        return jPlace.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddressTitle() {
        return addressTitle;
    }

    public void setAddressTitle(String addressTitle) {
        this.addressTitle = addressTitle;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }


}

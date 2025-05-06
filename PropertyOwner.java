import java.util.ArrayList;
import java.util.List;

public class PropertyOwner {
    
    private User user;
    private List<Property> listOfProperties;

    public PropertyOwner(User user) {
        this.user = user;
        this.listOfProperties = new ArrayList<>();
    }

    
    public void addProperty(Property property) {
        if (!listOfProperties.contains(property)) {
            listOfProperties.add(property);
            System.out.println("Property added successfully.");
        } else {
            System.out.println("Property already exists.");
        }
    }

    
    public void removeProperty(String propertyID) {
        Property toRemove = null;
        for (Property p : listOfProperties) {
            if (p.getPropertyID().equals(propertyID)) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            listOfProperties.remove(toRemove);
            System.out.println("Property removed successfully.");
        } else {
            System.out.println("Property not found.");
        }
    }

  
    public User getUser() {
        return user;
    }

    public List<Property> getListOfProperties() {
        return listOfProperties;
    }
}

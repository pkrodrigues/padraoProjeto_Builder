package patternofprojects.builder.classes;

public class TravelPackage {
    private int id_travel_package;
    private String package_name;
    private String description;
    private String arline_tickets ;
    private String accommodation;
    private String food;
    private String tours;
    private String transfer;

    public TravelPackage(){
        this.id_travel_package = 0;
        this.package_name = "";
    }

    public int getId_travel_package() {
        return id_travel_package;
    }

    public void setId_travel_package(int id_travel_package) {
        this.id_travel_package = id_travel_package;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getArline_tickets() {
        return arline_tickets;
    }

    public void setArline_tickets(String arline_tickets) {
        this.arline_tickets = arline_tickets;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getTours() {
        return tours;
    }

    public void setTours(String tours) {
        this.tours = tours;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }
}

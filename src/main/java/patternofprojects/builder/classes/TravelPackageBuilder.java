package patternofprojects.builder.classes;

public class TravelPackageBuilder {
    private TravelPackage travelPackage;

    public TravelPackageBuilder(){
        travelPackage = new TravelPackage();
    }

    public TravelPackage build() {
        if(travelPackage.getId_travel_package() == 0){
            throw new IllegalArgumentException("Id para pacote de viagem inválido");
        }
        if(travelPackage.getPackage_name().equals("")){
            throw new IllegalArgumentException("Nome de pacote de viagem inválido");
        }
        return travelPackage;
    }

    public TravelPackageBuilder setId_travel_package(int id_travel_package){
        travelPackage.setId_travel_package(id_travel_package);
        return this;
    }

    public TravelPackageBuilder setPackage_name(String package_name){
        travelPackage.setPackage_name(package_name);
        return this;
    }

    public TravelPackageBuilder setDescription(String description) {
        travelPackage.setDescription(description);
        return this;
    }
    public TravelPackageBuilder setArline_tickets(String arline_tickets){
        travelPackage.setArline_tickets(arline_tickets);
        return this;
    }

    public TravelPackageBuilder setAccomodation(String accomodation) {
        travelPackage.setAccommodation(accomodation);
        return this;
    }

    public TravelPackageBuilder setFood(String food){
        travelPackage.setFood(food);
        return this;
    }

    public TravelPackageBuilder setTours(String tours){
        travelPackage.setTours(tours);
        return this;
    }

    public TravelPackageBuilder setTransfer(String transfer){
        travelPackage.setTransfer(transfer);
        return this;
    }
}

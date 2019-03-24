package pl.sda.csvParser;

import java.math.BigDecimal;

public class RealEstate {
  //  street,city,zip,state,beds,baths,sq__ft,type,sale_date,price,latitude,longitude
    //3526 HIGH ST,SACRAMENTO,95838,CA,2,1,836,Residential,Wed May 21 00:00:00 EDT 2008,59222,38.631913,-121.434879

    private String street;
    private String city;
    private Integer zip;
    private String state;
    private Integer beds;
    private Integer baths;
    private Integer sq_ft;
    private String type;
    private String sale_date;
    private Integer price;
    private Double latitude;
    private Double longitude;

    public RealEstate(String street, String city, Integer zip, String state, Integer beds, Integer baths, Integer sq_ft, String type, String sale_date, Integer price, Double latitude, Double longitude) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.beds = beds;
        this.baths = baths;
        this.sq_ft = sq_ft;
        this.type = type;
        this.sale_date = sale_date;
        this.price = price;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Integer getBaths() {
        return baths;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    public Integer getSq_ft() {
        return sq_ft;
    }

    public void setSq_ft(Integer sq_ft) {
        this.sq_ft = sq_ft;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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

    @Override
    public String toString() {
        return "RealEstate{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                ", beds=" + beds +
                ", baths=" + baths +
                ", sq_ft=" + sq_ft +
                ", type='" + type + '\'' +
                ", sale_date='" + sale_date + '\'' +
                ", price=" + price +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

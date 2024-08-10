public class Cities {

    private String name;
    private String countryCode;
    private String district;

    public Cities(String name, String countryCode, String district) {
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}

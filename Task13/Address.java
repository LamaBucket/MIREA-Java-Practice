package Task13;

public class Address {
    private String _country;
    private String _region;
    private String _city;
    private String _street;
    private String _apt;
    private String _entrance;
    private String _flatNumber;


    public static Address FromString(String str){
        return FromString(str, ", ");
    }

    public static Address FromString(String str, String delimeter){
        String[] address = str.split(", ");

        if(address.length != 7){
            System.out.println("Something is missing. Try again.");
            return null;
        }

        return new Address(address[0], address[1], address[2], address[3], address[4], address[5], address[6]);
    }


    @Override
    public String toString(){
        return _country + " " + _region + " " + _city + " " + _street + " " + _apt + " " + _entrance + " " + _flatNumber;
    }

    private Address(String _country, String _region, String _city, String _street, String _apt, String _entrance,
            String _flatNumber) {
        this._country = _country;
        this._region = _region;
        this._city = _city;
        this._street = _street;
        this._apt = _apt;
        this._entrance = _entrance;
        this._flatNumber = _flatNumber;
    }
}

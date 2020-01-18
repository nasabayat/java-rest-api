package de.naserbayat.restapispk;

public class SpkDomainRole {

    private long deviceId;
    private String domain, role;

    public SpkDomainRole(long deviceId){
        this.deviceId = deviceId;
        if ((deviceId % 3 == 0) && (deviceId % 5 != 0)) {
            domain = "A";
            role = "Bing";
        }
        else if ((deviceId % 5 == 0) && (deviceId % 3 != 0)) {
            domain = "B";
            role = "Bang";
        }
        else if ((deviceId % 3 == 0) && (deviceId % 5 == 0)) {
            domain = "A&B";
            role = "Boom";
        }
        else{
            domain = "NA";
            role = "Meh";
        }
    }

    public long getDeviceId(){
        return deviceId;
    }

    public String getDomain(){
        return domain;
    }

    public String getRole(){
        return role;
    }
}
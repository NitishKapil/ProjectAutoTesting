package Task;

public class CurrenyCountry {

    private  Integer rps;
    private  String CurrenyName;

    public CurrenyCountry(Integer rps, String currenyName) {
        this.rps = rps;
        CurrenyName = currenyName;
    }

    public Integer getRps() {
        return rps;
    }

    public void setRps(Integer rps) {
        this.rps = rps;
    }

    public String getCurrenyName() {
        return CurrenyName;
    }

    public void setCurrenyName(String currenyName) {
        CurrenyName = currenyName;
    }

    public Integer add(CurrenyCountry cc)
    {
        return cc.rps + this.rps;
    }
}

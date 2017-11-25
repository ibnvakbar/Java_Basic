public class Pulsa {
    private String  provider;
    private Character jenis;
    private Integer nominal;

    public Pulsa(String provider, Character jenis, Integer nominal) {
        this.provider = provider;
        this.jenis = jenis;
        this.nominal = nominal;
    }

    public String getProvider() {
        return provider;
    }

    public Character getJenis() {
        return jenis;
    }

    public Integer getNominal() {
        return nominal;
    }
}

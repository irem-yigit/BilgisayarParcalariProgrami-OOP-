package Composition;

public class Monitor {

    private String model;
    private String uretici;
    private String boyut;
    private Resolution resolution;  // Monitor'ün içine, Resolution sınıfından bir tane nesneyi, referansı bulundurmuş oldum. Buna Composition denir.

    public Monitor(String model, String uretici, String boyut, Resolution resolution) {  //Resolution classından bir referans (resolution) olarak gözüküyor.
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }
    public void monitoru_kapat(){
        System.out.println("Monitor Kapatılıyor.....");
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getUretici() {
        return uretici;
    }
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
    public String getBoyut() {
        return boyut;
    }
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }
    public Resolution getResolution() {
        return resolution;
    }
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}

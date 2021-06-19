package com.amar.covid19andhrapradesh.RetrofitDistricts;

import com.google.gson.annotations.SerializedName;

public class DistricData {

    @SerializedName("Anantapur")
    private Adilabad adilabad;
    @SerializedName("Chittoor")
    private BhadradriKothagudem bhadradriKothagudem;
    @SerializedName("East Godavari")
    private Hyderabad hyderabad;
    @SerializedName("Guntur")
    private Jagtial jagtial;
    @SerializedName("Krishna")
    private Jangaon jangaon;
    @SerializedName("Kurnool")
    private JayashankarBhupalapally jayashankarBhupalapally;
    @SerializedName("Other State")
    private JogulambaGadwal jogulambaGadwal;
    @SerializedName("Prakasam")
    private Kamareddy kamareddy;
    @SerializedName("S.P.S. Nellore")
    private Karimnagar karimnagar;
    @SerializedName("Srikakulam")
    private Khammam khammam;
    @SerializedName("Visakhapatnam")
    private KomaramBheem komaramBheem;
    @SerializedName("Vizianagaram")
    private Mahabubabad mahabubabad;
    @SerializedName("West Godavari")
    private Mahabubnagar mahabubnagar;
    @SerializedName("Y.S.R. Kadapa")
    private Mancherial mancherial;


    public DistricData(Adilabad adilabad, BhadradriKothagudem bhadradriKothagudem, Hyderabad hyderabad, Jagtial jagtial, Jangaon jangaon, JayashankarBhupalapally jayashankarBhupalapally, JogulambaGadwal jogulambaGadwal, Kamareddy kamareddy, Karimnagar karimnagar, Khammam khammam, KomaramBheem komaramBheem, Mahabubabad mahabubabad, Mahabubnagar mahabubnagar, Mancherial mancherial) {
        this.adilabad = adilabad;
        this.bhadradriKothagudem = bhadradriKothagudem;
        this.hyderabad = hyderabad;
        this.jagtial = jagtial;
        this.jangaon = jangaon;
        this.jayashankarBhupalapally = jayashankarBhupalapally;
        this.jogulambaGadwal = jogulambaGadwal;
        this.kamareddy = kamareddy;
        this.karimnagar = karimnagar;
        this.khammam = khammam;
        this.komaramBheem = komaramBheem;
        this.mahabubabad = mahabubabad;
        this.mahabubnagar = mahabubnagar;
        this.mancherial = mancherial;
    }

    public Adilabad getAdilabad() {
        return adilabad;
    }

    public void setAdilabad(Adilabad adilabad) {
        this.adilabad = adilabad;
    }

    public BhadradriKothagudem getBhadradriKothagudem() {
        return bhadradriKothagudem;
    }

    public void setBhadradriKothagudem(BhadradriKothagudem bhadradriKothagudem) {
        this.bhadradriKothagudem = bhadradriKothagudem;
    }

    public Hyderabad getHyderabad() {
        return hyderabad;
    }

    public void setHyderabad(Hyderabad hyderabad) {
        this.hyderabad = hyderabad;
    }

    public Jagtial getJagtial() {
        return jagtial;
    }

    public void setJagtial(Jagtial jagtial) {
        this.jagtial = jagtial;
    }

    public Jangaon getJangaon() {
        return jangaon;
    }

    public void setJangaon(Jangaon jangaon) {
        this.jangaon = jangaon;
    }

    public JayashankarBhupalapally getJayashankarBhupalapally() {
        return jayashankarBhupalapally;
    }

    public void setJayashankarBhupalapally(JayashankarBhupalapally jayashankarBhupalapally) {
        this.jayashankarBhupalapally = jayashankarBhupalapally;
    }

    public JogulambaGadwal getJogulambaGadwal() {
        return jogulambaGadwal;
    }

    public void setJogulambaGadwal(JogulambaGadwal jogulambaGadwal) {
        this.jogulambaGadwal = jogulambaGadwal;
    }

    public Kamareddy getKamareddy() {
        return kamareddy;
    }

    public void setKamareddy(Kamareddy kamareddy) {
        this.kamareddy = kamareddy;
    }

    public Karimnagar getKarimnagar() {
        return karimnagar;
    }

    public void setKarimnagar(Karimnagar karimnagar) {
        this.karimnagar = karimnagar;
    }

    public Khammam getKhammam() {
        return khammam;
    }

    public void setKhammam(Khammam khammam) {
        this.khammam = khammam;
    }

    public KomaramBheem getKomaramBheem() {
        return komaramBheem;
    }

    public void setKomaramBheem(KomaramBheem komaramBheem) {
        this.komaramBheem = komaramBheem;
    }

    public Mahabubabad getMahabubabad() {
        return mahabubabad;
    }

    public void setMahabubabad(Mahabubabad mahabubabad) {
        this.mahabubabad = mahabubabad;
    }

    public Mahabubnagar getMahabubnagar() {
        return mahabubnagar;
    }

    public void setMahabubnagar(Mahabubnagar mahabubnagar) {
        this.mahabubnagar = mahabubnagar;
    }

    public Mancherial getMancherial() {
        return mancherial;
    }

    public void setMancherial(Mancherial mancherial) {
        this.mancherial = mancherial;
    }
}
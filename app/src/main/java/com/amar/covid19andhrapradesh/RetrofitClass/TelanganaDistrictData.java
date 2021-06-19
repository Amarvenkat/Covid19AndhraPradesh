package com.amar.covid19andhrapradesh.RetrofitClass;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amar.covid19andhrapradesh.ApiInterface.ApiDistrictData;
import com.amar.covid19andhrapradesh.Apiclients.ApiClient;
import com.amar.covid19andhrapradesh.DistricRecycler;
import com.amar.covid19andhrapradesh.R;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TelanganaDistrictData extends AppCompatActivity {

    ProgressBar progressBar;
    RecyclerView recyclerView;
    ArrayList<Integer>  districname      = new ArrayList<Integer>();
    ArrayList<Integer> districactive    = new ArrayList<Integer>();
    ArrayList<Integer> districconfirmed = new ArrayList<Integer>();
    ArrayList<Integer> districdeceased  = new ArrayList<Integer>();
    ArrayList<Integer> districrecovered = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telangana_district_data);

        recyclerView = (RecyclerView) findViewById(R.id.district_recycler);

        progressBar = (ProgressBar) findViewById(R.id.progressbardistrict);


        progressBar.setVisibility(View.INVISIBLE);

        ApiDistrictData apiService =
                ApiClient.getClient().create(ApiDistrictData.class);

        progressBar.setVisibility(View.VISIBLE);

        Call<TelanganaStateWise> call = apiService.getDistrictData();

        call.enqueue(new Callback<TelanganaStateWise>() {
            @Override
            public void onResponse(Response<TelanganaStateWise> response) {

                Telangana result = response.body().getTelangana();

                result.getDistricData();

                Integer adilabadactive =result.getDistricData().getAdilabad().getAdilabadactive();
                Integer bhadradriKothagudemactive =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemactive();
                Integer hyderabadactive =result.getDistricData().getHyderabad().getHyderabadactive();
                Integer jagtialactive =result.getDistricData().getJagtial().getJagtialactive();
                Integer  jangaonactive =result.getDistricData().getJangaon().getJangaonactive();
                Integer  jayashankarBhupalapallyactive =result.getDistricData().getJayashankarBhupalapally().getJayashankarBhupalapallyactive();
                Integer  jogulambaGadwalactive =result.getDistricData().getJogulambaGadwal().getJogulambaGadwalactive();
                Integer  kamareddyactive =result.getDistricData().getKamareddy().getKamareddyactive();
                Integer  karimnagaractive =result.getDistricData().getKarimnagar().getKarimnagaractive();
                Integer  khammamactive =result.getDistricData().getKhammam().getKhammamactive();
                Integer komaramBheemactive =result.getDistricData().getKomaramBheem().getKomaramBheemactive();
                Integer mahabubabadactive =result.getDistricData().getMahabubabad().getMahabubabadactive();
                Integer mahabubnagaractive =result.getDistricData().getMahabubnagar().getMahabubnagaractive();
                Integer mancherialactive =result.getDistricData().getMancherial().getMancherialactive();



                Integer adilabadconfirmed =result.getDistricData().getAdilabad().getAdilabadconfirmed();
                Integer bhadradriKothagudemconfirmed =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemconfirmed();
                Integer hyderabadconfirmed =result.getDistricData().getHyderabad().getHyderabadconfirmed();
                Integer jagtialconfirmed =result.getDistricData().getJagtial().getJagtialconfirmed();
                Integer  jangaonconfirmed =result.getDistricData().getJangaon().getJangaonconfirmed();
                Integer  jayashankarBhupalapallyconfirmed =result.getDistricData().getJayashankarBhupalapally().getJayashankarBhupalapallyconfirmed();
                Integer  jogulambaGadwalconfirmed =result.getDistricData().getJogulambaGadwal().getJogulambaGadwalconfirmed();
                Integer  kamareddyconfirmed =result.getDistricData().getKamareddy().getKamareddyconfirmed();
                Integer  karimnagarconfirmed =result.getDistricData().getKarimnagar().getKarimnagarconfirmed();
                Integer  khammamconfirmed =result.getDistricData().getKhammam().getKhammamconfirmed();
                Integer komaramBheemconfirmed =result.getDistricData().getKomaramBheem().getKomaramBheemconfirmed();
                Integer mahabubabadconfirmed =result.getDistricData().getMahabubabad().getMahabubabadconfirmed();
                Integer mahabubnagarconfirmed =result.getDistricData().getMahabubnagar().getMahabubnagarconfirmed();
                Integer mancherialconfirmed =result.getDistricData().getMancherial().getMancherialconfirmed();

                Integer adilabaddeceased =result.getDistricData().getAdilabad().getAdilabaddeceased();
                Integer bhadradriKothagudemdeceased =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemdeceased();
                Integer hyderabaddeceased =result.getDistricData().getHyderabad().getHyderabaddeceased();
                Integer jagtialdeceased =result.getDistricData().getJagtial().getJagtialdeceased();
                Integer  jangaondeceased =result.getDistricData().getJangaon().getJangaondeceased();
                Integer  jayashankarBhupalapallydeceased =result.getDistricData().getJayashankarBhupalapally().getJayashankarBhupalapallydeceased();
                Integer  jogulambaGadwaldeceased =result.getDistricData().getJogulambaGadwal().getJogulambaGadwaldeceased();
                Integer  kamareddydeceased =result.getDistricData().getKamareddy().getKamareddydeceased();
                Integer  karimnagardeceased =result.getDistricData().getKarimnagar().getKarimnagardeceased();
                Integer  khammamdeceased =result.getDistricData().getKhammam().getKhammamdeceased();
                Integer komaramBheemdeceased =result.getDistricData().getKomaramBheem().getKomaramBheemdeceased();
                Integer mahabubabaddeceased =result.getDistricData().getMahabubabad().getMahabubabaddeceased();
                Integer mahabubnagardeceased =result.getDistricData().getMahabubnagar().getMahabubnagardeceased();
                Integer mancherialdeceased =result.getDistricData().getMancherial().getMancherialdeceased();

                Integer adilabadrecovered =result.getDistricData().getAdilabad().getAdilabadrecovered();
                Integer bhadradriKothagudemrecovered =result.getDistricData().getBhadradriKothagudem().getBhadradriKothagudemrecovered();
                Integer hyderabadrecovered =result.getDistricData().getHyderabad().getHyderabadrecovered();
                Integer jagtialrecovered =result.getDistricData().getJagtial().getJagtialrecovered();
                Integer  jangaonrecovered =result.getDistricData().getJangaon().getJangaonrecovered();
                Integer  jayashankarBhupalapallyrecovered =result.getDistricData().getJayashankarBhupalapally().getJayashankarBhupalapallyrecovered();
                Integer  jogulambaGadwalrecovered =result.getDistricData().getJogulambaGadwal().getJogulambaGadwalrecovered();
                Integer  kamareddyrecovered =result.getDistricData().getKamareddy().getKamareddyrecovered();
                Integer  karimnagarrecovered =result.getDistricData().getKarimnagar().getKarimnagarrecovered();
                Integer  khammamrecovered =result.getDistricData().getKhammam().getKhammamrecovered();
                Integer komaramBheemrecovered =result.getDistricData().getKomaramBheem().getKomaramBheemrecovered();
                Integer mahabubabadrecovered =result.getDistricData().getMahabubabad().getMahabubabadrecovered();
                Integer mahabubnagarrecovered =result.getDistricData().getMahabubnagar().getMahabubnagarrecovered();
                Integer mancherialrecovered =result.getDistricData().getMancherial().getMancherialrecovered();

                districname.add(R.string.adilabad);
                districname.add(R.string.bhadradriKothagudem);
                districname.add(R.string.hyderabad);
                districname.add(R.string.jagtial);
                districname.add(R.string.jangaon);
                districname.add(R.string.jayashankarBhupalapally);
                districname.add(R.string.jogulambaGadwal);
                districname.add(R.string.kamareddy);
                districname.add(R.string.karimnagar);
                districname.add(R.string.khammam);
                districname.add(R.string.komaramBheem);
                districname.add(R.string.mahabubabad);
                districname.add(R.string.mahabubnagar);
                districname.add(R.string.mancherial);


                districactive.add(adilabadactive);
                districactive.add(bhadradriKothagudemactive);
                districactive.add(hyderabadactive);
                districactive.add(jagtialactive);
                districactive.add(jangaonactive);
                districactive.add(jayashankarBhupalapallyactive);
                districactive.add(jogulambaGadwalactive);
                districactive.add(kamareddyactive);
                districactive.add(karimnagaractive);
                districactive.add(khammamactive);
                districactive.add(komaramBheemactive);
                districactive.add(mahabubabadactive);
                districactive.add(mahabubnagaractive);
                districactive.add(mancherialactive);



                districconfirmed.add(adilabadconfirmed);
                districconfirmed.add(bhadradriKothagudemconfirmed);
                districconfirmed.add(hyderabadconfirmed);
                districconfirmed.add(jagtialconfirmed);
                districconfirmed.add(jangaonconfirmed);
                districconfirmed.add(jayashankarBhupalapallyconfirmed);
                districconfirmed.add(jogulambaGadwalconfirmed);
                districconfirmed.add(kamareddyconfirmed);
                districconfirmed.add(karimnagarconfirmed);
                districconfirmed.add(khammamconfirmed);
                districconfirmed.add(komaramBheemconfirmed);
                districconfirmed.add(mahabubabadconfirmed);
                districconfirmed.add(mahabubnagarconfirmed);
                districconfirmed.add(mancherialconfirmed);


                districdeceased.add(adilabaddeceased);
                districdeceased.add(bhadradriKothagudemdeceased);
                districdeceased.add(hyderabaddeceased);
                districdeceased.add(jagtialdeceased);
                districdeceased.add(jangaondeceased);
                districdeceased.add(jayashankarBhupalapallydeceased);
                districdeceased.add(jogulambaGadwaldeceased);
                districdeceased.add(kamareddydeceased);
                districdeceased.add(karimnagardeceased);
                districdeceased.add(khammamdeceased);
                districdeceased.add(komaramBheemdeceased);
                districdeceased.add(mahabubabaddeceased);
                districdeceased.add(mahabubnagardeceased);
                districdeceased.add(mancherialdeceased);

                districrecovered.add(adilabadrecovered);
                districrecovered.add(bhadradriKothagudemrecovered);
                districrecovered.add(hyderabadrecovered);
                districrecovered.add(jagtialrecovered);
                districrecovered.add(jangaonrecovered);
                districrecovered.add(jayashankarBhupalapallyrecovered);
                districrecovered.add(jogulambaGadwalrecovered);
                districrecovered.add(kamareddyrecovered);
                districrecovered.add(karimnagarrecovered);
                districrecovered.add(khammamrecovered);
                districrecovered.add(komaramBheemrecovered);
                districrecovered.add(mahabubabadrecovered);
                districrecovered.add(mahabubnagarrecovered);
                districrecovered.add(mancherialrecovered);

                DistricRecycler districRecycler = new DistricRecycler(getApplicationContext(),districname,districactive,districconfirmed,districdeceased,districrecovered);

                recyclerView.setAdapter(districRecycler);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                progressBar.setVisibility(View.INVISIBLE);


            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }
}

package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://assets.blackxperience.com/content/blackauto/autonews/2019020402-003xx-2019-motogp-valentino-rossi.jpg");
        mNames.add("Valentino Rossi");
        mDesc.add("Yamaha Factory Racing");
        mImageDet.add("Tim                 : Yamaha Factory Racing \n" +
                "Kebangsaan  : Italia \n" +
                "Lahir               :16 Februari 1979 Urbino, Italia \n\n" +
                "          Valentino Rossi adalah seorang pembalap di kejuaraan grandprix motor dunia dengan titel juara dunia di empat kelas yang berbeda yang diraihnya dalam waktu tujuh tahun berkarier. Ia adalah salah seorang pembalap tersukses sepanjang masa, dengan 7 gelar juara dunia di kelas puncak (500cc/MotoGP) dan dua gelar di kelas 250cc dan 125cc.");

        mImageUrls.add("https://cdn-1.motorsport.com/images/mgl/2dyEmABY/s8/motogp-repsol-honda-team-launch-2017-marc-marquez-repsol-honda-team.jpg");
        mNames.add("Marc Márquez");
        mDesc.add("Repsol Honda");
        mImageDet.add("Tim                 : Repsol Honda \n" +
                "Kebangsaan  : Spanyol \n" +
                "Lahir               : 17 Februari 1993 Cervera, Spanyol \n\n" +
                "          Marc Márquez Alenta adalah pembalap motor berkebangsaan Spanyol yang memiliki gelar juara dunia kelas 125cc pada tahun 2010, kelas Moto2 pada tahun 2012, dan kelas MotoGP tahun 2013, 2014, 2016, 2017, dan 2018. Dia adalah juara dunia termuda sepanjang sejarah MotoGP. Dan ia menjadi rider termuda yang meraih 5 titel juara dunia di semua kelas memecahkan rekor Valentino Rossi.");

        mImageUrls.add("https://www.ridersdomain.com/magazine/wp-content/uploads/2018/01/Maverick-Vinales-2018.jpg");
        mNames.add("Maverick Viñales");
        mDesc.add("Yamaha Factory Racing");
        mImageDet.add("Tim                 : Yamaha Factory Racing \n" +
                "Kebangsaan  : Spanyol  \n" +
                "Lahir               : 12 Januari 1995 Figueres, Spanyol \n\n" +
                "          Maverick Viñales Ruiz adalah pembalap asal Spanyol. Saat usia 12 tahun ia menjuarai seri 125 cc Catalan Champion untuk pertama kalinya dan mampu dipertahankannya setahun kemudian. Di tahun 2009 ia menempati posisi runner-up kejuaraan CEV Buckler National 125GP championship dengan hanya defisit empat poin. Atas pencapaiannya tersebut ia mendapatkan gelar Rookie of the Year.");

        mImageUrls.add("https://2yrh403fk8vd1hz9ro2n46dd-wpengine.netdna-ssl.com/wp-content/uploads/2019/02/2019-repsol-honda-motogp-gallery-1.jpg");
        mNames.add("Jorge Lorenzo");
        mDesc.add("Repsol Honda");
        mImageDet.add("Tim                 : Repsol Honda \n" +
                "Kebangsaan  : Spanyol \n" +
                "Lahir               : 4 Mei 1987 De Mallorca, Spanyol \n\n" +
                "          Jorge Lorenzo Guerrero merupakan seorang pembalap MotoGP asal Spanyol. Saat ini ia bergabung di tim Ducati Corse. Ia merupakan juara dunia kelas 250cc tahun 2006 dan 2007.[2] Tanggal 10 Oktober 2010, Jorge Lorenzo memastikan diri sebagai juara dunia MotoGP untuk pertama kalinya walaupun hanya finish ketiga di GP Malaysia.");

        mImageUrls.add("https://elcuentakilometro.files.wordpress.com/2016/05/andrea-dovizioso-ducati.jpg");
        mNames.add("Andrea Dovizioso");
        mDesc.add("Ducati Racing Team");
        mImageDet.add("Tim                 : Ducati Racing Team \n" +
                "Kebangsaan  : Italia \n" +
                "Lahir               : 23 Maret 1986 Forlì, Italy \n\n" +
                "          Andrea Dovizioso merupakan seorang pembalap MotoGP asal Italia. Saat ini ia bergabung dengan tim Ducati dan ia merupakan juara dunia kelas 125cc tahun 2004. Bakat membalap Davizioso mulai terlihat kilaunya saat baru berusia 15 tahun, kala itu dia menjuarai European Championship 125cc serta menjalani Kejuaraan Dunia pertamanya Mugello, yang sayangnya berakhir dengan DNF.");

        mImageUrls.add("https://images.caradisiac.com/images/4/3/3/9/174339/S0-motogp-ktm-johann-zarco-montre-ses-nouvelles-couleurs-580915.jpg");
        mNames.add("Johan Zarco");
        mDesc.add("KTM Racing Team");
        mImageDet.add("Tim                 : KTM Racing Team \n" +
                "kebangsaan  : Prancis \n" +
                "Lahir               : 16 Juli 1990 Cannes, Perancis \n\n" +
                "          Johann Zarco adalah pembalap motor Perancis, yang meraih dua gelar juara dunia Moto2 di tahun 2015 dan 2016. Mulai musim 2017 dia akan menjalani debutnya di kelas MotoGP bersama tim Monster Yamaha Tech 3.");

        mImageUrls.add("https://jalanberkarisma.files.wordpress.com/2018/02/livery-repsol-honda-team-motogp-2018-4.jpg");
        mNames.add("Daniel Pedrosa");
        mDesc.add("Repsol Honda");
        mImageDet.add("Tim                 : Repsol Honda \n" +
                "kebangsaan  : Spanyol \n" +
                "Lahir               : 29 September 1985 Sabadell, Spain \n\n" +
                "          Daniel Pedrosa Ramal adalah salah seorang pembalap MotoGP. Ia mulai debut balap grandprix motor pada tahun 2001 di kelas GP 125 cc bersama tim Telefonica Movistar Honda JR, dan meraih posisi ke 8 klasemen akhir. Tahun 2002 ia membalap di tim yang sama dan meraih juara 3 dunia GP 125 cc.");

        mImageUrls.add("https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/bolasport/medium_7cbed38d95de1119cb6c37a78d6ee0ed.jpg");
        mNames.add("Francesco Bagnaia");
        mDesc.add("Alma Pramac Racing");
        mImageDet.add("Tim                 : Alma Pramac Racing \n" +
                "kebangsaan  : italia \n" +
                "Lahir               : 14 Januari 1997 Turin, Italia \n\n" +
                "          Francesco Bagnaia merupakan pembalap yang sukses di Minimoto dan dia memenangkan kejuaraan di Eropa MiniGP pada tahun 2009 dan menempati posisi kedua dalam kejuaraan tersebut. Dalam kejuaraan Moto3 CEV 2012 ia mengendarai Honda Moto3 NSF250R dan menempati posisi ke-3. Bagnaia juga merupakan anggota Sky Racing Team VR46.");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mImageUrls);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}
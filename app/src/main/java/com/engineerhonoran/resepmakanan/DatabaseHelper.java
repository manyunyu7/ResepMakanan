package com.engineerhonoran.resepmakanan;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {
    // Database Version
    private static final int DATABASE_VERSION = 10;

    // Database Name
    private static final String DATABASE_NAME = "db_resep";

    // Table Names
    private static final String DB_TABLE = "tb_resep";

    // column names
    private static final String KEY_NAMA = "nama";
    private static final String KEY_RESEP = "resep";
    private static final String KEY_IMAGE = "foto";
    private static final String KEY_VIDEO = "video";
    private static final String KEY_ID = "id";
    private static final String KEY_JENIS = "jenis";
    // Table create statement
    private static final String CREATE_TABLE_RESEP = "CREATE TABLE " + DB_TABLE + "("+
            KEY_NAMA + " TEXT," +
            KEY_RESEP+  " TEXT,"+
            KEY_IMAGE + " INT,"+
            KEY_VIDEO+" INT,"+
            KEY_ID+" INT"+")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // creating table
        db.execSQL(CREATE_TABLE_RESEP);
//Cendol
        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Cendol","Cendol merupakan minuman khas Indonesia yang terbuat dari tepung beras, disajikan dengan es parut serta gula merah cair dan santan. Rasa minuman ini manis dan gurih. Di daerah Sunda minuman ini dikenal dengan nama cendol sedangkan di Jawa Tengah dikenal dengan nama es dawet. Berkembang kepercayaan populer dalam masyarakat Indonesia bahwa istilah “cendol” mungkin sekali berasal dari kata “jendol”, yang ditemukan dalam bahasa Sunda, Jawa dan Indonesia; hal ini merujuk sensasi jendolan yang dirasakan ketika butiran cendol melalui mulut kala tengah meminum es cendol.\n" +
                "Tepung beras diolah dengan diberi pewarna berwarna hijau dan di cetak melalui saringan khusus, sehingga berbentuk buliran. Pewarna yang digunakan awalnya adalah pewarna alami dari daun pandan, namun saat ini telah digunakan pewarna makanan buatan. Di Sunda cendol dibuat dengan cara mengayak kukusan tepung beras yang diwarnai dengan daun suji dengan ayakan sehingga diperoleh bentuk bulat lonjong yang lancip di ujungnya. Di Sunda minum cendol disebut nyendol.\n" +
                "Bahan-Bahan Untuk Membuat Es Cendol Pandan Yang Segar :\n" +
                "•\t-Siapkan 125 gr tepung beras\n" +
                "•\t-Siapkan 75 gr tepung kanji\n" +
                "•\t-Siapkan 25 gr tepung hunkwe\n" +
                "•\t-Siapkan 150 ml air suji (dibuat dari 20 lembar daun suji yg dihaluskan ditambah dgn 175 ml air)\n" +
                "•\t-Siapkan 500 ml air ditambahkan 1 tetes pasta pandan\n" +
                "•\t-Siapkan 1 sendok makan air kapur sirih\n" +
                "•\t-Siapkan Es batu secukupnya\n" +
                "•\t-Siapkan 10 daging buah nangka, yang telah dipotong-potong sesuai selera anda\n" +
                "Cara Membuat Membuat Santan/Saus Santan Es Cendol Pandan Segar : \n" +
                "•\t1 liter santan yg telah dibuat dari 1 butir parutan kelapa\n" +
                "•\t5 lembar daun dari pandan\n" +
                "•\t1/2 sendok teh garam (secukupnya)\n" +
                "•\tSeluruhnya bahan dimasak bersamaan sampai kemudian mendidih\n",R.drawable.imgcendol+"",""+R.raw.contohvideo,""+1});
//Es Lilin
         db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Es Lilin","Bahan Bahan Cara Membuat Es Lilin:\n" +
                 "•\t150 gram susu bubuk rasa \n" +
                 "•\t1 liter susu vanila cair\n" +
                 "•\t450 gram gula pasir yang dicairkan dengan air\n" +
                 "•\tEs batu yang diserut\n" +
                 "•\tCetakan es loli atau plastik\n" +
                 "•\tShaker\n" +
                 "Cara Membuat Es Lilin :\n" +
                 "1.\tAmbil Kalau Anda tidak punya shaker, gunakan saja tumbler atau gelas bertutup saja. Masukkan susu bubuk, air gula, susu cair, dan es serut dalam shaker.\n" +
                 "2.\tTutup shaker dan kocok-kocok dengan gerakan cepat.\n" +
                 "3.\tTuangkan milkshake ke dalam cetakan atau plastik es.\n" +
                 "4.\tTunggu membeku dan sajikan,\n",R.drawable.img_eslilin+"",""+R.raw.contohvideo,""+2});
//Sakoteng
        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Sakoteng","Sekoteng adalah minuman hangat yang tentunya sangat enak dan berkhasiat tinggi. Minuman asli indonesia ini sangat nikmat disajikan dimalam hari dan saat hujan tiba. Sekoteng ini tentunya menggunakan racikan bahan dan rempah-rempah alami asli indonesia. resep sekoteng terdiri dari air rebusan jahe dan rempah lainnya.\n" +
                "Bahan lain yang biasanya dicampur ke dalam minuman sekoteng adalah kacang hijau, kacang tanah, pacar cina, dan potongan roti. Sekoteng biasa dihidangkan pada malam hari. Sekoteng biasanya dijual keliling dengan menggunakan gerobak pikul. Satu sisi untuk panci air jahe beserta kompornya sedangkan sisi lain adalah tempat bahan campuran dan tempat mempersiapkan sekoteng.\n" +
                "\n" +
                "Bahan-bahan\n" +
                "•\t3 lembar roti tawar, potong-potong\n" +
                "•\t100 gram kolang-kaling, potong-potong\n" +
                "•\t50 gram gula pasir\n" +
                "•\t100 ml air\n" +
                "•\tPewarna merah secukupnya\n" +
                "•\t50 gram kacang hijau, cuci dan tiriskan\n" +
                "•\t150 gram delima merah, lihat resep es delima\n" +
                "•\t50 ml air jahe dari 2 sdm jahe parut\n" +
                "•\t10 sdm sirop vanilla\n" +
                "•\t500 gram es serut\n" +
                "Cara membuat\n" +
                "1.\tRebus kolang-kaling, gula, dan air hingga empuk, lalu beri warna merah secukupnya. Masak sebentar, angkat dan tiriskan.\n" +
                "2.\tRebus kacang hijau hingga matang tapi tidak pecah. Angkat.\n" +
                "3.\tSiapkan 5 mangkuk saji, letakkan dan susunan kacang hijau, kolang-kaling, roti tawar, delima merah, dan air jahe.\n" +
                "4.\tMasukkan es serut dan sirop vanilla.\n" +
                "5.\tSajikan segera.\n",R.drawable.img_sekoteng+"",""+R.raw.contohvideo,""+3});
        //Goyobod
        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Goyobod","SGoyobod adalah minuman khas Priangan. Goyobod sendiri adalah tepung sagu aren yang diproses seperti agar-agar. Dicampur macam-macam tambahan seperti sekoteng, alpukat, yang dicampur dalam santan kelapa dan es serut dengan pemanis sirup gula dan susu kental manis serta tambahan roti manis.\n" +
                "Bahan\n" +
                "Goyobod\n" +
                "60 g tepung hunkue\n" +
                "750 ml air\n" +
                "125 g gula merah, sisir\n" +
                "1 sdt garam\n" +
                " \n" +
                "Kuah santan\n" +
                "1.000 ml santan, dari 1 butir kelapa\n" +
                "300 g gula merah, sisir\n" +
                "100 g gula pasir\n" +
                "½ sdt garam\n" +
                "2 lembar daun pandan, ikat/potong-potong\n" +
                "\n" +
                "Isi\n" +
                "1 buah kelapa muda, belah dua, keruk daging buahnya\n" +
                "1 buah avokad, belah dua, buang bijinya, keruk daging buahnya\n" +
                "es serut/es batu\n" +
                "\n" +
                "Cara membuat:\n" +
                "1. Goyobod: Siapkan loyang/pinggan berukuran 17 x 24 x 3 cm. Basahi bagian dalamnya dengan air matang, sisihkan. Larutkan tepung hunkue dengan sedikit air. Jerang sisa air, gula merah, dan garam hingga mendidih di atas api sedang. Angkat dari atas api, saring. Tuang kembali ke dalam panci." + "\n" +
                "2. Masukkan larutan tepung hunkue ke dalam panci berisi air gula, masak di atas api sedang sambil terus diaduk hingga mendidih (meletup-letup). Angkat dari atas api." + "\n" +
                "3. Tuang adonan hunkue ke dalam loyang/mangkuk tahan panas. Biarkan hingga dingin. Keluarkan dari loyang/mangkuk. Potong-potong bentuk dadu ukuran 1 cm." + "\n" +
                "4. Kuah santan: Rebus santan, gula merah, garam, dan daun pandan sambil ditimba-timba hingga mendidih. Angkat dari atas api, saring." + "\n" +
                "5. Siapkan mangkuk/gelas saji. Taruh 2 – 3 sdm goyobod dalam mangkuk/gelas. Tambahkan kelapa muda dan avokad. Tuangi kuah santan. Tambahkan es serut/es batu. Sajikan\n",
                R.drawable.img_goyobod+"",""+R.raw.contohvideo,""+4});
//Es Oyen
        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Es Oyen","Bahan-Bahan\n" +
                "•\t10 potong nangka, iris dadu\n" +
                "•\t500 gram alpukat, keruk ambil dagingnya\n" +
                "•\t250 gram gula, dicairkan dengan air\n" +
                "•\tsagu mutiara matang sesuai selera\n" +
                "•\t1 butir kelapa muda, keruk ambil dagingnya\n" +
                "•\t1 bungkus sari kelapa\n" +
                "•\taneka jeli\n" +
                "•\tlarutan kental manis\n" +
                "•\tes batu secukupnya\n" +
                "Cara Membuat\n" +
                "1. Tata semua buah, sari kelapa, kelapa muda, dan jeli di wadah.\n" +
                "2. Tuang beberapa sendok gula cair.\n" +
                "3. Tambahkan es batu.\n" +
                "4. Tambahkan sagu mutiara dan larutan kental manis.\n" +
                "\n",R.drawable.img_esoyen+"",""+R.raw.contohvideo,""+5});
        //cilok 7
        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Cilok","Jajanan ala Sunda yang satu ini paling banyak dijual oleh gerobak-gerobak yang mangkal di pinggir jalan. Ternyata pembuatannya cukup mudah. Yuk, intip resepnya!\n" +
                "Bahan membuat cilok:\n" +
                "•\t500 gr tepung aci\n" +
                "•\t250 gr tepung terigu\n" +
                "•\tAir panas secukupnya\n" +
                "•\tGaram, gula, merica secukupnya\n" +
                "•\tIrisan daun bawang\n" +
                "•\tGajih sapi atau abon atau sosis untuk isian\n" +
                "Bahan membuat sambel kacang:\n" +
                "•\t50 gr kacang tanah yang sudah digoreng\n" +
                "•\tGula merah secukupnya\n" +
                "•\tGaram secukupnya\n" +
                "•\t3 siung bawang putih\n" +
                "•\t3 buah cabe merah keriting\n" +
                "Cara membuatnya:\n" +
                "1.\tCampur tepung terigu, garam, gula, dan merica dengan air panas sampai basahnya merata.\n" +
                "2.\tMasukkan tepung kanji dan daun bawang, aduk rata hingga kalis.\n" +
                "3.\tSiapkan air untuk merebus yang sudah diberi garam dan sedikit minyak.\n" +
                "4.\tBentuk adonan menjadi bulatan (bisa diisi gajih, abon atau sosis) dan masukkan ke dalam air mendidih. Rebus hingga mengapung dan berwarna mengkilat, angkat lalu tiriskan.\n" +
                "5.\tCara membuat sambal kacangnya, cukup haluskan semua bahan, lalu masak hingga mengental.\n",R.drawable.img_cilok+"",""+R.raw.contohvideo,""+6});
//Batagor 8
        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Batagor","Penjual batagor bisa ditemukan dimanapun, ada yang keliling ada juga yang punya kedai sendiri. Tapi biasanya, batagor yang dijual ini rasa ataupun teksturnya kurang nendang. Makanya, bikin sendiri adalah solusinya.\n" +
                "Bahan batagor:\n" +
                "•\t250 gr daging ikan tengiri, cuci bersih dan haluskan.\n" +
                "•\t1 sdm minyak goreng\n" +
                "•\t100 gr tepung aci\n" +
                "•\t1 butir telur\n" +
                "•\t50 ml santan encer\n" +
                "•\t2 sdm merica halus\n" +
                "•\t1 sdt garam\n" +
                "•\t1 sdt gula pasir\n" +
                "•\t3 siung bawang putih\n" +
                "•\t1 sdm kecap manis\n" +
                "•\t15 lembar kulit pangsit\n" +
                "•\tMinyak goreng secukupnya\n" +
                "Bahan bumbu kacang:\n" +
                "•\t100 gr kacang tanah yang sudah digoreng\n" +
                "•\t6 buah cabai merah\n" +
                "•\t3 siung bawang putih\n" +
                "•\t2 sdm gula pasir\n" +
                "•\t1 sdt garam\n" +
                "•\t1 sdt kecap manis\n" +
                "•\t1 sdt air jeruk nipis\n" +
                "•\tAir panas dan minyak secukupnya\n" +
                "Cara membuatnya:\n" +
                "1.\tTumis bawang putih, kecap manis, merica halus, garam dan gula pasir yang telah dihaluskan.\n" +
                "2.\tMasukkan bumbu yang sudah di tumis di atas lalu campur dengan ikan tengiri yang sudah dihaluskan sampai rata.\n" +
                "3.\tMasukkan telur, minyak goreng, santan encer dan tepung aci. Aduk hingga tercampur rata.\n" +
                "4.\tSiapkan kulit pangsit, isi dengan adonan lalu lipat, rekatkan dengan telur.\n" +
                "5.\tGoreng dalam minyak panas hingga matang.\n" +
                "6.\tUntuk bumbunya, campur semua bahan lalu tumis hingga mengental\n" +
                "Sajikan batagor dengan siraman bumbu dan telur rebus.\n",R.drawable.img_batagor+"",""+R.raw.contohvideo,""+7});
//Cireng 8
        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Cireng","Siapa sih yang nggak suka cireng? Cireng original saja enak, apalagi cireng dengan variasi isi? Wah, bisa kalap!\n" +
                "Bahan yang dibutuhkan:\n" +
                "•\t300 gr tepung aci\n" +
                "•\t150 gr tepung terigu\n" +
                "•\t2 siung bawang putih, haluskan\n" +
                "•\t1/4 sdt merica bubuk\n" +
                "•\t1 sdt garam\n" +
                "•\tKeju secukupnya\n" +
                "•\tGula pasir secukupnya\n" +
                "•\tAir mendidih secukupnya\n" +
                "•\tMinyak untuk menggoreng secukupnya\n" +
                "Cara membuat:\n" +
                "1.\tCampur tepung aci, tepung terigu, merica bubuk, gula pasir, garam dan bawang putih, aduk rata\n" +
                "2.\tTuang air panas sedikit demi sedikit ke dalam campuran tepung, uleni hingga kalis.\n" +
                "3.\tAmbil adonan lalu isi dengan keju, bentuk sesuai selera.\n" +
                "4.\tPanaskan minyak diatas api sedang lalu goreng cireng hingga matang.\n" +
                "Cireng isi bisa disajikan dengan saus atau sambal kacang.\n",R.drawable.img_cireng+"",""+R.raw.contohvideo,""+8});

        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Cimol","Biasanya cimol banyak dijumpai di pedangan gerobak yang uga menjajakan cilok dan cireng. Tiga jajanan ini memang sepaket. Kamu pasti kerap menjumpai cimol yang ‘aci doang’, jadi ketika sudah nggak hangat lagi, rasanya alot dan nggak enak. Makanya, bikin sendiri aja!\n" +
                "Bahan yang diperlukan:\n" +
                "•\t100 gr tepung aci\n" +
                "•\t10 sdm tepung beras\n" +
                "•\t8 sdm tepung terigu\n" +
                "•\tMinyak ikan secukupnya\n" +
                "•\tGaram dan merica secukupnya\n" +
                "•\tAir panas secukupnya\n" +
                "Cara membuatnya:\n" +
                "•\tCampur tepung aci, tepung beras, tepung terigu, minyak ikan, garam dan merica hingga merata.\n" +
                "•\tMasukan sedikit demi sedikit air panas hingga bahan adonan tadi berbentuk kenyal dan pulen, aduk menggunakan sendok atau spatula hingga merata.\n" +
                "•\tBentuk adonan menjadi bulatan sebesar kelereng atau sesuai selera lalu goreng hingga mengembang dan matang.\n" +
                "Cimol bisa disajikan dengan bubuk cabai ataupun bumbu kacang.\n" +
                "\n",R.drawable.img_cimol+"",""+R.raw.contohvideo,""+9});
   //Cibay
        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Cibay","Jajanan khas Tasikmalaya ini juga biasa disebut Cireng Lebay atau Aci Ngambay. Gorengan enak yang berisi daging ayam ini menjadi populer di kalangan masyarakat Sunda, namun belum banyak tersebar di daerah Jawa.\n" +
                "Bahan yang diperlukan:\n" +
                "•\t250 gr tepung aci\n" +
                "•\t150 gr daging ayam direbus matang lalu suwir-suwir\n" +
                "•\t800 ml air\n" +
                "•\t4 batang daun bawang diiris kecil\n" +
                "•\t2 siung bawang putih dihaluskan\n" +
                "•\t4 butir bawang merah dihaluskan\n" +
                "•\t1 sdt garam\n" +
                "•\t1/2 sdt merica\n" +
                "•\t1/2 sdt kaldu bubuk\n" +
                "•\t20 lembar kulit lumpia\n" +
                "•\t6 buah cabe rawit merah dicincang kasar\n" +
                "•\tbumbu tabur cabe secukupnya\n" +
                "•\t2 sdm tepung terigu dilarutkan dengan sedikit air untuk adonan perekat\n" +
                "•\tminyak untuk menggoreng\n" +
                "Cara membuatnya:\n" +
                "1.\tCampur dan aduk rata tepung aci, garam, merica dan kaldu bubuk dalam panci. Masukkan air, bawang putih, bawang merah, daun bawang, dan suwiran ayam, kemudian aduk hingga rata dan nggak ada yang menggumpal. Masak di atas api kecil sambil terus diaduk-aduk hingga adonan berwarna bening dan kental, matikan api.\n" +
                "2.\tAmbil 1 lembar kulit lumpia, tuang 1 sendok makan adonan aci tadi, lalu taburi dengan cabe rawit cincang secukupnya. Lipat berbentuk kotak atau sesuai selera dan lem menggunakan adonan terigu sebagai perekat. Lakukan hingga adonan habis.\n" +
                "3.\tPanaskan minyak, goreng hingga matang dan berwarna kekuningan, lalu angkat dan tiriskan.\n" +
                "Sajikan Cibay selagi panas dengan taburan bumbu tabur cabe untuk mendapatkan sensasi yang lebih pedas.\n",R.drawable.img_cibay+"",""+R.raw.contohvideo,""+10});

        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Seblak Ceker","Bahan:\n" +
                "- 2 genggam kerupuk, redam di air biasa 2 jam\n" +
                "- 6 butir bakso\n" +
                "- 200 gr ceker\n" +
                "Bumbu halus:\n" +
                "- 4 siung bawang merah\n" +
                "- 3 siung bawang putih\n" +
                "- 3 butir kemiri\n" +
                "- 1 ruas jari kencur\n" +
                "- 8 cabai merah keriting\n" +
                "- 6 cabai rawit pedas\n" +
                "- 5 cabai rawit hijau (untuk irisan)\n" +
                "- gula, garam, kaldu bubuk, lada bubuk.\n" +
                "- 1 bonggol sawi sendok\n" +
                "- 1 batang daun bawang\n" +
                "- air kaldu rebusan ceker (sesuai selera)\n" +
                "- 2 butir telur yang sudah diorak-arik\n" +
                "Cara membuat:\n" +
                "- Tumis bumbu hingga matang.\n" +
                "- Tambahkan bakso, ceker, kerupuk yang sudah direndam, garam, gula, lada, saos tiram, kaldu bubuk. Masak sebentar.\n" +
                "- Tambah air kaldu, masak hingga mendidih.\n" +
                "- Masukkan daun sawi, daun bawang, dan cabai rawit iris, masak hingga sayuran matang.\n" +
                "- Angkat dan sajikan.\n",R.drawable.img_seblakceker+"",""+R.raw.contohvideo,""+11});

        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Colenak","Bahan yang dibutuhkan sebagai bahan utama :\n" +
                "\uF0A7\tTape singkong sebanyak 500 gram\n" +
                "\uF0A7\tMargarine sebanyak 2 sendok makan\n" +
                "Bahan untuk sausnya :\n" +
                "\uF0A7\tSantan kelapa kental sebanyak 350 ml\n" +
                "\uF0A7\tDaun pandan sebanyak 2 lembar, yang telah dicuci bersih\n" +
                "\uF0A7\tKelapa muda sebanyak 1/2 buah, parut dahulu\n" +
                "\uF0A7\tGula merah sebanyak 200 gram, iris tipis\n" +
                "\uF0A7\tGaram dapur halus sebanyak1/4 sendok teh\n" +
                "Cara membuat Colenak :\n" +
                "1.\tLangkah pertama pipihkan dahulu tape singkong dengan menggunakan sendok makan.\n" +
                "2.\tBerikutya sipakan wajan datar yang telah dipanaskan dan diberi olesan margarine lalu panggang tape singkong yang telah dipipihkan diatasnya.\n" +
                "3.\tSering dibolak – balik agar tape tidak gosong. Lalu sisihkan.\n" +
                "4.\tLangkah berikutnya untuk membuat saus campurkan santan kelapa, gula merah dan daun pandan lalu rebus dan aduk hingga mendidih.\n" +
                "5.\tMasukan garam dapur halus aduk hingga rata dan gula merah larut.\n" +
                "6.\tTambahkan kelapa parut aduk rata dan kuah mengental. Angkat.\n" +
                "7.\tLetakan tape singkong dan tata pada piring saji.\n" +
                "8.\tKucuri saus gula kelapa dan colenak Bandung siap di sajikan.\n",R.drawable.img_colenak+"",""+R.raw.contohvideo,""+12});

        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Karedok","Bahan:\n" +
                "- 5 buah kacang panjang, iris tipis\n" +
                "- 1 buah timun, iris kecil-kecil\n" +
                "- 3 lembar kol, iris tipis\n" +
                "- 1/2 ons tauge\n" +
                "- 2 buah terong bulat, iris kecil-kecil\n" +
                "- 1/2 ikat kemangi\n" +
                "Bumbu:\n" +
                "- 1 ons kacang tanah sangrai\n" +
                "- 1 buah cabai merah\n" +
                "- 2 buah cabai rawit\n" +
                "- Sedikit terasi\n" +
                "- 2 ruas kencur\n" +
                "- 1/2 siung bawang putih\n" +
                "- garam dan gula merah\n" +
                "- 1 sdt air asam jawa (optional)\n" +
                "Pelengkap: kerupuk\n" +
                "Cara membuat:\n" +
                "1. Haluskan cabeai terasi, kencur, bawang putih, garam dan gula merah,\n" +
                "- Lalu tambahkan kacang tanah dan air asam jawa, haluskan dan beri sedikit air jika perlu.\n" +
                "- Masukkan semua sayur, aduk hingga rata.\n" +
                "- Sajikan dengan kerupuk.\n" +
                "\n",R.drawable.img_karedok+"",""+R.raw.contohvideo,""+13});

        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Empal Gepuk Daging","Bahan :\n" +
                "- 1 kg daging sapi, potong cuci bersih .\n" +
                "- 3 lembar daun salam .\n" +
                "- 4 lembar daun jeruk\n" +
                "- 1250 ml santan cair\n" +
                "- 250 ml santan kental\n" +
                "- 200 gr gula merah, sisir\n" +
                "- 4 sdm air asam jawa\n" +
                "- garam secukupnya\n" +
                "- kaldu bubuk secukupnya\n" +
                "Bumbu halus:\n" +
                "- 15 siung bawang merah\n" +
                "- 7 siung bawang putih\n" +
                "- 3 ruas lengkuas\n" +
                "- 2 batang serai\n" +
                "- 5 butir kemiri\n" +
                "- 2 sdm ketumbar\n" +
                "- 1 sdt merica\n" +
                "Cara membuat:\n" +
                "- Siapkan wajan masukkan santan cair, daging, bumbu halus, daun salam, serai, gula merah, air asam, garam dan kaldu bubuk. Masak sampai mendidih lalu kecilkan api.\n" +
                "- Jika daging sudah setengah empuk, masukan santan kental. Masak terus.\n" +
                "- Setelah santan menyusut, angkat daging lalu tumbuk hingga seratnya terlihat jelas.\n" +
                "- Lalu goreng sebentar saja.\n" +
                "- Sajikan dengan taburan bawang goreng, sayur asem dan sambal terasi\n",R.drawable.img_gepuk+"",""+R.raw.contohvideo,""+14});

        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Nasi Liwet Sunda","Bahan:\n" +
                "- 6 gelas beras\n" +
                "- 1 1/2 sachet kaldu bubuk rasa ayam\n" +
                "- 8 siung bawang putih, diiris\n" +
                "- 8 siung bawang merah, diiris\n" +
                "- 3 batang serai, geprek\n" +
                "- 6 lembar daun salam\n" +
                "- 5 lembar daun jeruk\n" +
                "- 10 cabai rawit merah\n" +
                "- 2 papan petai\n" +
                "- 100 gr teri medan, goreng kering\n" +
                "- garam secukupnya\n" +
                "- air secukupnya\n" +
                "Cara membuat:\n" +
                "- Cuci beras seperti biasa, masukkan kaldu bubuk, aduk, sisihkan.\n" +
                "- Tumis daun salam, daun jeruk, sereh, bawang merah dan bawang putih hingga harum, beri garam secukupnya.\n" +
                "- Kemudian tambahkan petai dan cabai rawit. Tumis sebentar lalu matikan kompor.\n" +
                "- Masukkan tumisan bumbu tersebut ke dalam beras beserta minyaknya, beri air selayaknya kita mau masak nasi, aduk.\n" +
                "- Masak seperti masak nasi biasa.\n" +
                "- Kalau sudah matang, biarkan sebentar selama 5 menit, lalu aduk nasinya, tutup kembali biarkan selama 5 menit. Taburi dengan teri medan. Nasi liwet siap disajikan.\n",R.drawable.img_liwet+"",""+R.raw.contohvideo,""+15});

        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Mie Kocok","Bahan:\n" +
                "- 400 g mi basah gepeng, siap pakai, cuci, tiriskan\n" +
                "- 150 g taoge, buang akarnya\n" +
                "- 2 sdm daun bawang iris tipis\n" +
                "- 2 sdm bawang goreng\n" +
                "- air jeruk limau\n" +
                "- sambal cabai rawit\n" +
                "Bahan kuah:\n" +
                "- 2 sdm minyak goreng\n" +
                "- 8 siung bawang putih, haluskan\n" +
                "- 2.5 liter kaldu sapi\n" +
                "- 650 g kikil sapi, rebus hingga empuk, potong dadu 2 cm\n" +
                "- 6 cm jahe, memarkan\n" +
                "- 1 butir biji pala, pecahkan\n" +
                "- 1 sdt merica bubuk\n" +
                "- 2 sdt garam\n" +
                "- 1 sdt gula pasir\n" +
                "\n" +
                "Cara membuat:\n" +
                "- Buat kuah terlebih dahulu, panaskan minyak goreng dalam wajan, tumis bawang putih dan jahe sampai harum, angkat, sisihkan.\n" +
                "- Rebus kaldu sapi ke dalam panci. Masak hingga mendidih.\n" +
                "- Masukkan kikil, pala, merica, garam, gula, dan tumisan bawang putih. Rebus hingga mendidih.\n" +
                "- Penyajian: Taruh mi dalam mangkuk saji, tambahkan taoge, siram dengan kuah panas beserta kikil dan sumsumnya.\n" +
                "- Taburi daun bawang dan bawang goreng. Tambahkan air jeruk limau. Sajikan selagi hangat dengan pelengkap sambal cabai rawit.\n",
                R.drawable.img_kocok+"",""+R.raw.contohvideo,""+16});

        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Tumis Genjer Oncom","Bahan:\n" +
                "- 400 g mi basah gepeng, siap pakai, cuci, tiriskan\n" +
                "- 150 g taoge, buang akarnya\n" +
                "- 2 sdm daun bawang iris tipis\n" +
                "- 2 sdm bawang goreng\n" +
                "- air jeruk limau\n" +
                "- sambal cabai rawit\n" +
                "Bahan kuah:\n" +
                "- 2 sdm minyak goreng\n" +
                "- 8 siung bawang putih, haluskan\n" +
                "- 2.5 liter kaldu sapi\n" +
                "- 650 g kikil sapi, rebus hingga empuk, potong dadu 2 cm\n" +
                "- 6 cm jahe, memarkan\n" +
                "- 1 butir biji pala, pecahkan\n" +
                "- 1 sdt merica bubuk\n" +
                "- 2 sdt garam\n" +
                "- 1 sdt gula pasir\n" +
                "\n" +
                "Cara membuat:\n" +
                "- Buat kuah terlebih dahulu, panaskan minyak goreng dalam wajan, tumis bawang putih dan jahe sampai harum, angkat, sisihkan.\n" +
                "- Rebus kaldu sapi ke dalam panci. Masak hingga mendidih.\n" +
                "- Masukkan kikil, pala, merica, garam, gula, dan tumisan bawang putih. Rebus hingga mendidih.\n" +
                "- Penyajian: Taruh mi dalam mangkuk saji, tambahkan taoge, siram dengan kuah panas beserta kikil dan sumsumnya.\n" +
                "- Taburi daun bawang dan bawang goreng. Tambahkan air jeruk limau. Sajikan selagi hangat dengan pelengkap sambal cabai rawit.\n",
                R.drawable.img_tumis+"",""+R.raw.contohvideo,""+17});

        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Urap Sayuran","Bahan :\n" +
                "- 2 ikat genjer\n" +
                "- 1/4 pot oncom\n" +
                "- 2 btg daun bawang iris\n" +
                "- 2 buah cabai merah keriting iris serong\n" +
                "- 1 buah tomat potong-potong\n" +
                "- garam gula pasir dan kaldu bubuk secukupnya\n" +
                "- sedikit minyak goreng untuk menumis\n" +
                "Bumbu halus :\n" +
                "- 10 buah cabai rawit\n" +
                "- 3 siung bawang merah\n" +
                "- 2 siung bawang putih\n" +
                "- 2 ruas kencur\n" +
                "Cara Membuatnya :\n" +
                "- Potong-potong genjer, cuci bersih lalu seduh dengan air panas, tiriskan.\n" +
                "- Haluskan oncom, sisihkan.\n" +
                "- Tumis bumbu halus hingga harum, lalu masukkan potongan daun bawang, potongan tomat, dan cabai merah keriting, aduk sebentar\n" +
                "- Lalu masukkan oncom, aduk hingga oncomnya agak sedikit kering.\n" +
                "- Tambahkan garam gula pasir dan kaldu bubuk secukupnya ,tes rasa\n" +
                "- Kemudian masukkan genjer aduk sebentar saja, supaya genjer layu dan sedikit kering.\n" +
                "- Angkat dan sajikan\n",
                R.drawable.img_urap+"",""+R.raw.contohvideo,""+18});

        db.execSQL("INSERT INTO tb_resep VALUES (?,?,?,?,?)",new String[]{"Sayur Lodeh Sunda","Masih ada resep masakan sunda yang lain loh. Berikut nya adalah sayur lodeh sunda. Masakan ini punya kuah sayur yang terlihat putih, dan berasa gurih yang berasal dari terasi dan kemiri. Supaya lebih nikmat wal mantap, sayur lodeh ini cocok jika di makan dengan lauk ikan asin yang masih hangat. Yummy.\n" +
                "Bumbu Halus :\n" +
                "\uF0A7\t2 sendok teh ebi kering (rendam dalam air panas hingga empuk)\n" +
                "\uF0A7\t4 siung bawang putih\n" +
                "\uF0A7\t6 siung bawang merah\n" +
                "\uF0A7\t4 butir kemiri\n" +
                "\uF0A7\t1 sendok teh terasi\n" +
                "\uF0A7\tKencur bubuk 1 sdt\n" +
                "\uF0A7\tKetumbar bubuk 1 sendok teh\n" +
                "\uF0A7\tGaram sebanyak 4 sendok teh\n" +
                "Bumbu Tambahan :\n" +
                "\uF0A7\t4 buah lengkuas (diiris tipis-tipis)\n" +
                "\uF0A7\tDaun salam kurang lebih 4 lembar\n" +
                "\uF0A7\t3 buah cabe merah (diiris tipis-tipis)\n" +
                "\uF0A7\tCabe hijau 3 buah (diiris tipis-tipis)\n" +
                "\uF0A7\tDaun bawang 3 batang (dipotong 2 cm)\n" +
                "\uF0A7\tGula jawa 3 sendok teh atau 1 sendok makan gula pasir\n" +
                "\uF0A7\tMinyak canola (sayur) 2 sendok makan (untuk menumis)\n" +
                "\uF0A7\tSantan kental ½ kaleng\n" +
                "\uF0A7\tAir 8 cup\n" +
                "Bahan-Bahan Sayuran:\n" +
                "\uF0A7\tTerong ungu 1 buah\n" +
                "\uF0A7\tKacang panjang 1 ikat\n" +
                "\uF0A7\tLabu siam 2 buah\n" +
                "\uF0A7\tTempe 1 potong\n" +
                "Cara Membuat Urap Sayuran :\n" +
                "\uF0A7\tHaluskan dulu bahan dari bumbu halus menggunakan blender atau food processor atau yang lain.\n" +
                "\uF0A7\tTumis bahan 2 sendok minyak sayur (canola) dan bumbu halus.\n" +
                "\uF0A7\tCampurkan bumbu tambahan, tumis hingga wangi.\n" +
                "\uF0A7\tMasukkan sayuran yang telah dipotong-potong.\n" +
                "\uF0A7\tKemudian pindahkan ke panci yang berukuran cukup besar.\n" +
                "\uF0A7\tTambahkan air dan santan kental.\n" +
                "\uF0A7\tMasak terus hingga sayuran terasa empuk dan matang.\n" +
                "\uF0A7\tMasakan siap untuk dihidangkan.\n",
                R.drawable.img_lodeh+"",""+R.raw.contohvideo,""+19});


    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE);
        // create new table
        onCreate(db);
    }

    public Cursor ambilId(int id){
        SQLiteDatabase db=getReadableDatabase();
        return db.rawQuery("SELECT * FROM tb_resep WHERE id="+id,null);
    }
}
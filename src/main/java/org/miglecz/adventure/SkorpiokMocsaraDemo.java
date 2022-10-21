package org.miglecz.adventure;

/**
 * http://users.atw.hu/kaland-ok/KJK_05_AskorpiokMocsara.pdf
 */
public class SkorpiokMocsaraDemo {
    public Game instance() {
        return new Game(
            Page.of(1, "Az ösvény, melyen el kell indulnod, igen hosszú,\n" +
                "ugyanis a Skorpiók Mocsara a királyság legtávo-\n" +
                "labbi zugában fekszik, a nyugati végeken. Utad\n" +
                "során sok olyan élményben lesz részed, amelyet\n" +
                "egy kevésbé tapasztalt vándor kockázatos kalan-\n" +
                "dorságnak ítélne. Számodra viszont az Orkokkal\n" +
                "vagy Goblinokkal való küzdelem, a gonosz varázs-\n" +
                "lók megsemmisítése vagy az óriásfarkasok letepe-\n" +
                "rése megszokott napi feladat. Nyugat felé haladva\n" +
                "észreveszed, hogy a környező hegyeket lassan\n" +
                "dombok váltják fel, majd azokat sík mezők, melyek\n" +
                "egy idő után nedvessé, süppedőssé válnak. Már\n" +
                "tudod, hogy a Skorpiók Mocsara nem lehet mesz-\n" +
                "sze!\n" +
                "Amikor elérsz Láphatár városkába, senki sem fi-\n" +
                "gyel fel rád. Sok utazó megfordul itt. Erős sisakod\n" +
                "és éles kardod elárulja ugyan, hogy jó harcos\n" +
                "vagy, akivel nem lehet tréfálni, de ez itt megszokott\n" +
                "dolog. Amikor a helyi kocsmában előadod a terve-\n" +
                "det, hogy felkutatod a mocsarat, hallgatóid meg-\n" +
                "döbbennek. Köréd gyűlnek, miközben széttologat-\n" +
                "ják az ütött-kopott lócákat, hogy helyet csináljanak\n" +
                "neked. A mocsár, mondják, sok hozzád hasonló\n" +
                "fickó csontjait őrzi! Nemcsak úttalan útjai meg az\n" +
                "ott élő férgek, szörnyek és éhező banditák miatt\n" +
                "veszélyes az a hely, hanem a magukat Mesterek-\n" +
                "nek nevező varázslók egy csoportja miatt is, akik a\n" +
                "Skorpiók Mocsarát saját tulajdonuknak tekintik.\n" +
                "Egyikük - egy jól megtermett, pocakos férfi, akit két\n" +
                "hatalmas szürke farkas kísér - itt járt ebben a\n" +
                "kocsmában a múlt héten. Nem beszélt sokat, me-\n" +
                "sélik a téged körülvevők, de nem úgy festett, mint\n" +
                "aki szívesen fogadna holmi betolakodót! A beszél-\n" +
                "getés során egyre inkább úgy érzed: a városka\n" +
                "lakói meg vannak győződve róla, hogy a mocsár-\n" +
                "ban leled halálodat. „Nem engedhetjük, hogy oda\n" +
                "menj!” - mondják. Egyikük még azt is meg meré-\n" +
                "szeli tenni, hogy a válladra téve kérges kezét visz-\n" +
                "szatartson, amikor elindulsz az ajtó felé. Mit te-\n" +
                "szel?", Option.of(48, "Párbajra hívod ki őket arcátlanságuk\n" +
                "miatt?"), Option.of(95, "Udvariasan közlöd velük, hogy elhatározásodon\n" +
                "nem változtatsz?")),
            Page.of(48, "Megmarkolod a kardodat, és harcra szólítod fel\n" +
                "őket. Nem ijednek meg tőled, még csak nem is\n" +
                "csodálkoznak rajtad; csupán csak kinevetnek. „Mi\n" +
                "nem vagyunk harcos népség, egyszerű falusi em-\n" +
                "berek vagyunk! - mondják. - De az olyan fickó,\n" +
                "mint te, aki a kardját mindig készenlétben tartja,\n" +
                "valóban azok közé a bajkeresők közé való, akik ott\n" +
                "vannak a nagy mocsárban. Nem marasztalunk\n" +
                "tovább!” Zavartan állsz. Vesztesz 1 SZERENCSE\n" +
                "pontot, amiért ilyen támadóan viselkedtél ezekkel a\n" +
                "békés emberekkel szemben!", Option.of(95, "Lapozz a 95-re")),
            Page.of(95, "A városka lakói rosszallóan ingatják ugyan a fejü-\n" +
                "ket, amikor elindulsz az ajtó felé, de már nem tar-\n" +
                "tóztatnak. Ám mielőtt elérnéd az ajtót, egyikük\n" +
                "elállja az utadat. Alacsony, középkorú, fekete\n" +
                "kecskeszakállas férfi áll előtted. Először farmernak\n" +
                "nézed, de úgy látod, nagyobb érdeklődést mutat\n" +
                "irántad, mint azt egy közönséges farmer tenné.\n" +
                "Megfogja a karodat, és a kocsma egyik sarkában\n" +
                "lévő asztalhoz vezet. A többiek tovább beszélget-\n" +
                "nek, te pedig kíváncsian várod, milyen mondaniva-\n" +
                "lója van számodra ennek a nyugodt férfinak. Be-\n" +
                "mutatkozik: „Gronarnak hívnak - mondja. - Ha va-\n" +
                "lóban szembe akarsz szállni a mocsár uraival,\n" +
                "valami komoly célt kell kitűznöd magad elé, nem\n" +
                "elegendő az, hogy vaktában feltérképezd a mocsa-\n" +
                "rat, vagy hogy megküzdj az ott élő fenevadakkal.", Option.of(240, "Ha igazat adsz neki, lapozz a 240-re."), Option.of(122, "Ha nem,\n" +
                "lapozz a 122-re.")),
            Page.of(240, "Igazat adsz Gronarnak. Utad sokkal érdekesebb\n" +
                "lesz, ha meghatározott küldetésed van. A férfi\n" +
                "helyeslően bólogatva így folytatja: „Jelenleg három\n" +
                "férfi tartózkodik itt a városkában, akik egyedül nem\n" +
                "tudnak elmenni a mocsárba. Mindannyiuknak\n" +
                "szükségük van egy olyan harcosra, aki hajlandó a\n" +
                "küzdelemre az ő oldalukon. Hármuk közül az első\n" +
                "egy Öreg varázsló, aki a Jó szolgálatában áll.”\n" +
                "Szünetet tartva jókorát húz a korsójából.", Option.of(205, "Ha végig\n" +
                "akarod hallgatni mondandóját, lapozz a 205-re."), Option.of(155, "Ha\n" +
                "félbeszakítod azzal, hogy te csak a Jót vagy haj-\n" +
                "landó szolgálni, lapozz a 155-re.")),
            Page.of(122, "Érveidet azonnal elutasítja. „A küldetés fontos\n" +
                "dolog, barátom - mondja -‚ de a Skorpiók Mocsa-\n" +
                "rában jó, ha az ember hatásos varázslatokkal is\n" +
                "rendelkezik. Bátor harcosnak látszol, és talán némi\n" +
                "varázsszered is van, de attól félek, hogy varázsló\n" +
                "segítsége nélkül soha többé nem fogod megpillan-\n" +
                "tani a napvilágot, ha egyszer beteszed a lábad a\n" +
                "Skorpiók Mocsarába!” Érzed, hogy őszintén be-\n" +
                "szél.", Option.of(240, "Ha még többet szeretnél megtudni ettől az\n" +
                "embertől, lapozz a 240-re."), Option.of(296, "a inkább elbúcsúzol\n" +
                "tőle és nekivágsz egyedül a mocsárnak, lapozz\n" +
                "296-ra.")),
            Page.of(296, "Bátran nekivágsz a mocsárnak. Bátor vagy,\n" +
                "ugyanakkor vakmerő is. Bár a varázserejű Réz-\n" +
                "gyűrű megvéd attól, hogy eltévedj, hamarosan\n" +
                "elfáradsz, így mindenféle ismert és ismeretlen\n" +
                "teremtmények megsebesítenek. Rájössz, hogy ha\n" +
                "nem szerzel magadnak még több varázsszert,\n" +
                "kevés reményed marad rá, hogy megmenekülj a\n" +
                "mocsárból, és nem lesz rá lehetőséged, hogy\n" +
                "megismerd annak titkát. Tedd próbára a SZE-\n" +
                "RENCSÉDET", Option.of(272, "Ha SZERENCSÉD van, lapozz a\n" +
                "272-re."), Option.of(3, "Ha nincs SZERENCSÉD, lapozz a 3-ra.")),
            Page.of(205, "Gronar újabb korsó sört rendel magának, és leül a\n" +
                "székére. „Selator a jó varázsló - mondja. - Bakó a\n" +
                "gonosz erőket szolgálja, habár egy magamfajta\n" +
                "egyszerű ember nem tudja igazán megítélni ezeket\n" +
                "a dolgokat. Vasöklű viszont valóban furcsa fickó.\n" +
                "Sokat nem lehet tudni róla, de a hatalma nagy.\n" +
                "Mindhárman egy bajnokot keresnek, akinek az\n" +
                "oldalán behatolhatnak a Skorpiók Mocsarába.\n" +
                "Ennél többet csak úgy tudhatsz meg róluk, ha\n" +
                "meglátogatod őket.” Mit teszel?", Option.of(335, "Selatorhoz, a jó varázslóhoz\n" +
                "mész?"), Option.of(255, "Elfogadod a gonosz erők segítségét, ha\n" +
                "az haszonnal jár, és felkeresed a\n" +
                "rosszhírű Bakót?"), Option.of(27, "A rejtélyes Vasöklűvel\n" +
                "próbálkozol?")),
            Page.of(155, "Őszintén hangzik, amit mondasz; Gronar bólint, és\n" +
                "mosolyogva így szól: „Vannak emberek, akik kissé\n" +
                "faragatlanok, de mindig készek az igazukért har-\n" +
                "colni. Ilyen a jó Selator is... meg te is, Paladin, bár\n" +
                "még sokat kell tanulnod!” Ebben a pillanatban úgy\n" +
                "látod, mintha Gronar sokkal nagyobb lenne, mint\n" +
                "korábban. Tényleg kereszt lenne a palástjára hí-\n" +
                "mezve? És honnan került elő ez a kard? Kérdez-\n" +
                "getni kezded, ki is ő, ekkor azonban átnyúl az asz-\n" +
                "tal fölött, és megérinti a homlokodat. Szédülni kez-\n" +
                "desz. „Isten áldjon, ifjú Paladin. Menj, és keresd\n" +
                "meg Selatort!” - mondja, és eltűnik a szemed elől.\n" +
                "Nem tudod, vajon az ajtón ment-e ki, vagy egysze-\n" +
                "rűen felszívódott... de a szédülésed gyorsan elmú-\n" +
                "lik, és kezded magad igazán jól érezni. Növeld\n" +
                "Kezdeti SZERENCSE pontjaid számát 2-vel, és", Option.of(335, "lapozz a 335-re.")),
            Page.of(272, "Nagy nehezen visszajutsz a faluba. Fáradt vagy,\n" +
                "és csuromvíz a ruhád, mert beleestél az iszap-\n" +
                "lyukba. Vonj le magadtól 2 SZERENCSE pontot,\n" +
                "és légy hálás a sorsnak, hogy életben maradtál. A\n" +
                "fogadóban meleg fürdőt veszel, és kissé magad-\n" +
                "hoz térsz. Bocsánatot kérsz Gronartól korábbi\n" +
                "hevességedért. Megrázza a fejét, majd óvatosan\n" +
                "elmosolyodik: „Látom, erős vagy és szerencsés,\n" +
                "különben egyáltalán nem jöttél volna vissza!” -\n" +
                "mondja. ", Option.of(205, "Lapozz a 205-re.")),
            Page.of(3, "Alig egy kilométerre a mocsár szélétől véletlenül\n" +
                "belelépsz egy mély gödörbe. Trágya cuppog a\n" +
                "lábad alatt. Képtelen vagy kimászni belőle. Lete-\n" +
                "szed a földre a kardodat, és egy indát kapsz el,\n" +
                "melyen megpróbálsz felhúzódzkodni. Az inda\n" +
                "azonban leszakad, és te jó mélyen visszapoty-\n" +
                "tyansz a trágyába. Csipogó hangot hallasz a hátad\n" +
                "mögül. Felkapod a kardodat, de ekkor apró éles\n" +
                "fogak vájnak a karodba... és ellepnek a patkányok.\n" +
                "Képtelen vagy menekülni vagy harcolni. Rövide-\n" +
                "sen, miként azt a falusiak megjósolták, csupán a\n" +
                "csontjaid fognak majd csillogni a fák között átszű-\n" +
                "rődő gyér napfényben. Kalandod itt véget ér! Leg-\n" +
                "közelebb vigyél magaddal több varázseszközt!", Option.of(0, "tovább")),
            Page.of(335, "A nehéz öntöttvas lámpák alatt fejedet lehajtva\n" +
                "elhagyod a kocsmát. A kinti fény oly erős, hogy\n" +
                "szinte megvakít egy percre. Elindulsz az úton lefe-\n" +
                "lé, de nem igazán tudod, merre is visz. Az egyik\n" +
                "üzlet ablakán észreveszel egy öregembert, üdvöz-\n" +
                "löd, aztán megkérdezed, nem tudja-e, hogy hol\n" +
                "találod Selatort, a jó varázslót. A tulaj előbb gya-\n" +
                "nakodva szemlél, de aztán barátságosan eligazít.\n" +
                "Nemsokára megint eltévedsz, de egy pirospozsgás\n" +
                "arcú asszony segít. Szemmel láthatólag itt min-\n" +
                "denki tudja, hol lakik Selator. Végül elérsz a falu\n" +
                "szélén egy kis házhoz. Selator alacsony, testes\n" +
                "ember, fehér ingben és vászonnadrágban tesz-\n" +
                "vesz a kertjében, amikor a kerítéséhez érkezel.\n" +
                "Elmeséled, mi járatban vagy. Elmosolyodik, és\n" +
                "megkérdezi, vajon miből gondolod, hogy képes\n" +
                "leszel átjutni a mocsár útvesztőjén.", Option.of(371, "Ha elárulod\n" +
                "neki a gyűrűd titkát, lapozz a 371-re."), Option.of(96, "Ha inkább\n" +
                "megőrzöd a titkodat, lapozz a 96-ra.")),
            Page.of(255, "Bakó egymagában lakik egy várban, a mocsár\n" +
                "közelében. Amikor az iránt érdeklődsz, hogy merre\n" +
                "is van ez a vár, senki sem óhajt szóba állni veled;\n" +
                "egy öregasszony szemmel ver, egy fiatal lány pe-\n" +
                "dig elfut előled. Végül is a piactéren egy szikár\n" +
                "Útonálló útbaigazít, és elindulsz, hogy találkozz\n" +
                "azzal a varázslóval, akitől mindenki reszket. Amint\n" +
                "megpillantod a várát, Rézgyűrűd melegedni kezd.\n" +
                "Bakó gonosz ember - valóban nagyon gonosz! Ez\n" +
                "az érzésed csak nő, amint közeledsz a sötét, sok-\n" +
                "tornyú, különös boltívekkel és rémisztő szobrokkal\n" +
                "díszített várhoz", Option.of(40, "Ha felmész a vár kapujához, la-\n" +
                "pozz a 40-re."), Option.of(139, "Ha inkább visszafordulsz a faluba,\n" +
                "lapozz a 139-re.")),
            Page.of(27, "Gronar azt ajánlja neked, hogy menj és keresd\n" +
                "meg Vasöklűt a piactéren. Amint beérsz az utcák\n" +
                "és üzletek sűrűjébe, eltévedsz. Többször kérsz\n" +
                "útbaigazítást, amikor végül egy nevetgélő fiúcsa-\n" +
                "pat elkísér a piactér szélén álló nagy házhoz. Be-\n" +
                "kopogsz - és egy Goblin válaszol! De nem egy\n" +
                "olyan Goblin-varázsló, akik ellen harcoltál, hanem\n" +
                "egy Goblin-szolgálólány. Bevezet a könyvtárszo-\n" +
                "bába, ahol Vasöklűt látod, amint a székén ül. Ez az\n" +
                "egyik legfurcsább ember, akit valaha láttál... Na-\n" +
                "gyon magas és iszonyúan kövér, a-szakállát gon-\n" +
                "dosan copfokba fonta, az arca pirospozsgás. El-\n" +
                "mondod, mi járatban vagy, és megkérdezed,\n" +
                "nincs-e szüksége rád. „De van! - mennydörgi. - De\n" +
                "miből gondolod, hogy túléled a Skorpiók Mocsarát,\n" +
                "ahol annyian meghaltak már?”", Option.of(2, "Ha elmondod neki\n" +
                "találkozásodat az öregasszonnyal és azt is, hogy\n" +
                "milyen ereje van az ujjadon lévő Rézgyűrűnek,\n" +
                "lapozz a 2-re."), Option.of(173, "Ha egyszerűen csak elmosolyodsz\n" +
                "és közlöd, hogy kipróbált harcos vagy, lapozz a\n" +
                "173-ra.")),
            Page.of(371, "„Te vagy az, akire vártam! Tedd, amit tenned kell! -\n" +
                "mondja boldogan mosolyogva, s téged büszkeség\n" +
                "fog el. Majd így folytatja: - Elmondom, amit tudok!\n" +
                "Egyszer régen egy Antherica nevű növény nőtt\n" +
                "ezen a vidéken. Gyógyító erejű volt, és a Jó va-\n" +
                "rázslók nélkülözhetetlen segédeszköze. A Gonosz\n" +
                "varázslók viszont, ahol csak tudták, mindenütt\n" +
                "kiirtották ezt a számukra szükségtelen növényt.\n" +
                "Mindenki úgy tudja, hogy nem maradt belőle egy\n" +
                "sem. Én viszont a tudományom és a kristálygöm-\n" +
                "böm segítségével rájöttem, hogy egyetlenegy\n" +
                "Antherica még létezik a Skorpiók Mocsarának a\n" +
                "mélyén. Ez alacsony, sötétzöld bokor, fehér virágai\n" +
                "és bíborszínű bogyói vannak. Ha csak egyetlenegy\n" +
                "bogyóját is elhoznád nekem, varázserőmmel ké-\n" +
                "pes lennék újra meghonosítani mindenütt az\n" +
                "Anthericát, hogy a Jó varázslók hasznát vehessék.\n" +
                "A mocsárban - folytatja a varázsló - számos kincs\n" +
                "van, amit ha megtalálsz, a tiéd lehet. Én csupán az\n" +
                "Antherica egyetlen bogyójára tartok igényt. Bár\n" +
                "egy olyan jól felfegyverzett harcos, mint te, képes\n" +
                "túlélni a mocsár borzalmait, mégis tudnod kell,\n" +
                "hogy azon a vidéken sok olyan gonosz erő uralko-\n" +
                "dik, amely ellen a kardod mit sem ér. Nem tudlak\n" +
                "varázslatokra megtanítani, de valamit azért tehetek\n" +
                "érted. Adok neked hat varázsgolyót. Mindegyikkel\n" +
                "egyszer tudsz majd varázsolni, de ha az összeset\n" +
                "felhasználtad, akkor már csak éles kardodra és\n" +
                "csavaros eszedre hagyatkozhatsz!” Megbeszéled\n" +
                "Selatorral, melyik varázslatot használd. Hat külön-\n" +
                "böző varázslatot választhatsz a VARÁZSLATOK\n" +
                "listájáról, melyet a könyv elején találsz - de csak a\n" +
                "SEMLEGES, illetve jó varázslatok közül választ-\n" +
                "hatsz. Nem választhatsz GONOSZ varázslatot!\n" +
                "Jegyezd fel választott varázslataidat a Kalandla-\n" +
                "podra.\n" +
                "A kapott varázsgolyókat elrejted a zsákod mélyén,\n" +
                "és Selatornak búcsút intve elindulsz a mocsár felé.\n" +
                "Bár utad veszélyes lesz, a varázsló sok tanácsa és\n" +
                "kedvessége felbátorít. Feladatod a következő: meg\n" +
                "kell találnod az Anthericát, és egy bogyóját el kell\n" +
                "hoznod Selatornak.", Option.of(9, "Lapozz a 9-re, és vágj neki a\n" +
                "kalandnak!")),
            Page.of(96, "", Option.of(0, "")),
            Page.of(40, "", Option.of(0, "")),
            Page.of(139, "", Option.of(0, "")),
            Page.of(2, "", Option.of(0, "")),
            Page.of(173, "", Option.of(0, "")),
            Page.of(9, "", Option.of(0, "")),
            //Page.of(0, "", Option.of(0, "")),
            //Page.of(0, "", Option.of(0, "")),
            //Page.of(0, "", Option.of(0, "")),
            //Page.of(0, "", Option.of(0, "")),
            //Page.of(0, "", Option.of(0, "")),
            //Page.of(0, "", Option.of(0, "")),

            Page.of(0, "játék vége")
        );
    }
}

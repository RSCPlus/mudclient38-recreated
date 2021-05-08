import jagex.f;
import jagex.o;
import java.io.IOException;

public class r {
  public final int sfb = 12345678;
  public static int tfb;
  public static int ufb;
  public static String[][] vfb;
  public static String[] wfb;
  public static String[] xfb;
  public static String[] yfb;
  public static int[] zfb;
  public static int[] agb;
  public static int[] bgb;
  public static int[] cgb;
  public static int[] dgb;
  public static int[] egb;
  public static int[] fgb;
  public static int[] ggb;
  public static int[] hgb;
  public static int[] igb;
  public static int[] jgb;
  public static int[] kgb;
  public static int[] lgb;
  public static int[] mgb;
  public static int[] ngb;
  public static int ogb;
  public static String[][] pgb;
  public static String[] qgb;
  public static int[] rgb;
  public static int[] sgb;
  public static int[] tgb;
  public static int[] ugb;
  public static int[] vgb;
  public static int[] wgb;
  public static int[] xgb;
  public static int[] ygb;
  public static int[] zgb;
  public static int[] ahb;
  public static int[] bhb;
  public static int[] chb;
  public static int[] dhb;
  public static int[] ehb;
  public static int[] fhb;
  public static int[][] ghb;
  public static int[] hhb;
  public static int[] ihb;
  public static int[] jhb;
  public static int[] khb;
  public static int[] lhb;
  public static int[] mhb;
  public static int[] nhb;
  public static int[] ohb;
  public static int[] phb;
  public static int[][] qhb;
  public static int[][] rhb;
  public static int shb;
  public static String[] thb;
  public static String[] uhb;
  public static int[] vhb;
  public static int[] whb;
  public static int[] xhb;
  public static int[] yhb;
  public static int[] zhb;
  public static int aib;
  public static String[][] bib;
  public static String[] cib;
  public static String[] dib;
  public static String[] eib;
  public static int[] fib;
  public static int[] gib;
  public static int[] hib;
  public static int[] iib;
  public static int[] jib;
  public static int[] kib;
  public static int lib;
  public static String[][] mib;
  public static String[] nib;
  public static String[] oib;
  public static String[] pib;
  public static int[] qib;
  public static int[] rib;
  public static int[] sib;
  public static int[] tib;
  public static int[] uib;
  public static int[] vib;
  public static int wib;
  public static String[] xib;
  public static int[] yib;
  public static int[] zib;
  public static int[] ajb;
  public static int bjb;
  public static String[] cjb;
  public static int[] djb;
  public static int[] ejb;
  public static int[] fjb;
  public static int gjb;
  public static int hjb;
  public static String[] ijb;
  public static String[] jjb;
  public static int[] kjb;
  public static int[] ljb;
  public static int[] mjb;
  public static int[] njb;
  public static int[] ojb;
  public static int[] pjb;
  public static int qjb;
  public static String[] rjb;
  public static String[] sjb;
  public static int[] tjb;
  public static int[] ujb;
  public static int[] vjb;
  public static int[] wjb;
  public static int[][] xjb;
  public static int[][] yjb;
  public static int qkb;
  public static String[] rkb;
  public static String[] skb;
  public static int[] tkb;
  public static int[] ukb;
  public static int[] vkb;
  public static int[] wkb;
  public static int[][] xkb;
  public static int[][] ykb;
  public static int zjb;
  public static String[] akb;
  public static int[] bkb;
  public static int[] ckb;
  public static int[] dkb;
  public static int[] ekb;
  public static int[] fkb;
  public static int[][] gkb;
  public static int[][] hkb;
  public static int[][] ikb;
  static String[] jkb = new String[]{
        "attack", "defense", "strength", "hits", "ranged", "thieving", "influence", "praygood", "prayevil", "goodmagic", "evilmagic",
        "cooking", "tailoring", "woodcutting", "firemaking", "crafting", "smithing", "mining", "herblaw"
  };
  public static String[] kkb = new String[]{"attack", "defense", "damage", "hits", "agression", "bravery", "regenerate", "perception"};
  public static int lkb;
  public static String[] mkb = new String[200];

  public static void uo() {
    try {
      so(new f("../gamedata/config/projectile.txt"));
      ro(new f("../gamedata/config/entity.txt"));
      lo(new f("../gamedata/config/objects.txt"));
      to(new f("../gamedata/config/npc.txt"));
      io(new f("../gamedata/config/location.txt"));
      po(new f("../gamedata/config/boundary.txt"));
      ho(new f("../gamedata/config/roof.txt"));
      ko(new f("../gamedata/config/floor.txt"));
      wo(new f("../gamedata/config/goodspells.txt"));
      yo(new f("../gamedata/config/evilspells.txt"));
      qo(new f("../gamedata/config/shop.txt"));
      vo();
    } catch (IOException var1) {
      System.out.println("Error loading config files");
      var1.printStackTrace();
    }
  }

  public static void oo(byte[] var0) {
    try {
      so(new f(var0, o.mm("projectile.txt", var0)));
      ro(new f(var0, o.mm("entity.txt", var0)));
      lo(new f(var0, o.mm("objects.txt", var0)));
      to(new f(var0, o.mm("npc.txt", var0)));
      io(new f(var0, o.mm("location.txt", var0)));
      po(new f(var0, o.mm("boundary.txt", var0)));
      ho(new f(var0, o.mm("roof.txt", var0)));
      ko(new f(var0, o.mm("floor.txt", var0)));
      wo(new f(var0, o.mm("goodspells.txt", var0)));
      yo(new f(var0, o.mm("evilspells.txt", var0)));
      qo(new f(var0, o.mm("shop.txt", var0)));
      vo();
    } catch (IOException var2) {
      System.out.println("Error loading config files");
      var2.printStackTrace();
    }
  }

  public static void qo(f var0) throws IOException {
    var0.qb();
    int var1 = var0.vb();
    zjb = var1;
    System.out.println("Found " + var1 + " shops");
    akb = new String[var1];
    bkb = new int[var1];
    fkb = new int[var1];
    ckb = new int[var1];
    dkb = new int[var1];
    ekb = new int[var1];
    gkb = new int[var1][40];
    hkb = new int[var1][40];
    ikb = new int[var1][40];

    for (int var2 = 0; var2 < var1; ++var2) {
      var0.qb();
      akb[var2] = var0.wb();
      int var3 = bkb[var2] = var0.vb();
      ckb[var2] = var0.vb();
      dkb[var2] = var0.vb();
      ekb[var2] = var0.vb();
      fkb[var2] = var0.vb();

      for (int var4 = 0; var4 < var3; ++var4) {
        var0.qb();
        gkb[var2][var4] = go(var0.wb());
        hkb[var2][var4] = var0.vb();
        ikb[var2][var4] = var0.vb();
      }
    }
  }

  public static void wo(f var0) throws IOException {
    var0.qb();
    int var1 = var0.vb();
    qjb = var1;
    System.out.println("Found " + var1 + " good skills");
    rjb = new String[var1];
    sjb = new String[var1];
    tjb = new int[var1];
    vjb = new int[var1];
    wjb = new int[var1];
    ujb = new int[var1];
    xjb = new int[var1][];
    yjb = new int[var1][];

    for (int var2 = 0; var2 < var1; ++var2) {
      var0.qb();
      rjb[var2] = var0.wb();
      tjb[var2] = var0.vb();
      sjb[var2] = var0.wb();
      vjb[var2] = var0.vb();
      wjb[var2] = var0.vb();
      var0.qb();
      int var3 = ujb[var2] = var0.vb();
      xjb[var2] = new int[var3];
      yjb[var2] = new int[var3];

      for (int var4 = 0; var4 < var3; ++var4) {
        xjb[var2][var4] = go(var0.wb());
        yjb[var2][var4] = var0.vb();
      }
    }

    var0.xb();
  }
  
  public static void yo(f var0) throws IOException {
	    var0.qb();
	    int var1 = var0.vb();
	    qkb = var1;
	    System.out.println("Found " + var1 + " evil skills");
	    rkb = new String[var1];
	    skb = new String[var1];
	    tkb = new int[var1];
	    vkb = new int[var1];
	    wkb = new int[var1];
	    ukb = new int[var1];
	    xkb = new int[var1][];
	    ykb = new int[var1][];

	    for (int var2 = 0; var2 < var1; ++var2) {
	      var0.qb();
	      rkb[var2] = var0.wb();
	      tkb[var2] = var0.vb();
	      skb[var2] = var0.wb();
	      vkb[var2] = var0.vb();
	      wkb[var2] = var0.vb();
	      var0.qb();
	      int var3 = ukb[var2] = var0.vb();
	      xkb[var2] = new int[var3];
	      ykb[var2] = new int[var3];

	      for (int var4 = 0; var4 < var3; ++var4) {
	        xkb[var2][var4] = go(var0.wb());
	        ykb[var2][var4] = var0.vb();
	      }
	    }

	    var0.xb();
	  }

  public static void so(f var0) throws IOException {
    var0.qb();
    int var1 = var0.vb();
    gjb = var1;
    System.out.println("Found " + var1 + " projectiles");
    ijb = new String[var1];
    jjb = new String[var1];
    kjb = new int[var1];
    ljb = new int[var1];
    mjb = new int[var1];
    njb = new int[var1];
    ojb = new int[var1];
    pjb = new int[var1];

    for (int var2 = 0; var2 < var1; ++var2) {
      var0.qb();
      ijb[var2] = var0.wb();
      kjb[var2] = var0.vb();
      ljb[var2] = var0.vb();
      mjb[var2] = var0.vb();
      njb[var2] = var0.vb();
      jjb[var2] = var0.wb();
      pjb[var2] = var0.vb();
      if (kjb[var2] + 1 > hjb) {
        hjb = kjb[var2] + 1;
      }
    }

    var0.xb();
  }

  public static void vo() {
    for (int var0 = 0; var0 < gjb; ++var0) {
      ojb[var0] = go(jjb[var0]);
    }
  }

  public static void ro(f var0) throws IOException {
    var0.qb();
    int var1 = var0.vb();
    shb = var1;
    System.out.println("Found " + var1 + " entities");
    thb = new String[var1];
    uhb = new String[var1];
    whb = new int[var1];
    vhb = new int[var1];
    xhb = new int[var1];
    yhb = new int[var1];
    zhb = new int[var1];

    for (int var2 = 0; var2 < var1; ++var2) {
      var0.qb();
      thb[var2] = var0.wb();
      uhb[var2] = var0.wb();
      vhb[var2] = var0.rb();
      whb[var2] = var0.vb();
      xhb[var2] = var0.vb();
      yhb[var2] = var0.vb();
    }

    var0.xb();
  }

  public static void to(f var0) throws IOException {
    var0.qb();
    int var1 = var0.vb();
    ogb = var1;
    System.out.println("Found " + var1 + " npcs");
    pgb = new String[var1][];
    qgb = new String[var1];
    rgb = new int[var1];
    sgb = new int[var1];
    tgb = new int[var1];
    ugb = new int[var1];
    vgb = new int[var1];
    wgb = new int[var1];
    xgb = new int[var1];
    ygb = new int[var1];
    zgb = new int[var1];
    ahb = new int[var1];
    bhb = new int[var1];
    chb = new int[var1];
    dhb = new int[var1];
    ehb = new int[var1];
    fhb = new int[var1];
    ghb = new int[var1][12];
    hhb = new int[var1];
    ihb = new int[var1];
    jhb = new int[var1];
    khb = new int[var1];
    lhb = new int[var1];
    mhb = new int[var1];
    nhb = new int[var1];
    ohb = new int[var1];
    phb = new int[var1];
    qhb = new int[var1][];
    rhb = new int[var1][];

    for (int var2 = 0; var2 < var1; ++var2) {
      var0.qb();
      int var3 = var0.vb();
      pgb[var2] = new String[var3];

      for (int var4 = 0; var4 < var3; ++var4) {
        pgb[var2][var4] = var0.wb();
      }

      qgb[var2] = var0.wb();
      var0.qb();
      rgb[var2] = var0.vb();
      sgb[var2] = var0.vb();
      tgb[var2] = var0.vb();
      ugb[var2] = var0.vb();
      vgb[var2] = var0.vb();
      wgb[var2] = var0.vb();
      xgb[var2] = var0.vb();
      ygb[var2] = var0.vb();
      zgb[var2] = var0.vb();
      ahb[var2] = var0.vb();
      bhb[var2] = var0.vb();
      chb[var2] = var0.vb();
      dhb[var2] = var0.vb();
      ehb[var2] = var0.vb();
      fhb[var2] = var0.vb();
      var0.qb();

      for (int var5 = 0; var5 < 12; ++var5) {
        ghb[var2][var5] = no(var0.wb());
      }

      hhb[var2] = var0.rb();
      ihb[var2] = var0.rb();
      jhb[var2] = var0.rb();
      khb[var2] = var0.rb();
      var0.qb();
      lhb[var2] = var0.vb();
      mhb[var2] = var0.vb();
      nhb[var2] = var0.vb();
      ohb[var2] = var0.vb();
      phb[var2] = var0.vb();
      var0.qb();
      int var6 = var0.vb();
      qhb[var2] = new int[var6];
      rhb[var2] = new int[var6];

      for (int var7 = 0; var7 < var6; ++var7) {
        qhb[var2][var7] = go(var0.wb());
        rhb[var2][var7] = var0.vb();
      }
    }

    var0.xb();
  }

  public static void lo(f var0) throws IOException {
    var0.qb();
    int var1 = var0.vb();
    tfb = var1;
    System.out.println("Found " + var1 + " objects");
    vfb = new String[var1][];
    wfb = new String[var1];
    yfb = new String[var1];
    zfb = new int[var1];
    agb = new int[var1];
    bgb = new int[var1];
    cgb = new int[var1];
    dgb = new int[var1];
    egb = new int[var1];
    fgb = new int[var1];
    ggb = new int[var1];
    hgb = new int[var1];
    igb = new int[var1];
    jgb = new int[var1];
    kgb = new int[var1];
    lgb = new int[var1];
    mgb = new int[var1];
    ngb = new int[var1];

    for (int var2 = 0; var2 < var1; ++var2) {
      var0.qb();
      int var3 = var0.vb();
      vfb[var2] = new String[var3];

      for (int var4 = 0; var4 < var3; ++var4) {
        vfb[var2][var4] = var0.wb();
      }

      wfb[var2] = var0.wb();
      var0.qb();
      zfb[var2] = var0.vb();
      if (zfb[var2] >= ufb) {
        ufb = zfb[var2] + 1;
      }

      agb[var2] = var0.vb();
      bgb[var2] = var0.vb();
      yfb[var2] = var0.wb();
      var0.qb();
      cgb[var2] = var0.vb();
      dgb[var2] = var0.vb();
      egb[var2] = var0.vb();
      fgb[var2] = var0.vb();
      ggb[var2] = var0.vb();
      hgb[var2] = var0.vb();
      igb[var2] = jo(var0.wb()) + 1;
      var0.qb();
      jgb[var2] = var0.vb();
      kgb[var2] = no(var0.wb());
      lgb[var2] = var0.rb();
      mgb[var2] = var0.vb();
      ngb[var2] = var0.vb();
    }

    var0.xb();
  }

  public static void io(f var0) throws IOException {
    var0.qb();
    int var1 = var0.vb();
    aib = var1;
    System.out.println("Found " + var1 + " locations");
    bib = new String[var1][];
    cib = new String[var1];
    dib = new String[var1];
    eib = new String[var1];
    fib = new int[var1];
    gib = new int[var1];
    hib = new int[var1];
    iib = new int[var1];
    jib = new int[var1];
    kib = new int[var1];

    for (int var2 = 0; var2 < var1; ++var2) {
      var0.qb();
      int var3 = var0.vb();
      bib[var2] = new String[var3];

      for (int var4 = 0; var4 < var3; ++var4) {
        bib[var2][var4] = var0.wb();
      }

      cib[var2] = var0.wb();
      var0.qb();
      fib[var2] = mo(var0.wb());
      gib[var2] = var0.vb();
      hib[var2] = var0.vb();
      iib[var2] = var0.vb();
      jib[var2] = var0.vb();
      dib[var2] = var0.wb();
      if (dib[var2].equals("_")) {
        dib[var2] = "WalkTo";
      }

      eib[var2] = var0.wb();
      if (eib[var2].equals("_")) {
        eib[var2] = "Examine";
      }

      kib[var2] = var0.vb();
    }

    var0.xb();
  }

  public static void po(f var0) throws IOException {
    var0.qb();
    int var1 = var0.vb();
    lib = var1;
    System.out.println("Found " + var1 + " boundaries");
    mib = new String[var1][];
    nib = new String[var1];
    oib = new String[var1];
    pib = new String[var1];
    qib = new int[var1];
    rib = new int[var1];
    sib = new int[var1];
    tib = new int[var1];
    uib = new int[var1];
    vib = new int[var1];

    for (int var2 = 0; var2 < var1; ++var2) {
      var0.qb();
      int var3 = var0.vb();
      mib[var2] = new String[var3];

      for (int var4 = 0; var4 < var3; ++var4) {
        mib[var2][var4] = var0.wb();
      }

      nib[var2] = var0.wb();
      var0.qb();
      qib[var2] = var0.vb();
      rib[var2] = var0.vb();
      sib[var2] = var0.vb();
      tib[var2] = var0.vb();
      uib[var2] = var0.vb();
      vib[var2] = var0.vb();
      oib[var2] = var0.wb();
      if (oib[var2].equals("_")) {
        oib[var2] = "WalkTo";
      }

      pib[var2] = var0.wb();
      if (pib[var2].equals("_")) {
        pib[var2] = "Examine";
      }
    }

    var0.xb();
  }

  public static void ho(f var0) throws IOException {
    var0.qb();
    int var1 = var0.vb();
    wib = var1;
    System.out.println("Found " + var1 + " roofs");
    xib = new String[var1];
    yib = new int[var1];
    zib = new int[var1];
    ajb = new int[var1];

    for (int var2 = 0; var2 < var1; ++var2) {
      var0.qb();
      xib[var2] = var0.wb();
      yib[var2] = var0.vb();
      zib[var2] = var0.vb();
      ajb[var2] = var0.vb();
    }

    var0.xb();
  }

  public static void ko(f var0) throws IOException {
    var0.qb();
    int var1 = var0.vb();
    bjb = var1;
    System.out.println("Found " + var1 + " floors");
    cjb = new String[var1];
    djb = new int[var1];
    ejb = new int[var1];
    fjb = new int[var1];

    for (int var2 = 0; var2 < var1; ++var2) {
      var0.qb();
      cjb[var2] = var0.wb();
      djb[var2] = var0.vb();
      ejb[var2] = var0.vb();
      fjb[var2] = var0.vb();
    }

    var0.xb();
  }

  public static int no(String var0) {
    if (var0.equalsIgnoreCase("na")) {
      return -1;
    } else {
      for (int var1 = 0; var1 < shb; ++var1) {
        if (var0.equalsIgnoreCase(thb[var1])) {
          return var1;
        }
      }

      System.out.println("WARNING: unable to match entity " + var0);
      return 0;
    }
  }

  public static int mo(String var0) {
    if (var0.equalsIgnoreCase("na")) {
      return 0;
    } else {
      for (int var1 = 0; var1 < lkb; ++var1) {
        if (mkb[var1].equalsIgnoreCase(var0)) {
          return var1;
        }
      }

      mkb[lkb++] = var0;
      return lkb - 1;
    }
  }

  public static int go(String var0) {
    if (var0.equalsIgnoreCase("na")) {
      return 0;
    } else {
      for (int var1 = 0; var1 < tfb; ++var1) {
        for (int var2 = 0; var2 < vfb[var1].length; ++var2) {
          if (vfb[var1][var2].equalsIgnoreCase(var0)) {
            return var1;
          }
        }
      }

      System.out.println("WARNING: unable to match object: " + var0);
      return 0;
    }
  }

  public static int jo(String var0) {
    if (var0.equals("_")) {
      return -1;
    } else {
      for (int var1 = 0; var1 < gjb; ++var1) {
        if (ijb[var1].equalsIgnoreCase(var0)) {
          return var1;
        }
      }

      System.out.println("WARNING: unable to match projectile: " + var0);
      return -1;
    }
  }
}

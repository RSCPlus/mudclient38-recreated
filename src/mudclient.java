import jagex.o;
import jagex.client.e;
import jagex.client.g;
import jagex.client.h;
import jagex.client.i;
import jagex.client.j;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

public class mudclient extends e {
  boolean zs = false;
  int at;
  boolean bt = false;
  boolean ct = true;
  boolean dt = false;
  int et;
  int ft;
  int gt;
  int ht;
  String it = "";
  int jt;
  boolean kt = false;
  int lt;
  int mt;
  boolean nt = false;
  Graphics ot;
  j pt;
  m qt;
  Image rt;
  int st;
  int tt = 128;
  int ut;
  int[] vt = new int[] {0, 1, 2, 1};
  int[] wt = new int[] {0, 1, 2, 1, 0, 0, 0, 0};
  int[] xt = new int[] {0, 0, 0, 0, 0, 1, 2, 1};
  public boolean yt = true;
  public int zt = 128;
  public int au;
  int bu = 512;
  int cu = 334;
  int du = 9;
  int eu;
  int fu;
  int gu = 12345678;
  boolean hu = false;
  int iu;
  int ju;
  int ku;
  int lu = 550;
  boolean mu = false;
  int nu;
  int ou;
  int pu = 1;
  int qu;
  int ru;
  int su;
  int tu;
  int uu = -1;
  int vu;
  int wu;
  int xu = -1;
  int yu;
  int zu;
  int av;
  int bv;
  p cv;
  boolean dv = false;
  int ev;
  int fv;
  int gv;
  int hv;
  int iv;
  int jv = 200;
  boolean kv = false;
  String[] lv;
  String[] mv;
  int[] nv;
  int[] ov;
  int[] pv;
  int[] qv;
  int[] rv;
  int[] sv;
  int[] tv;
  int uv;
  int vv;
  int wv;
  int xv;
  l[] yv;
  l[] zv;
  l aw;
  int bw;
  int cw;
  int dw;
  int ew;
  int fw;
  l[] gw;
  l[] hw;
  int iw;
  int jw;
  int[][] kw;
  int lw;
  int mw;
  int nw;
  int[] ow;
  int[] pw;
  int[] qw;
  int[] rw;
  int sw;
  int tw;
  h[] uw;
  int[] vw;
  int[] ww;
  int[] xw;
  int[] yw;
  h[] zw;
  boolean[] ax;
  int bx;
  int cx;
  h[] dx;
  int[] ex;
  int[] fx;
  int[] gx;
  int[] hx;
  boolean[] ix;
  int jx;
  int[] kx;
  int[] lx;
  int mx;
  int nx;
  int ox;
  int[] px;
  int[] qx;
  int[] rx;
  int sx;
  String tx;
  boolean ux;
  String vx;
  int wx;
  int[] xx;
  int[] yx;
  int zx;
  int[] ay;
  int[] by;
  boolean cy;
  boolean dy;
  int ey;
  int fy;
  boolean gy;
  int hy;
  int iy;
  int[] jy;
  int[] ky;
  int[] ly;
  int my;
  int ny;
  int[] oy;
  int[] py;
  int[] qy;
  String[] sy;
  String[] ty;
  int uy;
  int[] vy;
  boolean wy;
  int xy;
  String[] yy;
  int zy;
  int az;
  int bz;
  String cz;
  String dz;
  String ez;
  String fz;
  int gz;
  int hz;
  int iz;
  int jz;
  g kz;
  int lz;
  int mz;
  int nz;
  int oz;
  int pz;
  int qz;
  String[] rz;
  int[] sz;
  int tz;
  int uz;
  int vz;
  g wz;
  g xz;
  g yz;
  g zz;
  g aab;
  int bab;
  int cab;
  int dab;
  int eab;
  int fab;
  int gab;
  int hab;
  int iab;
  int jab;
  int kab;
  int lab;
  int mab;
  int nab;
  int oab;
  int pab;
  int qab;
  int rab;
  int sab;
  int tab;
  int uab;
  int vab;
  int wab;
  int xab;
  int yab;
  int zab;
  int abb;
  int bbb;
  int cbb;
  int dbb;
  int ebb;
  int fbb;
  int gbb;
  int hbb;
  int ibb;
  int jbb;
  int kbb;
  int lbb;
  int mbb;
  int nbb;
  int obb;
  int pbb;
  int qbb;
  int rbb;
  boolean sbb;
  int tbb;
  int ubb;
  int vbb;
  int wbb;
  int xbb;
  int ybb;
  int zbb;
  int acb;
  public int[] bcb;
  public int[] ccb;
  public int[] dcb;
  g ecb;
  int fcb;
  int gcb;
  g hcb;
  int icb;
  int jcb;
  long kcb;
  int lcb;
  String mcb;
  int ncb;
  int ocb;
  int pcb;
  int qcb;
  int rcb;
  int scb;
  int tcb;
  int ucb;
  int vcb;
  String[] wcb;
  int[] xcb;
  int[] ycb;
  int[] zcb;
  int[] adb;
  int bdb;
  int[] cdb;
  int[] ddb;
  int[] edb;
  int[] fdb;
  int gdb;
  int[] hdb;
  int[] idb;
  int[] jdb;

  public static void yl(String[] var0) {
    mudclient var1 = new mudclient();
    var1.yt = false;
    var1.ui(var1.bu, var1.cu + 22, "Runescape by Andrew Gower", false);
    var1.lq = 10;
  }

  public void yi() {
    if (this.yt) {
      String var1 = this.getDocumentBase().getHost().toLowerCase();
      if (!var1.endsWith("jagex.com") && !var1.endsWith("jagex.co.uk") && !var1.endsWith("jagex.superb.net") && !var1.endsWith("207.228.231.226") && !var1.endsWith("runescape.com") && !var1.endsWith("runescape.co.uk") && !var1.endsWith("64.23.60.47") && !var1.endsWith("penguin.local") && !var1.endsWith("jagex.dnsalias.com")) {
        this.nt = true;
        return;
      }
    }

    super.ad = 43594;
    super.rp = -11;
    e.vc = 500;
    e.uc = false;
    e.xc = 5;
    this.pl();
    this.az = 2000;
    this.zy = this.az + 100;
    this.nw = this.zy + 50;
    this.vz = this.nw + 300;
    this.ot = this.getGraphics();
    this.lj(50);
    this.qt = new m(this.bu, this.cu + 12, 2600, this);
    this.qt.is = this;
    this.qt.kf(0, 0, this.bu, this.cu + 12);
    g.dg = false;
    g.eg = this.zy;
    this.ecb = new g(this.qt, 5);
    int var3 = this.qt.sj - 199;
    byte var2 = 36;
    this.fcb = this.ecb.nc(var3, var2 + 24, 196, 90, 1, 500, true);
    this.hcb = new g(this.qt, 5);
    this.icb = this.hcb.nc(var3, var2 + 40, 196, 126, 1, 500, true);
    this.lk();
    this.wk(true);
    this.pt = new j(this.qt, 15000, 15000, 1000);
    this.pt.yh(this.bu / 2, this.cu / 2, this.bu / 2, this.cu / 2, this.bu, this.du);
    this.pt.dm = 2400;
    this.pt.em = 2400;
    this.pt.fm = 1;
    this.pt.gm = 2300;
    this.pt.xh(-50, -10, -50);
    this.cv = new p(this.pt, this.qt);
    this.cv.ydb = this.az;
    this.zl();
    this.sl();
    this.ml();
    this.gj(100, "Starting game...");
    this.hl();
    this.ik();
    this.al();
    this.vl();
    this.sj();
  }

  public void pl() {
    if (this.qj()) {
      byte[] var1 = null;

      try {
        var1 = this.wi("config" + c.hc + ".jag", "Configuration", 10);
      } catch (IOException var3) {
        System.out.println("Load error:" + var3);
      }

      r.oo(var1);
    } else {
      this.hj(10, "Loading configuration");
      r.uo();
    }
  }

  public void lk() {
    byte[] var1;
    int var2;
    int var3;
    int var4;
    if (this.qj()) {
      var1 = null;

      try {
        var1 = this.wi("media" + c.jc + ".jag", "2d graphics", 20);
      } catch (IOException var5) {
        System.out.println("Load error:" + var5);
      }

      this.qt.eg(var1, o.mm("inv1.tga", var1), this.az, true, false);
      this.qt.cg(var1, o.mm("inv2.tga", var1), this.az + 1, true, 1, 6, false);
      this.qt.eg(var1, o.mm("bubble.tga", var1), this.az + 9, true, false);
      this.qt.eg(var1, o.mm("runescape.tga", var1), this.az + 10, true, false);
      this.qt.jg(var1, o.mm("splat.tga", var1), this.az + 11, true, 3, false);
      this.qt.cg(var1, o.mm("icon.tga", var1), this.az + 14, true, 4, 2, false);
      this.qt.eg(var1, o.mm("hbar.tga", var1), this.az + 22, false, false);
      this.qt.eg(var1, o.mm("hbar2.tga", var1), this.az + 23, true, false);
      this.qt.eg(var1, o.mm("compass.tga", var1), this.az + 24, true, false);
      this.qt.jg(var1, o.mm("scrollbar.tga", var1), this.zy, true, 2, false);
      this.qt.jg(var1, o.mm("corners.tga", var1), this.zy + 2, true, 4, false);
      this.qt.jg(var1, o.mm("arrows.tga", var1), this.zy + 6, true, 2, false);
      this.rt = this.bj(o.lm("hbar.tga", 0, var1));
      var2 = r.ufb;

      for (var3 = 1; var2 > 0; ++var3) {
        var4 = var2;
        var2 -= 30;
        if (var4 > 30) {
          var4 = 30;
        }

        this.qt.cg(var1, o.mm("objects" + var3 + ".tga", var1), this.nw + (var3 - 1) * 30, true, 10, (var4 + 9) / 10, false);
      }

      this.qt.jg(var1, o.mm("projectile.tga", var1), this.vz, true, r.hjb, false);
    } else {
      var1 = new byte[100000];
      this.gj(20, "Loading 2d graphics");

      try {
        o.jm("../gamedata/media/inv1.tga", var1, 100000);
        this.qt.eg(var1, 0, this.az, true, false);
        o.jm("../gamedata/media/inv2.tga", var1, 100000);
        this.qt.cg(var1, 0, this.az + 1, true, 1, 6, false);
        o.jm("../gamedata/media/bubble.tga", var1, 100000);
        this.qt.eg(var1, 0, this.az + 9, true, false);
        o.jm("../gamedata/media/runescape.tga", var1, 100000);
        this.qt.eg(var1, 0, this.az + 10, true, false);
        o.jm("../gamedata/media/splat.tga", var1, 100000);
        this.qt.jg(var1, 0, this.az + 11, true, 3, false);
        o.jm("../gamedata/media/icon.tga", var1, 100000);
        this.qt.cg(var1, 0, this.az + 14, true, 4, 2, false);
        o.jm("../gamedata/media/hbar.tga", var1, 100000);
        this.qt.eg(var1, 0, this.az + 22, false, false);
        this.rt = this.bj(var1);
        o.jm("../gamedata/media/hbar2.tga", var1, 100000);
        this.qt.eg(var1, 0, this.az + 23, true, false);
        o.jm("../gamedata/media/compass.tga", var1, 100000);
        this.qt.eg(var1, 0, this.az + 24, true, false);
        o.jm("../gamedata/media/scrollbar.tga", var1, 100000);
        this.qt.jg(var1, 0, this.zy, true, 2, false);
        o.jm("../gamedata/media/corners.tga", var1, 100000);
        this.qt.jg(var1, 0, this.zy + 2, true, 4, false);
        o.jm("../gamedata/media/arrows.tga", var1, 100000);
        this.qt.jg(var1, 0, this.zy + 6, true, 2, false);
        var2 = r.ufb;

        for (var3 = 1; var2 > 0; ++var3) {
          var4 = var2;
          var2 -= 30;
          if (var4 > 30) {
            var4 = 30;
          }

          o.jm("../gamedata/media/objects" + var3 + ".tga", var1, 100000);
          this.qt.cg(var1, 0, this.nw + (var3 - 1) * 30, true, 10, (var4 + 9) / 10, false);
        }

        o.jm("../gamedata/media/projectile.tga", var1, 100000);
        this.qt.jg(var1, 0, this.vz, true, r.hjb, false);
      } catch (IOException var6) {
        System.out.println("ERROR: in raw media loader");
      }
    }
  }

  public void wk(boolean var1) {
    this.iw = 0;
    this.jw = this.iw;
    byte[] var2 = null;
    if (this.qj() && var1) {
      String var3 = "entity" + c.mc + ".jag";

      try {
        var2 = this.wi(var3, "people and monsters", 30);
      } catch (IOException var10) {
        System.out.println("Load error:" + var10);
      }
    } else {
      this.gj(30, "Loading people and monsters");
    }

    int var11 = 0;

    label68:
    for (int var4 = 0; var4 < r.shb; ++var4) {
      String var5 = r.uhb[var4];

      for (int var6 = 0; var6 < var4; ++var6) {
        if (r.uhb[var6].equalsIgnoreCase(var5)) {
          r.zhb[var4] = r.zhb[var6];
          continue label68;
        }
      }

      if (var1) {
        if (this.qj()) {
          boolean var7 = true;
          if (r.whb[var4] != 0) {
            var7 = false;
          }

          this.qt.jg(o.lm(var5 + ".tga", 0, var2), 0, this.jw, true, 15, var7);
          var11 += 15;
          if (r.xhb[var4] == 1) {
            this.qt.jg(o.lm(var5 + "a.tga", 0, var2), 0, this.jw + 15, true, 3, true);
            var11 += 3;
          }

          if (r.yhb[var4] == 1) {
            this.qt.jg(o.lm(var5 + "f.tga", 0, var2), 0, this.jw + 18, true, 9, true);
            var11 += 9;
          }
        } else {
          try {
            byte[] var12 = new byte[300000];
            o.jm("../gamedata/entity/" + var5 + ".tga", var12, 300000);
            var11 += 15;
            boolean var8 = true;
            if (r.whb[var4] != 0) {
              var8 = false;
            }

            this.qt.jg(var12, 0, this.jw, true, 15, var8);
            if (r.xhb[var4] == 1) {
              o.jm("../gamedata/entity/" + var5 + "a.tga", var12, 300000);
              var11 += 3;
              this.qt.jg(var12, 0, this.jw + 15, true, 3, true);
            }

            if (r.yhb[var4] == 1) {
              o.jm("../gamedata/entity/" + var5 + "f.tga", var12, 300000);
              var11 += 9;
              this.qt.jg(var12, 0, this.jw + 18, true, 9, true);
            }
          } catch (IOException var9) {
            System.out.println("ERROR: in raw entity loader - no:" + var4 + " " + var5);
          }
        }
      }

      r.zhb[var4] = this.jw;
      this.jw += 27;
    }

    System.out.println("Loaded: " + var11 + " frames of animation");
  }

  public void zl() {
    if (this.qj()) {
      this.pt.yg("textures" + c.lc + ".jag", 7, 11, 50, this);
    } else {
      this.gj(50, "Loading textures");
      this.pt.gi("../gamedata/textures");
    }
  }

  public void sl() {
    r.mo("torcha2");
    r.mo("torcha3");
    r.mo("torcha4");
    r.mo("skulltorcha2");
    r.mo("skulltorcha3");
    r.mo("skulltorcha4");
    r.mo("firea2");
    r.mo("firea3");
    if (this.qj()) {
      byte[] var5 = null;

      try {
        var5 = this.wi("models" + c.kc + ".jag", "3d models", 70);
      } catch (IOException var4) {
        System.out.println("Load error:" + var4);
      }

      for (int var2 = 0; var2 < r.lkb; ++var2) {
        int var3 = o.mm(r.mkb[var2] + ".ob2", var5);
        if (var3 != 0) {
          this.zw[var2] = new h(var5, var3);
        } else {
          this.zw[var2] = new h(1, 1);
        }
      }

    } else {
      this.gj(70, "Loading 3d models");

      for (int var1 = 0; var1 < r.lkb; ++var1) {
        this.zw[var1] = new h("../gamedata/models/" + r.mkb[var1] + ".ob2");
      }

    }
  }

  public void ml() {
    if (this.qj()) {
      this.cv.geb = null;

      try {
        this.cv.geb = this.wi("maps" + c.ic + ".jag", "map", 90);
      } catch (IOException var2) {
        System.out.println("Load error:" + var2);
      }
    } else {
      this.cv.udb = false;
    }
  }

  public void hl() {
    this.kz = new g(this.qt, 10);
    this.lz = this.kz.bc(5, 269, 502, 56, 1, 20, true);
    this.mz = this.kz.cc(7, 324, 498, 14, 1, 80, false, true);
    this.nz = this.kz.bc(5, 269, 502, 56, 1, 20, true);
    this.oz = this.kz.bc(5, 269, 502, 56, 1, 20, true);
    this.kz.lc(this.mz);
  }

  public void dj() {
    if (!this.nt) {
      ++this.eu;
      if (this.ut == 0) {
        super.sp = 0;
        this.ck();
      }

      if (this.ut == 1) {
        ++this.jt;
        ++super.sp;
        this.hm();
      }

      if (this.at > 0) {
        --this.at;
      }

      if (this.zs && this.at == 0) {
        this.zs = false;
        super.dd.m();
        this.at = 24;
      }

      super.pq = 0;
      super.rq = 0;
      if (this.gz > 0) {
        --this.gz;
      }

      if (this.hz > 0) {
        --this.hz;
      }

      if (this.iz > 0) {
        --this.iz;
      }

      if (this.jz > 0) {
        --this.jz;
      }

    }
  }

  public void jj() {
    if (this.nt) {
      Graphics var1 = this.getGraphics();
      var1.setColor(Color.black);
      var1.fillRect(0, 0, 512, 356);
      var1.setFont(new Font("Helvetica", 1, 20));
      var1.setColor(Color.white);
      var1.drawString("Error - unable to load game!", 50, 50);
      var1.drawString("To play RuneScape make sure you play from", 50, 100);
      var1.drawString("http://www.runescape.com", 50, 150);
      this.lj(1);
    } else {
      if (this.ut == 0) {
        this.qt.vk = false;
        this.dl();
      }

      if (this.ut == 1) {
        this.qt.vk = true;
        this.cl();
      }

    }
  }

  public void kj() {
    this.mb();
    if (this.qt != null) {
      this.qt.dg();
      this.qt.yj = null;
      this.qt = null;
    }

    if (this.pt != null) {
      this.pt.ni();
      this.pt = null;
    }

    this.zw = null;
    this.uw = null;
    this.dx = null;
    this.yv = null;
    this.zv = null;
    this.gw = null;
    this.hw = null;
    this.aw = null;
    if (this.cv != null) {
      this.cv.xeb = null;
      this.cv.yeb = null;
      this.cv.zeb = null;
      this.cv.afb = null;
      this.cv = null;
    }

    System.gc();
  }

  public void sj() {
    this.ot.drawImage(this.rt, 0, 0, this);
  }

  public void rj(int var1) {
    if (this.ut == 0) {
      if (this.bz == 0) {
        this.wz.ld(var1);
      }

      if (this.bz == 1) {
        this.xz.ld(var1);
      }

      if (this.bz == 2) {
        this.yz.ld(var1);
      }
    }

    if (this.sbb) {
      this.zz.ld(var1);
    }

    if (this.ut == 1) {
      if (this.gt == 0 && this.ht == 0) {
        this.kz.ld(var1);
      }

      if (this.gt == 3 || this.gt == 4) {
        this.gt = 0;
      }
    }

  }

  public void ll() {
    super.dd.g();
    this.zs = true;
    this.ib();
  }

  public void vl() {
    this.ut = 0;
    this.bz = 0;
    this.cz = "";
    this.dz = "";
    this.ez = "Please enter a username:";
    this.fz = "*" + this.cz + "*";
    this.wv = 0;
    this.fw = 0;
  }

  public void bl() {
    super.vq = "";
    super.wq = "";
  }

  public void al() {
    this.zz = new g(this.qt, 100);
    this.zz.gd(256, 10, "Design Your Character", 4, true);
    short var1 = 140;
    byte var2 = 34;
    this.zz.yc(var1, var2, 200, 25);
    this.zz.gd(var1, var2, "Appearance", 4, false);
    int var6 = var2 + 15;
    this.zz.gd(var1 - 55, var6 + 110, "Front", 3, true);
    this.zz.gd(var1, var6 + 110, "Side", 3, true);
    this.zz.gd(var1 + 55, var6 + 110, "Back", 3, true);
    byte var3 = 54;
    var6 += 145;
    this.zz.ic(var1 - var3, var6, 53, 41);
    this.zz.gd(var1 - var3, var6 - 8, "Head", 1, true);
    this.zz.gd(var1 - var3, var6 + 8, "Type", 1, true);
    this.zz.jc(var1 - var3 - 40, var6, g.eg + 7);
    this.yab = this.zz.id(var1 - var3 - 40, var6, 20, 20);
    this.zz.jc(var1 - var3 + 40, var6, g.eg + 6);
    this.zab = this.zz.id(var1 - var3 + 40, var6, 20, 20);
    this.zz.ic(var1 + var3, var6, 53, 41);
    this.zz.gd(var1 + var3, var6 - 8, "Hair", 1, true);
    this.zz.gd(var1 + var3, var6 + 8, "Color", 1, true);
    this.zz.jc(var1 + var3 - 40, var6, g.eg + 7);
    this.abb = this.zz.id(var1 + var3 - 40, var6, 20, 20);
    this.zz.jc(var1 + var3 + 40, var6, g.eg + 6);
    this.bbb = this.zz.id(var1 + var3 + 40, var6, 20, 20);
    var6 += 50;
    this.zz.ic(var1 - var3, var6, 53, 41);
    this.zz.gd(var1 - var3, var6, "Gender", 1, true);
    this.zz.jc(var1 - var3 - 40, var6, g.eg + 7);
    this.cbb = this.zz.id(var1 - var3 - 40, var6, 20, 20);
    this.zz.jc(var1 - var3 + 40, var6, g.eg + 6);
    this.dbb = this.zz.id(var1 - var3 + 40, var6, 20, 20);
    this.zz.ic(var1 + var3, var6, 53, 41);
    this.zz.gd(var1 + var3, var6 - 8, "Top", 1, true);
    this.zz.gd(var1 + var3, var6 + 8, "Color", 1, true);
    this.zz.jc(var1 + var3 - 40, var6, g.eg + 7);
    this.ebb = this.zz.id(var1 + var3 - 40, var6, 20, 20);
    this.zz.jc(var1 + var3 + 40, var6, g.eg + 6);
    this.fbb = this.zz.id(var1 + var3 + 40, var6, 20, 20);
    var6 += 50;
    this.zz.ic(var1 - var3, var6, 53, 41);
    this.zz.gd(var1 - var3, var6 - 8, "Skin", 1, true);
    this.zz.gd(var1 - var3, var6 + 8, "Color", 1, true);
    this.zz.jc(var1 - var3 - 40, var6, g.eg + 7);
    this.gbb = this.zz.id(var1 - var3 - 40, var6, 20, 20);
    this.zz.jc(var1 - var3 + 40, var6, g.eg + 6);
    this.hbb = this.zz.id(var1 - var3 + 40, var6, 20, 20);
    this.zz.ic(var1 + var3, var6, 53, 41);
    this.zz.gd(var1 + var3, var6 - 8, "Bottom", 1, true);
    this.zz.gd(var1 + var3, var6 + 8, "Color", 1, true);
    this.zz.jc(var1 + var3 - 40, var6, g.eg + 7);
    this.ibb = this.zz.id(var1 + var3 - 40, var6, 20, 20);
    this.zz.jc(var1 + var3 + 40, var6, g.eg + 6);
    this.jbb = this.zz.id(var1 + var3 + 40, var6, 20, 20);
    var1 = 372;
    var2 = 35;
    this.zz.yc(var1, var2, 200, 25);
    this.zz.gd(var1, var2, "Character Type", 4, false);
    var6 = var2 + 22;
    this.zz.gd(var1, var6, "Each character type has different starting", 0, true);
    var6 += 13;
    this.zz.gd(var1, var6, "bonuses. But the choice you make here", 0, true);
    var6 += 13;
    this.zz.gd(var1, var6, "isn't permanent, and will change depending", 0, true);
    var6 += 13;
    this.zz.gd(var1, var6, "on how you play the game.", 0, true);
    var6 += 73;
    this.zz.ic(var1, var6, 215, 125);
    String[] var4 = new String[]{"Adventurer", "Warrior", "Wizard", "Necromancer", "Ranger"};
    this.lbb = this.zz.ac(var1, var6 + 2, var4, 3, true);
    var6 += 75;
    this.zz.ic(var1, var6 + 21, 215, 60);
    this.zz.gd(var1, var6, "Do you wish to be able to fight with other", 0, true);
    var6 += 13;
    this.zz.gd(var1, var6, "players? Warning! If you choose 'yes' then", 0, true);
    var6 += 13;
    this.zz.gd(var1, var6, "other players will be able to attack you too!", 0, true);
    var6 += 13;
    String[] var5 = new String[]{"No thanks", "Yes I'll fight"};
    this.mbb = this.zz.qc(var1, var6, var5, 1, true);
    var6 += 32;
    this.zz.yc(var1, var6, 200, 30);
    this.zz.gd(var1, var6, "Start Game", 4, false);
    this.kbb = this.zz.id(var1, var6, 200, 30);
  }

  public void ek() {
    this.qt.rk = false;
    this.qt.df();
    this.zz.tc(0, 0, this.bu, this.cu);
    this.zz.fc();
    short var1 = 140;
    byte var2 = 50;
    this.qt.xf(var1 - 32 - 55, var2, 64, 102, r.zhb[this.vbb], this.bcb[this.ybb]);
    this.qt.pf(var1 - 32 - 55, var2, 64, 102, r.zhb[this.ubb], this.bcb[this.xbb], this.dcb[this.zbb], 0, false);
    this.qt.pf(var1 - 32 - 55, var2, 64, 102, r.zhb[this.tbb], this.ccb[this.wbb], this.dcb[this.zbb], 0, false);
    this.qt.xf(var1 - 32, var2, 64, 102, r.zhb[this.vbb] + 6, this.bcb[this.ybb]);
    this.qt.pf(var1 - 32, var2, 64, 102, r.zhb[this.ubb] + 6, this.bcb[this.xbb], this.dcb[this.zbb], 0, false);
    this.qt.pf(var1 - 32, var2, 64, 102, r.zhb[this.tbb] + 6, this.ccb[this.wbb], this.dcb[this.zbb], 0, false);
    this.qt.xf(var1 - 32 + 55, var2, 64, 102, r.zhb[this.vbb] + 12, this.bcb[this.ybb]);
    this.qt.pf(var1 - 32 + 55, var2, 64, 102, r.zhb[this.ubb] + 12, this.bcb[this.xbb], this.dcb[this.zbb], 0, false);
    this.qt.pf(var1 - 32 + 55, var2, 64, 102, r.zhb[this.tbb] + 12, this.ccb[this.wbb], this.dcb[this.zbb], 0, false);
    this.qt.rg(0, this.cu, this.az + 22);
    this.qt.cf(this.ot, 0, 11);
  }

  public void im() {
    this.zz.md(super.mq, super.nq, super.pq, super.oq);
    if (this.zz.od(this.yab)) {
      do {
        do {
          this.tbb = (this.tbb - 1 + r.shb) % r.shb;
        } while ((r.whb[this.tbb] & 3) != 1);
      } while ((r.whb[this.tbb] & 4 * this.acb) == 0);
    }

    if (this.zz.od(this.zab)) {
      do {
        do {
          this.tbb = (this.tbb + 1) % r.shb;
        } while ((r.whb[this.tbb] & 3) != 1);
      } while ((r.whb[this.tbb] & 4 * this.acb) == 0);
    }

    if (this.zz.od(this.abb)) {
      this.wbb = (this.wbb - 1 + this.ccb.length) % this.ccb.length;
    }

    if (this.zz.od(this.bbb)) {
      this.wbb = (this.wbb + 1) % this.ccb.length;
    }

    if (this.zz.od(this.cbb) || this.zz.od(this.dbb)) {
      for (this.acb = 3 - this.acb; (r.whb[this.tbb] & 3) != 1 || (r.whb[this.tbb] & 4 * this.acb) == 0; this.tbb = (this.tbb + 1) % r.shb) {
        ;
      }

      while ((r.whb[this.ubb] & 3) != 2 || (r.whb[this.ubb] & 4 * this.acb) == 0) {
        this.ubb = (this.ubb + 1) % r.shb;
      }
    }

    if (this.zz.od(this.ebb)) {
      this.xbb = (this.xbb - 1 + this.bcb.length) % this.bcb.length;
    }

    if (this.zz.od(this.fbb)) {
      this.xbb = (this.xbb + 1) % this.bcb.length;
    }

    if (this.zz.od(this.gbb)) {
      this.zbb = (this.zbb - 1 + this.dcb.length) % this.dcb.length;
    }

    if (this.zz.od(this.hbb)) {
      this.zbb = (this.zbb + 1) % this.dcb.length;
    }

    if (this.zz.od(this.ibb)) {
      this.ybb = (this.ybb - 1 + this.bcb.length) % this.bcb.length;
    }

    if (this.zz.od(this.jbb)) {
      this.ybb = (this.ybb + 1) % this.bcb.length;
    }

    if (this.zz.od(this.kbb)) {
      super.dd.i(236);
      super.dd.n(this.acb);
      super.dd.n(this.tbb);
      super.dd.n(this.ubb);
      super.dd.n(this.vbb);
      super.dd.n(this.wbb);
      super.dd.n(this.xbb);
      super.dd.n(this.ybb);
      super.dd.n(this.zbb);
      super.dd.n(this.zz.rc(this.lbb));
      super.dd.n(this.zz.rc(this.mbb));
      super.dd.e();
      this.sbb = false;
    }

  }

  public void ik() {
    this.wz = new g(this.qt, 50);
    byte var1 = 35;
    this.wz.gd(250, 200 + var1, "Click on an option", 5, true);
    this.wz.yc(150, 240 + var1, 120, 35);
    this.wz.yc(350, 240 + var1, 120, 35);
    this.wz.gd(150, 240 + var1, "New User", 5, false);
    this.wz.gd(350, 240 + var1, "Existing User", 5, false);
    this.bab = this.wz.id(150, 240 + var1, 120, 35);
    this.cab = this.wz.id(350, 240 + var1, 120, 35);
    var1 = 60;
    byte var2 = 110;
    boolean var3 = false;
    this.xz = new g(this.qt, 50);
    this.xz.yc(250, var1 + 17, 420, 34);
    this.xz.gd(250, var1 + 8, "Choose a Username (This is the name other users will see)", 4, var3);
    this.mab = this.xz.vc(250, var1 + 25, 200, 40, 4, 12, false, var3);
    int var5 = var1 + 40;
    this.xz.yc(250, var5 + 17, 420, 34);
    this.xz.gd(250, var5 + 8, "Choose a Password (You will require this to login)", 4, var3);
    this.oab = this.xz.vc(250, var5 + 25, 200, 40, 4, 12, false, var3);
    var5 += 40;
    this.xz.yc(250, var5 + 17, 420, 34);
    this.xz.gd(250, var5 + 8, "E-mail address", 4, var3);
    this.nab = this.xz.vc(250, var5 + 25, 200, 40, 4, 40, false, var3);
    var5 += 40;
    this.xz.yc(250, var5 + 22, 420, 44);
    this.xz.gd(250, var5 + 7, "Do you want to receive our free weekly newsletter? Get news of the latest", 1, var3);
    this.xz.gd(250, var5 + 21, "improvements, new-quests!, hints+tips, hiscores, special-events! etc...", 1, var3);
    String[] var4 = new String[]{"Yes sounds great!", "No-thanks"};
    this.iab = this.xz.qc(250, var5 + 35, var4, 1, var3);
    var5 += 50;
    this.xz.yc(250 - var2 + 50 - 15, var5 + 17, 270, 34);
    this.dab = this.xz.gd(250 - var2 + 50 - 15, var5 + 8, "To create an account please enter", 4, true);
    this.eab = this.xz.gd(250 - var2 + 50 - 15, var5 + 25, "all the requested details", 4, true);
    this.xz.yc(350, var5 + 17, 70, 34);
    this.xz.gd(350, var5 + 17, "Submit", 5, var3);
    this.lab = this.xz.id(335, var5 + 17, 100, 34);
    this.xz.yc(425, var5 + 17, 70, 34);
    this.xz.gd(425, var5 + 17, "Cancel", 5, var3);
    this.kab = this.xz.id(425, var5 + 17, 100, 34);
    this.xz.lc(this.mab);
    this.yz = new g(this.qt, 50);
    var1 = 83;
    this.yz.yc(250, var1, 300, 40);
    this.pab = this.yz.gd(250, var1 - 10, "Please enter your", 5, true);
    this.qab = this.yz.gd(250, var1 + 10, "username and password", 5, true);
    var5 = var1 + 60;
    this.yz.yc(250, var5, 200, 40);
    this.yz.gd(250, var5 - 10, "Username:", 4, var3);
    this.rab = this.yz.vc(250, var5 + 10, 200, 40, 4, 12, false, var3);
    var5 += 60;
    this.yz.yc(250, var5, 200, 40);
    this.yz.gd(250, var5 - 10, "Password:", 4, var3);
    this.sab = this.yz.vc(250, var5 + 10, 200, 40, 4, 20, true, var3);
    var5 += 60;
    var2 = 70;
    this.yz.yc(250 - var2, var5, 110, 40);
    this.yz.gd(250 - var2, var5, "Ok", 4, var3);
    this.tab = this.yz.id(250 - var2, var5, 110, 40);
    this.yz.yc(250 + var2, var5, 110, 40);
    this.yz.gd(250 + var2, var5, "Cancel", 4, var3);
    this.uab = this.yz.id(250 + var2, var5, 110, 40);
    this.yz.lc(this.rab);
    this.aab = new g(this.qt, 50);
    var1 = 20;
    this.aab.gd(250, var1, "Runescape-Rules / Terms+Conditions", 5, true);
    var5 = var1 + 30;
    this.aab.gc(40, var5 - 10, 420, 220);
    this.pbb = this.aab.bc(50, var5, 400, 200, 1, 1000, true);
    this.em(this.aab, this.pbb);
    var5 += 240;
    this.aab.yc(120, var5, 170, 50);
    this.aab.gd(120, var5 - 10, "I have read the terms", 1, false);
    this.aab.gd(120, var5, "and conditions above", 1, false);
    this.aab.gd(120, var5 + 10, "And I Agree", 1, false);
    this.nbb = this.aab.id(120, var5, 170, 50);
    this.aab.yc(380, var5, 170, 50);
    this.aab.gd(380, var5, "I do not agree", 1, false);
    this.obb = this.aab.id(380, var5, 170, 50);
  }

  public void dl() {
    this.qt.rk = false;
    this.qt.df();
    if (this.bz == 0) {
      this.qt._if(256, 95, this.az + 10);
    }

    if (this.bz == 0) {
      this.wz.tc(0, 0, this.bu, this.cu);
      this.wz.fc();
    }

    if (this.bz == 1) {
      this.xz.tc(0, 0, this.bu, this.cu);
      this.xz.fc();
    }

    if (this.bz == 2) {
      this.yz.tc(0, 0, this.bu, this.cu);
      this.yz.fc();
    }

    if (this.bz == 3) {
      this.aab.tc(0, 0, this.bu, this.cu);
      this.aab.fc();
    }

    this.qt.rg(0, this.cu, this.az + 22);
    this.qt.cf(this.ot, 0, 11);
  }

  public void ck() {
    if (this.bz == 0) {
      this.wz.md(super.mq, super.nq, super.pq, super.oq);
      if (this.wz.od(this.bab)) {
        this.bz = 3;
      }

      if (this.wz.od(this.cab)) {
        this.bz = 2;
        this.yz.hd(this.pab, "Please enter your");
        this.yz.hd(this.qab, "username and password");
        this.yz.hd(this.rab, "");
        this.yz.hd(this.sab, "");
        this.yz.lc(this.rab);
        return;
      }
    } else if (this.bz == 1) {
      this.xz.md(super.mq, super.nq, super.pq, super.oq);
      if (this.xz.od(this.mab)) {
        this.xz.lc(this.oab);
      }

      if (this.xz.od(this.oab)) {
        this.xz.lc(this.nab);
      }

      if (this.xz.od(this.nab)) {
        this.xz.lc(this.mab);
      }

      if (this.xz.od(this.kab)) {
        this.bz = 0;
      }

      if (this.xz.od(this.lab)) {
        if (this.xz.oc(this.mab) != null && this.xz.oc(this.mab).length() == 0 || this.xz.oc(this.nab) != null && this.xz.oc(this.nab).length() == 0 || this.xz.oc(this.oab) != null && this.xz.oc(this.oab).length() == 0) {
          this.xz.hd(this.dab, "Please fill in ALL requested");
          this.xz.hd(this.eab, "information to continue!");
          return;
        }

        this.xz.hd(this.dab, "Please wait...");
        this.xz.hd(this.eab, "Creating new account");
        this.dl();
        this.pj();
        this.xz.oc(this.fab);
        this.xz.oc(this.gab);
        String var1 = this.xz.oc(this.mab);
        String var2 = this.xz.oc(this.oab);
        String var3 = this.xz.oc(this.nab);
        int var4 = this.xz.rc(this.jab);
        int var5 = this.xz.rc(this.iab);
        int var6 = 0;
        String var7 = this.xz.oc(this.hab);

        try {
          var6 = Integer.parseInt(var7);
        } catch (Exception var8) {
          ;
        }

        this.db(var1, var2, var3, var4, var6, var5);
        return;
      }
    } else {
      if (this.bz == 2) {
        this.yz.md(super.mq, super.nq, super.pq, super.oq);
        if (this.yz.od(this.uab)) {
          this.bz = 0;
        }

        if (this.yz.od(this.rab)) {
          this.yz.lc(this.sab);
        }

        if (this.yz.od(this.sab) || this.yz.od(this.tab)) {
          this.cz = this.yz.oc(this.rab);
          this.dz = this.yz.oc(this.sab);
          this.fb(this.cz, this.dz);
        }

        return;
      }

      if (this.bz == 3) {
        this.aab.md(super.mq, super.nq, super.pq, super.oq);
        if (this.aab.od(this.nbb)) {
          this.bz = 1;
          this.xz.hd(this.dab, "To create an account please enter");
          this.xz.hd(this.eab, "all the requested details");
          this.xz.hd(this.mab, "");
          this.xz.hd(this.nab, "");
          this.xz.hd(this.oab, "");
          this.xz.lc(this.mab);
        }

        if (this.aab.od(this.obb)) {
          this.bz = 0;
        }
      }
    }

  }

  public void ob(String var1, String var2) {
    if (this.bz == 1) {
      this.xz.hd(this.dab, var1);
      this.xz.hd(this.eab, var2);
    }

    if (this.bz == 2) {
      this.yz.hd(this.pab, var1);
      this.yz.hd(this.qab, var2);
    }

    this.fz = var2;
    this.dl();
    this.pj();
  }

  public void v() {
    this.bz = 0;
    this.ut = 0;
  }

  public void q() {
    this.u();
  }

  public void u() {
    this.tz = 0;
    this.bz = 0;
    this.ut = 1;
    this.bl();
    this.qt.df();
    this.qt.cf(this.ot, 0, 11);

    for (int var1 = 0; var1 < this.tw; ++var1) {
      this.pt.sh(this.uw[var1]);
      this.cv.zn(this.vw[var1], this.ww[var1], this.xw[var1]);
    }

    for (int var2 = 0; var2 < this.cx; ++var2) {
      this.pt.sh(this.dx[var2]);
      this.cv.an(this.ex[var2], this.fx[var2], this.gx[var2], this.hx[var2]);
    }

    this.tw = 0;
    this.cx = 0;
    this.mw = 0;
    this.wv = 0;

    for (int var3 = 0; var3 < this.uv; ++var3) {
      this.yv[var3] = null;
    }

    for (int var4 = 0; var4 < this.vv; ++var4) {
      this.zv[var4] = null;
    }

    this.fw = 0;

    for (int var5 = 0; var5 < this.dw; ++var5) {
      this.gw[var5] = null;
    }

    for (int var6 = 0; var6 < this.ew; ++var6) {
      this.hw[var6] = null;
    }

    this.mx = 0;
    super.pq = 0;
    super.oq = 0;
  }

  public void hb() {
    String var1 = this.xz.oc(this.mab);
    String var2 = this.xz.oc(this.oab);
    this.bz = 2;
    this.yz.hd(this.pab, "Please enter your");
    this.yz.hd(this.qab, "username and password");
    this.yz.hd(this.rab, var1);
    this.yz.hd(this.sab, var2);
    this.dl();
    this.pj();
    this.fb(var1, var2);
  }

  public void em(g var1, int var2) {
    var1.ec(var2, "Runescape rules of use", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "In order to keep runescape enjoyable for everyone there are a few", false);
    var1.ec(var2, "rules you must observe. You must agree to these rules to play", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "When using the built in chat facility you must not use any language", false);
    var1.ec(var2, "which may be considered by others to be offensive, racist or", false);
    var1.ec(var2, "obscene. You must not use the chat facility to harass, threaten or", false);
    var1.ec(var2, "deceive other players.", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "You must not exploit any cheats or errors which you find in the", false);
    var1.ec(var2, "game, to give yourself an unfair advantage. Any exploits which you", false);
    var1.ec(var2, "find must be immediately reported to Jagex Software.", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "You must not attempt to use other programs in conjunction with", false);
    var1.ec(var2, "RuneScape to give yourself an unfair advantage at the game. You", false);
    var1.ec(var2, "may not use any bots or macros to control your character for you.", false);
    var1.ec(var2, "When you are not playing the game you must log-out. You may not", false);
    var1.ec(var2, "circumvent any of our mechanisms designed to log out inactive", false);
    var1.ec(var2, "players automatically.", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "You must not create multiple characters and use them to help each", false);
    var1.ec(var2, "other. You may create more than one character, but if you do, you", false);
    var1.ec(var2, "may not log in more than one at any time, and they must not interact", false);
    var1.ec(var2, "with each other in any way. If you wish to form an adventuring", false);
    var1.ec(var2, "party you should do so by cooperating with other players in the game", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "Terms and conditions", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "You agree that your character and account in runescape, is the", false);
    var1.ec(var2, "property of, and remains the property of Jagex Software. You may", false);
    var1.ec(var2, "not sell, transfer, or lend your character to anyone else. We may", false);
    var1.ec(var2, "delete or modify your character at any time for any reason.", false);
    var1.ec(var2, "For instance failing to follow the rules above may be cause for", false);
    var1.ec(var2, "IMMEDIATE DELETION of all your characters.", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "You agree that for purposes such as preventing offensive language", false);
    var1.ec(var2, "we may automatically or manually censor the chat as we see fit,", false);
    var1.ec(var2, "and that we may record the chat to help us identify offenders.", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "No Warranty is supplied with this Software. All implied warranties", false);
    var1.ec(var2, "conditions or terms are excluded to the fullest extent permitted by", false);
    var1.ec(var2, "law. We do not warrant that the operation of the Software will be", false);
    var1.ec(var2, "uninterrupted or error free. We accept no responsibility for any", false);
    var1.ec(var2, "consequential or indirect loss or damages. You use this software at", false);
    var1.ec(var2, "your own risk, and assume full responsibility for any and all real,", false);
    var1.ec(var2, "claimed, or supposed damages that may occur as a result of running", false);
    var1.ec(var2, "this software.", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "We reserve all rights related to the runescape name, logo, web site,", false);
    var1.ec(var2, "and game. All materials associated with runescape are protected", false);
    var1.ec(var2, "by UK copyright laws and all other applicable national laws, and", false);
    var1.ec(var2, "may not be copied, reproduced, republished, uploaded, posted,", false);
    var1.ec(var2, "transmitted, or distributed in any way without our prior written", false);
    var1.ec(var2, "consent. We reserve the right to modify or remove this game at any", false);
    var1.ec(var2, "time. You agree that we may change this service, and these terms", false);
    var1.ec(var2, "and conditions, as and when we deem necessary.", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "We accept no responsibility for the actions of other users of our", false);
    var1.ec(var2, "website. You acknowledge that it is inpractical for us to control", false);
    var1.ec(var2, "and monitor everything that users do in our game or post on our", false);
    var1.ec(var2, "message boards, and that we therefore cannot be held responsible", false);
    var1.ec(var2, "for any abusive or inappropriate content which appears on our site", false);
    var1.ec(var2, "as a result.", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "Occasionally we may accept ideas and game additions from the", false);
    var1.ec(var2, "players. You agree that by submitting material for inclusion in", false);
    var1.ec(var2, "runescape you are giving us a non-exclusive, perpetual, worldwide,", false);
    var1.ec(var2, "royalty-free license to use or modify the submission as we see", false);
    var1.ec(var2, "fit. You agree that you will not withdraw the submission or attempt", false);
    var1.ec(var2, "to make a charge for its use. Furthermore you warrant that you", false);
    var1.ec(var2, "are the exclusive copyright holder of the submission, and that the", false);
    var1.ec(var2, "submission in no way violates any other person or entity's rights", false);
    var1.ec(var2, "", false);
    var1.ec(var2, "These Terms shall be governed by the laws of England, and the", false);
    var1.ec(var2, "courts of England shall have exclusive jurisdiction in all matters", false);
    var1.ec(var2, "arising.", false);
  }

  public void hm() {
    this.z();
    if (super.sp > 4500 && this.lt == 0) {
      this.mb();
    } else {
      if (this.aw.gr == 8 || this.aw.gr == 9) {
        this.lt = 500;
      }

      if (this.lt > 0) {
        --this.lt;
      }

      int var3;
      int var5;
      int var6;
      int var7;
      for (int var1 = 0; var1 < this.wv; ++var1) {
        l var2 = this.zv[var1];
        var3 = (var2.jr + 1) % 10;
        if (var2.ir != var3) {
          byte var4 = -1;
          var5 = var2.ir;
          if (var5 < var3) {
            var6 = var3 - var5;
          } else {
            var6 = 10 + var3 - var5;
          }

          var7 = 4;
          if (var6 > 2) {
            var7 = (var6 - 1) * 4;
          }

          if (var2.kr[var5] - var2.cr <= this.tt * 3 && var2.lr[var5] - var2.dr <= this.tt * 3 && var2.kr[var5] - var2.cr >= -this.tt * 3 && var2.lr[var5] - var2.dr >= -this.tt * 3 && var6 <= 8) {
            if (var2.cr < var2.kr[var5]) {
              var2.cr += var7;
              ++var2.fr;
              var4 = 2;
            } else if (var2.cr > var2.kr[var5]) {
              var2.cr -= var7;
              ++var2.fr;
              var4 = 6;
            }

            if (var2.cr - var2.kr[var5] < var7 && var2.cr - var2.kr[var5] > -var7) {
              var2.cr = var2.kr[var5];
            }

            if (var2.dr < var2.lr[var5]) {
              var2.dr += var7;
              ++var2.fr;
              if (var4 == -1) {
                var4 = 4;
              } else if (var4 == 2) {
                var4 = 3;
              } else {
                var4 = 5;
              }
            } else if (var2.dr > var2.lr[var5]) {
              var2.dr -= var7;
              ++var2.fr;
              if (var4 == -1) {
                var4 = 0;
              } else if (var4 == 2) {
                var4 = 1;
              } else {
                var4 = 7;
              }
            }

            if (var2.dr - var2.lr[var5] < var7 && var2.dr - var2.lr[var5] > -var7) {
              var2.dr = var2.lr[var5];
            }
          } else {
            var2.cr = var2.kr[var5];
            var2.dr = var2.lr[var5];
          }

          if (var4 != -1) {
            var2.gr = var4;
          }

          if (var2.cr == var2.kr[var5] && var2.dr == var2.lr[var5]) {
            var2.ir = (var5 + 1) % 10;
          }
        } else {
          var2.gr = var2.hr;
        }

        if (var2.or > 0) {
          --var2.or;
        }

        if (var2.qr > 0) {
          --var2.qr;
        }

        if (var2.ur > 0) {
          --var2.ur;
        }

        if (this.fu > 0) {
          --this.fu;
          if (this.fu == 0) {
            this.gk("You have been granted another life. Be more careful this time!", 3);
          }

          if (this.fu == 0) {
            this.gk("You retain your skills. Unless you attacked another player recently,", 3);
          }

          if (this.fu == 0) {
            this.gk("you also keep your best 3 items. Everything else lands where you died.", 3);
          }
        }
      }

      int var13;
      for (int var9 = 0; var9 < this.fw; ++var9) {
        l var10 = this.hw[var9];
        var13 = (var10.jr + 1) % 10;
        if (var10.ir != var13) {
          byte var11 = -1;
          var6 = var10.ir;
          if (var6 < var13) {
            var7 = var13 - var6;
          } else {
            var7 = 10 + var13 - var6;
          }

          int var8 = 4;
          if (var7 > 2) {
            var8 = (var7 - 1) * 4;
          }

          if (var10.kr[var6] - var10.cr <= this.tt * 3 && var10.lr[var6] - var10.dr <= this.tt * 3 && var10.kr[var6] - var10.cr >= -this.tt * 3 && var10.lr[var6] - var10.dr >= -this.tt * 3 && var7 <= 8) {
            if (var10.cr < var10.kr[var6]) {
              var10.cr += var8;
              ++var10.fr;
              var11 = 2;
            } else if (var10.cr > var10.kr[var6]) {
              var10.cr -= var8;
              ++var10.fr;
              var11 = 6;
            }

            if (var10.cr - var10.kr[var6] < var8 && var10.cr - var10.kr[var6] > -var8) {
              var10.cr = var10.kr[var6];
            }

            if (var10.dr < var10.lr[var6]) {
              var10.dr += var8;
              ++var10.fr;
              if (var11 == -1) {
                var11 = 4;
              } else if (var11 == 2) {
                var11 = 3;
              } else {
                var11 = 5;
              }
            } else if (var10.dr > var10.lr[var6]) {
              var10.dr -= var8;
              ++var10.fr;
              if (var11 == -1) {
                var11 = 0;
              } else if (var11 == 2) {
                var11 = 1;
              } else {
                var11 = 7;
              }
            }

            if (var10.dr - var10.lr[var6] < var8 && var10.dr - var10.lr[var6] > -var8) {
              var10.dr = var10.lr[var6];
            }
          } else {
            var10.cr = var10.kr[var6];
            var10.dr = var10.lr[var6];
          }

          if (var11 != -1) {
            var10.gr = var11;
          }

          if (var10.cr == var10.kr[var6] && var10.dr == var10.lr[var6]) {
            var10.ir = (var6 + 1) % 10;
          }
        } else {
          var10.gr = var10.hr;
        }

        if (var10.or > 0) {
          --var10.or;
        }

        if (var10.qr > 0) {
          --var10.qr;
        }

        if (var10.ur > 0) {
          --var10.ur;
        }
      }

      for (var3 = 0; var3 < this.wv; ++var3) {
        l var14 = this.zv[var3];
        if (var14.es > 0) {
          --var14.es;
        }
      }

      if (this.bt) {
        if (this.nu - this.aw.cr < -500 || this.nu - this.aw.cr > 500 || this.ou - this.aw.dr < -500 || this.ou - this.aw.dr > 500) {
          this.nu = this.aw.cr;
          this.ou = this.aw.dr;
        }
      } else {
        if (this.nu - this.aw.cr < -500 || this.nu - this.aw.cr > 500 || this.ou - this.aw.dr < -500 || this.ou - this.aw.dr > 500) {
          this.nu = this.aw.cr;
          this.ou = this.aw.dr;
        }

        if (this.nu != this.aw.cr) {
          this.nu += (this.aw.cr - this.nu) / (16 + (this.lu - 500) / 15);
        }

        if (this.ou != this.aw.dr) {
          this.ou += (this.aw.dr - this.ou) / (16 + (this.lu - 500) / 15);
        }

        if (this.ct) {
          var13 = this.pu * 32;
          var5 = var13 - this.zt;
          byte var12 = 1;
          if (var5 != 0) {
            ++this.qu;
            if (var5 > 128) {
              var12 = -1;
              var5 = 256 - var5;
            } else if (var5 > 0) {
              var12 = 1;
            } else if (var5 < -128) {
              var12 = 1;
              var5 += 256;
            } else if (var5 < 0) {
              var12 = -1;
              var5 = -var5;
            }

            this.zt += (this.qu * var5 + 255) / 256 * var12;
            this.zt &= 255;
          } else {
            this.qu = 0;
          }
        }
      }

      if (this.sbb) {
        this.im();
      } else {
        if (super.nq > this.cu - 4) {
          if (super.mq > 15 && super.mq < 96 && super.pq == 1) {
            this.pz = 0;
          }

          if (super.mq > 110 && super.mq < 194 && super.pq == 1) {
            this.pz = 1;
            this.kz.ue[this.lz] = 999999;
          }

          if (super.mq > 215 && super.mq < 295 && super.pq == 1) {
            this.pz = 2;
            this.kz.ue[this.nz] = 999999;
          }

          if (super.mq > 315 && super.mq < 395 && super.pq == 1) {
            this.pz = 3;
            this.kz.ue[this.oz] = 999999;
          }

          super.pq = 0;
          super.oq = 0;
        }

        this.kz.md(super.mq, super.nq, super.pq, super.oq);
        if (this.pz > 0 && super.mq >= 494 && super.nq >= this.cu - 66) {
          super.pq = 0;
        }

        if (this.kz.od(this.mz)) {
          String var15 = this.kz.oc(this.mz);
          this.kz.hd(this.mz, "");
          if (var15.equalsIgnoreCase("simlostcon99")) {
            super.dd.xb();
          } else if (!this.x(var15)) {
            this.aw.or = 150;
            this.aw.nr = var15;
            this.gk(this.aw.zq + ": " + var15, 2);
          }
        }

        if (this.pz == 0) {
          for (var13 = 0; var13 < this.qz; ++var13) {
            if (this.sz[var13] > 0) {
              --this.sz[var13];
            }
          }
        }

        if (this.fu != 0) {
          super.pq = 0;
        }

        if (this.ux) {
          if (super.oq != 0) {
            ++this.ey;
          } else {
            this.ey = 0;
          }

          if (this.ey > 300) {
            this.fy += 50;
          } else if (this.ey > 150) {
            this.fy += 5;
          } else if (this.ey > 50) {
            ++this.fy;
          } else if (this.ey > 20 && (this.ey & 5) == 0) {
            ++this.fy;
          }
        } else {
          this.ey = 0;
          this.fy = 0;
        }

        if (super.pq == 1) {
          this.mx = 1;
        } else if (super.pq == 2) {
          this.mx = 2;
        }

        this.pt.ph(super.mq, super.nq);
        super.pq = 0;
        if (this.ct) {
          if (this.qu == 0 || this.bt) {
            if (super.fq) {
              this.pu = this.pu + 1 & 7;
              super.fq = false;
              if (!this.mu) {
                if ((this.pu & 1) == 0) {
                  this.pu = this.pu + 1 & 7;
                }

                for (var13 = 0; var13 < 8 && !this.ol(this.pu); ++var13) {
                  this.pu = this.pu + 1 & 7;
                }
              }
            }

            if (super.gq) {
              this.pu = this.pu + 7 & 7;
              super.gq = false;
              if (!this.mu) {
                if ((this.pu & 1) == 0) {
                  this.pu = this.pu + 7 & 7;
                }

                for (var13 = 0; var13 < 8 && !this.ol(this.pu); ++var13) {
                  this.pu = this.pu + 7 & 7;
                }
              }
            }
          }
        } else if (super.fq) {
          this.zt = this.zt + 2 & 255;
        } else if (super.gq) {
          this.zt = this.zt - 2 & 255;
        }

        if (this.mu && this.lu > 550) {
          this.lu -= 4;
        } else if (!this.mu && this.lu < 750) {
          this.lu += 4;
        }

        if (this.scb > 0) {
          --this.scb;
        } else if (this.scb < 0) {
          ++this.scb;
        }

        this.pt.ai(17);
        ++this.ncb;
        if (this.ncb > 5) {
          this.ncb = 0;
          this.ocb = this.ocb + 1 & 3;
          this.pcb = (this.pcb + 1) % 3;
        }

        for (var13 = 0; var13 < this.tw; ++var13) {
          var5 = this.vw[var13];
          var6 = this.ww[var13];
          if (var5 >= 0 && var6 >= 0 && var5 < 96 && var6 < 96 && this.xw[var13] == 74) {
            this.uw[var13].pe(1, 0, 0);
          }
        }

      }
    }
  }

  public void gk(String var1, int var2) {
    int var3;
    if (var2 == 2 || var2 == 4 || var2 == 6) {
      while (true) {
        if (var1.length() <= 5 || var1.charAt(0) != 64 || var1.charAt(4) != 64) {
          var3 = var1.indexOf(":");
          if (var3 != -1) {
            String var4 = var1.substring(0, var3);
            long var5 = o.rm(var4);

            for (int var7 = 0; var7 < super.md; ++var7) {
              if (super.nd[var7] == var5) {
                return;
              }
            }
          }
          break;
        }

        var1 = var1.substring(5);
      }
    }

    if (var2 == 2) {
      var1 = "@yel@" + var1;
    }

    if (var2 == 3 || var2 == 4) {
      var1 = "@whi@" + var1;
    }

    if (var2 == 6) {
      var1 = "@cya@" + var1;
    }

    if (this.pz != 0) {
      if (var2 == 4 || var2 == 3) {
        this.gz = 200;
      }

      if (var2 == 2 && this.pz != 1) {
        this.hz = 200;
      }

      if (var2 == 5 && this.pz != 2) {
        this.iz = 200;
      }

      if (var2 == 6 && this.pz != 3) {
        this.jz = 200;
      }

      if (var2 == 3 && this.pz != 0) {
        this.pz = 0;
      }

      if (var2 == 6 && this.pz != 3 && this.pz != 0) {
        this.pz = 3;
      }
    }

    for (var3 = this.qz - 1; var3 > 0; --var3) {
      this.rz[var3] = this.rz[var3 - 1];
      this.sz[var3] = this.sz[var3 - 1];
    }

    this.rz[0] = var1;
    this.sz[0] = 300;
    if (var2 == 2) {
      if (this.kz.ue[this.lz] == this.kz.ve[this.lz] - 4) {
        this.kz.ec(this.lz, var1, true);
      } else {
        this.kz.ec(this.lz, var1, false);
      }
    }

    if (var2 == 5) {
      if (this.kz.ue[this.nz] == this.kz.ve[this.nz] - 4) {
        this.kz.ec(this.nz, var1, true);
      } else {
        this.kz.ec(this.nz, var1, false);
      }
    }

    if (var2 == 6) {
      if (this.kz.ue[this.oz] == this.kz.ve[this.oz] - 4) {
        this.kz.ec(this.oz, var1, true);
        return;
      }

      this.kz.ec(this.oz, var1, false);
    }

  }

  public void w(String var1) {
    if (var1.equals("@sys@k")) {
      this.mb();
    } else if (var1.startsWith("@cha@")) {
      this.gk(var1, 2);
    } else if (var1.startsWith("@bor@")) {
      this.gk(var1, 4);
    } else if (var1.startsWith("@que@")) {
      this.gk("@whi@" + var1, 5);
    } else if (var1.startsWith("@pri@")) {
      this.gk(var1, 6);
    } else {
      this.gk(var1, 3);
    }
  }

  public void bb(int var1, int var2, byte[] var3) {
    int var6;
    try {
      int var4;
      int var7;
      int var8;
      int var9;
      int var21;
      if (var1 == 230) {
        var4 = var3[1] & 255;
        var21 = var3[2] & 255;
        var6 = var3[3] & 255;
        var7 = var3[4] & 255;
        var8 = var3[5] & 255;
        var9 = var3[6] & 255;
        if (var4 > c.hc || var21 > c.ic || var6 > c.jc || var7 > c.kc || var8 > c.lc || var9 > c.mc) {
          this.mb();
          super.up = "Runescape has been updated. Getting latest files";
          super.tp = 2;
          this.gj(0, "Loading");
          if (var4 > c.hc) {
            c.hc = var4;
            this.pl();
          }

          if (var6 > c.jc) {
            c.jc = var6;
            this.lk();
          }

          if (var9 > c.mc) {
            c.mc = var9;
            this.wk(true);
          } else {
            this.wk(false);
          }

          if (var8 > c.lc) {
            c.lc = var8;
            this.zl();
          }

          if (var7 > c.kc) {
            c.kc = var7;
            this.sl();
          }

          if (var21 > c.ic) {
            c.ic = var21;
            this.ml();
          }

          this.cv.web = false;
          this.uu = -1;
          super.tp = 0;
          this.fb(this.cz, this.dz);
          return;
        }
      }

      l var23;
      if (var1 == 232) {
        var4 = (var2 - 1) / 2;

        for (var21 = 0; var21 < var4; ++var21) {
          var6 = o.vm(var3, 1 + var21 * 2);

          for (var7 = 0; var7 < this.wv; ++var7) {
            var23 = this.zv[var7];
            if (var23 == null || var23.ar == var6) {
              --this.wv;

              for (var9 = var7; var9 < this.wv; ++var9) {
                this.zv[var9] = this.zv[var9 + 1];
              }

              --var7;
            }
          }
        }
      }

      if (var1 == 231) {
        var4 = (var2 - 1) / 2;

        for (var21 = 0; var21 < var4; ++var21) {
          var6 = o.vm(var3, 1 + var21 * 2);

          for (var7 = 0; var7 < this.fw; ++var7) {
            var23 = this.hw[var7];
            if (var23 == null || var23.ar == var6) {
              --this.fw;

              for (var9 = var7; var9 < this.fw; ++var9) {
                this.hw[var9] = this.hw[var9 + 1];
              }

              --var7;
            }
          }
        }
      }

      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      if (var1 == 255) {
        var4 = 1;
        var21 = 0;
        var11 = 0;

        for (this.hu = true; var4 < var2; ++var21) {
          boolean var10;
          if (var21 == 0) {
            var6 = o.vm(var3, 1);
            this.bw = o.vm(var3, 3);
            this.cw = o.vm(var3, 5);
            var9 = o.sm(var3[7]);
            var4 += 7;
            this.yk(this.bw, this.cw);
            this.bw -= this.vu;
            this.cw -= this.wu;
            var7 = this.bw * this.tt + 64;
            var8 = this.cw * this.tt + 64;
            if (var9 >= 128) {
              var9 -= 128;
              var10 = true;
            } else {
              var10 = false;
            }
          } else {
            var14 = o.vm(var3, var4);
            if ((var14 & '\ufc00') == '\ufc00') {
              var15 = o.vm(var3, var4 + 2);
              var4 += 4;
              var12 = var14 >> 5 & 31;
              if (var12 > 15) {
                var12 -= 32;
              }

              var13 = var14 & 31;
              if (var13 > 15) {
                var13 -= 32;
              }

              var6 = var15 >> 4 & 4095;
              var9 = var15 & 15;
              if (var9 == 15) {
                var9 = 0;
                var10 = true;
              } else {
                var10 = false;
              }
            } else {
              var15 = o.sm(var3[var4 + 2]);
              var4 += 3;
              var6 = var14 >> 6 & 1023;
              var12 = var14 >> 1 & 31;
              if (var12 > 15) {
                var12 -= 32;
              }

              var13 = (var14 << 4 & 16) + (var15 >> 4 & 15);
              if (var13 > 15) {
                var13 -= 32;
              }

              var9 = var15 & 15;
              if (var9 == 15) {
                var9 = 0;
                var10 = true;
              } else {
                var10 = false;
              }
            }

            var7 = (this.bw + var12) * this.tt + 64;
            var8 = (this.cw + var13) * this.tt + 64;
          }

          if (this.yv[var6] == null) {
            this.yv[var6] = new l();
            this.yv[var6].ar = var6;
            this.yv[var6].br = 0;
          }

          l var28 = this.yv[var6];
          if (var21 == 0) {
            this.aw = var28;
          }

          boolean var31 = false;

          for (var14 = 0; var14 < this.wv; ++var14) {
            if (this.zv[var14] == var28) {
              var31 = true;
              break;
            }
          }

          if (!var31) {
            this.zv[this.wv++] = this.yv[var6];
          }

          if (var31 && this.hu) {
            var28.hr = var9;
            var15 = var28.jr;
            if (var7 != var28.kr[var15] || var8 != var28.lr[var15]) {
              var28.jr = var15 = (var15 + 1) % 10;
              var28.kr[var15] = var7;
              var28.lr[var15] = var8;
            }
          } else {
            var28.ar = var6;
            var28.ir = 0;
            var28.jr = 0;
            var28.kr[0] = var28.cr = var7;
            var28.lr[0] = var28.dr = var8;
            var28.hr = var28.gr = var9;
            var28.fr = 0;
            if (!var10 && !var31) {
              this.vy[var11++] = var6;
            }
          }
        }

        if (var11 > 0) {
          super.dd.i(254);
          super.dd.k(var11);

          for (var12 = 0; var12 < var11; ++var12) {
            l var32 = this.yv[this.vy[var12]];
            super.dd.k(var32.ar);
            super.dd.k(var32.br);
          }

          super.dd.e();
          return;
        }
      } else {
        int var27;
        if (var1 == 254) {
          var4 = 1;

          while (true) {
            while (var4 < var2) {
              if (o.sm(var3[var4]) == 255) {
                var21 = 0;
                var6 = this.bw + var3[var4 + 1] >> 3;
                var7 = this.cw + var3[var4 + 2] >> 3;
                var4 += 3;

                for (var8 = 0; var8 < this.mw; ++var8) {
                  var9 = (this.ow[var8] >> 3) - var6;
                  var27 = (this.pw[var8] >> 3) - var7;
                  if (var9 != 0 || var27 != 0) {
                    if (var8 != var21) {
                      this.ow[var21] = this.ow[var8];
                      this.pw[var21] = this.pw[var8];
                      this.qw[var21] = this.qw[var8];
                      this.rw[var21] = this.rw[var8];
                    }

                    ++var21;
                  }
                }

                this.mw = var21;
              } else {
                var21 = o.vm(var3, var4);
                var4 += 2;
                var6 = this.bw + var3[var4++];
                var7 = this.cw + var3[var4++];
                if ((var21 & '\u8000') == 0) {
                  this.ow[this.mw] = var6;
                  this.pw[this.mw] = var7;
                  this.qw[this.mw] = var21;
                  this.rw[this.mw] = 0;

                  for (var8 = 0; var8 < this.tw; ++var8) {
                    if (this.vw[var8] == var6 && this.ww[var8] == var7) {
                      this.rw[this.mw] = r.kib[this.xw[var8]];
                      break;
                    }
                  }

                  ++this.mw;
                } else {
                  var21 &= 32767;
                  var8 = 0;

                  for (var9 = 0; var9 < this.mw; ++var9) {
                    if (this.ow[var9] == var6 && this.pw[var9] == var7 && this.qw[var9] == var21) {
                      var21 = -123;
                    } else {
                      if (var9 != var8) {
                        this.ow[var8] = this.ow[var9];
                        this.pw[var8] = this.pw[var9];
                        this.qw[var8] = this.qw[var9];
                        this.rw[var8] = this.rw[var9];
                      }

                      ++var8;
                    }
                  }

                  this.mw = var8;
                }
              }
            }

            return;
          }
        }

        if (var1 == 253) {
          var4 = 1;

          while (true) {
            while (var4 < var2) {
              if (o.sm(var3[var4]) == 255) {
                var21 = 0;
                var6 = this.bw + var3[var4 + 1] >> 3;
                var7 = this.cw + var3[var4 + 2] >> 3;
                var4 += 3;

                for (var8 = 0; var8 < this.tw; ++var8) {
                  var9 = (this.vw[var8] >> 3) - var6;
                  var27 = (this.ww[var8] >> 3) - var7;
                  if (var9 == 0 && var27 == 0) {
                    this.pt.sh(this.uw[var8]);
                    this.cv.zn(this.vw[var8], this.ww[var8], this.xw[var8]);
                  } else {
                    if (var8 != var21) {
                      this.uw[var21] = this.uw[var8];
                      this.uw[var21].ph = var21;
                      this.vw[var21] = this.vw[var8];
                      this.ww[var21] = this.ww[var8];
                      this.xw[var21] = this.xw[var8];
                      this.yw[var21] = this.yw[var8];
                    }

                    ++var21;
                  }
                }

                this.tw = var21;
              } else {
                var21 = o.vm(var3, var4);
                var4 += 2;
                var6 = this.bw + var3[var4++];
                var7 = this.cw + var3[var4++];
                var8 = 0;

                for (var9 = 0; var9 < this.tw; ++var9) {
                  if (this.vw[var9] == var6 && this.ww[var9] == var7) {
                    this.pt.sh(this.uw[var9]);
                    this.cv.zn(this.vw[var9], this.ww[var9], this.xw[var9]);
                  } else {
                    if (var9 != var8) {
                      this.uw[var8] = this.uw[var9];
                      this.uw[var8].ph = var8;
                      this.vw[var8] = this.vw[var9];
                      this.ww[var8] = this.ww[var9];
                      this.xw[var8] = this.xw[var9];
                      this.yw[var8] = this.yw[var9];
                    }

                    ++var8;
                  }
                }

                this.tw = var8;
                if (var21 != 60000) {
                  var27 = this.cv.dn(var6, var7);
                  if (var27 != 0 && var27 != 4) {
                    var12 = r.gib[var21];
                    var11 = r.hib[var21];
                  } else {
                    var11 = r.gib[var21];
                    var12 = r.hib[var21];
                  }

                  var13 = (var6 + var6 + var11) * this.tt / 2;
                  var14 = (var7 + var7 + var12) * this.tt / 2;
                  var15 = r.fib[var21];
                  h var36 = this.zw[var15].le();
                  this.pt.oh(var36);
                  var36.ph = this.tw;
                  var36.pe(0, var27 * 32, 0);
                  var36.wd(var13, -this.cv.jn(var13, var14), var14);
                  var36.ne(true, 48, 48, -50, -10, -50);
                  this.cv.pn(var6, var7, var21);
                  if (var21 == 74) {
                    var36.wd(0, -480, 0);
                  }

                  this.vw[this.tw] = var6;
                  this.ww[this.tw] = var7;
                  this.xw[this.tw] = var21;
                  this.yw[this.tw] = var27;
                  this.uw[this.tw++] = var36;
                }
              }
            }

            return;
          }
        }

        if (var1 == 252) {
          this.ox = (var2 - 1) / 4;

          for (var4 = 0; var4 < this.ox; ++var4) {
            this.px[var4] = o.vm(var3, var4 * 4 + 1);
            if (this.px[var4] >= 32768) {
              this.px[var4] -= 32768;
              this.rx[var4] = 1;
            } else {
              this.rx[var4] = 0;
            }

            this.qx[var4] = o.vm(var3, var4 * 4 + 3);
          }

          return;
        }

        if (var1 == 251) {
          var4 = o.vm(var3, 1);
          var21 = 3;

          for (var6 = 0; var6 < var4; ++var6) {
            var7 = o.vm(var3, var21);
            var21 += 2;
            var23 = this.yv[var7];
            if (var23 == null) {
              var21 += 14;
              var9 = o.sm(var3[var21]);
              var21 += var9 + 1;
            } else {
              var23.br = o.vm(var3, var21);
              var21 += 2;
              var23.yq = o.qm(var3, var21);
              var21 += 8;
              var23.zq = o.tm(var23.yq);
              var9 = o.sm(var3[var21]);
              ++var21;

              for (var27 = 0; var27 < var9; ++var27) {
                var23.mr[var27] = o.sm(var3[var21]);
                ++var21;
              }

              for (var11 = var9; var11 < 12; ++var11) {
                var23.mr[var11] = 0;
              }

              var23.xr = var3[var21++] & 255;
              var23.yr = var3[var21++] & 255;
              var23.zr = var3[var21++] & 255;
              var23.as = var3[var21++] & 255;
              var23.vr = var3[var21++] & 255;
              var23.wr = var3[var21++] & 255;
              var23.hs = var3[var21++] & 255;
            }
          }

          return;
        }

        if (var1 == 250) {
          var4 = o.vm(var3, 1);
          var21 = 3;

          for (var6 = 0; var6 < var4; ++var6) {
            var7 = o.vm(var3, var21);
            var21 += 2;
            var23 = this.yv[var7];
            byte var35 = var3[var21];
            ++var21;
            if (var35 == 0) {
              var27 = o.vm(var3, var21);
              var21 += 2;
              if (var23 != null) {
                var23.qr = 150;
                var23.pr = var27;
              }
            } else if (var35 != 1) {
              if (var35 == 2) {
                var27 = o.sm(var3[var21]);
                ++var21;
                var11 = o.sm(var3[var21]);
                ++var21;
                var12 = o.sm(var3[var21]);
                ++var21;
                if (var23 != null) {
                  var23.rr = var27;
                  var23.sr = var11;
                  var23.tr = var12;
                  var23.ur = 200;
                  if (var23 == this.aw) {
                    this.oy[3] = var11;
                    this.py[3] = var12;
                  }
                }
              } else if (var35 == 3) {
                var27 = o.vm(var3, var21);
                var21 += 2;
                var11 = o.vm(var3, var21);
                var21 += 2;
                if (var23 != null) {
                  var23.bs = var27;
                  var23.ds = var11;
                  var23.cs = -1;
                  var23.es = this.uz;
                }
              } else if (var35 == 4) {
                var27 = o.vm(var3, var21);
                var21 += 2;
                var11 = o.vm(var3, var21);
                var21 += 2;
                if (var23 != null) {
                  var23.bs = var27;
                  var23.cs = var11;
                  var23.ds = -1;
                  var23.es = this.uz;
                }
              }
            } else {
              byte var38 = var3[var21];
              ++var21;
              if (var23 != null) {
                String var37 = new String(var3, var21, var38);
                if (var37.startsWith("@que@")) {
                  var23.or = 150;
                  var23.nr = var37;
                  if (var23 == this.aw) {
                    this.gk("@yel@" + var23.zq + ": " + var23.nr, 5);
                  }
                } else if (var23 != this.aw) {
                  boolean var39 = false;

                  for (var13 = 0; var13 < super.md; ++var13) {
                    if (super.nd[var13] == var23.yq) {
                      var39 = true;
                    }
                  }

                  if (!var39) {
                    var37 = o.nm(var37, true);
                    var23.or = 150;
                    var23.nr = var37;
                    this.gk(var23.zq + ": " + var23.nr, 2);
                  }
                }
              }

              var21 += var38;
            }
          }

          return;
        }

        if (var1 == 249) {
          var4 = 1;

          while (true) {
            while (var4 < var2) {
              if (o.sm(var3[var4]) == 255) {
                var21 = 0;
                var6 = this.bw + var3[var4 + 1] >> 3;
                var7 = this.cw + var3[var4 + 2] >> 3;
                var4 += 3;

                for (var8 = 0; var8 < this.cx; ++var8) {
                  var9 = (this.ex[var8] >> 3) - var6;
                  var27 = (this.fx[var8] >> 3) - var7;
                  if (var9 == 0 && var27 == 0) {
                    this.pt.sh(this.dx[var8]);
                    this.cv.an(this.ex[var8], this.fx[var8], this.gx[var8], this.hx[var8]);
                  } else {
                    if (var8 != var21) {
                      this.dx[var21] = this.dx[var8];
                      this.dx[var21].ph = var21 + 10000;
                      this.ex[var21] = this.ex[var8];
                      this.fx[var21] = this.fx[var8];
                      this.gx[var21] = this.gx[var8];
                      this.hx[var21] = this.hx[var8];
                    }

                    ++var21;
                  }
                }

                this.cx = var21;
              } else {
                var21 = o.vm(var3, var4);
                var4 += 2;
                var6 = this.bw + var3[var4++];
                var7 = this.cw + var3[var4++];
                byte var29 = var3[var4++];
                var9 = 0;

                for (var27 = 0; var27 < this.cx; ++var27) {
                  if (this.ex[var27] == var6 && this.fx[var27] == var7 && this.gx[var27] == var29) {
                    this.pt.sh(this.dx[var27]);
                    this.cv.an(this.ex[var27], this.fx[var27], this.gx[var27], this.hx[var27]);
                  } else {
                    if (var27 != var9) {
                      this.dx[var9] = this.dx[var27];
                      this.dx[var9].ph = var9 + 10000;
                      this.ex[var9] = this.ex[var27];
                      this.fx[var9] = this.fx[var27];
                      this.gx[var9] = this.gx[var27];
                      this.hx[var9] = this.hx[var27];
                    }

                    ++var9;
                  }
                }

                this.cx = var9;
                if (var21 != 65535) {
                  this.cv.bo(var6, var7, var29, var21);
                  h var34 = this.qk(var6, var7, var29, var21, this.cx);
                  this.dx[this.cx] = var34;
                  this.ex[this.cx] = var6;
                  this.fx[this.cx] = var7;
                  this.hx[this.cx] = var21;
                  this.gx[this.cx++] = var29;
                }
              }
            }

            return;
          }
        }

        if (var1 == 248) {
          var4 = (var2 - 1) / 4;
          var21 = 1;

          for (var6 = 0; var6 < var4; ++var6) {
            var7 = o.vm(var3, var21);
            var8 = o.sm(var3[var21 + 2]);
            var9 = var7 >> 6 & 1023;
            var27 = var7 >> 1 & 31;
            if (var27 > 15) {
              var27 -= 32;
            }

            var11 = (var7 << 4 & 16) + (var8 >> 4 & 15);
            if (var11 > 15) {
              var11 -= 32;
            }

            var12 = var8 & 15;
            var13 = (this.bw + var27) * this.tt + 64;
            var14 = (this.cw + var11) * this.tt + 64;
            var15 = o.sm(var3[var21 + 3]);
            var21 += 4;
            if (var15 >= r.ogb) {
              var15 = 24;
            }

            if (this.gw[var9] == null) {
              this.gw[var9] = new l();
              this.gw[var9].ar = var9;
            }

            l var16 = this.gw[var9];
            boolean var17 = false;

            for (int var18 = 0; var18 < this.fw; ++var18) {
              if (this.hw[var18] == var16) {
                var17 = true;
                break;
              }
            }

            if (!var17) {
              this.hw[this.fw++] = this.gw[var9];
            }

            if (var17) {
              var16.er = var15;
              var16.hr = var12;
              int var19 = var16.jr;
              if (var13 != var16.kr[var19] || var14 != var16.lr[var19]) {
                var16.jr = var19 = (var19 + 1) % 10;
                var16.kr[var19] = var13;
                var16.lr[var19] = var14;
              }
            } else {
              var16.ar = var9;
              var16.ir = 0;
              var16.jr = 0;
              var16.kr[0] = var16.cr = var13;
              var16.lr[0] = var16.dr = var14;
              var16.er = var15;
              var16.hr = var16.gr = var12;
              var16.fr = 0;
            }
          }

          return;
        }

        if (var1 == 247) {
          var4 = o.vm(var3, 1);
          var21 = 3;

          for (var6 = 0; var6 < var4; ++var6) {
            var7 = o.vm(var3, var21);
            var21 += 2;
            var23 = this.gw[var7];
            var9 = o.sm(var3[var21]);
            ++var21;
            if (var9 == 1) {
              var27 = o.vm(var3, var21);
              var21 += 2;
              byte var30 = var3[var21];
              ++var21;
              if (var23 != null) {
                String var33 = new String(var3, var21, var30);
                var23.or = 150;
                var23.nr = var33;
                if (var27 == this.aw.ar) {
                  this.gk("@yel@" + r.pgb[var23.er][0] + ": " + var23.nr, 5);
                }
              }

              var21 += var30;
            } else if (var9 == 2) {
              var27 = o.sm(var3[var21]);
              ++var21;
              var11 = o.sm(var3[var21]);
              ++var21;
              var12 = o.sm(var3[var21]);
              ++var21;
              if (var23 != null) {
                var23.rr = var27;
                var23.sr = var11;
                var23.tr = var12;
                var23.ur = 200;
              }
            }
          }

          return;
        }

        if (var1 == 246) {
          this.wy = true;
          var4 = o.sm(var3[1]);
          this.xy = var4;
          var21 = 2;

          for (var6 = 0; var6 < var4; ++var6) {
            var7 = o.sm(var3[var21]);
            ++var21;
            this.yy[var6] = new String(var3, var21, var7);
            var21 += var7;
          }

          return;
        }

        if (var1 == 245) {
          this.wy = false;
          return;
        }

        if (var1 == 244) {
          this.ru = o.vm(var3, 1);
          this.su = o.vm(var3, 3);
          this.xu = o.vm(var3, 5);
          this.tu = o.vm(var3, 7);
          this.su -= this.xu * this.tu;
          return;
        }

        if (var1 == 243) {
          var4 = 1;

          for (var21 = 0; var21 < 19; ++var21) {
            this.oy[var21] = o.sm(var3[var4++]);
          }

          for (var6 = 0; var6 < 19; ++var6) {
            this.py[var6] = o.sm(var3[var4++]);
          }

          return;
        }

        if (var1 == 242) {
          for (var4 = 0; var4 < 6; ++var4) {
            this.qy[var4] = o.sm(var3[1 + var4]);
          }

          return;
        }

        if (var1 == 241) {
          this.fu = 250;
          this.uy += 10;
          return;
        }

        if (var1 == 240) {
          var4 = (var2 - 1) / 4;

          for (var21 = 0; var21 < var4; ++var21) {
            var6 = this.bw + o.wm(var3, 1 + var21 * 4) >> 3;
            var7 = this.cw + o.wm(var3, 3 + var21 * 4) >> 3;
            var8 = 0;

            for (var9 = 0; var9 < this.mw; ++var9) {
              var27 = (this.ow[var9] >> 3) - var6;
              var11 = (this.pw[var9] >> 3) - var7;
              if (var27 != 0 || var11 != 0) {
                if (var9 != var8) {
                  this.ow[var8] = this.ow[var9];
                  this.pw[var8] = this.pw[var9];
                  this.qw[var8] = this.qw[var9];
                  this.rw[var8] = this.rw[var9];
                }

                ++var8;
              }
            }

            this.mw = var8;
            var8 = 0;

            for (var27 = 0; var27 < this.tw; ++var27) {
              var11 = (this.vw[var27] >> 3) - var6;
              var12 = (this.ww[var27] >> 3) - var7;
              if (var11 == 0 && var12 == 0) {
                this.pt.sh(this.uw[var27]);
                this.cv.zn(this.vw[var27], this.ww[var27], this.xw[var27]);
              } else {
                if (var27 != var8) {
                  this.uw[var8] = this.uw[var27];
                  this.uw[var8].ph = var8;
                  this.vw[var8] = this.vw[var27];
                  this.ww[var8] = this.ww[var27];
                  this.xw[var8] = this.xw[var27];
                  this.yw[var8] = this.yw[var27];
                }

                ++var8;
              }
            }

            this.tw = var8;
            var8 = 0;

            for (var11 = 0; var11 < this.cx; ++var11) {
              var12 = (this.ex[var11] >> 3) - var6;
              var13 = (this.fx[var11] >> 3) - var7;
              if (var12 == 0 && var13 == 0) {
                this.pt.sh(this.dx[var11]);
                this.cv.an(this.ex[var11], this.fx[var11], this.gx[var11], this.hx[var11]);
              } else {
                if (var11 != var8) {
                  this.dx[var8] = this.dx[var11];
                  this.dx[var8].ph = var8 + 10000;
                  this.ex[var8] = this.ex[var11];
                  this.fx[var8] = this.fx[var11];
                  this.gx[var8] = this.gx[var11];
                  this.hx[var8] = this.hx[var11];
                }

                ++var8;
              }
            }

            this.cx = var8;
          }

          return;
        }

        if (var1 == 239) {
          this.sbb = true;
          return;
        }

        if (var1 == 238) {
          var4 = o.vm(var3, 1);
          if (this.yv[var4] != null) {
            this.vx = this.yv[var4].zq;
          }

          this.ux = true;
          this.cy = false;
          this.dy = false;
          this.wx = 0;
          this.zx = 0;
          return;
        }

        if (var1 == 237) {
          this.ux = false;
          return;
        }

        if (var1 == 236) {
          this.zx = var3[1] & 255;
          var4 = 2;

          for (var21 = 0; var21 < this.zx; ++var21) {
            this.ay[var21] = o.vm(var3, var4);
            var4 += 2;
            this.by[var21] = o.vm(var3, var4);
            var4 += 2;
          }

          this.cy = false;
          this.dy = false;
          return;
        }

        byte var25;
        if (var1 == 235) {
          var25 = var3[1];
          if (var25 == 1) {
            this.cy = true;
            return;
          }

          this.cy = false;
          return;
        }

        if (var1 == 234) {
          this.gy = true;
          byte var22 = 1;
          var4 = var22 + 1;
          var21 = var3[var22] & 255;
          byte var24 = var3[var4++];
          this.hy = var3[var4++] & 255;
          this.iy = var3[var4++] & 255;

          for (var7 = 0; var7 < 40; ++var7) {
            this.jy[var7] = -1;
          }

          for (var8 = 0; var8 < var21; ++var8) {
            this.jy[var8] = o.vm(var3, var4);
            var4 += 2;
            this.ky[var8] = o.vm(var3, var4);
            var4 += 2;
            this.ly[var8] = var3[var4++];
          }

          if (var24 == 1) {
            var9 = 39;

            for (var27 = 0; var27 < this.ox && var9 >= var21; ++var27) {
              boolean var26 = false;

              for (var12 = 0; var12 < 40; ++var12) {
                if (this.jy[var12] == this.px[var27]) {
                  var26 = true;
                  break;
                }
              }

              if (this.px[var27] == 10) {
                var26 = true;
              }

              if (!var26) {
                this.jy[var9] = this.px[var27] & 32767;
                this.ky[var9] = 0;
                this.ly[var9] = 0;
                --var9;
              }
            }
          }

          if (this.my >= 0 && this.my < 40 && this.jy[this.my] != this.ny) {
            this.my = -1;
            this.ny = -2;
            return;
          }
        } else {
          if (var1 == 233) {
            this.gy = false;
            return;
          }

          if (var1 == 229) {
            var25 = var3[1];
            if (var25 == 1) {
              this.dy = true;
              return;
            }

            this.dy = false;
            return;
          }

          if (var1 != 228) {
            return;
          }

          System.out.println("Got config");
          this.dt = o.sm(var3[1]) == 1;
          this.ct = o.sm(var3[2]) == 1;
          this.et = o.sm(var3[3]);
          this.kv = o.sm(var3[4]) == 1;
        }
      }

      return;
    } catch (RuntimeException var20) {
      if (this.mt < 3) {
        super.dd.i(17);
        super.dd.d(var20.toString());
        this.ll();
        super.dd.i(17);
        super.dd.d("ptype:" + var1 + " psize:" + var2);
        this.ll();
        super.dd.i(17);
        super.dd.d("rx:" + this.bw + " ry:" + this.cw + " num3l:" + this.tw);
        this.ll();
        String var5 = "";

        for (var6 = 0; var6 < 80 && var6 < var2; ++var6) {
          var5 = var5 + var3[var6] + " ";
        }

        super.dd.i(17);
        super.dd.d(var5);
        this.ll();
        ++this.mt;
      }
    }

  }

  public boolean ol(int var1) {
    int var2 = this.aw.cr / 128;
    int var3 = this.aw.dr / 128;

    for (int var4 = 2; var4 >= 1; --var4) {
      if (var1 == 1 && ((this.cv.ueb[var2][var3 - var4] & 128) == 128 || (this.cv.ueb[var2 - var4][var3] & 128) == 128 || (this.cv.ueb[var2 - var4][var3 - var4] & 128) == 128)) {
        return false;
      }

      if (var1 == 3 && ((this.cv.ueb[var2][var3 + var4] & 128) == 128 || (this.cv.ueb[var2 - var4][var3] & 128) == 128 || (this.cv.ueb[var2 - var4][var3 + var4] & 128) == 128)) {
        return false;
      }

      if (var1 == 5 && ((this.cv.ueb[var2][var3 + var4] & 128) == 128 || (this.cv.ueb[var2 + var4][var3] & 128) == 128 || (this.cv.ueb[var2 + var4][var3 + var4] & 128) == 128)) {
        return false;
      }

      if (var1 == 7 && ((this.cv.ueb[var2][var3 - var4] & 128) == 128 || (this.cv.ueb[var2 + var4][var3] & 128) == 128 || (this.cv.ueb[var2 + var4][var3 - var4] & 128) == 128)) {
        return false;
      }

      if (var1 == 0 && (this.cv.ueb[var2][var3 - var4] & 128) == 128) {
        return false;
      }

      if (var1 == 2 && (this.cv.ueb[var2 - var4][var3] & 128) == 128) {
        return false;
      }

      if (var1 == 4 && (this.cv.ueb[var2][var3 + var4] & 128) == 128) {
        return false;
      }

      if (var1 == 6 && (this.cv.ueb[var2 + var4][var3] & 128) == 128) {
        return false;
      }
    }

    return true;
  }

  public void xk() {
    if ((this.pu & 1) != 1 || !this.ol(this.pu)) {
      if ((this.pu & 1) == 0 && this.ol(this.pu)) {
        if (this.ol(this.pu + 1 & 7)) {
          this.pu = this.pu + 1 & 7;
        } else {
          if (this.ol(this.pu + 7 & 7)) {
            this.pu = this.pu + 7 & 7;
          }

        }
      } else {
        int[] var1 = new int[] {1, -1, 2, -2, 3, -3, 4};

        for (int var2 = 0; var2 < 7; ++var2) {
          if (this.ol(this.pu + var1[var2] + 8 & 7)) {
            this.pu = this.pu + var1[var2] + 8 & 7;
            break;
          }
        }

        if ((this.pu & 1) == 0 && this.ol(this.pu)) {
          if (this.ol(this.pu + 1 & 7)) {
            this.pu = this.pu + 1 & 7;
          } else {
            if (this.ol(this.pu + 7 & 7)) {
              this.pu = this.pu + 7 & 7;
            }

          }
        }
      }
    }
  }

  public void cl() {
    if (this.fu != 0) {
      this.qt.ze();
      this.qt.mg("Oh dear! You are dead...", this.bu / 2, this.cu / 2, 7, 16711680);
      this.rl();
      this.qt.cf(this.ot, 0, 11);
    } else if (this.cv.web) {
      if (this.sbb) {
        this.ek();
      } else {
        for (int var1 = 0; var1 < 64; ++var1) {
          this.pt.sh(this.cv.zeb[this.uu][var1]);
          if (this.uu == 0) {
            this.pt.sh(this.cv.yeb[1][var1]);
            this.pt.sh(this.cv.zeb[1][var1]);
            this.pt.sh(this.cv.yeb[2][var1]);
            this.pt.sh(this.cv.zeb[2][var1]);
          }

          this.mu = true;
          if (this.uu == 0 && (this.cv.ueb[this.aw.cr / 128][this.aw.dr / 128] & 128) == 0) {
            this.pt.oh(this.cv.zeb[this.uu][var1]);
            if (this.uu == 0) {
              this.pt.oh(this.cv.yeb[1][var1]);
              this.pt.oh(this.cv.zeb[1][var1]);
              this.pt.oh(this.cv.yeb[2][var1]);
              this.pt.oh(this.cv.zeb[2][var1]);
            }

            this.mu = false;
          }
        }

        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        byte var7;
        String var8;
        int var9;
        h var10;
        if (this.ocb != this.qcb) {
          this.qcb = this.ocb;

          for (var2 = 0; var2 < this.tw; ++var2) {
            if (this.xw[var2] == 51) {
              var3 = this.vw[var2];
              var4 = this.ww[var2];
              var5 = var3 - this.aw.cr / 128;
              var6 = var4 - this.aw.dr / 128;
              var7 = 7;
              if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var5 > -var7 && var5 < var7 && var6 > -var7 && var6 < var7) {
                this.pt.sh(this.uw[var2]);
                var8 = "torcha" + (this.ocb + 1);
                var9 = r.mo(var8);
                var10 = this.zw[var9].le();
                this.pt.oh(var10);
                var10.ne(true, 48, 48, -50, -10, -50);
                var10.vd(this.uw[var2]);
                var10.ph = var2;
                this.uw[var2] = var10;
              }
            }

            if (this.xw[var2] == 143) {
              var3 = this.vw[var2];
              var4 = this.ww[var2];
              var5 = var3 - this.aw.cr / 128;
              var6 = var4 - this.aw.dr / 128;
              var7 = 7;
              if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var5 > -var7 && var5 < var7 && var6 > -var7 && var6 < var7) {
                this.pt.sh(this.uw[var2]);
                var8 = "skulltorcha" + (this.ocb + 1);
                var9 = r.mo(var8);
                var10 = this.zw[var9].le();
                this.pt.oh(var10);
                var10.ne(true, 48, 48, -50, -10, -50);
                var10.vd(this.uw[var2]);
                var10.ph = var2;
                this.uw[var2] = var10;
              }
            }
          }
        }

        if (this.pcb != this.rcb) {
          this.rcb = this.pcb;

          for (var2 = 0; var2 < this.tw; ++var2) {
            if (this.xw[var2] == 97) {
              var3 = this.vw[var2];
              var4 = this.ww[var2];
              var5 = var3 - this.aw.cr / 128;
              var6 = var4 - this.aw.dr / 128;
              var7 = 9;
              if (var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var5 > -var7 && var5 < var7 && var6 > -var7 && var6 < var7) {
                this.pt.sh(this.uw[var2]);
                var8 = "firea" + (this.pcb + 1);
                var9 = r.mo(var8);
                var10 = this.zw[var9].le();
                this.pt.oh(var10);
                var10.ne(true, 48, 48, -50, -10, -50);
                var10.vd(this.uw[var2]);
                var10.ph = var2;
                this.uw[var2] = var10;
              }
            }
          }
        }

        this.pt.ei(this.xv);
        this.xv = 0;

        int var18;
        for (var2 = 0; var2 < this.wv; ++var2) {
          l var15 = this.zv[var2];
          if (var15.zr != 255) {
            var4 = var15.cr;
            var5 = var15.dr;
            var6 = -this.cv.jn(var4, var5);
            var18 = this.pt.fh(5000 + var2, var4, var6, var5, 145, 220, var2 + 10000);
            ++this.xv;
            if (var15 == this.aw) {
              this.pt.gh(var18);
            }

            if (var15.gr == 8) {
              this.pt.ii(var18, -30);
            }

            if (var15.gr == 9) {
              this.pt.ii(var18, 30);
            }
          }
        }

        l var17;
        int var19;
        for (var3 = 0; var3 < this.wv; ++var3) {
          l var16 = this.zv[var3];
          if (var16.es > 0) {
            var17 = null;
            if (var16.ds != -1) {
              var17 = this.gw[var16.ds];
            } else if (var16.cs != -1) {
              var17 = this.yv[var16.cs];
            }

            if (var17 != null) {
              var6 = var16.cr;
              var18 = var16.dr;
              var19 = -this.cv.jn(var6, var18) - 110;
              var9 = var17.cr;
              int var21 = var17.dr;
              int var11 = -this.cv.jn(var9, var21) - r.mhb[var17.er] / 2;
              int var12 = (var6 * var16.es + var9 * (this.uz - var16.es)) / this.uz;
              int var13 = (var19 * var16.es + var11 * (this.uz - var16.es)) / this.uz;
              int var14 = (var18 * var16.es + var21 * (this.uz - var16.es)) / this.uz;
              this.pt.fh(this.vz + var16.bs, var12, var13, var14, 32, 32, 0);
              ++this.xv;
            }
          }
        }

        for (var4 = 0; var4 < this.fw; ++var4) {
          var17 = this.hw[var4];
          var6 = var17.cr;
          var18 = var17.dr;
          var19 = -this.cv.jn(var6, var18);
          var9 = this.pt.fh(20000 + var4, var6, var19, var18, r.lhb[var17.er], r.mhb[var17.er], var4 + 30000);
          ++this.xv;
          if (var17.gr == 8) {
            this.pt.ii(var9, -30);
          }

          if (var17.gr == 9) {
            this.pt.ii(var9, 30);
          }
        }

        for (var5 = 0; var5 < this.mw; ++var5) {
          var6 = this.ow[var5] * this.tt + 64;
          var18 = this.pw[var5] * this.tt + 64;
          this.pt.fh('\u9c40' + this.qw[var5], var6, -this.cv.jn(var6, var18) - this.rw[var5], var18, 96, 64, var5 + 20000);
          ++this.xv;
        }

        this.qt.rk = false;
        this.qt.df();
        this.qt.rk = super.sq;
        if (this.uu == 3) {
          var6 = 40 + (int)(Math.random() * 3.0D);
          var18 = 40 + (int)(Math.random() * 7.0D);
          this.pt.th(true, var6, var18, -50, -10, -50);
        }

        this.bdb = 0;
        this.vcb = 0;
        this.gdb = 0;
        if (this.bt) {
          if (this.ct && !this.mu) {
            var6 = this.pu;
            this.xk();
            if (this.pu != var6) {
              this.nu = this.aw.cr;
              this.ou = this.aw.dr;
            }
          }

          this.pt.dm = 3000;
          this.pt.em = 3000;
          this.pt.fm = 1;
          this.pt.gm = 2800;
          this.zt = this.pu * 32;
          this.pt.uh(this.nu, -this.cv.jn(this.nu, this.ou), this.ou, 912, this.zt * 4, 0, 2000);
        } else {
          if (this.ct && !this.mu) {
            this.xk();
          }

          if (!super.sq) {
            this.pt.dm = 2400;
            this.pt.em = 2400;
            this.pt.fm = 1;
            this.pt.gm = 2300;
          } else {
            this.pt.dm = 2200;
            this.pt.em = 2200;
            this.pt.fm = 1;
            this.pt.gm = 2100;
          }

          this.pt.uh(this.nu, -this.cv.jn(this.nu, this.ou), this.ou, 912, this.zt * 4, 0, this.lu * 2);
        }

        this.pt.qi();
        this.nk();
        if (this.scb > 0) {
          this.qt.rg(this.tcb - 8, this.ucb - 8, this.az + 14 + (24 - this.scb) / 6);
        }

        if (this.scb < 0) {
          this.qt.rg(this.tcb - 8, this.ucb - 8, this.az + 18 + (24 + this.scb) / 6);
        }

        this.qt.ef("Fps: " + super.xq, 450, this.cu - 10, 1, 16776960);
        if (this.pz == 0) {
          for (var6 = 0; var6 < this.qz; ++var6) {
            if (this.sz[var6] > 0) {
              String var20 = this.rz[var6];
              this.qt.ef(var20, 7, this.cu - 18 - var6 * 12, 1, 16776960);
            }
          }
        }

        this.kz.nd(this.lz);
        this.kz.nd(this.nz);
        this.kz.nd(this.oz);
        if (this.pz == 1) {
          this.kz.bd(this.lz);
        } else if (this.pz == 2) {
          this.kz.bd(this.nz);
        } else if (this.pz == 3) {
          this.kz.bd(this.oz);
        }

        g.ig = 2;
        this.kz.fc();
        g.ig = 0;
        this.qt.vf(this.qt.sj - 3 - 197, 3, this.az);
        this.jk();
        this.qt.vk = false;
        this.rl();
        this.qt.cf(this.ot, 0, 11);
      }
    }
  }

  public void rl() {
    this.qt.rg(0, this.cu - 4, this.az + 23);
    int var1 = i.fg(200, 200, 255);
    if (this.pz == 0) {
      var1 = i.fg(255, 200, 50);
    }

    if (this.gz % 30 > 15) {
      var1 = i.fg(255, 50, 50);
    }

    this.qt.mg("All messages", 54, this.cu + 6, 0, var1);
    var1 = i.fg(200, 200, 255);
    if (this.pz == 1) {
      var1 = i.fg(255, 200, 50);
    }

    if (this.hz % 30 > 15) {
      var1 = i.fg(255, 50, 50);
    }

    this.qt.mg("Chat history", 155, this.cu + 6, 0, var1);
    var1 = i.fg(200, 200, 255);
    if (this.pz == 2) {
      var1 = i.fg(255, 200, 50);
    }

    if (this.iz % 30 > 15) {
      var1 = i.fg(255, 50, 50);
    }

    this.qt.mg("Quest history", 255, this.cu + 6, 0, var1);
    var1 = i.fg(200, 200, 255);
    if (this.pz == 3) {
      var1 = i.fg(255, 200, 50);
    }

    if (this.jz % 30 > 15) {
      var1 = i.fg(255, 50, 50);
    }

    this.qt.mg("Private history", 355, this.cu + 6, 0, var1);
  }

  public void hk(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
    int var8 = r.zfb[var5] + this.nw;
    int var9 = r.lgb[var5];
    this.qt.pf(var1, var2, var3, var4, var8, var9, 0, 0, false);
  }

  public void uk(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
    l var8 = this.hw[var5];
    int var9 = var8.gr + (this.zt + 16) / 32 & 7;
    boolean var10 = false;
    int var11 = var9;
    if (var9 == 5) {
      var11 = 3;
      var10 = true;
    } else if (var9 == 6) {
      var11 = 2;
      var10 = true;
    } else if (var9 == 7) {
      var11 = 1;
      var10 = true;
    }

    int var12 = var11 * 3 + this.vt[var8.fr / r.nhb[var8.er] % 4];
    boolean var23;
    if (var8.gr == 8) {
      var11 = 5;
      var23 = true;
      var10 = false;
      var1 -= r.phb[var8.er] * var7 / 100;
      var12 = var11 * 3 + this.wt[this.eu / (r.ohb[var8.er] - 1) % 8];
    } else if (var8.gr == 9) {
      var11 = 5;
      var23 = true;
      var10 = true;
      var1 += r.phb[var8.er] * var7 / 100;
      var12 = var11 * 3 + this.xt[this.eu / r.ohb[var8.er] % 8];
    }

    int var14;
    int var15;
    for (int var13 = 0; var13 < 12; ++var13) {
      var14 = this.kw[var11][var13];
      var15 = r.ghb[var8.er][var14];
      if (var15 >= 0) {
        byte var16 = 0;
        byte var17 = 0;
        int var18 = var12;
        if (var10 && var11 >= 1 && var11 <= 3 && r.yhb[var15] == 1) {
          var18 = var12 + 15;
        }

        if (var11 != 5 || r.xhb[var15] == 1) {
          int var19 = var18 + r.zhb[var15];
          int var24 = var16 * var3 / this.qt.jk[var19];
          int var25 = var17 * var4 / this.qt.kk[var19];
          int var20 = var3 * this.qt.jk[var19] / this.qt.jk[r.zhb[var15]];
          var24 -= (var20 - var3) / 2;
          int var21 = r.vhb[var15];
          int var22 = 0;
          if (var21 == 1) {
            var21 = r.hhb[var8.er];
            var22 = r.khb[var8.er];
          } else if (var21 == 2) {
            var21 = r.ihb[var8.er];
            var22 = r.khb[var8.er];
          } else if (var21 == 3) {
            var21 = r.jhb[var8.er];
            var22 = r.khb[var8.er];
          }

          this.qt.pf(var1 + var24, var2 + var25, var20, var4, var19, var21, var22, var6, var10);
        }
      }
    }

    if (var8.or > 0) {
      this.zcb[this.vcb] = this.qt.xe(var8.nr, 1) / 2;
      this.adb[this.vcb] = this.qt.ig(1);
      if (this.zcb[this.vcb] > 300) {
        this.zcb[this.vcb] = 300;
        this.adb[this.vcb] *= 2;
      }

      this.xcb[this.vcb] = var1 + var3 / 2;
      this.ycb[this.vcb] = var2;
      this.wcb[this.vcb++] = var8.nr;
    }

    if (var8.gr == 8 || var8.gr == 9 || var8.ur != 0) {
      if (var8.ur > 0) {
        var14 = var1;
        if (var8.gr == 8) {
          var14 = var1 - 20 * var7 / 100;
        } else if (var8.gr == 9) {
          var14 = var1 + 20 * var7 / 100;
        }

        var15 = var8.sr * 30 / var8.tr;
        this.hdb[this.gdb] = var14 + var3 / 2;
        this.idb[this.gdb] = var2;
        this.jdb[this.gdb++] = var15;
      }

      if (var8.ur > 150) {
        var14 = var1;
        if (var8.gr == 8) {
          var14 = var1 - 10 * var7 / 100;
        } else if (var8.gr == 9) {
          var14 = var1 + 10 * var7 / 100;
        }

        this.qt._if(var14 + var3 / 2, var2 + var4 / 2, this.az + 12);
        this.qt.mg(String.valueOf(var8.rr), var14 + var3 / 2 - 1, var2 + var4 / 2 + 5, 3, 16777215);
      }
    }

  }

  public void il(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
    l var8 = this.zv[var5];
    if (var8.zr != 255) {
      int var9 = var8.gr + (this.zt + 16) / 32 & 7;
      boolean var10 = false;
      int var11 = var9;
      if (var9 == 5) {
        var11 = 3;
        var10 = true;
      } else if (var9 == 6) {
        var11 = 2;
        var10 = true;
      } else if (var9 == 7) {
        var11 = 1;
        var10 = true;
      }

      int var12 = var11 * 3 + this.vt[var8.fr / 6 % 4];
      if (var8.gr == 8) {
        var11 = 5;
        var9 = 2;
        var10 = false;
        var1 -= 5 * var7 / 100;
        var12 = var11 * 3 + this.wt[this.eu / 5 % 8];
      } else if (var8.gr == 9) {
        var11 = 5;
        var9 = 2;
        var10 = true;
        var1 += 5 * var7 / 100;
        var12 = var11 * 3 + this.xt[this.eu / 6 % 8];
      }

      int var14;
      int var15;
      int var23;
      for (int var13 = 0; var13 < 12; ++var13) {
        var14 = this.kw[var9][var13];
        var15 = var8.mr[var14] - 1;
        if (var15 >= 0) {
          byte var16 = 0;
          byte var17 = 0;
          int var18 = var12;
          if (var10 && var11 >= 1 && var11 <= 3) {
            if (r.yhb[var15] == 1) {
              var18 = var12 + 15;
            } else if (var14 == 4 && var11 == 1) {
              var16 = -22;
              var17 = -3;
              var18 = var11 * 3 + this.vt[(2 + var8.fr / 6) % 4];
            } else if (var14 == 4 && var11 == 2) {
              var16 = 0;
              var17 = -8;
              var18 = var11 * 3 + this.vt[(2 + var8.fr / 6) % 4];
            } else if (var14 == 4 && var11 == 3) {
              var16 = 26;
              var17 = -5;
              var18 = var11 * 3 + this.vt[(2 + var8.fr / 6) % 4];
            } else if (var14 == 3 && var11 == 1) {
              var16 = 22;
              var17 = 3;
              var18 = var11 * 3 + this.vt[(2 + var8.fr / 6) % 4];
            } else if (var14 == 3 && var11 == 2) {
              var16 = 0;
              var17 = 8;
              var18 = var11 * 3 + this.vt[(2 + var8.fr / 6) % 4];
            } else if (var14 == 3 && var11 == 3) {
              var16 = -26;
              var17 = 5;
              var18 = var11 * 3 + this.vt[(2 + var8.fr / 6) % 4];
            }
          }

          if (var11 != 5 || r.xhb[var15] == 1) {
            int var19 = var18 + r.zhb[var15];
            var23 = var16 * var3 / this.qt.jk[var19];
            int var24 = var17 * var4 / this.qt.kk[var19];
            int var20 = var3 * this.qt.jk[var19] / this.qt.jk[r.zhb[var15]];
            var23 -= (var20 - var3) / 2;
            int var21 = r.vhb[var15];
            int var22 = 0;
            if (var21 == 1) {
              var21 = this.ccb[var8.xr];
              var22 = this.dcb[var8.as];
            } else if (var21 == 2) {
              var21 = this.bcb[var8.yr];
              var22 = this.dcb[var8.as];
            } else if (var21 == 3) {
              var21 = this.bcb[var8.zr];
              var22 = this.dcb[var8.as];
            }

            this.qt.pf(var1 + var23, var2 + var24, var20, var4, var19, var21, var22, var6, var10);
          }
        }
      }

      if (var8.or > 0) {
        this.zcb[this.vcb] = this.qt.xe(var8.nr, 1) / 2;
        this.adb[this.vcb] = this.qt.ig(1);
        if (this.zcb[this.vcb] > 300) {
          this.zcb[this.vcb] = 300;
          this.adb[this.vcb] *= 2;
        }

        this.xcb[this.vcb] = var1 + var3 / 2;
        this.ycb[this.vcb] = var2;
        this.wcb[this.vcb++] = var8.nr;
      }

      if (var8.qr > 0) {
        this.cdb[this.bdb] = var1 + var3 / 2;
        this.ddb[this.bdb] = var2;
        this.edb[this.bdb] = var7;
        this.fdb[this.bdb++] = var8.pr;
      }

      if (var8.gr == 8 || var8.gr == 9 || var8.ur != 0) {
        if (var8.ur > 0) {
          var14 = var1;
          if (var8.gr == 8) {
            var14 = var1 - 20 * var7 / 100;
          } else if (var8.gr == 9) {
            var14 = var1 + 20 * var7 / 100;
          }

          var15 = var8.sr * 30 / var8.tr;
          this.hdb[this.gdb] = var14 + var3 / 2;
          this.idb[this.gdb] = var2;
          this.jdb[this.gdb++] = var15;
        }

        if (var8.ur > 150) {
          var14 = var1;
          if (var8.gr == 8) {
            var14 = var1 - 10 * var7 / 100;
          } else if (var8.gr == 9) {
            var14 = var1 + 10 * var7 / 100;
          }

          this.qt._if(var14 + var3 / 2, var2 + var4 / 2, this.az + 11);
          this.qt.mg(String.valueOf(var8.rr), var14 + var3 / 2 - 1, var2 + var4 / 2 + 5, 3, 16777215);
        }
      }

      if (var8.hs == 1 && var8.qr == 0) {
        var14 = var6 + var1 + var3 / 2;
        if (var8.gr == 8) {
          var14 -= 20 * var7 / 100;
        } else if (var8.gr == 9) {
          var14 += 20 * var7 / 100;
        }

        var15 = 16 * var7 / 100;
        var23 = 16 * var7 / 100;
        this.qt.lf(var14 - var15 / 2, var2 - var23 / 2 - 10 * var7 / 100, var15, var23, this.az + 13);
      }

    }
  }

  public void nk() {
    int var2;
    int var3;
    int var4;
    int var5;
    int var7;
    for (int var1 = 0; var1 < this.vcb; ++var1) {
      var2 = this.xcb[var1];
      var3 = this.ycb[var1];
      var4 = this.zcb[var1];
      var5 = this.adb[var1];
      boolean var6 = true;

      while (var6) {
        var6 = false;

        for (var7 = 0; var7 < var1; ++var7) {
          if (var3 > this.ycb[var7] - this.adb[var7] && var3 - var5 < this.ycb[var7] && var2 - var4 < this.xcb[var7] + this.zcb[var7] && var2 + var4 > this.xcb[var7] - this.zcb[var7]) {
            var3 = this.ycb[var7] - var5;
            var6 = true;
          }
        }
      }

      this.ycb[var1] = var3;
      this.qt.ug(this.wcb[var1], var2, var3, 1, 16776960, 300);
    }

    int var12;
    for (var2 = 0; var2 < this.bdb; ++var2) {
      var3 = this.cdb[var2];
      var4 = this.ddb[var2];
      var5 = this.edb[var2];
      var12 = this.fdb[var2];
      var7 = 39 * var5 / 100;
      int var8 = 27 * var5 / 100;
      int var9 = var4 - var8;
      this.qt.wg(var3 - var7 / 2, var9, var7, var8, this.az + 9, 85);
      int var10 = 36 * var5 / 100;
      int var11 = 24 * var5 / 100;
      this.qt.pf(var3 - var10 / 2, var9 + var8 / 2 - var11 / 2, var10, var11, r.zfb[var12] + this.nw, r.lgb[var12], 0, 0, false);
    }

    for (var3 = 0; var3 < this.gdb; ++var3) {
      var4 = this.hdb[var3];
      var5 = this.idb[var3];
      var12 = this.jdb[var3];
      this.qt.nf(var4 - 15, var5 - 3, var12, 5, '\uff00', 192);
      this.qt.nf(var4 - 15 + var12, var5 - 3, 30 - var12, 5, 16711680, 192);
    }

  }

  public int dk(int var1) {
    int var2 = 0;

    for (int var3 = 0; var3 < this.ox; ++var3) {
      if (this.px[var3] == var1) {
        if (r.bgb[var1] == 1) {
          ++var2;
        } else {
          var2 += this.qx[var3];
        }
      }
    }

    return var2;
  }

  public boolean mk(int var1, int var2) {
    if (var1 == 31 && this.ok(197)) {
      return true;
    } else if (var1 == 32 && this.ok(102)) {
      return true;
    } else if (var1 == 33 && this.ok(101)) {
      return true;
    } else if (var1 == 34 && this.ok(103)) {
      return true;
    } else {
      return this.dk(var1) >= var2;
    }
  }

  public boolean ok(int var1) {
    for (int var2 = 0; var2 < this.ox; ++var2) {
      if (this.px[var2] == var1 && this.rx[var2] == 1) {
        return true;
      }
    }

    return false;
  }

  public void fk(int var1, int var2, int var3) {
    this.qt.gg(var1, var2, var3);
    this.qt.gg(var1 - 1, var2, var3);
    this.qt.gg(var1 + 1, var2, var3);
    this.qt.gg(var1, var2 - 1, var3);
    this.qt.gg(var1, var2 + 1, var3);
  }

  public void ul(int var1, int var2, int var3, int var4, boolean var5) {
    this.fl(var1, var2, var3, var4, var3, var4, false, var5);
  }

  public void gl(int var1, int var2, int var3, int var4, boolean var5) {
    if (!this.fl(var1, var2, var3, var4, var3, var4, false, var5)) {
      this.fl(var1, var2, var3, var4, var3, var4, true, var5);
    }
  }

  public void zk(int var1, int var2, int var3, int var4) {
    int var5;
    int var6;
    if (var3 != 0 && var3 != 4) {
      var6 = r.gib[var4];
      var5 = r.hib[var4];
    } else {
      var5 = r.gib[var4];
      var6 = r.hib[var4];
    }

    if (r.iib[var4] != 2 && r.iib[var4] != 3) {
      this.fl(this.bw, this.cw, var1, var2, var1 + var5 - 1, var2 + var6 - 1, true, true);
    } else {
      if (var3 == 0) {
        --var1;
        ++var5;
      }

      if (var3 == 2) {
        ++var6;
      }

      if (var3 == 4) {
        ++var5;
      }

      if (var3 == 6) {
        --var2;
        ++var6;
      }

      this.fl(this.bw, this.cw, var1, var2, var1 + var5 - 1, var2 + var6 - 1, false, true);
    }
  }

  public void dm(int var1, int var2, int var3) {
    if (var3 == 0) {
      this.fl(this.bw, this.cw, var1, var2 - 1, var1, var2, false, true);
    } else if (var3 == 1) {
      this.fl(this.bw, this.cw, var1 - 1, var2, var1, var2, false, true);
    } else {
      this.fl(this.bw, this.cw, var1, var2, var1, var2, true, true);
    }
  }

  public boolean fl(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
    int var9 = this.cv.cn(var1, var2, var3, var4, var5, var6, this.kx, this.lx, var7);
    if (var9 == -1) {
      return false;
    } else {
      --var9;
      var1 = this.kx[var9];
      var2 = this.lx[var9];
      --var9;
      if (var8) {
        super.dd.i(215);
      } else {
        super.dd.i(255);
      }

      super.dd.k(var1 + this.vu);
      super.dd.k(var2 + this.wu);

      for (int var10 = var9; var10 >= 0 && var10 > var9 - 25; --var10) {
        super.dd.n(this.kx[var10] - var1);
        super.dd.n(this.lx[var10] - var2);
      }

      this.ll();
      this.scb = -24;
      this.tcb = super.mq;
      this.ucb = super.nq;
      return true;
    }
  }

  public void yk(int var1, int var2) {
    if (this.fu != 0) {
      this.cv.web = false;
    } else {
      var1 += this.ru;
      var2 += this.su;
      if (this.uu == this.xu && var1 > this.yu && var1 < this.av && var2 > this.zu && var2 < this.bv) {
        this.cv.web = true;
      } else {
        this.qt.mg("Loading... Please wait", 256, 192, 1, 16777215);
        this.rl();
        this.qt.cf(this.ot, 0, 11);
        int var3 = this.vu;
        int var4 = this.wu;
        int var5 = (var1 + 24) / 48;
        int var6 = (var2 + 24) / 48;
        this.uu = this.xu;
        this.vu = var5 * 48 - 48;
        this.wu = var6 * 48 - 48;
        this.yu = var5 * 48 - 32;
        this.zu = var6 * 48 - 32;
        this.av = var5 * 48 + 32;
        this.bv = var6 * 48 + 32;
        this.cv.rn(var1, var2, this.uu);
        this.vu -= this.ru;
        this.wu -= this.su;
        int var7 = this.vu - var3;
        int var8 = this.wu - var4;

        int var10;
        int var11;
        int var12;
        int var14;
        int var15;
        for (int var9 = 0; var9 < this.tw; ++var9) {
          this.vw[var9] -= var7;
          this.ww[var9] -= var8;
          var10 = this.vw[var9];
          var11 = this.ww[var9];
          var12 = this.xw[var9];
          h var13 = this.uw[var9];

          try {
            var14 = this.yw[var9];
            int var16;
            if (var14 != 0 && var14 != 4) {
              var16 = r.gib[var12];
              var15 = r.hib[var12];
            } else {
              var15 = r.gib[var12];
              var16 = r.hib[var12];
            }

            int var17 = (var10 + var10 + var15) * this.tt / 2;
            int var18 = (var11 + var11 + var16) * this.tt / 2;
            if (var10 >= 0 && var11 >= 0 && var10 < 96 && var11 < 96) {
              this.pt.oh(var13);
              var13.ce(var17, -this.cv.jn(var17, var18), var18);
              this.cv.pn(var10, var11, var12);
              if (var12 == 74) {
                var13.wd(0, -480, 0);
              }
            }
          } catch (RuntimeException var20) {
            System.out.println("Loc Error: " + var20.getMessage());
            System.out.println("i:" + var9 + " obj:" + var13);
            var20.printStackTrace();
          }
        }

        int var21;
        for (var10 = 0; var10 < this.cx; ++var10) {
          this.ex[var10] -= var7;
          this.fx[var10] -= var8;
          var11 = this.ex[var10];
          var12 = this.fx[var10];
          var21 = this.hx[var10];
          var14 = this.gx[var10];

          try {
            this.cv.bo(var11, var12, var14, var21);
            h var24 = this.qk(var11, var12, var14, var21, var10);
            this.dx[var10] = var24;
          } catch (RuntimeException var19) {
            System.out.println("Bound Error: " + var19.getMessage());
            var19.printStackTrace();
          }
        }

        for (var11 = 0; var11 < this.mw; ++var11) {
          this.ow[var11] -= var7;
          this.pw[var11] -= var8;
        }

        for (var12 = 0; var12 < this.wv; ++var12) {
          l var22 = this.zv[var12];
          var22.cr -= var7 * this.tt;
          var22.dr -= var8 * this.tt;

          for (var14 = 0; var14 < var22.jr; ++var14) {
            var22.kr[var14] -= var7 * this.tt;
            var22.lr[var14] -= var8 * this.tt;
          }
        }

        for (var21 = 0; var21 < this.fw; ++var21) {
          l var23 = this.hw[var21];
          var23.cr -= var7 * this.tt;
          var23.dr -= var8 * this.tt;

          for (var15 = 0; var15 < var23.jr; ++var15) {
            var23.kr[var15] -= var7 * this.tt;
            var23.lr[var15] -= var8 * this.tt;
          }
        }

        this.cv.web = true;
        this.hu = false;
      }
    }
  }

  public h qk(int var1, int var2, int var3, int var4, int var5) {
    int var6 = var1;
    int var8 = var1;
    int var9 = var2;
    int var10 = r.rib[var4];
    int var11 = r.sib[var4];
    int var12 = r.qib[var4];
    h var13 = new h(4, 1);
    if (var3 == 0) {
      var8 = var1 + 1;
    }

    if (var3 == 1) {
      var9 = var2 + 1;
    }

    if (var3 == 2) {
      var6 = var1 + 1;
      var9 = var2 + 1;
    }

    if (var3 == 3) {
      var8 = var1 + 1;
      var9 = var2 + 1;
    }

    var6 *= this.tt;
    int var7 = var2 * this.tt;
    var8 *= this.tt;
    var9 *= this.tt;
    int var14 = var13.je(var6, -this.cv.jn(var6, var7), var7);
    int var15 = var13.je(var6, -this.cv.jn(var6, var7) - var12, var7);
    int var16 = var13.je(var8, -this.cv.jn(var8, var9) - var12, var9);
    int var17 = var13.je(var8, -this.cv.jn(var8, var9), var9);
    int[] var18 = new int[] {var14, var15, var16, var17};
    var13.ie(4, var18, var10, var11);
    var13.ne(false, 60, 24, -50, -10, -50);
    if (var1 >= 0 && var2 >= 0 && var1 < 96 && var2 < 96) {
      this.pt.oh(var13);
    }

    var13.ph = var5 + 10000;
    return var13;
  }

  public void jk() {
    if (this.gy && this.lt == 0) {
      this.rk();
    } else if (this.ux) {
      this.bm();
    } else if (this.gt != 0) {
      this.kk();
    } else if (this.ht != 0) {
      this.cm();
    } else if (this.ft == 1) {
      this.gm();
    } else if (!this.kt && this.jt > 180000 && this.lt == 0) {
      this.el();
    } else {
      if (this.wy) {
        this.nl();
      }

      if (this.aw.ur > 0) {
        this.ql();
      }

      this.pk();
      boolean var1 = !this.wy && !this.dv;
      if (var1) {
        this.iv = 0;
      }

      if (this.nx == 0 && var1) {
        this.tk();
      }

      if (this.nx == 1) {
        this.wl(var1);
      }

      if (this.nx == 2) {
        this.vk(var1);
      }

      if (this.nx == 3) {
        this.sk(var1);
      }

      if (this.nx == 4) {
        this.xl(var1);
      }

      if (this.nx == 5) {
        this.tl(var1);
      }

      if (this.nx == 6) {
        this.kl(var1);
      }

      if (!this.dv && !this.wy) {
        this.fm();
      }

      if (this.dv && !this.wy) {
        this.am();
      }
    }

    this.mx = 0;
  }

  public void nl() {
    int var1;
    if (this.mx == 0) {
      for (var1 = 0; var1 < this.xy; ++var1) {
        int var2 = 65535;
        if (super.mq < this.qt.xe(this.yy[var1], 1) && super.nq > var1 * 12 && super.nq < 12 + var1 * 12) {
          var2 = 16711680;
        }

        this.qt.ef(this.yy[var1], 6, 12 + var1 * 12, 1, var2);
      }

    } else {
      for (var1 = 0; var1 < this.xy; ++var1) {
        if (super.mq < this.qt.xe(this.yy[var1], 1) && super.nq > var1 * 12 && super.nq < 12 + var1 * 12) {
          super.dd.i(237);
          super.dd.n(var1);
          this.ll();
          break;
        }
      }

      this.mx = 0;
      this.wy = false;
    }
  }

  public void ql() {
    byte var1 = 7;
    byte var2 = 15;
    short var3 = 175;
    int var4;
    if (this.mx != 0) {
      for (var4 = 0; var4 < 5; ++var4) {
        if (var4 > 0 && super.mq > var1 && super.mq < var1 + var3 && super.nq > var2 + var4 * 20 && super.nq < var2 + var4 * 20 + 20) {
          this.tz = var4 - 1;
          this.mx = 0;
          super.dd.i(231);
          super.dd.n(this.tz);
          this.ll();
          break;
        }
      }
    }

    for (var4 = 0; var4 < 5; ++var4) {
      if (var4 == this.tz + 1) {
        this.qt.nf(var1, var2 + var4 * 20, var3, 20, i.fg(255, 0, 0), 128);
      } else {
        this.qt.nf(var1, var2 + var4 * 20, var3, 20, i.fg(190, 190, 190), 128);
      }

      this.qt.kg(var1, var2 + var4 * 20, var3, 0);
      this.qt.kg(var1, var2 + var4 * 20 + 20, var3, 0);
    }

    this.qt.mg("Select combat style", var1 + var3 / 2, var2 + 16, 3, 16777215);
    this.qt.mg("Controlled (+1 of each)", var1 + var3 / 2, var2 + 36, 3, 0);
    this.qt.mg("Aggressive (+3 strength)", var1 + var3 / 2, var2 + 56, 3, 0);
    this.qt.mg("Accurate   (+3 attack)", var1 + var3 / 2, var2 + 76, 3, 0);
    this.qt.mg("Defensive  (+3 defense)", var1 + var3 / 2, var2 + 96, 3, 0);
  }

  public void el() {
    if (this.mx != 0) {
      this.mx = 0;
      if (super.mq > 200 && super.mq < 300 && super.nq > 230 && super.nq < 253) {
        this.kt = true;
        return;
      }
    }

    byte var1 = 90;
    this.qt.qf(106, 70, 300, 190, 0);
    this.qt.hf(106, 70, 300, 190, 16777215);
    this.qt.mg("You have been playing for", 256, var1, 4, 16777215);
    int var3 = var1 + 20;
    this.qt.mg("over 1 hour. Please consider", 256, var3, 4, 16777215);
    var3 += 20;
    this.qt.mg("visiting our advertiser if you", 256, var3, 4, 16777215);
    var3 += 20;
    this.qt.mg("see an advert which interests you.", 256, var3, 4, 16777215);
    var3 += 40;
    this.qt.mg("Doing so will help ensure", 256, var3, 4, 16777215);
    var3 += 20;
    this.qt.mg("Runescape remains free.", 256, var3, 4, 16777215);
    var3 += 40;
    int var2 = 16777215;
    if (super.mq > 200 && super.mq < 300 && super.nq > var3 - 20 && super.nq < var3 + 3) {
      var2 = 16776960;
    }

    this.qt.mg("Close", 256, var3, 4, var2);
  }

  public void gm() {
    short var1;
    if (this.mx != 0) {
      this.mx = 0;
      var1 = 250;
      if (super.mq < 56 || super.nq < 70 || super.mq > 456 || super.nq > 260) {
        this.ft = 0;
        return;
      }

      if (super.mq > 250 && super.mq < 350 && super.nq > var1 - 20 && super.nq < var1 + 3) {
        this.ft = 0;
        return;
      }

      if (super.mq > 150 && super.mq < 250 && super.nq > var1 - 20 && super.nq < var1 + 3) {
        this.dt = !this.dt;
        super.dd.i(213);
        super.dd.n(1);
        super.dd.n(this.dt ? 1 : 0);
        super.dd.e();
        this.ft = 0;
        return;
      }
    }

    this.qt.qf(56, 70, 400, 190, 0);
    this.qt.hf(56, 70, 400, 190, 16777215);
    int var3 = 90;
    if (!this.dt) {
      this.qt.mg("Are you sure you want to change", 256, var3, 4, 16777215);
      var3 += 20;
      this.qt.mg("to being able to fight other players?", 256, var3, 4, 16777215);
      var3 += 40;
      this.qt.mg("If you do other players will be able to", 256, var3, 4, 16777215);
      var3 += 20;
      this.qt.mg("attack you, and you will probably die", 256, var3, 4, 16777215);
      var3 += 20;
      this.qt.mg("much more often.", 256, var3, 4, 16777215);
      var3 += 40;
    }

    if (this.dt) {
      this.qt.mg("Are you sure you want to change", 256, var3, 4, 16777215);
      var3 += 20;
      this.qt.mg("to not fighting other players?", 256, var3, 4, 16777215);
      var3 += 40;
      this.qt.mg("This will make you safe from attack,", 256, var3, 4, 16777215);
      var3 += 20;
      this.qt.mg("but will also preventing you from attacking", 256, var3, 4, 16777215);
      var3 += 20;
      this.qt.mg("others (except in the arena - coming soon)", 256, var3, 4, 16777215);
      var3 += 40;
    }

    if (this.et == 2) {
      this.qt.mg("You can only change a total of 2 times", 256, var3, 4, 16777215);
      var3 += 20;
    }

    if (this.et == 1) {
      this.qt.mg("You will not be allowed to change back again", 256, var3, 4, 16777215);
      var3 += 20;
    }

    var1 = 250;
    int var2 = 16777215;
    if (super.mq > 150 && super.mq < 250 && super.nq > var1 - 20 && super.nq < var1 + 3) {
      var2 = 16776960;
    }

    this.qt.mg("Yes I'm sure", 200, var1, 4, var2);
    var2 = 16777215;
    if (super.mq > 250 && super.mq < 350 && super.nq > var1 - 20 && super.nq < var1 + 3) {
      var2 = 16776960;
    }

    this.qt.mg("No thanks", 300, var1, 4, var2);
  }

  public void kk() {
    if (this.mx != 0) {
      this.mx = 0;
      if (super.mq < 106 || super.nq < 150 || super.mq > 406 || super.nq > 210) {
        this.gt = 0;
        return;
      }
    }

    short var1 = 150;
    this.qt.qf(106, var1, 300, 60, 0);
    this.qt.hf(106, var1, 300, 60, 16777215);
    int var4 = var1 + 22;
    String var2;
    int var3;
    if (this.gt == 1) {
      this.qt.mg("Please enter your new password", 256, var4, 4, 16777215);
      var4 += 25;
      var2 = "*";

      for (var3 = 0; var3 < super.tq.length(); ++var3) {
        var2 = "X" + var2;
      }

      this.qt.mg(var2, 256, var4, 4, 16777215);
      if (super.uq.length() > 0) {
        this.it = super.uq;
        super.tq = "";
        super.uq = "";
        this.gt = 2;
        return;
      }
    } else if (this.gt == 2) {
      this.qt.mg("Enter password again to confirm", 256, var4, 4, 16777215);
      var4 += 25;
      var2 = "*";

      for (var3 = 0; var3 < super.tq.length(); ++var3) {
        var2 = "X" + var2;
      }

      this.qt.mg(var2, 256, var4, 4, 16777215);
      if (super.uq.length() > 0) {
        if (super.uq.equalsIgnoreCase(this.it)) {
          this.gt = 4;
          this.ab(this.it);
          return;
        }

        this.gt = 3;
        return;
      }
    } else {
      if (this.gt == 3) {
        this.qt.mg("Passwords do not match!", 256, var4, 4, 16777215);
        var4 += 25;
        this.qt.mg("Press any key to close", 256, var4, 4, 16777215);
        return;
      }

      if (this.gt == 4) {
        this.qt.mg("Ok, your request has been sent", 256, var4, 4, 16777215);
        var4 += 25;
        this.qt.mg("Press any key to close", 256, var4, 4, 16777215);
      }
    }

  }

  public void cm() {
    if (this.mx != 0) {
      label118: {
        this.mx = 0;
        if (this.ht != 1 || super.mq >= 106 && super.nq >= 145 && super.mq <= 406 && super.nq <= 215) {
          if (this.ht == 2 && (super.mq < 6 || super.nq < 145 || super.mq > 506 || super.nq > 215)) {
            this.ht = 0;
            return;
          }

          if (this.ht != 3 || super.mq >= 106 && super.nq >= 145 && super.mq <= 406 && super.nq <= 215) {
            if (super.mq > 236 && super.mq < 276 && super.nq > 193 && super.nq < 213) {
              this.ht = 0;
              return;
            }
            break label118;
          }

          this.ht = 0;
          return;
        }

        this.ht = 0;
        return;
      }
    }

    int var1 = 145;
    String var2;
    if (this.ht == 1) {
      this.qt.qf(106, var1, 300, 70, 0);
      this.qt.hf(106, var1, 300, 70, 16777215);
      var1 += 20;
      this.qt.mg("Enter name to add to friends list", 256, var1, 4, 16777215);
      var1 += 20;
      this.qt.mg(super.tq + "*", 256, var1, 4, 16777215);
      if (super.uq.length() > 0) {
        var2 = super.uq.trim();
        super.tq = "";
        super.uq = "";
        this.ht = 0;
        if (var2.length() > 0 && o.rm(var2) != this.aw.yq) {
          this.gb(var2);
        }
      }
    }

    if (this.ht == 2) {
      this.qt.qf(6, var1, 500, 70, 0);
      this.qt.hf(6, var1, 500, 70, 16777215);
      var1 += 20;
      this.qt.mg("Enter message to send to " + o.tm(this.kcb), 256, var1, 4, 16777215);
      var1 += 20;
      this.qt.mg(super.vq + "*", 256, var1, 4, 16777215);
      if (super.wq.length() > 0) {
        var2 = super.wq;
        super.vq = "";
        super.wq = "";
        this.ht = 0;
        this.t(this.kcb, var2);
      }
    }

    if (this.ht == 3) {
      this.qt.qf(106, var1, 300, 70, 0);
      this.qt.hf(106, var1, 300, 70, 16777215);
      var1 += 20;
      this.qt.mg("Enter name to add to ignore list", 256, var1, 4, 16777215);
      var1 += 20;
      this.qt.mg(super.tq + "*", 256, var1, 4, 16777215);
      if (super.uq.length() > 0) {
        var2 = super.uq.trim();
        super.tq = "";
        super.uq = "";
        this.ht = 0;
        if (var2.length() > 0 && o.rm(var2) != this.aw.yq) {
          this.lb(var2);
        }
      }
    }

    int var3 = 16777215;
    if (super.mq > 236 && super.mq < 276 && super.nq > 193 && super.nq < 213) {
      var3 = 16776960;
    }

    this.qt.mg("Cancel", 256, 208, 1, var3);
  }

  public void rk() {
    int var3;
    int var4;
    int var5;
    int var6;
    int var7;
    if (this.mx != 0) {
      this.mx = 0;
      int var1 = super.mq - 52;
      int var2 = super.nq - 44;
      if (var1 < 0 || var2 < 12 || var1 >= 408 || var2 >= 246) {
        super.dd.i(218);
        this.ll();
        this.gy = false;
        return;
      }

      var3 = 0;

      for (var4 = 0; var4 < 5; ++var4) {
        for (var5 = 0; var5 < 8; ++var5) {
          var6 = 7 + var5 * 49;
          var7 = 28 + var4 * 34;
          if (var1 > var6 && var1 < var6 + 49 && var2 > var7 && var2 < var7 + 34 && this.jy[var3] != -1) {
            this.my = var3;
            this.ny = this.jy[var3];
          }

          ++var3;
        }
      }

      if (this.my >= 0) {
        var5 = this.jy[this.my];
        if (var5 != -1) {
          if (this.ky[this.my] > 0 && var1 > 298 && var2 >= 204 && var1 < 408 && var2 <= 215) {
            var6 = this.iy + this.ly[this.my];
            if (var6 < 10) {
              var6 = 10;
            }

            var7 = var6 * r.agb[var5] / 100;
            super.dd.i(217);
            super.dd.k(this.jy[this.my]);
            super.dd.k(var7);
            this.ll();
          }

          if (this.dk(var5) > 0 && var1 > 2 && var2 >= 229 && var1 < 112 && var2 <= 240) {
            var6 = this.hy + this.ly[this.my];
            if (var6 < 10) {
              var6 = 10;
            }

            var7 = var6 * r.agb[var5] / 100;
            super.dd.i(216);
            super.dd.k(this.jy[this.my]);
            super.dd.k(var7);
            this.ll();
          }
        }
      }
    }

    byte var11 = 52;
    byte var12 = 44;
    this.qt.qf(var11, var12, 408, 12, 192);
    var3 = 10000536;
    this.qt.nf(var11, var12 + 12, 408, 17, var3, 160);
    this.qt.nf(var11, var12 + 29, 8, 170, var3, 160);
    this.qt.nf(var11 + 399, var12 + 29, 9, 170, var3, 160);
    this.qt.nf(var11, var12 + 199, 408, 47, var3, 160);
    this.qt.ef("Buying and selling items", var11 + 1, var12 + 10, 1, 16777215);
    var4 = 16777215;
    if (super.mq > var11 + 320 && super.nq >= var12 && super.mq < var11 + 408 && super.nq < var12 + 12) {
      var4 = 16711680;
    }

    this.qt.sg("Close window", var11 + 406, var12 + 10, 1, var4);
    this.qt.ef("Shops stock in green", var11 + 2, var12 + 24, 1, '\uff00');
    this.qt.ef("Number you own in blue", var11 + 135, var12 + 24, 1, '\uffff');
    this.qt.ef("Your money: " + this.dk(10) + "gp", var11 + 280, var12 + 24, 1, 16776960);
    var5 = 13684944;
    var6 = 0;

    int var8;
    int var9;
    int var10;
    for (var7 = 0; var7 < 5; ++var7) {
      for (var8 = 0; var8 < 8; ++var8) {
        var9 = var11 + 7 + var8 * 49;
        var10 = var12 + 28 + var7 * 34;
        if (this.my == var6) {
          this.qt.nf(var9, var10, 49, 34, 16711680, 160);
        } else {
          this.qt.nf(var9, var10, 49, 34, var5, 160);
        }

        this.qt.hf(var9, var10, 50, 35, 0);
        if (this.jy[var6] != -1) {
          this.qt.pf(var9, var10, 48, 32, this.nw + r.zfb[this.jy[var6]], r.lgb[this.jy[var6]], 0, 0, false);
          this.qt.ef(String.valueOf(this.ky[var6]), var9 + 1, var10 + 10, 1, '\uff00');
          this.qt.sg(String.valueOf(this.dk(this.jy[var6])), var9 + 47, var10 + 10, 1, '\uffff');
        }

        ++var6;
      }
    }

    this.qt.kg(var11 + 5, var12 + 222, 398, 0);
    if (this.my == -1) {
      this.qt.mg("Select an object to buy or sell", var11 + 204, var12 + 214, 3, 16776960);
    } else {
      var8 = this.jy[this.my];
      if (var8 != -1) {
        if (this.ky[this.my] > 0) {
          var9 = this.iy + this.ly[this.my];
          if (var9 < 10) {
            var9 = 10;
          }

          var10 = var9 * r.agb[var8] / 100;
          this.qt.ef("Buy a new " + r.vfb[var8][0] + " for " + var10 + "gp", var11 + 2, var12 + 214, 1, 16776960);
          var4 = 16777215;
          if (super.mq > var11 + 298 && super.nq >= var12 + 204 && super.mq < var11 + 408 && super.nq <= var12 + 215) {
            var4 = 16711680;
          }

          this.qt.sg("Click here to buy", var11 + 405, var12 + 214, 3, var4);
        } else {
          this.qt.mg("This item is not currently available to buy", var11 + 204, var12 + 214, 3, 16776960);
        }

        if (this.dk(var8) > 0) {
          var9 = this.hy + this.ly[this.my];
          if (var9 < 10) {
            var9 = 10;
          }

          var10 = var9 * r.agb[var8] / 100;
          this.qt.sg("Sell your " + r.vfb[var8][0] + " for " + var10 + "gp", var11 + 405, var12 + 239, 1, 16776960);
          var4 = 16777215;
          if (super.mq > var11 + 2 && super.nq >= var12 + 229 && super.mq < var11 + 112 && super.nq <= var12 + 240) {
            var4 = 16711680;
          }

          this.qt.ef("Click here to sell", var11 + 2, var12 + 239, 3, var4);
          return;
        }

        this.qt.mg("You do not have any of this item to sell", var11 + 204, var12 + 239, 3, 16776960);
      }

    }
  }

  public void bm() {
    if (this.mx != 0 && this.fy == 0) {
      this.fy = 1;
    }

    int var3;
    int var5;
    int var6;
    int var7;
    int var8;
    int var16;
    if (this.fy > 0) {
      int var1 = super.mq - 22;
      int var2 = super.nq - 36;
      if (var1 >= 0 && var2 >= 0 && var1 < 468 && var2 < 262) {
        if (var1 > 216 && var2 > 30 && var1 < 462 && var2 < 235) {
          var3 = (var1 - 217) / 49 + (var2 - 31) / 34 * 5;
          if (var3 >= 0 && var3 < this.ox) {
            boolean var4 = false;
            var5 = 0;
            var6 = this.px[var3];

            for (var7 = 0; var7 < this.wx; ++var7) {
              if (this.xx[var7] == var6) {
                if (r.bgb[var6] == 0) {
                  for (var8 = 0; var8 < this.fy; ++var8) {
                    if (this.yx[var7] < this.qx[var3]) {
                      ++this.yx[var7];
                    }

                    var4 = true;
                  }
                } else {
                  ++var5;
                }
              }
            }

            if (this.dk(var6) <= var5) {
              var4 = true;
            }

            if (!var4 && this.wx < 12) {
              this.xx[this.wx] = var6;
              this.yx[this.wx] = 1;
              ++this.wx;
              var4 = true;
            }

            if (var4) {
              super.dd.i(234);
              super.dd.n(this.wx);

              for (var8 = 0; var8 < this.wx; ++var8) {
                super.dd.k(this.xx[var8]);
                super.dd.k(this.yx[var8]);
              }

              this.ll();
              this.cy = false;
              this.dy = false;
            }
          }
        }

        if (var1 > 8 && var2 > 30 && var1 < 205 && var2 < 133) {
          var3 = (var1 - 9) / 49 + (var2 - 31) / 34 * 4;
          if (var3 >= 0 && var3 < this.wx) {
            var16 = this.xx[var3];

            for (var5 = 0; var5 < this.fy; ++var5) {
              if (r.bgb[var16] != 0 || this.yx[var3] <= 1) {
                --this.wx;
                this.ey = 0;

                for (var6 = var3; var6 < this.wx; ++var6) {
                  this.xx[var6] = this.xx[var6 + 1];
                  this.yx[var6] = this.yx[var6 + 1];
                }
                break;
              }

              --this.yx[var3];
            }

            super.dd.i(234);
            super.dd.n(this.wx);

            for (var6 = 0; var6 < this.wx; ++var6) {
              super.dd.k(this.xx[var6]);
              super.dd.k(this.yx[var6]);
            }

            this.ll();
            this.cy = false;
            this.dy = false;
          }
        }

        if (var1 > 143 && var2 > 141 && var1 < 154 && var2 < 152) {
          this.dy = !this.dy;
          super.dd.i(232);
          super.dd.n(this.dy ? 1 : 0);
          this.ll();
        }

        if (var1 > 413 && var2 > 237 && var1 < 462 && var2 < 258) {
          this.ux = false;
          super.dd.i(233);
          this.ll();
        }
      } else if (this.mx != 0) {
        this.ux = false;
        super.dd.i(233);
        this.ll();
      }

      this.mx = 0;
      this.fy = 0;
    }

    if (this.ux) {
      byte var14 = 22;
      byte var15 = 36;
      this.qt.qf(var14, var15, 468, 12, 192);
      var3 = 10000536;
      this.qt.nf(var14, var15 + 12, 468, 18, var3, 160);
      this.qt.nf(var14, var15 + 30, 8, 248, var3, 160);
      this.qt.nf(var14 + 205, var15 + 30, 11, 248, var3, 160);
      this.qt.nf(var14 + 462, var15 + 30, 6, 248, var3, 160);
      this.qt.nf(var14 + 8, var15 + 133, 197, 22, var3, 160);
      this.qt.nf(var14 + 8, var15 + 258, 197, 20, var3, 160);
      this.qt.nf(var14 + 216, var15 + 235, 246, 43, var3, 160);
      var16 = 13684944;
      this.qt.nf(var14 + 8, var15 + 30, 197, 103, var16, 160);
      this.qt.nf(var14 + 8, var15 + 155, 197, 103, var16, 160);
      this.qt.nf(var14 + 216, var15 + 30, 246, 205, var16, 160);

      for (var5 = 0; var5 < 4; ++var5) {
        this.qt.kg(var14 + 8, var15 + 30 + var5 * 34, 197, 0);
      }

      for (var6 = 0; var6 < 4; ++var6) {
        this.qt.kg(var14 + 8, var15 + 155 + var6 * 34, 197, 0);
      }

      for (var7 = 0; var7 < 7; ++var7) {
        this.qt.kg(var14 + 216, var15 + 30 + var7 * 34, 246, 0);
      }

      for (var8 = 0; var8 < 6; ++var8) {
        if (var8 < 5) {
          this.qt.og(var14 + 8 + var8 * 49, var15 + 30, 103, 0);
        }

        if (var8 < 5) {
          this.qt.og(var14 + 8 + var8 * 49, var15 + 155, 103, 0);
        }

        this.qt.og(var14 + 216 + var8 * 49, var15 + 30, 205, 0);
      }

      this.qt.ef("Trading with: " + this.vx, var14 + 1, var15 + 10, 1, 16777215);
      this.qt.ef("Your Offer", var14 + 9, var15 + 27, 4, 16777215);
      this.qt.ef("Opponent's Offer", var14 + 9, var15 + 152, 4, 16777215);
      this.qt.ef("Your Inventory", var14 + 216, var15 + 27, 4, 16777215);
      this.qt.sg("Accepted", var14 + 204, var15 + 27, 4, '\uff00');
      this.qt.hf(var14 + 125, var15 + 16, 11, 11, '\uff00');
      if (this.cy) {
        this.qt.qf(var14 + 127, var15 + 18, 7, 7, '\uff00');
      }

      this.qt.sg("Accept", var14 + 204, var15 + 152, 4, '\uff00');
      this.qt.hf(var14 + 143, var15 + 141, 11, 11, '\uff00');
      if (this.dy) {
        this.qt.qf(var14 + 145, var15 + 143, 7, 7, '\uff00');
      }

      this.qt.sg("Close", var14 + 408 + 49, var15 + 251, 4, 12582912);
      this.qt.hf(var14 + 364 + 49, var15 + 237, 49, 21, 12582912);

      int var10;
      int var11;
      for (int var9 = 0; var9 < this.ox; ++var9) {
        var10 = 217 + var14 + var9 % 5 * 49;
        var11 = 31 + var15 + var9 / 5 * 34;
        this.qt.pf(var10, var11, 48, 32, this.nw + r.zfb[this.px[var9]], r.lgb[this.px[var9]], 0, 0, false);
        if (r.bgb[this.px[var9]] == 0) {
          this.qt.ef(String.valueOf(this.qx[var9]), var10 + 1, var11 + 10, 1, 16776960);
        }
      }

      int var12;
      for (var10 = 0; var10 < this.wx; ++var10) {
        var11 = 9 + var14 + var10 % 4 * 49;
        var12 = 31 + var15 + var10 / 4 * 34;
        this.qt.pf(var11, var12, 48, 32, this.nw + r.zfb[this.xx[var10]], r.lgb[this.xx[var10]], 0, 0, false);
        if (r.bgb[this.xx[var10]] == 0) {
          this.qt.ef(String.valueOf(this.yx[var10]), var11 + 1, var12 + 10, 1, 16776960);
        }

        if (super.mq > var11 && super.mq < var11 + 48 && super.nq > var12 && super.nq < var12 + 32) {
          this.qt.ef(r.vfb[this.xx[var10]][0] + ": @whi@" + r.wfb[this.xx[var10]], var14 + 8, var15 + 273, 1, 16776960);
        }
      }

      for (var11 = 0; var11 < this.zx; ++var11) {
        var12 = 9 + var14 + var11 % 4 * 49;
        int var13 = 156 + var15 + var11 / 4 * 34;
        this.qt.pf(var12, var13, 48, 32, this.nw + r.zfb[this.ay[var11]], r.lgb[this.ay[var11]], 0, 0, false);
        if (r.bgb[this.ay[var11]] == 0) {
          this.qt.ef(String.valueOf(this.by[var11]), var12 + 1, var13 + 10, 1, 16776960);
        }

        if (super.mq > var12 && super.mq < var12 + 48 && super.nq > var13 && super.nq < var13 + 32) {
          this.qt.ef(r.vfb[this.ay[var11]][0] + ": @whi@" + r.wfb[this.ay[var11]], var14 + 8, var15 + 273, 1, 16776960);
        }
      }

    }
  }

  public void pk() {
    if (this.nx == 0 && super.mq >= this.qt.sj - 35 && super.nq >= 3 && super.mq < this.qt.sj - 3 && super.nq < 35) {
      this.nx = 1;
    }

    if (this.nx == 0 && super.mq >= this.qt.sj - 35 - 33 && super.nq >= 3 && super.mq < this.qt.sj - 3 - 33 && super.nq < 35) {
      this.nx = 2;
    }

    if (this.nx == 0 && super.mq >= this.qt.sj - 35 - 66 && super.nq >= 3 && super.mq < this.qt.sj - 3 - 66 && super.nq < 35) {
      this.nx = 3;
    }

    if (this.nx == 0 && super.mq >= this.qt.sj - 35 - 99 && super.nq >= 3 && super.mq < this.qt.sj - 3 - 99 && super.nq < 35) {
      this.nx = 4;
    }

    if (this.nx == 0 && super.mq >= this.qt.sj - 35 - 132 && super.nq >= 3 && super.mq < this.qt.sj - 3 - 132 && super.nq < 35) {
      this.nx = 5;
    }

    if (this.nx == 0 && super.mq >= this.qt.sj - 35 - 165 && super.nq >= 3 && super.mq < this.qt.sj - 3 - 165 && super.nq < 35) {
      this.nx = 6;
    }

    if (this.nx != 0 && super.mq >= this.qt.sj - 35 && super.nq >= 3 && super.mq < this.qt.sj - 3 && super.nq < 26) {
      this.nx = 1;
    }

    if (this.nx != 0 && super.mq >= this.qt.sj - 35 - 33 && super.nq >= 3 && super.mq < this.qt.sj - 3 - 33 && super.nq < 26) {
      this.nx = 2;
    }

    if (this.nx != 0 && super.mq >= this.qt.sj - 35 - 66 && super.nq >= 3 && super.mq < this.qt.sj - 3 - 66 && super.nq < 26) {
      this.nx = 3;
    }

    if (this.nx != 0 && super.mq >= this.qt.sj - 35 - 99 && super.nq >= 3 && super.mq < this.qt.sj - 3 - 99 && super.nq < 26) {
      this.nx = 4;
    }

    if (this.nx != 0 && super.mq >= this.qt.sj - 35 - 132 && super.nq >= 3 && super.mq < this.qt.sj - 3 - 132 && super.nq < 26) {
      this.nx = 5;
    }

    if (this.nx != 0 && super.mq >= this.qt.sj - 35 - 165 && super.nq >= 3 && super.mq < this.qt.sj - 3 - 165 && super.nq < 26) {
      this.nx = 6;
    }

    if (this.nx == 1 && (super.mq < this.qt.sj - 248 || super.nq > 240)) {
      this.nx = 0;
    }

    if (this.nx >= 2 && this.nx <= 5 && (super.mq < this.qt.sj - 199 || super.nq > 240)) {
      this.nx = 0;
    }

    if (this.nx == 6 && (super.mq < this.qt.sj - 199 || super.nq > 267)) {
      this.nx = 0;
    }

  }

  public void wl(boolean var1) {
    int var2 = this.qt.sj - 248;
    this.qt.rg(var2, 3, this.az + 1);

    int var4;
    int var5;
    for (int var3 = 0; var3 < 30; ++var3) {
      var4 = var2 + var3 % 5 * 49;
      var5 = 36 + var3 / 5 * 34;
      if (var3 < this.ox && this.rx[var3] == 1) {
        this.qt.nf(var4, var5, 49, 34, 16711680, 128);
      } else {
        this.qt.nf(var4, var5, 49, 34, i.fg(181, 181, 181), 128);
      }

      if (var3 < this.ox) {
        this.qt.pf(var4, var5, 48, 32, this.nw + r.zfb[this.px[var3]], r.lgb[this.px[var3]], 0, 0, false);
        if (r.bgb[this.px[var3]] == 0) {
          this.qt.ef(String.valueOf(this.qx[var3]), var4 + 1, var5 + 10, 1, 16776960);
        }
      }
    }

    for (var4 = 1; var4 <= 4; ++var4) {
      this.qt.og(var2 + var4 * 49, 36, 204, 0);
    }

    for (var5 = 1; var5 <= 5; ++var5) {
      this.qt.kg(var2, 36 + var5 * 34, 245, 0);
    }

    if (var1) {
      var2 = super.mq - (this.qt.sj - 248);
      int var6 = super.nq - 36;
      if (var2 >= 0 && var6 >= 0 && var2 < 248 && var6 < 204) {
        int var7 = var2 / 49 + var6 / 34 * 5;
        if (var7 < this.ox) {
          int var8 = this.px[var7];
          if (this.lcb >= 0) {
            int scb = this.lcb & 0xFF;
            boolean pcb = (this.lcb & 0x100) == 0;
            if ((pcb && r.vjb[scb] == 3) || (!pcb && r.vkb[scb] == 3)) {
              this.mv[this.iv] = this.mcb + (pcb ? r.rjb[scb] : r.rkb[scb]) + " on";
              this.lv[this.iv] = "@lre@" + r.vfb[var8][0];
              this.nv[this.iv] = 600;
              this.qv[this.iv] = var7;
              this.rv[this.iv] = this.lcb;
              ++this.iv;
              return;
            }
          } else {
            if (this.sx >= 0) {
              this.mv[this.iv] = "Use " + this.tx + " with";
              this.lv[this.iv] = "@lre@" + r.vfb[var8][0];
              this.nv[this.iv] = 610;
              this.qv[this.iv] = var7;
              this.rv[this.iv] = this.sx;
              ++this.iv;
              return;
            }

            if (this.rx[var7] == 1) {
              this.mv[this.iv] = "Remove";
              this.lv[this.iv] = "@lre@" + r.vfb[var8][0];
              this.nv[this.iv] = 620;
              this.qv[this.iv] = var7;
              ++this.iv;
            } else if (r.jgb[var8] != 0) {
              if ((r.jgb[var8] & 24) != 0) {
                this.mv[this.iv] = "Wield";
              } else {
                this.mv[this.iv] = "Wear";
              }

              this.lv[this.iv] = "@lre@" + r.vfb[var8][0];
              this.nv[this.iv] = 630;
              this.qv[this.iv] = var7;
              ++this.iv;
            }

            if (!r.yfb[var8].equals("_")) {
              this.mv[this.iv] = r.yfb[var8];
              this.lv[this.iv] = "@lre@" + r.vfb[var8][0];
              this.nv[this.iv] = 640;
              this.qv[this.iv] = var7;
              ++this.iv;
            }

            this.mv[this.iv] = "Use";
            this.lv[this.iv] = "@lre@" + r.vfb[var8][0];
            this.nv[this.iv] = 650;
            this.qv[this.iv] = var7;
            ++this.iv;
            this.mv[this.iv] = "Drop";
            this.lv[this.iv] = "@lre@" + r.vfb[var8][0];
            this.nv[this.iv] = 660;
            this.qv[this.iv] = var7;
            ++this.iv;
            this.mv[this.iv] = "Examine";
            this.lv[this.iv] = "@lre@" + r.vfb[var8][0];
            this.nv[this.iv] = 3600;
            this.qv[this.iv] = var8;
            ++this.iv;
          }
        }
      }

    }
  }

  public void vk(boolean var1) {
    int var2 = this.qt.sj - 199;
    short var3 = 156;
    short var4 = 152;
    this.qt.rg(var2 - 49, 3, this.az + 2);
    var2 += 40;
    this.qt.qf(var2, 36, var3, var4, 0);
    this.qt.kf(var2, 36, var2 + var3, 36 + var4);
    short var5 = 192;
    int var6 = (this.aw.cr - 6040) * 3 * var5 / 2048;
    int var7 = (this.aw.dr - 6040) * 3 * var5 / 2048;
    int var8 = j.hm[1024 - this.zt * 4 & 1023];
    int var9 = j.hm[(1024 - this.zt * 4 & 1023) + 1024];
    int var10 = var7 * var8 + var6 * var9 >> 18;
    var7 = var7 * var9 - var6 * var8 >> 18;
    this.qt.gf(var2 + var3 / 2 - var10, 36 + var4 / 2 + var7, this.az - 1, this.zt + 64 & 255, var5);

    for (int var11 = 0; var11 < this.tw; ++var11) {
      var6 = (this.vw[var11] * this.tt + 64 - this.aw.cr) * 3 * var5 / 2048;
      var7 = (this.ww[var11] * this.tt + 64 - this.aw.dr) * 3 * var5 / 2048;
      var10 = var7 * var8 + var6 * var9 >> 18;
      var7 = var7 * var9 - var6 * var8 >> 18;
      this.fk(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, '\uffff');
    }

    for (int var12 = 0; var12 < this.mw; ++var12) {
      var6 = (this.ow[var12] * this.tt + 64 - this.aw.cr) * 3 * var5 / 2048;
      var7 = (this.pw[var12] * this.tt + 64 - this.aw.dr) * 3 * var5 / 2048;
      var10 = var7 * var8 + var6 * var9 >> 18;
      var7 = var7 * var9 - var6 * var8 >> 18;
      this.fk(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 16711680);
    }

    for (int var13 = 0; var13 < this.fw; ++var13) {
      l var14 = this.hw[var13];
      var6 = (var14.cr - this.aw.cr) * 3 * var5 / 2048;
      var7 = (var14.dr - this.aw.dr) * 3 * var5 / 2048;
      var10 = var7 * var8 + var6 * var9 >> 18;
      var7 = var7 * var9 - var6 * var8 >> 18;
      this.fk(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 16776960);
    }

    for (int var16 = 0; var16 < this.wv; ++var16) {
      l var15 = this.zv[var16];
      var6 = (var15.cr - this.aw.cr) * 3 * var5 / 2048;
      var7 = (var15.dr - this.aw.dr) * 3 * var5 / 2048;
      var10 = var7 * var8 + var6 * var9 >> 18;
      var7 = var7 * var9 - var6 * var8 >> 18;
      this.fk(var2 + var3 / 2 + var10, 36 + var4 / 2 - var7, 16777215);
    }

    this.qt.rf(var2 + var3 / 2, 36 + var4 / 2, 2, 16777215, 255);
    this.qt.gf(var2 + 19, 55, this.az + 24, this.zt + 128 & 255, 128);
    this.qt.kf(0, 0, this.bu, this.cu + 12);
    if (var1) {
      var2 = super.mq - (this.qt.sj - 199);
      int var17 = super.nq - 36;
      if (var2 >= 40 && var17 >= 0 && var2 < 196 && var17 < 152) {
        var3 = 156;
        var4 = 152;
        var5 = 192;
        var2 = this.qt.sj - 199;
        var2 += 40;
        var6 = (super.mq - (var2 + var3 / 2)) * 16384 / (3 * var5);
        var7 = (super.nq - (36 + var4 / 2)) * 16384 / (3 * var5);
        var8 = j.hm[1024 - this.zt * 4 & 1023];
        var9 = j.hm[(1024 - this.zt * 4 & 1023) + 1024];
        var10 = var7 * var8 + var6 * var9 >> 15;
        var7 = var7 * var9 - var6 * var8 >> 15;
        var6 = var10 + this.aw.cr;
        var7 = this.aw.dr - var7;
        if (this.mx == 1) {
          this.ul(this.bw, this.cw, var6 / 128, var7 / 128, false);
        }

        this.mx = 0;
      }

    }
  }

  public void sk(boolean var1) {
    int var2 = this.qt.sj - 199;
    this.qt.rg(var2 - 49, 3, this.az + 3);
    short var3 = 196;
    short var4 = 182;
    this.qt.nf(var2, 36, var3, var4, i.fg(181, 181, 181), 160);
    byte var5 = 48;
    this.qt.ef("Skills", var2 + 5, var5, 3, 16776960);
    int var8 = var5 + 12;

    for (int var6 = 0; var6 < 10; ++var6) {
      if (var6 < 9) {
        this.qt.ef(this.sy[var6] + ":@yel@" + this.oy[var6] + "/" + this.py[var6], var2 + 5, var8, 2, 16777215);
      }
      this.qt.ef(this.sy[var6 + 9] + ":@yel@" + this.oy[var6 + 9] + "/" + this.py[var6 + 9], var2 + var3 / 2 - 8, var8 - 12, 2, 16777215);
      var8 += 12;
    }
    var8 -= 4;

    this.qt.ef("Equipment Status", var2 + 5, var8, 3, 16776960);
    var8 += 12;

    for (int var7 = 0; var7 < 3; ++var7) {
      this.qt.ef(this.ty[var7] + ":@yel@" + this.qy[var7], var2 + 5, var8, 2, 16777215);
      this.qt.ef(this.ty[var7 + 3] + ":@yel@" + this.qy[var7 + 3], var2 + var3 / 2 + 25, var8, 2, 16777215);
      var8 += 12;
    }

  }

  public void xl(boolean var1) {
    int var2 = this.qt.sj - 199;
    byte var3 = 36;
    this.qt.rg(var2 - 49, 3, this.az + 4);
    short var4 = 196;
    short var5 = 182;
    int var7;
    int var6 = var7 = i.fg(160, 160, 160);
    if (this.gcb == 0) {
      var6 = i.fg(220, 220, 220);
    } else {
      var7 = i.fg(220, 220, 220);
    }

    this.qt.nf(var2, var3, var4 / 2, 24, var6, 128);
    this.qt.nf(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
    this.qt.nf(var2, var3 + 24, var4, 90, i.fg(220, 220, 220), 128);
    this.qt.nf(var2, var3 + 24 + 90, var4, var5 - 90 - 24, i.fg(160, 160, 160), 128);
    this.qt.kg(var2, var3 + 24, var4, 0);
    this.qt.og(var2 + var4 / 2, var3, 24, 0);
    this.qt.kg(var2, var3 + 113, var4, 0);
    this.qt.mg("Good magic", var2 + var4 / 4, var3 + 16, 4, 0);
    this.qt.mg("Evil magic", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
    int var8;
    int var9;
    int var11;
    int var17;
    if (this.gcb == 0) {
      this.ecb.kc(this.fcb);
      var8 = 0;

      int var12;
      for (var9 = 0; var9 < r.qjb; ++var9) {
        String var10 = "@yel@";

        for (var11 = 0; var11 < r.ujb[var9]; ++var11) {
          var12 = r.xjb[var9][var11];
          if (!this.mk(var12, r.yjb[var9][var11])) {
            var10 = "@whi@";
            break;
          }
        }

        var12 = this.oy[9];
        if (r.tjb[var9] > var12) {
          var10 = "@bla@";
        }

        this.ecb.ad(this.fcb, var8++, var10 + "Level " + r.tjb[var9] + ": " + r.rjb[var9]);
      }

      this.ecb.fc();
      var17 = this.ecb.hc(this.fcb);
      if (var17 != -1) {
        this.qt.ef("Level " + r.tjb[var17] + ": " + r.rjb[var17], var2 + 2, var3 + 124, 1, 0);
        this.qt.ef(r.sjb[var17], var2 + 2, var3 + 136, 0, 0);

        for (var11 = 0; var11 < r.ujb[var17]; ++var11) {
          var12 = r.xjb[var17][var11];
          this.qt.rg(var2 + 2 + var11 * 44, var3 + 150, this.nw + r.zfb[var12]);
          int var13 = this.dk(var12);
          int var14 = r.yjb[var17][var11];
          String var15 = "@red@";
          if (this.mk(var12, var14)) {
            var15 = "@gre@";
          }

          this.qt.ef(var15 + var13 + "/" + var14, var2 + 2 + var11 * 44, var3 + 150, 1, 16777215);
        }
      } else {
        this.qt.ef("Point at a spell for a description", var2 + 2, var3 + 124, 1, 0);
      }
    }

    if (this.gcb == 1) {
      this.ecb.kc(this.fcb);
      var8 = 0;

      int var12;
      for (var9 = 0; var9 < r.qkb; ++var9) {
        String var10 = "@yel@";

        for (var11 = 0; var11 < r.ukb[var9]; ++var11) {
          var12 = r.xkb[var9][var11];
          if (!this.mk(var12, r.ykb[var9][var11])) {
            var10 = "@whi@";
            break;
          }
        }

        var12 = this.oy[10];
        if (r.tkb[var9] > var12) {
          var10 = "@bla@";
        }

        this.ecb.ad(this.fcb, var8++, var10 + "Level " + r.tkb[var9] + ": " + r.rkb[var9]);
      }

      this.ecb.fc();
      var17 = this.ecb.hc(this.fcb);
      if (var17 != -1) {
        this.qt.ef("Level " + r.tkb[var17] + ": " + r.rkb[var17], var2 + 2, var3 + 124, 1, 0);
        this.qt.ef(r.skb[var17], var2 + 2, var3 + 136, 0, 0);

        for (var11 = 0; var11 < r.ukb[var17]; ++var11) {
          var12 = r.xkb[var17][var11];
          this.qt.rg(var2 + 2 + var11 * 44, var3 + 150, this.nw + r.zfb[var12]);
          int var13 = this.dk(var12);
          int var14 = r.ykb[var17][var11];
          String var15 = "@red@";
          if (this.mk(var12, var14)) {
            var15 = "@gre@";
          }

          this.qt.ef(var15 + var13 + "/" + var14, var2 + 2 + var11 * 44, var3 + 150, 1, 16777215);
        }
      } else {
        this.qt.ef("Point at a spell for a description", var2 + 2, var3 + 124, 1, 0);
      }
    }

    if (var1) {
      var2 = super.mq - (this.qt.sj - 199);
      int var16 = super.nq - 36;
      if (var2 >= 0 && var16 >= 0 && var2 < 196 && var16 < 182) {
        this.ecb.md(var2 + (this.qt.sj - 199), var16 + 36, super.pq, super.oq);
        if (var16 <= 24 && this.mx == 1) {
          if (var2 < 98 && this.gcb == 1) {
            this.gcb = 0;
            this.ecb.xc(this.fcb);
          } else if (var2 > 98 && this.gcb == 0) {
            this.gcb = 1;
            this.ecb.xc(this.fcb);
          }
        }

        if (this.mx == 1 && this.gcb == 0) {
          var8 = this.ecb.hc(this.fcb);
          if (var8 != -1) {
            var9 = this.oy[9];
            if (r.tjb[var8] > var9) {
              this.gk("Your good magic ability is not high enough for this spell", 3);
            } else {
              for (var17 = 0; var17 < r.ujb[var8]; ++var17) {
                var11 = r.xjb[var8][var17];
                if (!this.mk(var11, r.yjb[var8][var17])) {
                  this.gk("You don't have all the reagents you need for this spell", 3);
                  var17 = -1;
                  break;
                }
              }

              if (var17 == r.ujb[var8]) {
                this.lcb = var8 + (0 << 8);
                this.sx = -1;
                this.mcb = "Cast ";
              }
            }
          }
        }

        if (this.mx == 1 && this.gcb == 1) {
          var8 = this.ecb.hc(this.fcb);
          if (var8 != -1) {
            var9 = this.oy[10];
            if (r.tkb[var8] > var9) {
              this.gk("Your evil magic ability is not high enough for this spell", 3);
            } else {
              for (var17 = 0; var17 < r.ukb[var8]; ++var17) {
                var11 = r.xkb[var8][var17];
                if (!this.mk(var11, r.ykb[var8][var17])) {
                  this.gk("You don't have all the reagents you need for this spell", 3);
                  var17 = -1;
                  break;
                }
              }

              if (var17 == r.ukb[var8]) {
                this.lcb = var8 + (1 << 8);
                this.sx = -1;
                this.mcb = "Cast ";
              }
            }
          }
        }

        this.mx = 0;
      }

    }
  }

  public void tl(boolean var1) {
    int var2 = this.qt.sj - 199;
    byte var3 = 36;
    this.qt.rg(var2 - 49, 3, this.az + 5);
    short var4 = 196;
    short var5 = 182;
    int var7;
    int var6 = var7 = i.fg(160, 160, 160);
    if (this.jcb == 0) {
      var6 = i.fg(220, 220, 220);
    } else {
      var7 = i.fg(220, 220, 220);
    }

    this.qt.nf(var2, var3, var4 / 2, 24, var6, 128);
    this.qt.nf(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
    this.qt.nf(var2, var3 + 24, var4, var5 - 24, i.fg(220, 220, 220), 128);
    this.qt.kg(var2, var3 + 24, var4, 0);
    this.qt.og(var2 + var4 / 2, var3, 24, 0);
    this.qt.kg(var2, var3 + var5 - 16, var4, 0);
    this.qt.mg("Friends", var2 + var4 / 4, var3 + 16, 4, 0);
    this.qt.mg("Ignore", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
    this.hcb.kc(this.icb);
    int var8;
    if (this.jcb == 0) {
      for (var8 = 0; var8 < super.jd; ++var8) {
        String var9;
        if (super.ld[var8] == 2) {
          var9 = "@gre@";
        } else if (super.ld[var8] == 1) {
          var9 = "@yel@";
        } else {
          var9 = "@red@";
        }

        this.hcb.ad(this.icb, var8, var9 + o.tm(super.kd[var8]) + "~439~@whi@Remove         WWWWWWWWWW");
      }
    }

    if (this.jcb == 1) {
      for (var8 = 0; var8 < super.md; ++var8) {
        this.hcb.ad(this.icb, var8, "@yel@" + o.tm(super.nd[var8]) + "~439~@whi@Remove         WWWWWWWWWW");
      }
    }

    this.hcb.fc();
    int var11;
    if (this.jcb == 0) {
      var8 = this.hcb.hc(this.icb);
      if (var8 >= 0 && super.mq < 489) {
        if (super.mq > 429) {
          this.qt.mg("Click to remove " + o.tm(super.kd[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
        } else if (super.ld[var8] == 2) {
          this.qt.mg("Click to message " + o.tm(super.kd[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
        } else if (super.ld[var8] == 1) {
          this.qt.mg(o.tm(super.kd[var8]) + " is on a different server", var2 + var4 / 2, var3 + 35, 1, 16777215);
        } else {
          this.qt.mg(o.tm(super.kd[var8]) + " is offline", var2 + var4 / 2, var3 + 35, 1, 16777215);
        }
      } else {
        this.qt.mg("Click a name to send a message", var2 + var4 / 2, var3 + 35, 1, 16777215);
      }

      if (super.mq > var2 && super.mq < var2 + var4 && super.nq > var3 + var5 - 16 && super.nq < var3 + var5) {
        var11 = 16776960;
      } else {
        var11 = 16777215;
      }

      this.qt.mg("Click here to add a friend", var2 + var4 / 2, var3 + var5 - 3, 1, var11);
    }

    if (this.jcb == 1) {
      var8 = this.hcb.hc(this.icb);
      if (var8 >= 0 && super.mq < 489 && super.mq > 429) {
        if (super.mq > 429) {
          this.qt.mg("Click to remove " + o.tm(super.nd[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
        }
      } else {
        this.qt.mg("Blocking messages from:", var2 + var4 / 2, var3 + 35, 1, 16777215);
      }

      if (super.mq > var2 && super.mq < var2 + var4 && super.nq > var3 + var5 - 16 && super.nq < var3 + var5) {
        var11 = 16776960;
      } else {
        var11 = 16777215;
      }

      this.qt.mg("Click here to add a name", var2 + var4 / 2, var3 + var5 - 3, 1, var11);
    }

    if (var1) {
      var2 = super.mq - (this.qt.sj - 199);
      int var10 = super.nq - 36;
      if (var2 >= 0 && var10 >= 0 && var2 < 196 && var10 < 182) {
        this.hcb.md(var2 + (this.qt.sj - 199), var10 + 36, super.pq, super.oq);
        if (var10 <= 24 && this.mx == 1) {
          if (var2 < 98 && this.jcb == 1) {
            this.jcb = 0;
            this.hcb.xc(this.icb);
          } else if (var2 > 98 && this.jcb == 0) {
            this.jcb = 1;
            this.hcb.xc(this.icb);
          }
        }

        if (this.mx == 1 && this.jcb == 0) {
          var8 = this.hcb.hc(this.icb);
          if (var8 >= 0 && super.mq < 489) {
            if (super.mq > 429) {
              this.y(super.kd[var8]);
            } else if (super.ld[var8] != 0) {
              this.ht = 2;
              this.kcb = super.kd[var8];
              super.vq = "";
              super.wq = "";
            }
          }
        }

        if (this.mx == 1 && this.jcb == 1) {
          var8 = this.hcb.hc(this.icb);
          if (var8 >= 0 && super.mq < 489 && super.mq > 429) {
            this.cb(super.nd[var8]);
          }
        }

        if (var10 > 166 && this.mx == 1 && this.jcb == 0) {
          this.ht = 1;
          super.tq = "";
          super.uq = "";
        }

        if (var10 > 166 && this.mx == 1 && this.jcb == 1) {
          this.ht = 3;
          super.tq = "";
          super.uq = "";
        }

        this.mx = 0;
      }

    }
  }

  public void kl(boolean var1) {
    int var2 = this.qt.sj - 199;
    byte var3 = 36;
    this.qt.rg(var2 - 49, 3, this.az + 6);
    short var4 = 196;
    this.qt.nf(var2, 36, var4, 90, i.fg(181, 181, 181), 160);
    this.qt.nf(var2, 126, var4, 105, i.fg(201, 2011, 201), 160);
    this.qt.nf(var2, 231, var4, 30, i.fg(181, 181, 181), 160);
    int var5 = var2 + 3;
    int var6 = var3 + 15;
    this.qt.ef("Game options - click to toggle", var5, var6, 1, 0);
    var6 += 15;
    if (this.ct) {
      this.qt.ef("Camera angle mode - @gre@Auto", var5, var6, 1, 16777215);
    } else {
      this.qt.ef("Camera angle mode - @red@Manual", var5, var6, 1, 16777215);
    }

    var6 += 15;
    if (this.kv) {
      this.qt.ef("Mouse buttons - @red@One", var5, var6, 1, 16777215);
    } else {
      this.qt.ef("Mouse buttons - @gre@Two", var5, var6, 1, 16777215);
    }

    var6 += 15;
    if (this.dt) {
      this.qt.ef("Player type: @red@Player-Killer", var5, var6, 1, 16777215);
    } else {
      this.qt.ef("Player type: @gre@Non Player-Killer", var5, var6, 1, 16777215);
    }

    var6 += 15;
    int var7 = 16777215;
    if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4) {
      var7 = 16776960;
    }

    this.qt.ef("Change password", var5, var6, 1, var7);
    var6 += 15;
    var6 += 15;
    this.qt.ef("Privacy settings. Will be applied to", var2 + 3, var6, 1, 0);
    var6 += 15;
    this.qt.ef("all people not on your friends list", var2 + 3, var6, 1, 0);
    var6 += 15;
    if (super.od == 0) {
      this.qt.ef("Hide online-status: @red@<off>", var2 + 3, var6, 1, 16777215);
    } else {
      this.qt.ef("Hide online-status: @gre@<on>", var2 + 3, var6, 1, 16777215);
    }

    var6 += 15;
    if (super.pd == 0) {
      this.qt.ef("Block chat messages: @red@<off>", var2 + 3, var6, 1, 16777215);
    } else {
      this.qt.ef("Block chat messages: @gre@<on>", var2 + 3, var6, 1, 16777215);
    }

    var6 += 15;
    if (super.qd == 0) {
      this.qt.ef("Block private messages: @red@<off>", var2 + 3, var6, 1, 16777215);
    } else {
      this.qt.ef("Block private messages: @gre@<on>", var2 + 3, var6, 1, 16777215);
    }

    var6 += 15;
    if (super.rd == 0) {
      this.qt.ef("Block trade requests: @red@<off>", var2 + 3, var6, 1, 16777215);
    } else {
      this.qt.ef("Block trade requests: @gre@<on>", var2 + 3, var6, 1, 16777215);
    }

    var6 += 15;
    var6 += 15;
    var7 = 16777215;
    if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4) {
      var7 = 16776960;
    }

    this.qt.ef("Click here to logout", var2 + 3, var6, 1, var7);
    if (var1) {
      var2 = super.mq - (this.qt.sj - 199);
      int var11 = super.nq - 36;
      if (var2 >= 0 && var11 >= 0 && var2 < 196 && var11 < 231) {
        int var8 = this.qt.sj - 199;
        byte var9 = 36;
        var4 = 196;
        var5 = var8 + 3;
        var6 = var9 + 30;
        if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4 && this.mx == 1) {
          this.ct = !this.ct;
          super.dd.i(213);
          super.dd.n(0);
          super.dd.n(this.ct ? 1 : 0);
          super.dd.e();
        }

        var6 += 15;
        if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4 && this.mx == 1) {
          this.kv = !this.kv;
          super.dd.i(213);
          super.dd.n(2);
          super.dd.n(this.kv ? 1 : 0);
          super.dd.e();
        }

        var6 += 15;
        if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4 && this.mx == 1 && this.et > 0) {
          this.ft = 1;
        }

        var6 += 15;
        if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4 && this.mx == 1) {
          this.gt = 1;
          super.tq = "";
          super.uq = "";
        }

        boolean var10 = false;
        var6 += 60;
        if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4 && this.mx == 1) {
          super.od = 1 - super.od;
          var10 = true;
        }

        var6 += 15;
        if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4 && this.mx == 1) {
          super.pd = 1 - super.pd;
          var10 = true;
        }

        var6 += 15;
        if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4 && this.mx == 1) {
          super.qd = 1 - super.qd;
          var10 = true;
        }

        var6 += 15;
        if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4 && this.mx == 1) {
          super.rd = 1 - super.rd;
          var10 = true;
        }

        if (var10) {
          this.nb(super.od, super.pd, super.qd, super.rd, 0);
        }

        var6 += 30;
        if (super.mq > var5 && super.mq < var5 + var4 && super.nq > var6 - 12 && super.nq < var6 + 4 && this.mx == 1) {
          if (this.lt > 450) {
            this.gk("@cya@You can't logout during combat!", 3);
          } else {
            if (this.lt <= 0) {
              this.mb();
              return;
            }

            this.gk("@cya@You can't logout for 10 seconds after combat", 3);
          }
        }

        this.mx = 0;
      }

    }
  }

  public void tk() {
    int var1 = -1;

    for (int var2 = 0; var2 < this.tw; ++var2) {
      this.ax[var2] = false;
    }

    for (int var3 = 0; var3 < this.cx; ++var3) {
      this.ix[var3] = false;
    }

    int var4 = this.pt.mi();
    h[] var5 = this.pt.ih();
    int[] var6 = this.pt.hi();

    for (int var7 = 0; var7 < var4; ++var7) {
      int var8 = var6[var7];
      h var9 = var5[var7];
      if (var9.qh[var8] <= 65535 || var9.qh[var8] >= 200000 && var9.qh[var8] <= 300000) {
        int var10;
        int var11;
        if (var9 != this.pt.vn) {
          if (var9 != null && var9.ph >= 10000) {
            var10 = var9.ph - 10000;
            var11 = this.hx[var10];
            if (!this.ix[var10]) {
              if (this.lcb >= 0) {
                int scb = this.lcb & 0xFF;
                boolean pcb = (this.lcb & 0x100) == 0;
                if ((pcb && r.vjb[scb] == 4) || (!pcb && r.vkb[scb] == 4)) {
                  this.mv[this.iv] = this.mcb + (pcb ? r.rjb[scb] : r.rkb[scb]) + " on";
                  this.lv[this.iv] = "@cya@" + r.mib[var11][0];
                  this.nv[this.iv] = 300;
                  this.ov[this.iv] = this.ex[var10];
                  this.pv[this.iv] = this.fx[var10];
                  this.qv[this.iv] = this.gx[var10];
                  this.rv[this.iv] = this.lcb;
                  ++this.iv;
                }
              } else if (this.sx >= 0) {
                this.mv[this.iv] = "Use " + this.tx + " with";
                this.lv[this.iv] = "@cya@" + r.mib[var11][0];
                this.nv[this.iv] = 310;
                this.ov[this.iv] = this.ex[var10];
                this.pv[this.iv] = this.fx[var10];
                this.qv[this.iv] = this.gx[var10];
                this.rv[this.iv] = this.sx;
                ++this.iv;
              } else {
                if (!r.oib[var11].equalsIgnoreCase("WalkTo")) {
                  this.mv[this.iv] = r.oib[var11];
                  this.lv[this.iv] = "@cya@" + r.mib[var11][0];
                  this.nv[this.iv] = 320;
                  this.ov[this.iv] = this.ex[var10];
                  this.pv[this.iv] = this.fx[var10];
                  this.qv[this.iv] = this.gx[var10];
                  ++this.iv;
                }

                if (!r.pib[var11].equalsIgnoreCase("Examine")) {
                  this.mv[this.iv] = r.pib[var11];
                  this.lv[this.iv] = "@cya@" + r.mib[var11][0];
                  this.nv[this.iv] = 2300;
                  this.ov[this.iv] = this.ex[var10];
                  this.pv[this.iv] = this.fx[var10];
                  this.qv[this.iv] = this.gx[var10];
                  ++this.iv;
                }

                this.mv[this.iv] = "Examine";
                this.lv[this.iv] = "@cya@" + r.mib[var11][0];
                this.nv[this.iv] = 3300;
                this.qv[this.iv] = var11;
                ++this.iv;
              }

              this.ix[var10] = true;
            }
          } else if (var9 != null && var9.ph >= 0) {
            var10 = var9.ph;
            var11 = this.xw[var10];
            if (!this.ax[var10]) {
              if (this.lcb >= 0) {
                int scb = this.lcb & 0xFF;
                boolean pcb = (this.lcb & 0x100) == 0;
                if ((pcb && r.vjb[scb] == 5) || (!pcb && r.vkb[scb] == 5)) {
                  this.mv[this.iv] = this.mcb + (pcb ? r.rjb[scb] : r.rkb[scb]) + " on";
                  this.lv[this.iv] = "@cya@" + r.bib[var11][0];
                  this.nv[this.iv] = 400;
                  this.ov[this.iv] = this.vw[var10];
                  this.pv[this.iv] = this.ww[var10];
                  this.qv[this.iv] = this.yw[var10];
                  this.rv[this.iv] = this.xw[var10];
                  this.sv[this.iv] = this.lcb;
                  ++this.iv;
                }
              } else if (this.sx >= 0) {
                this.mv[this.iv] = "Use " + this.tx + " with";
                this.lv[this.iv] = "@cya@" + r.bib[var11][0];
                this.nv[this.iv] = 410;
                this.ov[this.iv] = this.vw[var10];
                this.pv[this.iv] = this.ww[var10];
                this.qv[this.iv] = this.yw[var10];
                this.rv[this.iv] = this.xw[var10];
                this.sv[this.iv] = this.sx;
                ++this.iv;
              } else {
                if (!r.dib[var11].equalsIgnoreCase("WalkTo")) {
                  this.mv[this.iv] = r.dib[var11];
                  this.lv[this.iv] = "@cya@" + r.bib[var11][0];
                  this.nv[this.iv] = 420;
                  this.ov[this.iv] = this.vw[var10];
                  this.pv[this.iv] = this.ww[var10];
                  this.qv[this.iv] = this.yw[var10];
                  this.rv[this.iv] = this.xw[var10];
                  ++this.iv;
                }

                if (!r.eib[var11].equalsIgnoreCase("Examine")) {
                  this.mv[this.iv] = r.eib[var11];
                  this.lv[this.iv] = "@cya@" + r.bib[var11][0];
                  this.nv[this.iv] = 2400;
                  this.ov[this.iv] = this.vw[var10];
                  this.pv[this.iv] = this.ww[var10];
                  this.qv[this.iv] = this.yw[var10];
                  this.rv[this.iv] = this.xw[var10];
                  ++this.iv;
                }

                this.mv[this.iv] = "Examine";
                this.lv[this.iv] = "@cya@" + r.bib[var11][0];
                this.nv[this.iv] = 3400;
                this.qv[this.iv] = var11;
                ++this.iv;
              }

              this.ax[var10] = true;
            }
          } else {
            if (var8 >= 0) {
              var8 = var9.qh[var8] - 200000;
            }

            if (var8 >= 0) {
              var1 = var8;
            }
          }
        } else {
          var10 = var9.qh[var8] % 10000;
          var11 = var9.qh[var8] / 10000;
          String var12;
          int var13;
          int var14;
          if (var11 == 1) {
            var12 = "";
            var13 = -1;
            var14 = this.zv[var10].vr;
            if (var14 == 1) {
              var13 = 0;
              if (this.aw.wr > 0 && this.zv[var10].wr > 0) {
                var13 = this.aw.wr - this.zv[var10].wr;
              }

              if (var13 < 0) {
                var12 = "@or1@";
              }

              if (var13 < -3) {
                var12 = "@or2@";
              }

              if (var13 < -6) {
                var12 = "@or3@";
              }

              if (var13 < -9) {
                var12 = "@red@";
              }

              if (var13 > 0) {
                var12 = "@gr1@";
              }

              if (var13 > 3) {
                var12 = "@gr2@";
              }

              if (var13 > 6) {
                var12 = "@gr3@";
              }

              if (var13 > 9) {
                var12 = "@gre@";
              }

              var12 = " " + var12 + "(level-" + this.zv[var10].wr + ")";
            }

            if (this.lcb >= 0) {
              int scb = this.lcb & 0xFF;
              boolean pcb = (this.lcb & 0x100) == 0;
              if ((pcb && (r.vjb[scb] == 1 || r.vjb[scb] == 2 && var14 == 1 && this.aw.vr == 1))
                || (!pcb && (r.vkb[scb] == 1 || r.vkb[scb] == 2 && var14 == 1 && this.aw.vr == 1))) {
                this.mv[this.iv] = this.mcb + (pcb ? r.rjb[scb] : r.rkb[scb]) + " on";
                this.lv[this.iv] = "@whi@" + this.zv[var10].zq;
                this.nv[this.iv] = 800;
                this.ov[this.iv] = this.zv[var10].cr;
                this.pv[this.iv] = this.zv[var10].dr;
                this.qv[this.iv] = this.zv[var10].ar;
                this.rv[this.iv] = this.lcb;
                ++this.iv;
              }
            } else if (this.sx >= 0) {
              this.mv[this.iv] = "Use " + this.tx + " with";
              this.lv[this.iv] = "@whi@" + this.zv[var10].zq;
              this.nv[this.iv] = 810;
              this.ov[this.iv] = this.zv[var10].cr;
              this.pv[this.iv] = this.zv[var10].dr;
              this.qv[this.iv] = this.zv[var10].ar;
              this.rv[this.iv] = this.sx;
              ++this.iv;
            } else {
              if (var14 == 1 && this.aw.vr == 1) {
                this.mv[this.iv] = "Attack";
                this.lv[this.iv] = "@whi@" + this.zv[var10].zq + var12;
                if (var13 >= 0 && var13 < 5) {
                  this.nv[this.iv] = 805;
                } else {
                  this.nv[this.iv] = 2805;
                }

                this.ov[this.iv] = this.zv[var10].cr;
                this.pv[this.iv] = this.zv[var10].dr;
                this.qv[this.iv] = this.zv[var10].ar;
                ++this.iv;
              }

              this.mv[this.iv] = "Trade with";
              this.lv[this.iv] = "@whi@" + this.zv[var10].zq;
              this.nv[this.iv] = 2810;
              this.qv[this.iv] = this.zv[var10].ar;
              ++this.iv;
              this.mv[this.iv] = "Follow";
              this.lv[this.iv] = "@whi@" + this.zv[var10].zq;
              this.nv[this.iv] = 2820;
              this.qv[this.iv] = this.zv[var10].ar;
              ++this.iv;
            }
          } else if (var11 == 2) {
            if (this.lcb >= 0) {
              int scb = this.lcb & 0xFF;
              boolean pcb = (this.lcb & 0x100) == 0;
              if ((pcb && r.vjb[scb] == 3) || (!pcb && r.vkb[scb] == 3)) {
                this.mv[this.iv] = this.mcb + (pcb ? r.rjb[scb] : r.rkb[scb]) + " on";
                this.lv[this.iv] = "@lre@" + r.vfb[this.qw[var10]][0];
                this.nv[this.iv] = 200;
                this.ov[this.iv] = this.ow[var10];
                this.pv[this.iv] = this.pw[var10];
                this.qv[this.iv] = this.qw[var10];
                this.rv[this.iv] = this.lcb;
                ++this.iv;
              }
            } else if (this.sx >= 0) {
              this.mv[this.iv] = "Use " + this.tx + " with";
              this.lv[this.iv] = "@lre@" + r.vfb[this.qw[var10]][0];
              this.nv[this.iv] = 210;
              this.ov[this.iv] = this.ow[var10];
              this.pv[this.iv] = this.pw[var10];
              this.qv[this.iv] = this.qw[var10];
              this.rv[this.iv] = this.sx;
              ++this.iv;
            } else {
              this.mv[this.iv] = "Take";
              this.lv[this.iv] = "@lre@" + r.vfb[this.qw[var10]][0];
              this.nv[this.iv] = 220;
              this.ov[this.iv] = this.ow[var10];
              this.pv[this.iv] = this.pw[var10];
              this.qv[this.iv] = this.qw[var10];
              ++this.iv;
              this.mv[this.iv] = "Examine";
              this.lv[this.iv] = "@lre@" + r.vfb[this.qw[var10]][0];
              this.nv[this.iv] = 3200;
              this.qv[this.iv] = this.qw[var10];
              ++this.iv;
            }
          } else if (var11 == 3) {
            var12 = "";
            var13 = -1;
            var14 = this.hw[var10].er;
            if (r.vgb[var14] > 0) {
              int var15 = (r.rgb[var14] + r.ugb[var14] + r.sgb[var14] + r.tgb[var14]) / 4;
              int var16 = (this.py[0] + this.py[1] + this.py[2] + this.py[3] + 27) / 4;
              var13 = var16 - var15;
              var12 = "@yel@";
              if (var13 < 0) {
                var12 = "@or1@";
              }

              if (var13 < -3) {
                var12 = "@or2@";
              }

              if (var13 < -6) {
                var12 = "@or3@";
              }

              if (var13 < -9) {
                var12 = "@red@";
              }

              if (var13 > 0) {
                var12 = "@gr1@";
              }

              if (var13 > 3) {
                var12 = "@gr2@";
              }

              if (var13 > 6) {
                var12 = "@gr3@";
              }

              if (var13 > 9) {
                var12 = "@gre@";
              }

              var12 = " " + var12 + "(level-" + var15 + ")";
            }

            if (this.lcb >= 0) {
              int scb = this.lcb & 0xFF;
              boolean pcb = (this.lcb & 0x100) == 0;
              if ((pcb && r.vjb[scb] == 2) || (!pcb && r.vkb[scb] == 2)) {
                this.mv[this.iv] = this.mcb + (pcb ? r.rjb[scb] : r.rkb[scb]) + " on";
                this.lv[this.iv] = "@yel@" + r.pgb[this.hw[var10].er][0];
                this.nv[this.iv] = 700;
                this.ov[this.iv] = this.hw[var10].cr;
                this.pv[this.iv] = this.hw[var10].dr;
                this.qv[this.iv] = this.hw[var10].ar;
                this.rv[this.iv] = this.lcb;
                ++this.iv;
              }
            } else if (this.sx >= 0) {
              this.mv[this.iv] = "Use " + this.tx + " with";
              this.lv[this.iv] = "@yel@" + r.pgb[this.hw[var10].er][0];
              this.nv[this.iv] = 710;
              this.ov[this.iv] = this.hw[var10].cr;
              this.pv[this.iv] = this.hw[var10].dr;
              this.qv[this.iv] = this.hw[var10].ar;
              this.rv[this.iv] = this.sx;
              ++this.iv;
            } else {
              if (r.vgb[var14] > 0) {
                this.mv[this.iv] = "Attack";
                this.lv[this.iv] = "@yel@" + r.pgb[this.hw[var10].er][0] + var12;
                if (var13 >= 0) {
                  this.nv[this.iv] = 715;
                } else {
                  this.nv[this.iv] = 2715;
                }

                this.ov[this.iv] = this.hw[var10].cr;
                this.pv[this.iv] = this.hw[var10].dr;
                this.qv[this.iv] = this.hw[var10].ar;
                ++this.iv;
              }

              this.mv[this.iv] = "Talk-to";
              this.lv[this.iv] = "@yel@" + r.pgb[this.hw[var10].er][0];
              this.nv[this.iv] = 720;
              this.ov[this.iv] = this.hw[var10].cr;
              this.pv[this.iv] = this.hw[var10].dr;
              this.qv[this.iv] = this.hw[var10].ar;
              ++this.iv;
              this.mv[this.iv] = "Examine";
              this.lv[this.iv] = "@yel@" + r.pgb[this.hw[var10].er][0];
              this.nv[this.iv] = 3700;
              this.qv[this.iv] = this.hw[var10].er;
              ++this.iv;
            }
          }
        }
      }
    }

    int scb = this.lcb & 0xFF;
    boolean pcb = (this.lcb & 0x100) == 0;
    if (this.lcb >= 0 && ((pcb && r.vjb[scb] <= 1) || (!pcb && r.vkb[scb] <= 1))) {
      this.mv[this.iv] = this.mcb + "on self";
      this.lv[this.iv] = "";
      this.nv[this.iv] = 1000;
      this.qv[this.iv] = this.lcb;
      ++this.iv;
    }

    if (var1 != -1) {
      if (this.lcb >= 0) {
        if ((pcb && r.vjb[scb] == 6) || (!pcb && r.vkb[scb] == 6)) {
          this.mv[this.iv] = this.mcb + "on ground";
          this.lv[this.iv] = "";
          this.nv[this.iv] = 900;
          this.ov[this.iv] = this.cv.reb[var1];
          this.pv[this.iv] = this.cv.seb[var1];
          this.qv[this.iv] = this.lcb;
          ++this.iv;
          return;
        }
      } else if (this.sx < 0) {
        this.mv[this.iv] = "Walk here";
        this.lv[this.iv] = "";
        this.nv[this.iv] = 920;
        this.ov[this.iv] = this.cv.reb[var1];
        this.pv[this.iv] = this.cv.seb[var1];
        ++this.iv;
      }
    }

  }

  public void am() {
    int var1;
    int var2;
    int var3;
    if (this.mx == 0) {
      if (super.mq >= this.ev - 10 && super.nq >= this.fv - 10 && super.mq <= this.ev + this.gv + 10 && super.nq <= this.fv + this.hv + 10) {
        this.qt.nf(this.ev, this.fv, this.gv, this.hv, 13684944, 160);
        this.qt.ef("Choose option", this.ev + 2, this.fv + 12, 1, '\uffff');

        for (var1 = 0; var1 < this.iv; ++var1) {
          var2 = this.ev + 2;
          var3 = this.fv + 27 + var1 * 15;
          int var4 = 16777215;
          if (super.mq > var2 - 2 && super.nq > var3 - 12 && super.nq < var3 + 4 && super.mq < var2 - 3 + this.gv) {
            var4 = 16776960;
          }

          this.qt.ef(this.mv[this.tv[var1]] + " " + this.lv[this.tv[var1]], var2, var3, 1, var4);
        }

      } else {
        this.dv = false;
      }
    } else {
      for (var1 = 0; var1 < this.iv; ++var1) {
        var2 = this.ev + 2;
        var3 = this.fv + 27 + var1 * 15;
        if (super.mq > var2 - 2 && super.nq > var3 - 12 && super.nq < var3 + 4 && super.mq < var2 - 3 + this.gv) {
          this.jl(this.tv[var1]);
          break;
        }
      }

      this.mx = 0;
      this.dv = false;
    }
  }

  public void fm() {
    if (this.lcb >= 0 || this.sx >= 0) {
      this.mv[this.iv] = "Cancel";
      this.lv[this.iv] = "";
      this.nv[this.iv] = 4000;
      ++this.iv;
    }

    for (int var1 = 0; var1 < this.iv; this.tv[var1] = var1++) {
      ;
    }

    boolean var2 = false;

    int var3;
    int var4;
    while (!var2) {
      var2 = true;

      for (var3 = 0; var3 < this.iv - 1; ++var3) {
        var4 = this.tv[var3];
        int var5 = this.tv[var3 + 1];
        if (this.nv[var4] > this.nv[var5]) {
          this.tv[var3] = var5;
          this.tv[var3 + 1] = var4;
          var2 = false;
        }
      }
    }

    if (this.iv > 20) {
      this.iv = 20;
    }

    if (this.iv > 0) {
      var3 = -1;

      for (var4 = 0; var4 < this.iv; ++var4) {
        if (this.lv[this.tv[var4]] != null && this.lv[this.tv[var4]].length() > 0) {
          var3 = var4;
          break;
        }
      }

      String var8 = null;
      if ((this.sx >= 0 || this.lcb >= 0) && this.iv == 1) {
        var8 = "Choose a target";
      } else if ((this.sx >= 0 || this.lcb >= 0) && this.iv > 1) {
        var8 = "@whi@" + this.mv[this.tv[0]] + " " + this.lv[this.tv[0]];
      } else if (var3 != -1) {
        var8 = this.lv[this.tv[var3]] + ": @whi@" + this.mv[this.tv[0]];
      }

      if (this.iv == 2 && var8 != null) {
        var8 = var8 + "@whi@ / 1 more option";
      }

      if (this.iv > 2 && var8 != null) {
        var8 = var8 + "@whi@ / " + (this.iv - 1) + " more options";
      }

      if (var8 != null) {
        this.qt.ef(var8, 6, 14, 1, 16776960);
      }

      if (!this.kv && this.mx == 1 || this.kv && this.mx == 1 && this.iv == 1) {
        this.jl(this.tv[0]);
        this.mx = 0;
        return;
      }

      if (!this.kv && this.mx == 2 || this.kv && this.mx == 1) {
        this.hv = (this.iv + 1) * 15;
        this.gv = this.qt.xe("Choose option", 1) + 5;

        for (int var6 = 0; var6 < this.iv; ++var6) {
          int var7 = this.qt.xe(this.mv[var6] + " " + this.lv[var6], 1) + 5;
          if (var7 > this.gv) {
            this.gv = var7;
          }
        }

        this.ev = super.mq - this.gv / 2;
        this.fv = super.nq - 7;
        this.dv = true;
        if (this.ev < 0) {
          this.ev = 0;
        }

        if (this.fv < 0) {
          this.fv = 0;
        }

        if (this.ev + this.gv > 510) {
          this.ev = 510 - this.gv;
        }

        if (this.fv + this.hv > 315) {
          this.fv = 315 - this.hv;
        }

        this.mx = 0;
      }
    }

  }

  public void jl(int var1) {
    int var2 = this.ov[var1];
    int var3 = this.pv[var1];
    int var4 = this.qv[var1];
    int var5 = this.rv[var1];
    int var6 = this.sv[var1];
    int var7 = this.nv[var1];
    if (var7 == 200) {
      this.gl(this.bw, this.cw, var2, var3, true);
      super.dd.i(224);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      super.dd.k(var4);
      super.dd.k(var5);
      this.ll();
      this.lcb = -1;
    }

    if (var7 == 210) {
      this.gl(this.bw, this.cw, var2, var3, true);
      super.dd.i(250);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      super.dd.k(var4);
      super.dd.k(var5);
      this.ll();
      this.sx = -1;
    }

    if (var7 == 220) {
      this.gl(this.bw, this.cw, var2, var3, true);
      super.dd.i(252);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      super.dd.k(var4);
      this.ll();
    }

    if (var7 == 3200) {
      this.gk(r.wfb[var4], 3);
    }

    if (var7 == 300) {
      this.dm(var2, var3, var4);
      super.dd.i(223);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      super.dd.n(var4);
      super.dd.k(var5);
      this.ll();
      this.lcb = -1;
    }

    if (var7 == 310) {
      this.dm(var2, var3, var4);
      super.dd.i(239);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      super.dd.n(var4);
      super.dd.k(var5);
      this.ll();
      this.sx = -1;
    }

    if (var7 == 320) {
      this.dm(var2, var3, var4);
      super.dd.i(238);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      super.dd.n(var4);
      this.ll();
    }

    if (var7 == 2300) {
      this.dm(var2, var3, var4);
      super.dd.i(229);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      super.dd.n(var4);
      this.ll();
    }

    if (var7 == 3300) {
      this.gk(r.nib[var4], 3);
    }

    if (var7 == 400) {
      this.zk(var2, var3, var4, var5);
      super.dd.i(222);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      super.dd.k(var6);
      this.ll();
      this.lcb = -1;
    }

    if (var7 == 410) {
      this.zk(var2, var3, var4, var5);
      super.dd.i(241);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      super.dd.k(var6);
      this.ll();
      this.sx = -1;
    }

    if (var7 == 420) {
      this.zk(var2, var3, var4, var5);
      super.dd.i(242);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      this.ll();
    }

    if (var7 == 2400) {
      this.zk(var2, var3, var4, var5);
      super.dd.i(230);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      this.ll();
    }

    if (var7 == 3400) {
      this.gk(r.cib[var4], 3);
    }

    if (var7 == 600) {
      super.dd.i(220);
      super.dd.k(var4);
      super.dd.k(var5);
      this.ll();
      this.lcb = -1;
    }

    if (var7 == 610) {
      super.dd.i(240);
      super.dd.k(var4);
      super.dd.k(var5);
      this.ll();
      this.sx = -1;
    }

    if (var7 == 620) {
      super.dd.i(248);
      super.dd.k(var4);
      this.ll();
    }

    if (var7 == 630) {
      super.dd.i(249);
      super.dd.k(var4);
      this.ll();
    }

    if (var7 == 640) {
      super.dd.i(246);
      super.dd.k(var4);
      this.ll();
    }

    if (var7 == 650) {
      this.sx = var4;
      this.nx = 0;
      this.tx = r.vfb[this.px[this.sx]][0];
    }

    if (var7 == 660) {
      super.dd.i(251);
      super.dd.k(var4);
      this.ll();
      this.sx = -1;
      this.nx = 0;
      this.gk("Dropping " + r.vfb[this.px[var4]][0], 4);
    }

    if (var7 == 3600) {
      this.gk(r.wfb[var4], 3);
    }

    int var8;
    int var9;
    if (var7 == 700) {
      var8 = (var2 - 64) / this.tt;
      var9 = (var3 - 64) / this.tt;
      this.ul(this.bw, this.cw, var8, var9, true);
      super.dd.i(225);
      super.dd.k(var4);
      super.dd.k(var5);
      this.ll();
      this.lcb = -1;
    }

    if (var7 == 710) {
      var8 = (var2 - 64) / this.tt;
      var9 = (var3 - 64) / this.tt;
      this.ul(this.bw, this.cw, var8, var9, true);
      super.dd.i(243);
      super.dd.k(var4);
      super.dd.k(var5);
      this.ll();
      this.sx = -1;
    }

    if (var7 == 720) {
      var8 = (var2 - 64) / this.tt;
      var9 = (var3 - 64) / this.tt;
      this.ul(this.bw, this.cw, var8, var9, true);
      super.dd.i(245);
      super.dd.k(var4);
      this.ll();
    }

    if (var7 == 715 || var7 == 2715) {
      var8 = (var2 - 64) / this.tt;
      var9 = (var3 - 64) / this.tt;
      this.ul(this.bw, this.cw, var8, var9, true);
      super.dd.i(244);
      super.dd.k(var4);
      this.ll();
    }

    if (var7 == 3700) {
      this.gk(r.qgb[var4], 3);
    }

    if (var7 == 800) {
      var8 = (var2 - 64) / this.tt;
      var9 = (var3 - 64) / this.tt;
      this.ul(this.bw, this.cw, var8, var9, true);
      super.dd.i(226);
      super.dd.k(var4);
      super.dd.k(var5);
      this.ll();
      this.lcb = -1;
    }

    if (var7 == 810) {
      var8 = (var2 - 64) / this.tt;
      var9 = (var3 - 64) / this.tt;
      this.ul(this.bw, this.cw, var8, var9, true);
      super.dd.i(219);
      super.dd.k(var4);
      super.dd.k(var5);
      this.ll();
      this.sx = -1;
    }

    if (var7 == 805 || var7 == 2805) {
      var8 = (var2 - 64) / this.tt;
      var9 = (var3 - 64) / this.tt;
      this.ul(this.bw, this.cw, var8, var9, true);
      super.dd.i(228);
      super.dd.k(var4);
      this.ll();
    }

    if (var7 == 2810) {
      super.dd.i(235);
      super.dd.k(var4);
      this.ll();
    }

    if (var7 == 2820) {
      super.dd.i(214);
      super.dd.k(var4);
      this.ll();
    }

    if (var7 == 900) {
      this.ul(this.bw, this.cw, var2, var3, true);
      super.dd.i(221);
      super.dd.k(var2 + this.vu);
      super.dd.k(var3 + this.wu);
      super.dd.k(var4);
      this.ll();
      this.lcb = -1;
    }

    if (var7 == 920) {
      this.ul(this.bw, this.cw, var2, var3, false);
      if (this.scb == -24) {
        this.scb = 24;
      }
    }

    if (var7 == 1000) {
      super.dd.i(227);
      super.dd.k(var4);
      this.ll();
      this.lcb = -1;
    }

    if (var7 == 4000) {
      this.sx = -1;
      this.lcb = -1;
    }

  }

  public mudclient() {
    this.lv = new String[this.jv];
    this.mv = new String[this.jv];
    this.nv = new int[this.jv];
    this.ov = new int[this.jv];
    this.pv = new int[this.jv];
    this.qv = new int[this.jv];
    this.rv = new int[this.jv];
    this.sv = new int[this.jv];
    this.tv = new int[this.jv];
    this.uv = 4000;
    this.vv = 500;
    this.yv = new l[this.uv];
    this.zv = new l[this.vv];
    this.aw = new l();
    this.dw = 1000;
    this.ew = 500;
    this.gw = new l[this.dw];
    this.hw = new l[this.ew];
    this.kw = new int[][]{{11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4, 3}};
    this.lw = 500;
    this.ow = new int[this.lw];
    this.pw = new int[this.lw];
    this.qw = new int[this.lw];
    this.rw = new int[this.lw];
    this.sw = 1500;
    this.uw = new h[this.sw];
    this.vw = new int[this.sw];
    this.ww = new int[this.sw];
    this.xw = new int[this.sw];
    this.yw = new int[this.sw];
    this.zw = new h[200];
    this.ax = new boolean[this.sw];
    this.bx = 500;
    this.dx = new h[this.bx];
    this.ex = new int[this.bx];
    this.fx = new int[this.bx];
    this.gx = new int[this.bx];
    this.hx = new int[this.bx];
    this.ix = new boolean[this.bx];
    this.jx = 8000;
    this.kx = new int[this.jx];
    this.lx = new int[this.jx];
    this.px = new int[30];
    this.qx = new int[30];
    this.rx = new int[30];
    this.sx = -1;
    this.tx = "";
    this.ux = false;
    this.vx = "";
    this.xx = new int[14];
    this.yx = new int[14];
    this.ay = new int[14];
    this.by = new int[14];
    this.cy = false;
    this.dy = false;
    this.gy = false;
    this.jy = new int[256];
    this.ky = new int[256];
    this.ly = new int[256];
    this.my = -1;
    this.ny = -2;
    this.oy = new int[19];
    this.py = new int[19];
    this.qy = new int[6];
    this.sy = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Thieving", "Influence", "PrayGood", "PrayEvil", "GoodMagic", "EvilMagic", "Cooking", "Tailoring", "Woodcutting", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw"};
    this.ty = new String[]{"Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer", "Hiding"};
    this.vy = new int[500];
    this.wy = false;
    this.yy = new String[5];
    this.cz = "";
    this.dz = "";
    this.ez = "";
    this.fz = "";
    this.qz = 5;
    this.rz = new String[this.qz];
    this.sz = new int[this.qz];
    this.uz = 40;
    this.sbb = false;
    this.ubb = 1;
    this.vbb = 2;
    this.wbb = 2;
    this.xbb = 8;
    this.ybb = 14;
    this.acb = 1;
    this.bcb = new int[] {16711680, 16744448, 16769024, 10543104, 57344, 32768, 41088, 45311, 33023, 12528, 14680288, 3158064, 6307840, 8409088, 16777215};
    this.ccb = new int[] {16760880, 16752704, 8409136, 6307872, 3158064, 16736288, 16728064, 16777215, 65280, 65535};
    this.dcb = new int[] {15523536, 13415270, 11766848, 10056486, 9461792};
    this.lcb = -1;
    this.qcb = -1;
    this.rcb = -1;
    this.wcb = new String[50];
    this.xcb = new int[50];
    this.ycb = new int[50];
    this.zcb = new int[50];
    this.adb = new int[50];
    this.cdb = new int[50];
    this.ddb = new int[50];
    this.edb = new int[50];
    this.fdb = new int[50];
    this.hdb = new int[50];
    this.idb = new int[50];
    this.jdb = new int[50];
  }
}

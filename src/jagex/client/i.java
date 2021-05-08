package jagex.client;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public class i implements ImageProducer, ImageObserver {
  public int sj;
  public int tj;
  public int uj;
  public int vj;
  public int wj;
  ColorModel xj;
  public int[] yj;
  ImageConsumer zj;
  private Component ak;
  public Image bk;
  private int[][] ck;
  private byte[][] dk;
  private int[][] ek;
  public int[] fk;
  public int[] gk;
  public int[] hk;
  public int[] ik;
  public int[] jk;
  public int[] kk;
  public boolean[] lk;
  private boolean mk = true;
  private int nk;
  private int ok;
  private int pk;
  private int qk;
  public boolean rk = false;
  static byte[][] sk = new byte[50][];
  static int[] tk;
  static int uk;
  public boolean vk = false;
  int[] wk;
  int[] xk;
  int[] yk;
  int[] zk;
  int[] al;
  int[] bl;
  int[] cl;
  public static final int dl = 0;
  public static final int el = 16777215;
  public static final int fl = 16711680;
  public static final int gl = 12582912;
  public static final int hl = 65280;
  public static final int il = 255;
  public static final int jl = 16776960;
  public static final int kl = 65535;
  public static final int ll = 16711935;
  public static final int ml = 12632256;
  public static final int nl = 8421504;
  public static final int ol = 4210752;
  public static final int pl = 0;
  public static final int ql = 1;
  public static final int rl = 2;
  public static final int sl = 3;
  public static final int tl = 4;
  public static final int ul = 5;
  public static final int vl = 6;
  public static final int wl = 7;

  public i(int var1, int var2, int var3, Component var4) {
    this.ak = var4;
    this.ok = var2;
    this.qk = var1;
    this.vj = this.sj = var1;
    this.wj = this.tj = var2;
    this.uj = var1 * var2;
    this.yj = new int[var1 * var2];
    this.ck = new int[var3][];
    this.lk = new boolean[var3];
    this.dk = new byte[var3][];
    this.ek = new int[var3][];
    this.fk = new int[var3];
    this.gk = new int[var3];
    this.jk = new int[var3];
    this.kk = new int[var3];
    this.hk = new int[var3];
    this.ik = new int[var3];
    if (var1 > 1 && var2 > 1 && var4 != null) {
      this.xj = new DirectColorModel(32, 16711680, 65280, 255);
      int var5 = this.sj * this.tj;

      for (int var6 = 0; var6 < var5; ++var6) {
        this.yj[var6] = 0;
      }

      this.bk = var4.createImage(this);
      this.of();
      var4.prepareImage(this.bk, var4);
      this.of();
      var4.prepareImage(this.bk, var4);
      this.of();
      var4.prepareImage(this.bk, var4);
    }

  }

  public synchronized void qg(int var1, int var2) {
    if (this.sj > this.vj) {
      this.sj = this.vj;
    }

    if (this.tj > this.wj) {
      this.tj = this.wj;
    }

    this.sj = var1;
    this.tj = var2;
    this.uj = var1 * var2;
  }

  public synchronized void addConsumer(ImageConsumer var1) {
    this.zj = var1;
    var1.setDimensions(this.sj, this.tj);
    var1.setProperties((Hashtable)null);
    var1.setColorModel(this.xj);
    var1.setHints(14);
  }

  public synchronized boolean isConsumer(ImageConsumer var1) {
    return this.zj == var1;
  }

  public synchronized void removeConsumer(ImageConsumer var1) {
    if (this.zj == var1) {
      this.zj = null;
    }

  }

  public void startProduction(ImageConsumer var1) {
    this.addConsumer(var1);
  }

  public void requestTopDownLeftRightResend(ImageConsumer var1) {
    System.out.println("TDLR");
  }

  public synchronized void of() {
    if (this.zj != null) {
      this.zj.setPixels(0, 0, this.sj, this.tj, this.xj, this.yj, 0, this.sj);
      this.zj.imageComplete(2);
    }
  }

  public void kf(int var1, int var2, int var3, int var4) {
    if (var1 < 0) {
      var1 = 0;
    }

    if (var2 < 0) {
      var2 = 0;
    }

    if (var3 > this.sj) {
      var3 = this.sj;
    }

    if (var4 > this.tj) {
      var4 = this.tj;
    }

    this.pk = var1;
    this.nk = var2;
    this.qk = var3;
    this.ok = var4;
  }

  public void mf() {
    this.pk = 0;
    this.nk = 0;
    this.qk = this.sj;
    this.ok = this.tj;
  }

  public void cf(Graphics var1, int var2, int var3) {
    this.of();
    var1.drawImage(this.bk, var2, var3, this);
  }

  public void df() {
    int var1 = this.sj * this.tj;
    int var2;
    if (!this.rk) {
      for (var2 = 0; var2 < var1; ++var2) {
        this.yj[var2] = 0;
      }

    } else {
      var2 = 0;

      for (int var3 = -this.tj; var3 < 0; var3 += 2) {
        for (int var4 = -this.sj; var4 < 0; ++var4) {
          this.yj[var2++] = 0;
        }

        var2 += this.sj;
      }

    }
  }

  public void rf(int var1, int var2, int var3, int var4, int var5) {
    int var6 = 256 - var5;
    int var7 = (var4 >> 16 & 255) * var5;
    int var8 = (var4 >> 8 & 255) * var5;
    int var9 = (var4 & 255) * var5;
    int var13 = var2 - var3;
    if (var13 < 0) {
      var13 = 0;
    }

    int var14 = var2 + var3;
    if (var14 >= this.tj) {
      var14 = this.tj - 1;
    }

    byte var15 = 1;
    if (this.rk) {
      var15 = 2;
      if ((var13 & 1) != 0) {
        ++var13;
      }
    }

    for (int var16 = var13; var16 <= var14; var16 += var15) {
      int var17 = var16 - var2;
      int var18 = (int)Math.sqrt((double)(var3 * var3 - var17 * var17));
      int var19 = var1 - var18;
      if (var19 < 0) {
        var19 = 0;
      }

      int var20 = var1 + var18;
      if (var20 >= this.sj) {
        var20 = this.sj - 1;
      }

      int var21 = var19 + var16 * this.sj;

      for (int var22 = var19; var22 <= var20; ++var22) {
        int var10 = (this.yj[var21] >> 16 & 255) * var6;
        int var11 = (this.yj[var21] >> 8 & 255) * var6;
        int var12 = (this.yj[var21] & 255) * var6;
        int var23 = (var7 + var10 >> 8 << 16) + (var8 + var11 >> 8 << 8) + (var9 + var12 >> 8);
        this.yj[var21++] = var23;
      }
    }

  }

  public void nf(int var1, int var2, int var3, int var4, int var5, int var6) {
    if (var1 < this.pk) {
      var3 -= this.pk - var1;
      var1 = this.pk;
    }

    if (var2 < this.nk) {
      var4 -= this.nk - var2;
      var2 = this.nk;
    }

    if (var1 + var3 > this.qk) {
      var3 = this.qk - var1;
    }

    if (var2 + var4 > this.ok) {
      var4 = this.ok - var2;
    }

    int var7 = 256 - var6;
    int var8 = (var5 >> 16 & 255) * var6;
    int var9 = (var5 >> 8 & 255) * var6;
    int var10 = (var5 & 255) * var6;
    int var14 = this.sj - var3;
    byte var15 = 1;
    if (this.rk) {
      var15 = 2;
      var14 += this.sj;
      if ((var2 & 1) != 0) {
        ++var2;
        --var4;
      }
    }

    int var16 = var1 + var2 * this.sj;

    for (int var17 = 0; var17 < var4; var17 += var15) {
      for (int var18 = -var3; var18 < 0; ++var18) {
        int var11 = (this.yj[var16] >> 16 & 255) * var7;
        int var12 = (this.yj[var16] >> 8 & 255) * var7;
        int var13 = (this.yj[var16] & 255) * var7;
        int var19 = (var8 + var11 >> 8 << 16) + (var9 + var12 >> 8 << 8) + (var10 + var13 >> 8);
        this.yj[var16++] = var19;
      }

      var16 += var14;
    }

  }

  public void ag(int var1, int var2, int var3, int var4, int var5, int var6) {
    if (var1 < this.pk) {
      var3 -= this.pk - var1;
      var1 = this.pk;
    }

    if (var1 + var3 > this.qk) {
      var3 = this.qk - var1;
    }

    int var7 = var6 >> 16 & 255;
    int var8 = var6 >> 8 & 255;
    int var9 = var6 & 255;
    int var10 = var5 >> 16 & 255;
    int var11 = var5 >> 8 & 255;
    int var12 = var5 & 255;
    int var13 = this.sj - var3;
    byte var14 = 1;
    if (this.rk) {
      var14 = 2;
      var13 += this.sj;
      if ((var2 & 1) != 0) {
        ++var2;
        --var4;
      }
    }

    int var15 = var1 + var2 * this.sj;

    for (int var16 = 0; var16 < var4; var16 += var14) {
      if (var16 + var2 >= this.nk && var16 + var2 < this.ok) {
        int var17 = ((var7 * var16 + var10 * (var4 - var16)) / var4 << 16) + ((var8 * var16 + var11 * (var4 - var16)) / var4 << 8) + (var9 * var16 + var12 * (var4 - var16)) / var4;

        for (int var18 = -var3; var18 < 0; ++var18) {
          this.yj[var15++] = var17;
        }

        var15 += var13;
      } else {
        var15 += this.sj;
      }
    }

  }

  public void qf(int var1, int var2, int var3, int var4, int var5) {
    if (var1 < this.pk) {
      var3 -= this.pk - var1;
      var1 = this.pk;
    }

    if (var2 < this.nk) {
      var4 -= this.nk - var2;
      var2 = this.nk;
    }

    if (var1 + var3 > this.qk) {
      var3 = this.qk - var1;
    }

    if (var2 + var4 > this.ok) {
      var4 = this.ok - var2;
    }

    int var6 = this.sj - var3;
    byte var7 = 1;
    if (this.rk) {
      var7 = 2;
      var6 += this.sj;
      if ((var2 & 1) != 0) {
        ++var2;
        --var4;
      }
    }

    int var8 = var1 + var2 * this.sj;

    for (int var9 = -var4; var9 < 0; var9 += var7) {
      for (int var10 = -var3; var10 < 0; ++var10) {
        this.yj[var8++] = var5;
      }

      var8 += var6;
    }

  }

  public void hf(int var1, int var2, int var3, int var4, int var5) {
    this.kg(var1, var2, var3, var5);
    this.kg(var1, var2 + var4 - 1, var3, var5);
    this.og(var1, var2, var4, var5);
    this.og(var1 + var3 - 1, var2, var4, var5);
  }

  public void kg(int var1, int var2, int var3, int var4) {
    if (var2 >= this.nk && var2 < this.ok) {
      if (var1 < this.pk) {
        var3 -= this.pk - var1;
        var1 = this.pk;
      }

      if (var1 + var3 > this.qk) {
        var3 = this.qk - var1;
      }

      int var5 = var1 + var2 * this.sj;

      for (int var6 = 0; var6 < var3; ++var6) {
        this.yj[var5 + var6] = var4;
      }

    }
  }

  public void og(int var1, int var2, int var3, int var4) {
    if (var1 >= this.pk && var1 < this.qk) {
      if (var2 < this.nk) {
        var3 -= this.nk - var2;
        var2 = this.nk;
      }

      if (var2 + var3 > this.qk) {
        var3 = this.ok - var2;
      }

      int var5 = var1 + var2 * this.sj;

      for (int var6 = 0; var6 < var3; ++var6) {
        this.yj[var5 + var6 * this.sj] = var4;
      }

    }
  }

  public void gg(int var1, int var2, int var3) {
    if (var1 >= this.pk && var2 >= this.nk && var1 < this.qk && var2 < this.ok) {
      this.yj[var1 + var2 * this.sj] = var3;
    }
  }

  public void ze() {
    int var3 = this.sj * this.tj;

    for (int var2 = 0; var2 < var3; ++var2) {
      int var1 = this.yj[var2] & 16777215;
      this.yj[var2] = (var1 >>> 1 & 8355711) + (var1 >>> 2 & 4144959) + (var1 >>> 3 & 2039583) + (var1 >>> 4 & 986895);
    }

  }

  public static int fg(int var0, int var1, int var2) {
    return (var0 << 16) + (var1 << 8) + var2;
  }

  public void dg() {
    for (int var1 = 0; var1 < this.ck.length; ++var1) {
      this.ck[var1] = null;
      this.fk[var1] = 0;
      this.gk[var1] = 0;
      this.dk[var1] = null;
      this.ek[var1] = null;
    }

  }

  public void eg(byte[] var1, int var2, int var3, boolean var4, boolean var5) {
    this.cg(var1, var2, var3, var4, 1, 1, var5);
  }

  public void jg(byte[] var1, int var2, int var3, boolean var4, int var5, boolean var6) {
    this.cg(var1, var2, var3, var4, var5, 1, var6);
  }

  public void cg(byte[] var1, int var2, int var3, boolean var4, int var5, int var6, boolean var7) {
    int var8 = (var1[13 + var2] & 255) * 256 + (var1[12 + var2] & 255);
    int var9 = (var1[15 + var2] & 255) * 256 + (var1[14 + var2] & 255);
    int var10 = -1;
    int[] var11 = new int[256];

    for (int var12 = 0; var12 < 256; ++var12) {
      var11[var12] = -16777216 + ((var1[var2 + 20 + var12 * 3] & 255) << 16) + ((var1[var2 + 19 + var12 * 3] & 255) << 8) + (var1[var2 + 18 + var12 * 3] & 255);
      if (var11[var12] == -65281) {
        var10 = var12;
      }
    }

    if (var10 == -1) {
      var4 = false;
    }

    if (var7 && var4) {
      var11[var10] = var11[0];
    }

    int var13 = var8 / var5;
    int var14 = var9 / var6;
    int[] var15 = new int[var13 * var14];

    for (int var16 = 0; var16 < var6; ++var16) {
      for (int var17 = 0; var17 < var5; ++var17) {
        int var18 = 0;

        for (int var19 = var14 * var16; var19 < var14 * (var16 + 1); ++var19) {
          for (int var20 = var13 * var17; var20 < var13 * (var17 + 1); ++var20) {
            if (var7) {
              var15[var18++] = var1[var2 + 786 + var20 + (var9 - var19 - 1) * var8] & 255;
            } else {
              var15[var18++] = var11[var1[var2 + 786 + var20 + (var9 - var19 - 1) * var8] & 255];
            }
          }
        }

        if (var7) {
          this.af(var15, var13, var14, var3++, var4, var11, var10);
        } else {
          this.af(var15, var13, var14, var3++, var4, (int[])null, -65281);
        }
      }
    }

  }

  private void af(int[] var1, int var2, int var3, int var4, boolean var5, int[] var6, int var7) {
    int var8 = 0;
    int var9 = 0;
    int var10 = var2;
    int var11 = var3;
    int var12;
    int var13;
    int var14;
    int var15;
    if (var5 && this.mk) {
      label146:
      for (var12 = 0; var12 < var3; ++var12) {
        for (var13 = 0; var13 < var2; ++var13) {
          var14 = var1[var13 + var12 * var2];
          if (var14 != var7) {
            var9 = var12;
            break label146;
          }
        }
      }

      label132:
      for (var13 = 0; var13 < var2; ++var13) {
        for (var14 = 0; var14 < var3; ++var14) {
          var15 = var1[var13 + var14 * var2];
          if (var15 != var7) {
            var8 = var13;
            break label132;
          }
        }
      }

      int var16;
      label118:
      for (var14 = var3 - 1; var14 >= 0; --var14) {
        for (var15 = 0; var15 < var2; ++var15) {
          var16 = var1[var15 + var14 * var2];
          if (var16 != var7) {
            var11 = var14 + 1;
            break label118;
          }
        }
      }

      label105:
      for (var15 = var2 - 1; var15 >= 0; --var15) {
        for (var16 = 0; var16 < var3; ++var16) {
          int var17 = var1[var15 + var16 * var2];
          if (var17 != var7) {
            var10 = var15 + 1;
            break label105;
          }
        }
      }
    }

    this.fk[var4] = var10 - var8;
    this.gk[var4] = var11 - var9;
    this.lk[var4] = var5;
    this.hk[var4] = var8;
    this.ik[var4] = var9;
    this.jk[var4] = var2;
    this.kk[var4] = var3;
    if (var6 == null) {
      this.ck[var4] = new int[(var10 - var8) * (var11 - var9)];
      var12 = 0;

      for (var13 = var9; var13 < var11; ++var13) {
        for (var14 = var8; var14 < var10; ++var14) {
          var15 = var1[var14 + var13 * var2];
          if (var5) {
            if (var15 == var7) {
              var15 = 0;
            }

            if (var15 == -16777216) {
              var15 = -16711423;
            }
          }

          this.ck[var4][var12++] = var15 & 16777215;
        }
      }

    } else {
      this.dk[var4] = new byte[(var10 - var8) * (var11 - var9)];
      this.ek[var4] = var6;
      var12 = 0;

      for (var13 = var9; var13 < var11; ++var13) {
        for (var14 = var8; var14 < var10; ++var14) {
          var15 = var1[var14 + var13 * var2];
          if (var5) {
            if (var15 == var7) {
              var15 = 0;
            } else if (var15 == 0) {
              var15 = var7;
            }
          }

          this.dk[var4][var12++] = (byte)var15;
        }
      }

    }
  }

  public void jf(int var1, int var2, int var3, int var4, int var5) {
    this.fk[var1] = var4;
    this.gk[var1] = var5;
    this.lk[var1] = false;
    this.hk[var1] = 0;
    this.ik[var1] = 0;
    this.jk[var1] = var4;
    this.kk[var1] = var5;
    int var6 = var4 * var5;
    int var7 = 0;
    this.ck[var1] = new int[var6];

    for (int var8 = var2; var8 < var2 + var4; ++var8) {
      for (int var9 = var3; var9 < var3 + var5; ++var9) {
        this.ck[var1][var7++] = this.yj[var8 + var9 * this.sj];
      }
    }

  }

  public void _if (int var1, int var2, int var3) {
    this.rg(var1 - this.jk[var3] / 2, var2 - this.kk[var3] / 2, var3);
  }

  public void rg(int var1, int var2, int var3) {
    if (this.lk[var3]) {
      var1 += this.hk[var3];
      var2 += this.ik[var3];
    }

    int var4 = var1 + var2 * this.sj;
    int var5 = 0;
    int var6 = this.gk[var3];
    int var7 = this.fk[var3];
    int var8 = this.sj - var7;
    int var9 = 0;
    int var10;
    if (var2 < this.nk) {
      var10 = this.nk - var2;
      var6 -= var10;
      var2 = this.nk;
      var5 += var10 * var7;
      var4 += var10 * this.sj;
    }

    if (var2 + var6 >= this.ok) {
      var6 -= var2 + var6 - this.ok + 1;
    }

    if (var1 < this.pk) {
      var10 = this.pk - var1;
      var7 -= var10;
      var1 = this.pk;
      var5 += var10;
      var4 += var10;
      var9 += var10;
      var8 += var10;
    }

    if (var1 + var7 >= this.qk) {
      var10 = var1 + var7 - this.qk + 1;
      var7 -= var10;
      var9 += var10;
      var8 += var10;
    }

    if (var7 > 0 && var6 > 0) {
      byte var11 = 1;
      if (this.rk) {
        var11 = 2;
        var8 += this.sj;
        var9 += this.fk[var3];
        if ((var2 & 1) != 0) {
          var4 += this.sj;
          --var6;
        }
      }

      if (this.lk[var3]) {
        this.ff(this.yj, this.ck[var3], 0, var5, var4, var7, var6, var8, var9, var11);
      } else {
        this.tg(this.yj, this.ck[var3], var5, var4, var7, var6, var8, var9, var11);
      }
    }
  }

  private void tg(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
    int var10 = -(var5 >> 2);
    var5 = -(var5 & 3);

    for (int var11 = -var6; var11 < 0; var11 += var9) {
      for (int var12 = var10; var12 < 0; ++var12) {
        var1[var4++] = var2[var3++];
        var1[var4++] = var2[var3++];
        var1[var4++] = var2[var3++];
        var1[var4++] = var2[var3++];
      }

      for (int var13 = var5; var13 < 0; ++var13) {
        var1[var4++] = var2[var3++];
      }

      var4 += var7;
      var3 += var8;
    }

  }

  private void ff(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
    int var11 = -(var6 >> 2);
    var6 = -(var6 & 3);

    for (int var12 = -var7; var12 < 0; var12 += var10) {
      for (int var13 = var11; var13 < 0; ++var13) {
        var3 = var2[var4++];
        if (var3 != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }

        var3 = var2[var4++];
        if (var3 != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }

        var3 = var2[var4++];
        if (var3 != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }

        var3 = var2[var4++];
        if (var3 != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }
      }

      for (int var14 = var6; var14 < 0; ++var14) {
        var3 = var2[var4++];
        if (var3 != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }
      }

      var5 += var8;
      var4 += var9;
    }

  }

  public void vf(int var1, int var2, int var3) {
    if (this.lk[var3]) {
      var1 += this.hk[var3];
      var2 += this.ik[var3];
    }

    int var4 = var1 + var2 * this.sj;
    int var5 = 0;
    int var6 = this.gk[var3];
    int var7 = this.fk[var3];
    int var8 = this.sj - var7;
    int var9 = 0;
    int var10;
    if (var2 < this.nk) {
      var10 = this.nk - var2;
      var6 -= var10;
      var2 = this.nk;
      var5 += var10 * var7;
      var4 += var10 * this.sj;
    }

    if (var2 + var6 >= this.ok) {
      var6 -= var2 + var6 - this.ok + 1;
    }

    if (var1 < this.pk) {
      var10 = this.pk - var1;
      var7 -= var10;
      var1 = this.pk;
      var5 += var10;
      var4 += var10;
      var9 += var10;
      var8 += var10;
    }

    if (var1 + var7 >= this.qk) {
      var10 = var1 + var7 - this.qk + 1;
      var7 -= var10;
      var9 += var10;
      var8 += var10;
    }

    if (var7 > 0 && var6 > 0) {
      byte var11 = 1;
      if (this.rk) {
        var11 = 2;
        var8 += this.sj;
        var9 += this.fk[var3];
        if ((var2 & 1) != 0) {
          var4 += this.sj;
          --var6;
        }
      }

      this.pg(this.yj, this.ck[var3], 0, var5, var4, var7, var6, var8, var9, var11);
    }
  }

  private void pg(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
    int var11 = -(var6 >> 2);
    var6 = -(var6 & 3);

    for (int var12 = -var7; var12 < 0; var12 += var10) {
      for (int var13 = var11; var13 < 0; ++var13) {
        var3 = var2[var4++];
        if (var3 != 0) {
          var1[var5++] = (var3 >> 1 & 8355711) + (var1[var5] >> 1 & 8355711);
        } else {
          ++var5;
        }

        var3 = var2[var4++];
        if (var3 != 0) {
          var1[var5++] = (var3 >> 1 & 8355711) + (var1[var5] >> 1 & 8355711);
        } else {
          ++var5;
        }

        var3 = var2[var4++];
        if (var3 != 0) {
          var1[var5++] = (var3 >> 1 & 8355711) + (var1[var5] >> 1 & 8355711);
        } else {
          ++var5;
        }

        var3 = var2[var4++];
        if (var3 != 0) {
          var1[var5++] = (var3 >> 1 & 8355711) + (var1[var5] >> 1 & 8355711);
        } else {
          ++var5;
        }
      }

      for (int var14 = var6; var14 < 0; ++var14) {
        var3 = var2[var4++];
        if (var3 != 0) {
          var1[var5++] = (var3 >> 1 & 8355711) + (var1[var5] >> 1 & 8355711);
        } else {
          ++var5;
        }
      }

      var5 += var8;
      var4 += var9;
    }

  }

  public void gf(int var1, int var2, int var3, int var4, int var5) {
    int var6 = this.sj;
    int var7 = this.tj;
    int var8;
    if (this.wk == null) {
      this.wk = new int[512];

      for (var8 = 0; var8 < 256; ++var8) {
        this.wk[var8] = (int)(Math.sin((double)var8 * 0.02454369D) * 32768.0D);
        this.wk[var8 + 256] = (int)(Math.cos((double)var8 * 0.02454369D) * 32768.0D);
      }
    }

    var8 = -this.jk[var3] / 2;
    int var9 = -this.kk[var3] / 2;
    if (this.lk[var3]) {
      var8 += this.hk[var3];
      var9 += this.ik[var3];
    }

    int var10 = var8 + this.fk[var3];
    int var11 = var9 + this.gk[var3];
    var4 &= 255;
    int var16 = this.wk[var4] * var5;
    int var17 = this.wk[var4 + 256] * var5;
    int var18 = var1 + (var9 * var16 + var8 * var17 >> 22);
    int var19 = var2 + (var9 * var17 - var8 * var16 >> 22);
    int var20 = var1 + (var9 * var16 + var10 * var17 >> 22);
    int var21 = var2 + (var9 * var17 - var10 * var16 >> 22);
    int var22 = var1 + (var11 * var16 + var10 * var17 >> 22);
    int var23 = var2 + (var11 * var17 - var10 * var16 >> 22);
    int var24 = var1 + (var11 * var16 + var8 * var17 >> 22);
    int var25 = var2 + (var11 * var17 - var8 * var16 >> 22);
    int var26 = var19;
    int var27 = var19;
    if (var21 < var19) {
      var26 = var21;
    } else if (var21 > var19) {
      var27 = var21;
    }

    if (var23 < var26) {
      var26 = var23;
    } else if (var23 > var27) {
      var27 = var23;
    }

    if (var25 < var26) {
      var26 = var25;
    } else if (var25 > var27) {
      var27 = var25;
    }

    if (var26 < this.nk) {
      var26 = this.nk;
    }

    if (var27 > this.ok) {
      var27 = this.ok;
    }

    if (this.xk == null || this.xk.length != var7 + 1) {
      this.xk = new int[var7 + 1];
      this.yk = new int[var7 + 1];
      this.zk = new int[var7 + 1];
      this.al = new int[var7 + 1];
      this.bl = new int[var7 + 1];
      this.cl = new int[var7 + 1];
    }

    for (int var28 = var26; var28 <= var27; ++var28) {
      this.xk[var28] = 99999999;
      this.yk[var28] = -99999999;
    }

    int var32 = 0;
    int var34 = 0;
    int var36 = 0;
    int var37 = this.fk[var3];
    int var38 = this.gk[var3];
    byte var52 = 0;
    byte var53 = 0;
    int var12 = var37 - 1;
    byte var13 = 0;
    var10 = var37 - 1;
    var11 = var38 - 1;
    byte var14 = 0;
    int var15 = var38 - 1;
    if (var25 != var19) {
      var32 = (var24 - var18 << 8) / (var25 - var19);
      var36 = (var15 - var53 << 8) / (var25 - var19);
    }

    int var29;
    int var30;
    int var31;
    int var35;
    if (var19 > var25) {
      var31 = var24 << 8;
      var35 = var15 << 8;
      var29 = var25;
      var30 = var19;
    } else {
      var31 = var18 << 8;
      var35 = var53 << 8;
      var29 = var19;
      var30 = var25;
    }

    if (var29 < 0) {
      var31 -= var32 * var29;
      var35 -= var36 * var29;
      var29 = 0;
    }

    if (var30 > var7 - 1) {
      var30 = var7 - 1;
    }

    for (int var39 = var29; var39 <= var30; ++var39) {
      this.xk[var39] = this.yk[var39] = var31;
      var31 += var32;
      this.zk[var39] = this.al[var39] = 0;
      this.bl[var39] = this.cl[var39] = var35;
      var35 += var36;
    }

    if (var21 != var19) {
      var32 = (var20 - var18 << 8) / (var21 - var19);
      var34 = (var12 - var52 << 8) / (var21 - var19);
    }

    int var33;
    if (var19 > var21) {
      var31 = var20 << 8;
      var33 = var12 << 8;
      var29 = var21;
      var30 = var19;
    } else {
      var31 = var18 << 8;
      var33 = var52 << 8;
      var29 = var19;
      var30 = var21;
    }

    if (var29 < 0) {
      var31 -= var32 * var29;
      var33 -= var34 * var29;
      var29 = 0;
    }

    if (var30 > var7 - 1) {
      var30 = var7 - 1;
    }

    for (int var40 = var29; var40 <= var30; ++var40) {
      if (var31 < this.xk[var40]) {
        this.xk[var40] = var31;
        this.zk[var40] = var33;
        this.bl[var40] = 0;
      }

      if (var31 > this.yk[var40]) {
        this.yk[var40] = var31;
        this.al[var40] = var33;
        this.cl[var40] = 0;
      }

      var31 += var32;
      var33 += var34;
    }

    if (var23 != var21) {
      var32 = (var22 - var20 << 8) / (var23 - var21);
      var36 = (var11 - var13 << 8) / (var23 - var21);
    }

    if (var21 > var23) {
      var31 = var22 << 8;
      var33 = var10 << 8;
      var35 = var11 << 8;
      var29 = var23;
      var30 = var21;
    } else {
      var31 = var20 << 8;
      var33 = var12 << 8;
      var35 = var13 << 8;
      var29 = var21;
      var30 = var23;
    }

    if (var29 < 0) {
      var31 -= var32 * var29;
      var35 -= var36 * var29;
      var29 = 0;
    }

    if (var30 > var7 - 1) {
      var30 = var7 - 1;
    }

    for (int var41 = var29; var41 <= var30; ++var41) {
      if (var31 < this.xk[var41]) {
        this.xk[var41] = var31;
        this.zk[var41] = var33;
        this.bl[var41] = var35;
      }

      if (var31 > this.yk[var41]) {
        this.yk[var41] = var31;
        this.al[var41] = var33;
        this.cl[var41] = var35;
      }

      var31 += var32;
      var35 += var36;
    }

    if (var25 != var23) {
      var32 = (var24 - var22 << 8) / (var25 - var23);
      var34 = (var14 - var10 << 8) / (var25 - var23);
    }

    if (var23 > var25) {
      var31 = var24 << 8;
      var33 = var14 << 8;
      var35 = var15 << 8;
      var29 = var25;
      var30 = var23;
    } else {
      var31 = var22 << 8;
      var33 = var10 << 8;
      var35 = var11 << 8;
      var29 = var23;
      var30 = var25;
    }

    if (var29 < 0) {
      var31 -= var32 * var29;
      var33 -= var34 * var29;
      var29 = 0;
    }

    if (var30 > var7 - 1) {
      var30 = var7 - 1;
    }

    for (int var42 = var29; var42 <= var30; ++var42) {
      if (var31 < this.xk[var42]) {
        this.xk[var42] = var31;
        this.zk[var42] = var33;
        this.bl[var42] = var35;
      }

      if (var31 > this.yk[var42]) {
        this.yk[var42] = var31;
        this.al[var42] = var33;
        this.cl[var42] = var35;
      }

      var31 += var32;
      var33 += var34;
    }

    int var43 = var26 * var6;
    int[] var44 = this.ck[var3];

    for (int var45 = var26; var45 < var27; ++var45) {
      int var46 = this.xk[var45] >> 8;
      int var47 = this.yk[var45] >> 8;
      if (var47 - var46 <= 0) {
        var43 += var6;
      } else {
        int var48 = this.zk[var45] << 9;
        int var49 = ((this.al[var45] << 9) - var48) / (var47 - var46);
        int var50 = this.bl[var45] << 9;
        int var51 = ((this.cl[var45] << 9) - var50) / (var47 - var46);
        if (var46 < this.pk) {
          var48 += (this.pk - var46) * var49;
          var50 += (this.pk - var46) * var51;
          var46 = this.pk;
        }

        if (var47 > this.qk) {
          var47 = this.qk;
        }

        if (!this.rk || (var45 & 1) == 0) {
          if (!this.lk[var3]) {
            this.sf(this.yj, var44, 0, var43 + var46, var48, var50, var49, var51, var46 - var47, var37);
          } else {
            this.zf(this.yj, var44, 0, var43 + var46, var48, var50, var49, var51, var46 - var47, var37);
          }
        }

        var43 += var6;
      }
    }

  }

  private void sf(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
    for (var3 = var9; var3 < 0; ++var3) {
      this.yj[var4++] = var2[(var5 >> 17) + (var6 >> 17) * var10];
      var5 += var7;
      var6 += var8;
    }

  }

  private void zf(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
    for (int var11 = var9; var11 < 0; ++var11) {
      var3 = var2[(var5 >> 17) + (var6 >> 17) * var10];
      if (var3 != 0) {
        this.yj[var4++] = var3;
      } else {
        ++var4;
      }

      var5 += var7;
      var6 += var8;
    }

  }

  public void xf(int var1, int var2, int var3, int var4, int var5, int var6) {
    try {
      int var7 = this.fk[var5];
      int var8 = this.gk[var5];
      int var9 = 0;
      int var10 = 0;
      int var11 = (var7 << 16) / var3;
      int var12 = (var8 << 16) / var4;
      int var13;
      int var14;
      if (this.lk[var5]) {
        var13 = this.jk[var5];
        var14 = this.kk[var5];
        var11 = (var13 << 16) / var3;
        var12 = (var14 << 16) / var4;
        var1 += (this.hk[var5] * var3 + var13 - 1) / var13;
        var2 += (this.ik[var5] * var4 + var14 - 1) / var14;
        if (this.hk[var5] * var3 % var13 != 0) {
          var9 = (var13 - this.hk[var5] * var3 % var13 << 16) / var3;
        }

        if (this.ik[var5] * var4 % var14 != 0) {
          var10 = (var14 - this.ik[var5] * var4 % var14 << 16) / var4;
        }

        var3 = var3 * (this.fk[var5] - (var9 >> 16)) / var13;
        var4 = var4 * (this.gk[var5] - (var10 >> 16)) / var14;
      }

      var13 = var1 + var2 * this.sj;
      var14 = this.sj - var3;
      int var15;
      if (var2 < this.nk) {
        var15 = this.nk - var2;
        var4 -= var15;
        var2 = 0;
        var13 += var15 * this.sj;
        var10 += var12 * var15;
      }

      if (var2 + var4 >= this.ok) {
        var4 -= var2 + var4 - this.ok + 1;
      }

      if (var1 < this.pk) {
        var15 = this.pk - var1;
        var3 -= var15;
        var1 = 0;
        var13 += var15;
        var9 += var11 * var15;
        var14 += var15;
      }

      if (var1 + var3 >= this.qk) {
        var15 = var1 + var3 - this.qk + 1;
        var3 -= var15;
        var14 += var15;
      }

      byte var17 = 1;
      if (this.rk) {
        var17 = 2;
        var14 += this.sj;
        var12 += var12;
        if ((var2 & 1) != 0) {
          var13 += this.sj;
          --var4;
        }
      }

      this.tf(this.yj, this.ck[var5], 0, var9, var10, var13, var14, var3, var4, var11, var12, var7, var17, var6);
    } catch (Exception var16) {
      System.out.println("error in sprite clipping routine");
    }
  }

  private void tf(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
    int var18 = var14 >> 16 & 255;
    int var19 = var14 >> 8 & 255;
    int var20 = var14 & 255;

    try {
      int var21 = var4;

      for (int var22 = -var9; var22 < 0; var22 += var13) {
        int var23 = (var5 >> 16) * var12;

        for (int var24 = -var8; var24 < 0; ++var24) {
          var3 = var2[(var4 >> 16) + var23];
          if (var3 != 0) {
            int var15 = var3 >> 16 & 255;
            int var16 = var3 >> 8 & 255;
            int var17 = var3 & 255;
            if (var15 == var16 && var16 == var17) {
              var1[var6++] = (var15 * var18 >> 8 << 16) + (var16 * var19 >> 8 << 8) + (var17 * var20 >> 8);
            } else {
              var1[var6++] = var3;
            }
          } else {
            ++var6;
          }

          var4 += var10;
        }

        var5 += var11;
        var4 = var21;
        var6 += var7;
      }

    } catch (Exception var25) {
      System.out.println("error in transparent sprite plot routine");
    }
  }

  public void lf(int var1, int var2, int var3, int var4, int var5) {
    try {
      int var6 = this.fk[var5];
      int var7 = this.gk[var5];
      int var8 = 0;
      int var9 = 0;
      int var10 = (var6 << 16) / var3;
      int var11 = (var7 << 16) / var4;
      int var12;
      int var13;
      if (this.lk[var5]) {
        var12 = this.jk[var5];
        var13 = this.kk[var5];
        var10 = (var12 << 16) / var3;
        var11 = (var13 << 16) / var4;
        var1 += (this.hk[var5] * var3 + var12 - 1) / var12;
        var2 += (this.ik[var5] * var4 + var13 - 1) / var13;
        if (this.hk[var5] * var3 % var12 != 0) {
          var8 = (var12 - this.hk[var5] * var3 % var12 << 16) / var3;
        }

        if (this.ik[var5] * var4 % var13 != 0) {
          var9 = (var13 - this.ik[var5] * var4 % var13 << 16) / var4;
        }

        var3 = var3 * (this.fk[var5] - (var8 >> 16)) / var12;
        var4 = var4 * (this.gk[var5] - (var9 >> 16)) / var13;
      }

      var12 = var1 + var2 * this.sj;
      var13 = this.sj - var3;
      int var14;
      if (var2 < this.nk) {
        var14 = this.nk - var2;
        var4 -= var14;
        var2 = 0;
        var12 += var14 * this.sj;
        var9 += var11 * var14;
      }

      if (var2 + var4 >= this.ok) {
        var4 -= var2 + var4 - this.ok + 1;
      }

      if (var1 < this.pk) {
        var14 = this.pk - var1;
        var3 -= var14;
        var1 = 0;
        var12 += var14;
        var8 += var10 * var14;
        var13 += var14;
      }

      if (var1 + var3 >= this.qk) {
        var14 = var1 + var3 - this.qk + 1;
        var3 -= var14;
        var13 += var14;
      }

      byte var16 = 1;
      if (this.rk) {
        var16 = 2;
        var13 += this.sj;
        var11 += var11;
        if ((var2 & 1) != 0) {
          var12 += this.sj;
          --var4;
        }
      }

      if (this.lk[var5]) {
        this.bg(this.yj, this.ck[var5], 0, var8, var9, var12, var13, var3, var4, var10, var11, var6, var16);
      } else {
        this.hg(this.yj, this.ck[var5], var12, var8, var9, var13, var3, var4, var10, var11, var6, var16);
      }
    } catch (Exception var15) {
      System.out.println("error in sprite clipping routine");
    }
  }

  private void hg(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
    try {
      int var13 = var4;

      for (int var14 = -var8; var14 < 0; var14 += var12) {
        int var15 = (var5 >> 16) * var11;

        for (int var16 = -var7; var16 < 0; ++var16) {
          var1[var3++] = var2[(var4 >> 16) + var15];
          var4 += var9;
        }

        var5 += var10;
        var4 = var13;
        var3 += var6;
      }

    } catch (Exception var17) {
      System.out.println("error in sprite plot routine");
    }
  }

  private void bg(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
    try {
      int var14 = var4;

      for (int var15 = -var9; var15 < 0; var15 += var13) {
        int var16 = (var5 >> 16) * var12;

        for (int var17 = -var8; var17 < 0; ++var17) {
          var3 = var2[(var4 >> 16) + var16];
          if (var3 != 0) {
            var1[var6++] = var3;
          } else {
            ++var6;
          }

          var4 += var10;
        }

        var5 += var11;
        var4 = var14;
        var6 += var7;
      }

    } catch (Exception var18) {
      System.out.println("error in transparent sprite plot routine");
    }
  }

  public void wg(int var1, int var2, int var3, int var4, int var5, int var6) {
    int var7 = this.fk[var5];
    int var8 = this.gk[var5];
    int var9 = 0;
    int var10 = 0;
    int var11 = (var7 << 16) / var3;
    int var12 = (var8 << 16) / var4;
    int var13;
    int var14;
    if (this.lk[var5]) {
      var13 = this.jk[var5];
      var14 = this.kk[var5];
      var11 = (var13 << 16) / var3;
      var12 = (var14 << 16) / var4;
      var1 += (this.hk[var5] * var3 + var13 - 1) / var13;
      var2 += (this.ik[var5] * var4 + var14 - 1) / var14;
      if (this.hk[var5] * var3 % var13 != 0) {
        var9 = (var13 - this.hk[var5] * var3 % var13 << 16) / var3;
      }

      if (this.ik[var5] * var4 % var14 != 0) {
        var10 = (var14 - this.ik[var5] * var4 % var14 << 16) / var4;
      }

      var3 = var3 * (this.fk[var5] - (var9 >> 16)) / var13;
      var4 = var4 * (this.gk[var5] - (var10 >> 16)) / var14;
    }

    var13 = var1 + var2 * this.sj;
    var14 = this.sj - var3;
    int var15;
    if (var2 < this.nk) {
      var15 = this.nk - var2;
      var4 -= var15;
      var2 = 0;
      var13 += var15 * this.sj;
      var10 += var12 * var15;
    }

    if (var2 + var4 >= this.ok) {
      var4 -= var2 + var4 - this.ok + 1;
    }

    if (var1 < this.pk) {
      var15 = this.pk - var1;
      var3 -= var15;
      var1 = 0;
      var13 += var15;
      var9 += var11 * var15;
      var14 += var15;
    }

    if (var1 + var3 >= this.qk) {
      var15 = var1 + var3 - this.qk + 1;
      var3 -= var15;
      var14 += var15;
    }

    if (var6 == 128) {
      this.ng(this.yj, this.ck[var5], 0, var9, var10, var13, var14, var3, var4, var11, var12, var7);
    } else {
      this.wf(this.yj, this.ck[var5], 0, var9, var10, var13, var14, var3, var4, var11, var12, var7, var6);
    }
  }

  private void ng(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
    int var13 = var4;

    for (int var14 = -var9; var14 < 0; ++var14) {
      int var15 = (var5 >> 16) * var12;

      for (int var16 = -var8; var16 < 0; ++var16) {
        var3 = var2[(var4 >> 16) + var15];
        if (var3 != 0) {
          var1[var6++] = (var3 >>> 1 & 8355711) + (var1[var6] >>> 1 & 8355711);
        } else {
          ++var6;
        }

        var4 += var10;
      }

      var5 += var11;
      var4 = var13;
      var6 += var7;
    }

  }

  private void wf(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
    int var14 = var4;
    int var15 = 256 - var13;

    for (int var22 = -var9; var22 < 0; ++var22) {
      int var23 = (var5 >> 16) * var12;

      for (int var24 = -var8; var24 < 0; ++var24) {
        var3 = var2[(var4 >> 16) + var23];
        if (var3 != 0) {
          int var16 = (var3 >> 16 & 255) * var13;
          int var17 = (var3 >> 8 & 255) * var13;
          int var18 = (var3 & 255) * var13;
          int var19 = (var1[var6] >> 16 & 255) * var15;
          int var20 = (var1[var6] >> 8 & 255) * var15;
          int var21 = (var1[var6] & 255) * var15;
          int var25 = (var16 + var19 >> 8 << 16) + (var17 + var20 >> 8 << 8) + (var18 + var21 >> 8);
          var1[var6++] = var25;
        } else {
          ++var6;
        }

        var4 += var10;
      }

      var5 += var11;
      var4 = var14;
      var6 += var7;
    }

  }

  public void yf(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
    this.lf(var1, var2, var3, var4, var5);
  }

  public void pf(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
    try {
      if (var6 == 0) {
        var6 = 16777215;
      }

      if (var7 == 0) {
        var7 = 16777215;
      }

      int var10 = this.fk[var5];
      int var11 = this.gk[var5];
      int var12 = 0;
      int var13 = 0;
      int var14 = var8 << 16;
      int var15 = (var10 << 16) / var3;
      int var16 = (var11 << 16) / var4;
      int var17 = -(var8 << 16) / var4;
      int var18;
      int var19;
      if (this.lk[var5]) {
        var18 = this.jk[var5];
        var19 = this.kk[var5];
        var15 = (var18 << 16) / var3;
        var16 = (var19 << 16) / var4;
        int var20 = this.hk[var5];
        int var21 = this.ik[var5];
        if (var9) {
          var20 = var18 - this.fk[var5] - var20;
        }

        var1 += (var20 * var3 + var18 - 1) / var18;
        int var22 = (var21 * var4 + var19 - 1) / var19;
        var2 += var22;
        var14 += var22 * var17;
        if (var20 * var3 % var18 != 0) {
          var12 = (var18 - var20 * var3 % var18 << 16) / var3;
        }

        if (var21 * var4 % var19 != 0) {
          var13 = (var19 - var21 * var4 % var19 << 16) / var4;
        }

        var3 = ((this.fk[var5] << 16) - var12 + var15 - 1) / var15;
        var4 = ((this.gk[var5] << 16) - var13 + var16 - 1) / var16;
      }

      var18 = var2 * this.sj;
      var14 += var1 << 16;
      if (var2 < this.nk) {
        var19 = this.nk - var2;
        var4 -= var19;
        var2 = this.nk;
        var18 += var19 * this.sj;
        var13 += var16 * var19;
        var14 += var17 * var19;
      }

      if (var2 + var4 >= this.ok) {
        var4 -= var2 + var4 - this.ok + 1;
      }

      var19 = var18 / this.sj & 1;
      if (!this.rk) {
        var19 = 2;
      }

      if (var7 == 16777215) {
        if (this.ck[var5] != null) {
          if (!var9) {
            this.xg(this.yj, this.ck[var5], 0, var12, var13, var18, var3, var4, var15, var16, var10, var6, var14, var17, var19);
          } else {
            this.xg(this.yj, this.ck[var5], 0, (this.fk[var5] << 16) - var12 - 1, var13, var18, var3, var4, -var15, var16, var10, var6, var14, var17, var19);
          }
        } else if (!var9) {
          this.bf(this.yj, this.dk[var5], this.ek[var5], 0, var12, var13, var18, var3, var4, var15, var16, var10, var6, var14, var17, var19);
        } else {
          this.bf(this.yj, this.dk[var5], this.ek[var5], 0, (this.fk[var5] << 16) - var12 - 1, var13, var18, var3, var4, -var15, var16, var10, var6, var14, var17, var19);
        }
      } else if (this.ck[var5] != null) {
        if (!var9) {
          this.uf(this.yj, this.ck[var5], 0, var12, var13, var18, var3, var4, var15, var16, var10, var6, var7, var14, var17, var19);
        } else {
          this.uf(this.yj, this.ck[var5], 0, (this.fk[var5] << 16) - var12 - 1, var13, var18, var3, var4, -var15, var16, var10, var6, var7, var14, var17, var19);
        }
      } else if (!var9) {
        this.vg(this.yj, this.dk[var5], this.ek[var5], 0, var12, var13, var18, var3, var4, var15, var16, var10, var6, var7, var14, var17, var19);
      } else {
        this.vg(this.yj, this.dk[var5], this.ek[var5], 0, (this.fk[var5] << 16) - var12 - 1, var13, var18, var3, var4, -var15, var16, var10, var6, var7, var14, var17, var19);
      }
    } catch (Exception var23) {
      System.out.println("error in sprite clipping routine");
    }
  }

  private void xg(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
    int var19 = var12 >> 16 & 255;
    int var20 = var12 >> 8 & 255;
    int var21 = var12 & 255;

    try {
      int var22 = var4;

      for (int var23 = -var8; var23 < 0; ++var23) {
        int var24 = (var5 >> 16) * var11;
        int var25 = var13 >> 16;
        int var26 = var7;
        int var27;
        if (var25 < this.pk) {
          var27 = this.pk - var25;
          var26 = var7 - var27;
          var25 = this.pk;
          var4 += var9 * var27;
        }

        if (var25 + var26 >= this.qk) {
          var27 = var25 + var26 - this.qk;
          var26 -= var27;
        }

        var15 = 1 - var15;
        if (var15 != 0) {
          for (var27 = var25; var27 < var25 + var26; ++var27) {
            var3 = var2[(var4 >> 16) + var24];
            if (var3 != 0) {
              int var16 = var3 >> 16 & 255;
              int var17 = var3 >> 8 & 255;
              int var18 = var3 & 255;
              if (var16 == var17 && var17 == var18) {
                var1[var27 + var6] = (var16 * var19 >> 8 << 16) + (var17 * var20 >> 8 << 8) + (var18 * var21 >> 8);
              } else {
                var1[var27 + var6] = var3;
              }
            }

            var4 += var9;
          }
        }

        var5 += var10;
        var4 = var22;
        var6 += this.sj;
        var13 += var14;
      }

    } catch (Exception var28) {
      System.out.println("error in transparent sprite plot routine");
    }
  }

  private void uf(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
    int var20 = var12 >> 16 & 255;
    int var21 = var12 >> 8 & 255;
    int var22 = var12 & 255;
    int var23 = var13 >> 16 & 255;
    int var24 = var13 >> 8 & 255;
    int var25 = var13 & 255;

    try {
      int var26 = var4;

      for (int var27 = -var8; var27 < 0; ++var27) {
        int var28 = (var5 >> 16) * var11;
        int var29 = var14 >> 16;
        int var30 = var7;
        int var31;
        if (var29 < this.pk) {
          var31 = this.pk - var29;
          var30 = var7 - var31;
          var29 = this.pk;
          var4 += var9 * var31;
        }

        if (var29 + var30 >= this.qk) {
          var31 = var29 + var30 - this.qk;
          var30 -= var31;
        }

        var16 = 1 - var16;
        if (var16 != 0) {
          for (var31 = var29; var31 < var29 + var30; ++var31) {
            var3 = var2[(var4 >> 16) + var28];
            if (var3 != 0) {
              int var17 = var3 >> 16 & 255;
              int var18 = var3 >> 8 & 255;
              int var19 = var3 & 255;
              if (var17 == var18 && var18 == var19) {
                var1[var31 + var6] = (var17 * var20 >> 8 << 16) + (var18 * var21 >> 8 << 8) + (var19 * var22 >> 8);
              } else if (var17 == 255 && var18 == var19) {
                var1[var31 + var6] = (var17 * var23 >> 8 << 16) + (var18 * var24 >> 8 << 8) + (var19 * var25 >> 8);
              } else {
                var1[var31 + var6] = var3;
              }
            }

            var4 += var9;
          }
        }

        var5 += var10;
        var4 = var26;
        var6 += this.sj;
        var14 += var15;
      }

    } catch (Exception var32) {
      System.out.println("error in transparent sprite plot routine");
    }
  }

  private void bf(int[] var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
    int var20 = var13 >> 16 & 255;
    int var21 = var13 >> 8 & 255;
    int var22 = var13 & 255;

    try {
      int var23 = var5;

      for (int var24 = -var9; var24 < 0; ++var24) {
        int var25 = (var6 >> 16) * var12;
        int var26 = var14 >> 16;
        int var27 = var8;
        int var28;
        if (var26 < this.pk) {
          var28 = this.pk - var26;
          var27 = var8 - var28;
          var26 = this.pk;
          var5 += var10 * var28;
        }

        if (var26 + var27 >= this.qk) {
          var28 = var26 + var27 - this.qk;
          var27 -= var28;
        }

        var16 = 1 - var16;
        if (var16 != 0) {
          for (var28 = var26; var28 < var26 + var27; ++var28) {
            var4 = var2[(var5 >> 16) + var25] & 255;
            if (var4 != 0) {
              var4 = var3[var4];
              int var17 = var4 >> 16 & 255;
              int var18 = var4 >> 8 & 255;
              int var19 = var4 & 255;
              if (var17 == var18 && var18 == var19) {
                var1[var28 + var7] = (var17 * var20 >> 8 << 16) + (var18 * var21 >> 8 << 8) + (var19 * var22 >> 8);
              } else {
                var1[var28 + var7] = var4;
              }
            }

            var5 += var10;
          }
        }

        var6 += var11;
        var5 = var23;
        var7 += this.sj;
        var14 += var15;
      }

    } catch (Exception var29) {
      System.out.println("error in transparent sprite plot routine");
    }
  }

  private void vg(int[] var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17) {
    int var21 = var13 >> 16 & 255;
    int var22 = var13 >> 8 & 255;
    int var23 = var13 & 255;
    int var24 = var14 >> 16 & 255;
    int var25 = var14 >> 8 & 255;
    int var26 = var14 & 255;

    try {
      int var27 = var5;

      for (int var28 = -var9; var28 < 0; ++var28) {
        int var29 = (var6 >> 16) * var12;
        int var30 = var15 >> 16;
        int var31 = var8;
        int var32;
        if (var30 < this.pk) {
          var32 = this.pk - var30;
          var31 = var8 - var32;
          var30 = this.pk;
          var5 += var10 * var32;
        }

        if (var30 + var31 >= this.qk) {
          var32 = var30 + var31 - this.qk;
          var31 -= var32;
        }

        var17 = 1 - var17;
        if (var17 != 0) {
          for (var32 = var30; var32 < var30 + var31; ++var32) {
            var4 = var2[(var5 >> 16) + var29] & 255;
            if (var4 != 0) {
              var4 = var3[var4];
              int var18 = var4 >> 16 & 255;
              int var19 = var4 >> 8 & 255;
              int var20 = var4 & 255;
              if (var18 == var19 && var19 == var20) {
                var1[var32 + var7] = (var18 * var21 >> 8 << 16) + (var19 * var22 >> 8 << 8) + (var20 * var23 >> 8);
              } else if (var18 == 255 && var19 == var20) {
                var1[var32 + var7] = (var18 * var24 >> 8 << 16) + (var19 * var25 >> 8 << 8) + (var20 * var26 >> 8);
              } else {
                var1[var32 + var7] = var4;
              }
            }

            var5 += var10;
          }
        }

        var6 += var11;
        var5 = var27;
        var7 += this.sj;
        var15 += var16;
      }

    } catch (Exception var33) {
      System.out.println("error in transparent sprite plot routine");
    }
  }

  public static int ye(byte[] var0) {
    sk[uk] = var0;
    return uk++;
  }

  public void sg(String var1, int var2, int var3, int var4, int var5) {
    this.ef(var1, var2 - this.xe(var1, var4), var3, var4, var5);
  }

  public void mg(String var1, int var2, int var3, int var4, int var5) {
    this.ef(var1, var2 - this.xe(var1, var4) / 2, var3, var4, var5);
  }

  public void ug(String var1, int var2, int var3, int var4, int var5, int var6) {
    int var7 = 0;
    byte[] var8 = sk[var4];
    int var9 = 0;
    int var10 = 0;

    for (int var11 = 0; var11 < var1.length(); ++var11) {
      if (var1.charAt(var11) == '@' && var11 + 4 < var1.length() && var1.charAt(var11 + 4) == '@') {
        var11 += 4;
      } else if (var1.charAt(var11) == '~' && var11 + 4 < var1.length() && var1.charAt(var11 + 4) == '~') {
        var11 += 4;
      } else {
        var7 += var8[tk[var1.charAt(var11)] + 7];
      }

      if (var1.charAt(var11) == ' ') {
        var10 = var11;
      }

      if (var7 > var6) {
        if (var10 <= var9) {
          var10 = var11;
        }

        this.mg(var1.substring(var9, var10), var2, var3, var4, var5);
        var7 = 0;
        var9 = var11 = var10 + 1;
        var3 += this.ig(var4);
      }
    }

    if (var7 > 0) {
      this.mg(var1.substring(var9), var2, var3, var4, var5);
    }

  }

  public void ef(String var1, int var2, int var3, int var4, int var5) {
    byte[] var6 = sk[var4];

    for (int var7 = 0; var7 < var1.length(); ++var7) {
      if (var1.charAt(var7) == '@' && var7 + 4 < var1.length() && var1.charAt(var7 + 4) == '@') {
        if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("red")) {
          var5 = 16711680;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("lre")) {
          var5 = 16748608;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("yel")) {
          var5 = 16776960;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("gre")) {
          var5 = 65280;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("blu")) {
          var5 = 255;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("cya")) {
          var5 = 65535;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("mag")) {
          var5 = 16711935;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("whi")) {
          var5 = 16777215;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("bla")) {
          var5 = 0;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("dre")) {
          var5 = 12582912;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("ora")) {
          var5 = 16748608;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("ran")) {
          var5 = (int)(Math.random() * 1.6777215E7D);
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("or1")) {
          var5 = 16756736;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("or2")) {
          var5 = 16740352;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("or3")) {
          var5 = 16723968;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("gr1")) {
          var5 = 12648192;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("gr2")) {
          var5 = 8453888;
        } else if (var1.substring(var7 + 1, var7 + 4).equalsIgnoreCase("gr3")) {
          var5 = 4259584;
        }

        var7 += 4;
      } else if (var1.charAt(var7) == '~' && var7 + 4 < var1.length() && var1.charAt(var7 + 4) == '~') {
        char var11 = var1.charAt(var7 + 1);
        char var9 = var1.charAt(var7 + 2);
        char var10 = var1.charAt(var7 + 3);
        if (var11 >= '0' && var11 <= '9' && var9 >= '0' && var9 <= '9' && var10 >= '0' && var10 <= '9') {
          var2 = Integer.parseInt(var1.substring(var7 + 1, var7 + 4));
        }

        var7 += 4;
      } else {
        int var8 = tk[var1.charAt(var7)];
        if (this.vk && var5 != 0) {
          this.lg(var8, var2 + 1, var3, 0, var6);
        }

        if (this.vk && var5 != 0) {
          this.lg(var8, var2, var3 + 1, 0, var6);
        }

        this.lg(var8, var2, var3, var5, var6);
        var2 += var6[var8 + 7];
      }
    }

  }

  private void lg(int var1, int var2, int var3, int var4, byte[] var5) {
    int var6 = var2 + var5[var1 + 5];
    int var7 = var3 - var5[var1 + 6];
    int var8 = var5[var1 + 3];
    int var9 = var5[var1 + 4];
    int var10 = var5[var1] * 16384 + var5[var1 + 1] * 128 + var5[var1 + 2];
    int var11 = var6 + var7 * this.sj;
    int var12 = this.sj - var8;
    int var13 = 0;
    int var14;
    if (var7 < this.nk) {
      var14 = this.nk - var7;
      var9 -= var14;
      var7 = this.nk;
      var10 += var14 * var8;
      var11 += var14 * this.sj;
    }

    if (var7 + var9 >= this.ok) {
      var9 -= var7 + var9 - this.ok + 1;
    }

    if (var6 < this.pk) {
      var14 = this.pk - var6;
      var8 -= var14;
      var6 = this.pk;
      var10 += var14;
      var11 += var14;
      var13 += var14;
      var12 += var14;
    }

    if (var6 + var8 >= this.qk) {
      var14 = var6 + var8 - this.qk + 1;
      var8 -= var14;
      var13 += var14;
      var12 += var14;
    }

    if (var8 > 0 && var9 > 0) {
      this.we(this.yj, var5, var4, var10, var11, var8, var9, var12, var13);
    }

  }

  private void we(int[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
    int var10 = -(var6 >> 2);
    var6 = -(var6 & 3);

    for (int var11 = -var7; var11 < 0; ++var11) {
      for (int var12 = var10; var12 < 0; ++var12) {
        if (var2[var4++] != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }

        if (var2[var4++] != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }

        if (var2[var4++] != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }

        if (var2[var4++] != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }
      }

      for (int var13 = var6; var13 < 0; ++var13) {
        if (var2[var4++] != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }
      }

      var5 += var8;
      var4 += var9;
    }

  }

  public int ig(int var1) {
    return var1 == 0 ? sk[var1][8] - 2 : sk[var1][8] - 1;
  }

  public int xe(String var1, int var2) {
    int var3 = 0;
    byte[] var4 = sk[var2];

    for (int var5 = 0; var5 < var1.length(); ++var5) {
      if (var1.charAt(var5) == '@' && var5 + 4 < var1.length() && var1.charAt(var5 + 4) == '@') {
        var5 += 4;
      } else if (var1.charAt(var5) == '~' && var5 + 4 < var1.length() && var1.charAt(var5 + 4) == '~') {
        var5 += 4;
      } else {
        var3 += var4[tk[var1.charAt(var5)] + 7];
      }
    }

    return var3;
  }

  public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
    return true;
  }

  static {
    String var0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    tk = new int[256];

    for (int var1 = 0; var1 < 256; ++var1) {
      int var2 = var0.indexOf(var1);
      if (var2 == -1) {
        var2 = 74;
      }

      tk[var1] = var2 * 9;
    }

  }
}

package deob;

@ObfuscatedName("r")
public final class class3 extends class40 {

    @ObfuscatedName("r.l")
    public String field59;

    @ObfuscatedName("r.g")
    public class183 field32;

    @ObfuscatedName("r.r")
    public int field31 = -1;

    @ObfuscatedName("r.e")
    public int field34 = -1;

    @ObfuscatedName("r.s")
    public String[] field51 = new String[3];

    @ObfuscatedName("r.k")
    public int field38;

    @ObfuscatedName("r.u")
    public int field55;

    @ObfuscatedName("r.n")
    public int field39;

    @ObfuscatedName("r.b")
    public int field44;

    @ObfuscatedName("r.m")
    public int field41;

    @ObfuscatedName("r.q")
    public int field42;

    @ObfuscatedName("r.p")
    public int field43;

    @ObfuscatedName("r.w")
    public int field33;

    @ObfuscatedName("r.o")
    public class109 field37;

    @ObfuscatedName("r.d")
    public int field56;

    @ObfuscatedName("r.f")
    public int field47;

    @ObfuscatedName("r.z")
    public int field48;

    @ObfuscatedName("r.i")
    public int field49;

    @ObfuscatedName("r.v")
    public boolean field40;

    @ObfuscatedName("r.j")
    public int field45;

    @ObfuscatedName("r.x")
    public boolean field52;

    @ObfuscatedName("r.t")
    public int field53;

    @ObfuscatedName("r.y")
    public int field54;

    @ObfuscatedName("r.a")
    public boolean field46;

    @ObfuscatedName("r.c")
    public int field50;

    @ObfuscatedName("r.ad")
    public int field57;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field51[var1] = "";
        }
        this.field38 = 0;
        this.field55 = 0;
        this.field44 = 0;
        this.field41 = 0;
        this.field40 = false;
        this.field45 = 0;
        this.field52 = false;
        this.field46 = false;
    }

    @ObfuscatedName("r.l(Ldc;B)V")
    public final void method30(class123 arg0) {
        arg0.field2051 = 0;
        int var2 = arg0.method2490();
        this.field31 = arg0.method2491();
        this.field34 = arg0.method2491();
        int var3 = -1;
        this.field45 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2490();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2490();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2492();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class56.method15(var4[var5] - 512).field1190;
                    if (var8 != 0) {
                        this.field45 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2490();
            if (var11 < 0 || var11 >= Statics.field2795[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field839 = arg0.method2492();
        if (this.field839 == 65535) {
            this.field839 = -1;
        }
        this.field867 = arg0.method2492();
        if (this.field867 == 65535) {
            this.field867 = -1;
        }
        this.field854 = this.field867;
        this.field880 = arg0.method2492();
        if (this.field880 == 65535) {
            this.field880 = -1;
        }
        this.field841 = arg0.method2492();
        if (this.field841 == 65535) {
            this.field841 = -1;
        }
        this.field842 = arg0.method2492();
        if (this.field842 == 65535) {
            this.field842 = -1;
        }
        this.field832 = arg0.method2492();
        if (this.field832 == 65535) {
            this.field832 = -1;
        }
        this.field844 = arg0.method2492();
        if (this.field844 == 65535) {
            this.field844 = -1;
        }
        this.field59 = arg0.method2520();
        if (Statics.field66 == this) {
            Statics.field2288 = this.field59;
        }
        this.field38 = arg0.method2490();
        this.field55 = arg0.method2492();
        this.field52 = arg0.method2490() == 1;
        if (client.field298 == 0 && client.field461 >= 2) {
            this.field52 = false;
        }
        if (this.field32 == null) {
            this.field32 = new class183();
        }
        this.field32.method3426(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("r.g(I)I")
    public int method16() {
        return this.field32 == null || this.field32.field2973 == -1 ? 1 : class42.method195(this.field32.field2973).field914;
    }

    @ObfuscatedName("r.r(I)Ldv;")
    public final class109 method18() {
        if (this.field32 == null) {
            return null;
        }
        class45 var1 = this.field864 != -1 && this.field865 == 0 ? class45.method578(this.field864) : null;
        class45 var2 = this.field861 == -1 || this.field40 || this.field861 == this.field839 && var1 != null ? null : class45.method578(this.field861);
        class109 var3 = this.field32.method3459(var1, this.field837, var2, this.field862);
        if (var3 == null) {
            return null;
        }
        var3.method2270();
        this.field838 = var3.field1539;
        if (!this.field40 && this.field869 != -1 && this.field891 != -1) {
            class109 var4 = class46.method2351(this.field869).method927(this.field891);
            if (var4 != null) {
                var4.method2280(0, -this.field873, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (!this.field40 && this.field37 != null) {
            if (client.field306 >= this.field41) {
                this.field37 = null;
            }
            if (client.field306 >= this.field44 && client.field306 < this.field41) {
                class109 var6 = this.field37;
                var6.method2280(this.field42 - this.field876, this.field43 - this.field39, this.field33 - this.field833);
                if (this.field883 == 512) {
                    var6.method2320();
                    var6.method2320();
                    var6.method2320();
                } else if (this.field883 == 1024) {
                    var6.method2320();
                    var6.method2320();
                } else if (this.field883 == 1536) {
                    var6.method2320();
                }
                class109[] var7 = new class109[] { var3, var6 };
                var3 = new class109(var7, 2);
                if (this.field883 == 512) {
                    var6.method2320();
                } else if (this.field883 == 1024) {
                    var6.method2320();
                    var6.method2320();
                } else if (this.field883 == 1536) {
                    var6.method2320();
                    var6.method2320();
                    var6.method2320();
                }
                var6.method2280(this.field876 - this.field42, this.field39 - this.field43, this.field833 - this.field33);
            }
        }
        var3.field1893 = true;
        return var3;
    }

    @ObfuscatedName("r.e(IIBI)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field864 != -1 && class45.method578(this.field864).field1029 == 1) {
            this.field864 = -1;
        }
        this.field860 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method20(arg0, arg1);
        } else if (this.field887[0] >= 0 && this.field887[0] < 104 && this.field888[0] >= 0 && this.field888[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field887[0];
                int var6 = this.field888[0];
                int var7 = this.method16();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class110.method942(var5, var6, this.method16(), client.method3132(arg0, arg1), client.field355[this.field53], true, client.field575, client.field576);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method21(client.field575[var9], client.field576[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method21(arg0, arg1, arg2);
        } else {
            this.method20(arg0, arg1);
        }
    }

    @ObfuscatedName("r.h(III)V")
    public void method20(int arg0, int arg1) {
        this.field850 = 0;
        this.field840 = 0;
        this.field890 = 0;
        this.field887[0] = arg0;
        this.field888[0] = arg1;
        int var3 = this.method16();
        this.field876 = this.field887[0] * 128 + var3 * 64;
        this.field833 = this.field888[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("r.s(IIBS)V")
    public final void method21(int arg0, int arg1, byte arg2) {
        if (this.field850 < 9) {
            this.field850++;
        }
        for (int var4 = this.field850; var4 > 0; var4--) {
            this.field887[var4] = this.field887[var4 - 1];
            this.field888[var4] = this.field888[var4 - 1];
            this.field889[var4] = this.field889[var4 - 1];
        }
        this.field887[0] = arg0;
        this.field888[0] = arg1;
        this.field889[0] = arg2;
    }

    @ObfuscatedName("r.k(B)Z")
    public final boolean method38() {
        return this.field32 != null;
    }
}

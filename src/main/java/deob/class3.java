package deob;

@ObfuscatedName("f")
public final class class3 extends class40 {

    @ObfuscatedName("f.k")
    public String field45;

    @ObfuscatedName("f.q")
    public class183 field30;

    @ObfuscatedName("f.f")
    public int field31 = -1;

    @ObfuscatedName("f.c")
    public int field47 = -1;

    @ObfuscatedName("f.j")
    public String[] field34 = new String[3];

    @ObfuscatedName("f.m")
    public int field35;

    @ObfuscatedName("f.y")
    public int field29;

    @ObfuscatedName("f.u")
    public int field37;

    @ObfuscatedName("f.h")
    public int field38;

    @ObfuscatedName("f.l")
    public int field39;

    @ObfuscatedName("f.b")
    public int field40;

    @ObfuscatedName("f.g")
    public int field55;

    @ObfuscatedName("f.e")
    public int field51;

    @ObfuscatedName("f.p")
    public class109 field43;

    @ObfuscatedName("f.s")
    public int field44;

    @ObfuscatedName("f.w")
    public int field42;

    @ObfuscatedName("f.i")
    public int field46;

    @ObfuscatedName("f.r")
    public int field41;

    @ObfuscatedName("f.a")
    public boolean field48;

    @ObfuscatedName("f.n")
    public int field49;

    @ObfuscatedName("f.z")
    public boolean field50;

    @ObfuscatedName("f.x")
    public int field56;

    @ObfuscatedName("f.d")
    public int field52;

    @ObfuscatedName("f.t")
    public boolean field53;

    @ObfuscatedName("f.o")
    public int field54;

    @ObfuscatedName("f.aq")
    public int field36;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field34[var1] = "";
        }
        this.field35 = 0;
        this.field29 = 0;
        this.field38 = 0;
        this.field39 = 0;
        this.field48 = false;
        this.field49 = 0;
        this.field50 = false;
        this.field53 = false;
    }

    @ObfuscatedName("f.k(Lde;B)V")
    public final void method12(class123 arg0) {
        arg0.field2060 = 0;
        int var2 = arg0.method2427();
        this.field31 = arg0.method2428();
        this.field47 = arg0.method2428();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2427();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2427();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2547();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class56.method576(var4[var5] - 512).field1215;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2427();
            if (var11 < 0 || var11 >= Statics.field2969[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field831 = arg0.method2547();
        if (this.field831 == 65535) {
            this.field831 = -1;
        }
        this.field832 = arg0.method2547();
        if (this.field832 == 65535) {
            this.field832 = -1;
        }
        this.field833 = this.field832;
        this.field834 = arg0.method2547();
        if (this.field834 == 65535) {
            this.field834 = -1;
        }
        this.field835 = arg0.method2547();
        if (this.field835 == 65535) {
            this.field835 = -1;
        }
        this.field836 = arg0.method2547();
        if (this.field836 == 65535) {
            this.field836 = -1;
        }
        this.field837 = arg0.method2547();
        if (this.field837 == 65535) {
            this.field837 = -1;
        }
        this.field873 = arg0.method2547();
        if (this.field873 == 65535) {
            this.field873 = -1;
        }
        this.field45 = arg0.method2435();
        if (Statics.field2692 == this) {
            Statics.field2035 = this.field45;
        }
        this.field35 = arg0.method2427();
        this.field29 = arg0.method2547();
        this.field50 = arg0.method2427() == 1;
        if (client.field280 == 0 && client.field448 >= 2) {
            this.field50 = false;
        }
        if (this.field30 == null) {
            this.field30 = new class183();
        }
        this.field30.method3294(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("f.q(I)I")
    public int method19() {
        return this.field30 == null || this.field30.field2976 == -1 ? 1 : class42.method2307(this.field30.field2976).field900;
    }

    @ObfuscatedName("f.f(I)Ldj;")
    public final class109 method14() {
        if (this.field30 == null) {
            return null;
        }
        class45 var1 = this.field851 != -1 && this.field861 == 0 ? class45.method726(this.field851) : null;
        class45 var2 = this.field826 == -1 || this.field48 || this.field831 == this.field826 && var1 != null ? null : class45.method726(this.field826);
        class109 var3 = this.field30.method3300(var1, this.field860, var2, this.field855);
        if (var3 == null) {
            return null;
        }
        var3.method2233();
        this.field858 = var3.field1518;
        if (!this.field48 && this.field863 != -1 && this.field828 != -1) {
            class109 var4 = class46.method2984(this.field863).method904(this.field828);
            if (var4 != null) {
                var4.method2242(0, -this.field867, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (!this.field48 && this.field43 != null) {
            if (client.field289 >= this.field39) {
                this.field43 = null;
            }
            if (client.field289 >= this.field38 && client.field289 < this.field39) {
                class109 var6 = this.field43;
                var6.method2242(this.field40 - this.field880, this.field55 - this.field37, this.field51 - this.field827);
                if (this.field877 == 512) {
                    var6.method2238();
                    var6.method2238();
                    var6.method2238();
                } else if (this.field877 == 1024) {
                    var6.method2238();
                    var6.method2238();
                } else if (this.field877 == 1536) {
                    var6.method2238();
                }
                class109[] var7 = new class109[] { var3, var6 };
                var3 = new class109(var7, 2);
                if (this.field877 == 512) {
                    var6.method2238();
                } else if (this.field877 == 1024) {
                    var6.method2238();
                    var6.method2238();
                } else if (this.field877 == 1536) {
                    var6.method2238();
                    var6.method2238();
                    var6.method2238();
                }
                var6.method2242(this.field880 - this.field40, this.field37 - this.field55, this.field827 - this.field51);
            }
        }
        var3.field1912 = true;
        return var3;
    }

    @ObfuscatedName("f.c(IIBB)V")
    public final void method15(int arg0, int arg1, byte arg2) {
        if (this.field851 != -1 && class45.method726(this.field851).field1019 == 1) {
            this.field851 = -1;
        }
        this.field846 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method11(arg0, arg1);
        } else if (this.field881[0] >= 0 && this.field881[0] < 104 && this.field882[0] >= 0 && this.field882[0] < 104) {
            if (arg2 == 2) {
                client.method2032(this, arg0, arg1, (byte) 2);
            }
            this.method17(arg0, arg1, arg2);
        } else {
            this.method11(arg0, arg1);
        }
    }

    @ObfuscatedName("f.v(III)V")
    public void method11(int arg0, int arg1) {
        this.field852 = 0;
        this.field864 = 0;
        this.field884 = 0;
        this.field881[0] = arg0;
        this.field882[0] = arg1;
        int var3 = this.method19();
        this.field880 = this.field881[0] * 128 + var3 * 64;
        this.field827 = this.field882[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("f.j(IIBB)V")
    public final void method17(int arg0, int arg1, byte arg2) {
        if (this.field852 < 9) {
            this.field852++;
        }
        for (int var4 = this.field852; var4 > 0; var4--) {
            this.field881[var4] = this.field881[var4 - 1];
            this.field882[var4] = this.field882[var4 - 1];
            this.field883[var4] = this.field883[var4 - 1];
        }
        this.field881[0] = arg0;
        this.field882[0] = arg1;
        this.field883[0] = arg2;
    }

    @ObfuscatedName("f.m(I)Z")
    public final boolean method18() {
        return this.field30 != null;
    }
}

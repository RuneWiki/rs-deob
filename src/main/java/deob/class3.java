package deob;

@ObfuscatedName("t")
public final class class3 extends class38 {

    @ObfuscatedName("t.w")
    public String field60;

    @ObfuscatedName("t.x")
    public class180 field48;

    @ObfuscatedName("t.t")
    public int field40 = -1;

    @ObfuscatedName("t.p")
    public int field56 = -1;

    @ObfuscatedName("t.y")
    public String[] field43 = new String[3];

    @ObfuscatedName("t.m")
    public int field51;

    @ObfuscatedName("t.c")
    public int field45;

    @ObfuscatedName("t.v")
    public int field46;

    @ObfuscatedName("t.l")
    public int field47;

    @ObfuscatedName("t.z")
    public int field58;

    @ObfuscatedName("t.s")
    public int field49;

    @ObfuscatedName("t.j")
    public int field50;

    @ObfuscatedName("t.q")
    public int field39;

    @ObfuscatedName("t.a")
    public class106 field52;

    @ObfuscatedName("t.d")
    public int field53;

    @ObfuscatedName("t.u")
    public int field54;

    @ObfuscatedName("t.i")
    public int field55;

    @ObfuscatedName("t.o")
    public int field68;

    @ObfuscatedName("t.h")
    public boolean field57;

    @ObfuscatedName("t.k")
    public int field67;

    @ObfuscatedName("t.f")
    public boolean field44;

    @ObfuscatedName("t.r")
    public int field63;

    @ObfuscatedName("t.n")
    public int field61;

    @ObfuscatedName("t.g")
    public boolean field62;

    @ObfuscatedName("t.b")
    public int field59;

    @ObfuscatedName("t.af")
    public int field64;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field43[var1] = "";
        }
        this.field51 = 0;
        this.field45 = 0;
        this.field47 = 0;
        this.field58 = 0;
        this.field57 = false;
        this.field67 = 0;
        this.field44 = false;
        this.field62 = false;
    }

    @ObfuscatedName("t.w(Lde;B)V")
    public final void method23(class120 arg0) {
        arg0.field2012 = 0;
        int var2 = arg0.method2363();
        this.field40 = arg0.method2381();
        this.field56 = arg0.method2381();
        int var3 = -1;
        this.field67 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2363();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2363();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2365();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method1036(var4[var5] - 512).field1160;
                    if (var8 != 0) {
                        this.field67 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2363();
            if (var11 < 0 || var11 >= Statics.field585[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field824 = arg0.method2365();
        if (this.field824 == 65535) {
            this.field824 = -1;
        }
        this.field825 = arg0.method2365();
        if (this.field825 == 65535) {
            this.field825 = -1;
        }
        this.field826 = this.field825;
        this.field827 = arg0.method2365();
        if (this.field827 == 65535) {
            this.field827 = -1;
        }
        this.field828 = arg0.method2365();
        if (this.field828 == 65535) {
            this.field828 = -1;
        }
        this.field829 = arg0.method2365();
        if (this.field829 == 65535) {
            this.field829 = -1;
        }
        this.field830 = arg0.method2365();
        if (this.field830 == 65535) {
            this.field830 = -1;
        }
        this.field869 = arg0.method2365();
        if (this.field869 == 65535) {
            this.field869 = -1;
        }
        if (Statics.field2693 == this) {
            Statics.field2243 = this.field60;
        }
        this.field51 = arg0.method2363();
        this.field45 = arg0.method2365();
        this.field44 = arg0.method2363() == 1;
        if (client.field300 == 0 && client.field462 >= 2) {
            this.field44 = false;
        }
        if (this.field48 == null) {
            this.field48 = new class180();
        }
        this.field48.method3276(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("t.x(I)I")
    public int method16() {
        return this.field48 == null || this.field48.field2929 == -1 ? 1 : class40.method745(this.field48.field2929).field886;
    }

    @ObfuscatedName("t.t(I)Ldp;")
    public final class106 method34() {
        if (this.field48 == null) {
            return null;
        }
        class43 var1 = this.field822 != -1 && this.field853 == 0 ? class43.method2054(this.field822) : null;
        class43 var2 = this.field847 == -1 || this.field57 || this.field847 == this.field824 && var1 != null ? null : class43.method2054(this.field847);
        class106 var3 = this.field48.method3282(var1, this.field851, var2, this.field838);
        if (var3 == null) {
            return null;
        }
        var3.method2189();
        this.field868 = var3.field1468;
        if (!this.field57 && this.field855 != -1 && this.field870 != -1) {
            class106 var4 = class44.method662(this.field855).method918(this.field870);
            if (var4 != null) {
                var4.method2205(0, -this.field859, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (!this.field57 && this.field52 != null) {
            if (client.field306 >= this.field58) {
                this.field52 = null;
            }
            if (client.field306 >= this.field47 && client.field306 < this.field58) {
                class106 var6 = this.field52;
                var6.method2205(this.field49 - this.field850, this.field50 - this.field46, this.field39 - this.field820);
                if (this.field848 == 512) {
                    var6.method2177();
                    var6.method2177();
                    var6.method2177();
                } else if (this.field848 == 1024) {
                    var6.method2177();
                    var6.method2177();
                } else if (this.field848 == 1536) {
                    var6.method2177();
                }
                class106[] var7 = new class106[] { var3, var6 };
                var3 = new class106(var7, 2);
                if (this.field848 == 512) {
                    var6.method2177();
                } else if (this.field848 == 1024) {
                    var6.method2177();
                    var6.method2177();
                } else if (this.field848 == 1536) {
                    var6.method2177();
                    var6.method2177();
                    var6.method2177();
                }
                var6.method2205(this.field850 - this.field49, this.field46 - this.field50, this.field820 - this.field39);
            }
        }
        var3.field1871 = true;
        return var3;
    }

    @ObfuscatedName("t.p(IIBB)V")
    public final void method17(int arg0, int arg1, byte arg2) {
        if (this.field822 != -1 && class43.method2054(this.field822).field1005 == 1) {
            this.field822 = -1;
        }
        this.field877 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method18(arg0, arg1);
        } else if (this.field873[0] >= 0 && this.field873[0] < 104 && this.field874[0] >= 0 && this.field874[0] < 104) {
            if (arg2 == 2) {
                client.method2159(this, arg0, arg1, (byte) 2);
            }
            this.method19(arg0, arg1, arg2);
        } else {
            this.method18(arg0, arg1);
        }
    }

    @ObfuscatedName("t.e(IIB)V")
    public void method18(int arg0, int arg1) {
        this.field819 = 0;
        this.field876 = 0;
        this.field846 = 0;
        this.field873[0] = arg0;
        this.field874[0] = arg1;
        int var3 = this.method16();
        this.field850 = this.field873[0] * 128 + var3 * 64;
        this.field820 = this.field874[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("t.y(IIBI)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field819 < 9) {
            this.field819++;
        }
        for (int var4 = this.field819; var4 > 0; var4--) {
            this.field873[var4] = this.field873[var4 - 1];
            this.field874[var4] = this.field874[var4 - 1];
            this.field875[var4] = this.field875[var4 - 1];
        }
        this.field873[0] = arg0;
        this.field874[0] = arg1;
        this.field875[0] = arg2;
    }

    @ObfuscatedName("t.m(B)Z")
    public final boolean method20() {
        return this.field48 != null;
    }
}

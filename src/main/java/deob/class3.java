package deob;

@ObfuscatedName("m")
public final class class3 extends class38 {

    @ObfuscatedName("m.j")
    public String field59;

    @ObfuscatedName("m.h")
    public class180 field37;

    @ObfuscatedName("m.m")
    public int field38 = -1;

    @ObfuscatedName("m.z")
    public int field41 = -1;

    @ObfuscatedName("m.e")
    public String[] field62 = new String[3];

    @ObfuscatedName("m.i")
    public int field42;

    @ObfuscatedName("m.c")
    public int field40;

    @ObfuscatedName("m.n")
    public int field44;

    @ObfuscatedName("m.l")
    public int field45;

    @ObfuscatedName("m.u")
    public int field46;

    @ObfuscatedName("m.r")
    public int field47;

    @ObfuscatedName("m.a")
    public int field55;

    @ObfuscatedName("m.d")
    public int field49;

    @ObfuscatedName("m.p")
    public class106 field50;

    @ObfuscatedName("m.q")
    public int field51;

    @ObfuscatedName("m.b")
    public int field48;

    @ObfuscatedName("m.t")
    public int field39;

    @ObfuscatedName("m.y")
    public int field54;

    @ObfuscatedName("m.w")
    public boolean field36;

    @ObfuscatedName("m.g")
    public int field56;

    @ObfuscatedName("m.s")
    public boolean field57;

    @ObfuscatedName("m.k")
    public int field58;

    @ObfuscatedName("m.o")
    public int field53;

    @ObfuscatedName("m.v")
    public boolean field60;

    @ObfuscatedName("m.f")
    public int field61;

    @ObfuscatedName("m.au")
    public int field52;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field62[var1] = "";
        }
        this.field42 = 0;
        this.field40 = 0;
        this.field45 = 0;
        this.field46 = 0;
        this.field36 = false;
        this.field56 = 0;
        this.field57 = false;
        this.field60 = false;
    }

    @ObfuscatedName("m.j(Ldx;B)V")
    public final void method9(class120 arg0) {
        arg0.field1972 = 0;
        int var2 = arg0.method2361();
        this.field38 = arg0.method2531();
        this.field41 = arg0.method2531();
        int var3 = -1;
        this.field56 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2361();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2361();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2363();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method1967(var4[var5] - 512).field1131;
                    if (var8 != 0) {
                        this.field56 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2361();
            if (var11 < 0 || var11 >= Statics.field1536[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field800 = arg0.method2363();
        if (this.field800 == 65535) {
            this.field800 = -1;
        }
        this.field801 = arg0.method2363();
        if (this.field801 == 65535) {
            this.field801 = -1;
        }
        this.field805 = this.field801;
        this.field803 = arg0.method2363();
        if (this.field803 == 65535) {
            this.field803 = -1;
        }
        this.field804 = arg0.method2363();
        if (this.field804 == 65535) {
            this.field804 = -1;
        }
        this.field852 = arg0.method2363();
        if (this.field852 == 65535) {
            this.field852 = -1;
        }
        this.field848 = arg0.method2363();
        if (this.field848 == 65535) {
            this.field848 = -1;
        }
        this.field807 = arg0.method2363();
        if (this.field807 == 65535) {
            this.field807 = -1;
        }
        this.field59 = arg0.method2369();
        if (Statics.field1054 == this) {
            Statics.field2202 = this.field59;
        }
        this.field42 = arg0.method2361();
        this.field40 = arg0.method2363();
        this.field57 = arg0.method2361() == 1;
        if (client.field432 == 0 && client.field441 >= 2) {
            this.field57 = false;
        }
        if (this.field37 == null) {
            this.field37 = new class180();
        }
        this.field37.method3224(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("m.h(I)I")
    public int method11() {
        return this.field37 == null || this.field37.field2922 == -1 ? 1 : class40.method2927(this.field37.field2922).field869;
    }

    @ObfuscatedName("m.m(I)Ldf;")
    public final class106 method12() {
        if (this.field37 == null) {
            return null;
        }
        class43 var1 = this.field826 != -1 && this.field850 == 0 ? class43.method2947(this.field826) : null;
        class43 var2 = this.field855 == -1 || this.field36 || this.field855 == this.field800 && var1 != null ? null : class43.method2947(this.field855);
        class106 var3 = this.field37.method3230(var1, this.field827, var2, this.field799);
        if (var3 == null) {
            return null;
        }
        var3.method2203();
        this.field795 = var3.field1444;
        if (!this.field36 && this.field857 != -1 && this.field832 != -1) {
            class106 var4 = class44.method236(this.field857).method875(this.field832);
            if (var4 != null) {
                var4.method2168(0, -this.field835, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (!this.field36 && this.field50 != null) {
            if (client.field286 >= this.field46) {
                this.field50 = null;
            }
            if (client.field286 >= this.field45 && client.field286 < this.field46) {
                class106 var6 = this.field50;
                var6.method2168(this.field47 - this.field817, this.field55 - this.field44, this.field49 - this.field841);
                if (this.field845 == 512) {
                    var6.method2164();
                    var6.method2164();
                    var6.method2164();
                } else if (this.field845 == 1024) {
                    var6.method2164();
                    var6.method2164();
                } else if (this.field845 == 1536) {
                    var6.method2164();
                }
                class106[] var7 = new class106[] { var3, var6 };
                var3 = new class106(var7, 2);
                if (this.field845 == 512) {
                    var6.method2164();
                } else if (this.field845 == 1024) {
                    var6.method2164();
                    var6.method2164();
                } else if (this.field845 == 1536) {
                    var6.method2164();
                    var6.method2164();
                    var6.method2164();
                }
                var6.method2168(this.field817 - this.field47, this.field44 - this.field55, this.field841 - this.field49);
            }
        }
        var3.field1810 = true;
        return var3;
    }

    @ObfuscatedName("m.z(IIBB)V")
    public final void method27(int arg0, int arg1, byte arg2) {
        if (this.field826 != -1 && class43.method2947(this.field826).field977 == 1) {
            this.field826 = -1;
        }
        this.field822 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method14(arg0, arg1);
        } else if (this.field849[0] >= 0 && this.field849[0] < 104 && this.field823[0] >= 0 && this.field823[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field849[0];
                int var6 = this.field823[0];
                int var7 = this.method11();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method11();
                    client.field553.field1862 = arg0;
                    client.field553.field1860 = arg1;
                    client.field553.field1859 = 1;
                    client.field553.field1864 = 1;
                    class11 var11 = client.field553;
                    int var12 = class107.method309(var5, var6, var10, var11, client.field483[this.field58], true, client.field554, client.field555);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method15(client.field554[var13], client.field555[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method15(arg0, arg1, arg2);
        } else {
            this.method14(arg0, arg1);
        }
    }

    @ObfuscatedName("m.x(IIB)V")
    public void method14(int arg0, int arg1) {
        this.field821 = 0;
        this.field853 = 0;
        this.field824 = 0;
        this.field849[0] = arg0;
        this.field823[0] = arg1;
        int var3 = this.method11();
        this.field817 = this.field849[0] * 128 + var3 * 64;
        this.field841 = this.field823[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("m.e(IIBB)V")
    public final void method15(int arg0, int arg1, byte arg2) {
        if (this.field821 < 9) {
            this.field821++;
        }
        for (int var4 = this.field821; var4 > 0; var4--) {
            this.field849[var4] = this.field849[var4 - 1];
            this.field823[var4] = this.field823[var4 - 1];
            this.field851[var4] = this.field851[var4 - 1];
        }
        this.field849[0] = arg0;
        this.field823[0] = arg1;
        this.field851[0] = arg2;
    }

    @ObfuscatedName("m.i(I)Z")
    public final boolean method22() {
        return this.field37 != null;
    }
}

package deob;

@ObfuscatedName("k")
public final class class3 extends class38 {

    @ObfuscatedName("k.c")
    public String field35;

    @ObfuscatedName("k.h")
    public class179 field43;

    @ObfuscatedName("k.k")
    public int field56 = -1;

    @ObfuscatedName("k.t")
    public int field54 = -1;

    @ObfuscatedName("k.g")
    public int field32 = 0;

    @ObfuscatedName("k.o")
    public int field37 = 0;

    @ObfuscatedName("k.i")
    public int field38;

    @ObfuscatedName("k.w")
    public int field49 = 0;

    @ObfuscatedName("k.m")
    public int field40 = 0;

    @ObfuscatedName("k.r")
    public int field41;

    @ObfuscatedName("k.y")
    public int field42;

    @ObfuscatedName("k.q")
    public int field36;

    @ObfuscatedName("k.f")
    public class105 field48;

    @ObfuscatedName("k.x")
    public int field45;

    @ObfuscatedName("k.d")
    public int field46;

    @ObfuscatedName("k.e")
    public int field47;

    @ObfuscatedName("k.l")
    public int field44;

    @ObfuscatedName("k.u")
    public boolean field33 = false;

    @ObfuscatedName("k.a")
    public int field50 = 0;

    @ObfuscatedName("k.b")
    public boolean field51 = false;

    @ObfuscatedName("k.s")
    public int field52;

    @ObfuscatedName("k.v")
    public int field53;

    @ObfuscatedName("k.j")
    public int field58;

    @ObfuscatedName("k.z")
    public int field55;

    @ObfuscatedName("k.c(Ldf;I)V")
    public final void method25(class119 arg0) {
        arg0.field1955 = 0;
        int var2 = arg0.method2291();
        this.field56 = arg0.method2292();
        this.field54 = arg0.method2292();
        int var3 = -1;
        this.field50 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2291();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2291();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2293();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method971(var4[var5] - 512).field1150;
                    if (var8 != 0) {
                        this.field50 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2291();
            if (var11 < 0 || var11 >= Statics.field2905[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field817 = arg0.method2293();
        if (this.field817 == 65535) {
            this.field817 = -1;
        }
        this.field818 = arg0.method2293();
        if (this.field818 == 65535) {
            this.field818 = -1;
        }
        this.field862 = this.field818;
        this.field820 = arg0.method2293();
        if (this.field820 == 65535) {
            this.field820 = -1;
        }
        this.field821 = arg0.method2293();
        if (this.field821 == 65535) {
            this.field821 = -1;
        }
        this.field822 = arg0.method2293();
        if (this.field822 == 65535) {
            this.field822 = -1;
        }
        this.field823 = arg0.method2293();
        if (this.field823 == 65535) {
            this.field823 = -1;
        }
        this.field824 = arg0.method2293();
        if (this.field824 == 65535) {
            this.field824 = -1;
        }
        this.field35 = arg0.method2299();
        if (Statics.field2644 == this) {
            Statics.field2191 = this.field35;
        }
        this.field32 = arg0.method2291();
        this.field37 = arg0.method2293();
        this.field51 = arg0.method2291() == 1;
        if (client.field301 == 0 && client.field442 >= 2) {
            this.field51 = false;
        }
        if (this.field43 == null) {
            this.field43 = new class179();
        }
        this.field43.method3265(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("k.h(B)I")
    public int method20() {
        return this.field43 == null || this.field43.field2901 == -1 ? 1 : Statics.method618(this.field43.field2901).field890;
    }

    @ObfuscatedName("k.k(B)Ldt;")
    public final class105 method13() {
        if (this.field43 == null) {
            return null;
        }
        class43 var1 = this.field846 != -1 && this.field858 == 0 ? class43.method2648(this.field846) : null;
        class43 var2 = this.field850 == -1 || this.field33 || this.field850 == this.field817 && var1 != null ? null : class43.method2648(this.field850);
        class105 var3 = this.field43.method3245(var1, this.field844, var2, this.field841);
        if (var3 == null) {
            return null;
        }
        var3.method2095();
        this.field861 = var3.field1437;
        if (!this.field33 && this.field848 != -1 && this.field849 != -1) {
            class105 var4 = class44.method1037(this.field848).method876(this.field849);
            if (var4 != null) {
                var4.method2105(0, -this.field855, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field33 && this.field48 != null) {
            if (client.field285 >= this.field40) {
                this.field48 = null;
            }
            if (client.field285 >= this.field49 && client.field285 < this.field40) {
                class105 var6 = this.field48;
                var6.method2105(this.field41 - this.field859, this.field42 - this.field38, this.field36 - this.field839);
                if (this.field825 == 512) {
                    var6.method2101();
                    var6.method2101();
                    var6.method2101();
                } else if (this.field825 == 1024) {
                    var6.method2101();
                    var6.method2101();
                } else if (this.field825 == 1536) {
                    var6.method2101();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field825 == 512) {
                    var6.method2101();
                } else if (this.field825 == 1024) {
                    var6.method2101();
                    var6.method2101();
                } else if (this.field825 == 1536) {
                    var6.method2101();
                    var6.method2101();
                    var6.method2101();
                }
                var6.method2105(this.field859 - this.field41, this.field38 - this.field42, this.field839 - this.field36);
            }
        }
        var3.field1795 = true;
        return var3;
    }

    @ObfuscatedName("k.t(IIBI)V")
    public final void method14(int arg0, int arg1, byte arg2) {
        if (this.field846 != -1 && class43.method2648(this.field846).field1001 == 1) {
            this.field846 = -1;
        }
        this.field847 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method15(this.field859, this.field839);
        } else if (this.field866[0] >= 0 && this.field866[0] < 104 && this.field867[0] >= 0 && this.field867[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field866[0];
                int var6 = this.field867[0];
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104 && arg0 >= 0 && arg0 < 104 && arg1 >= 0 && arg1 < 104) {
                    int var7 = class106.method549(var5, var6, this.method20(), client.method688(arg0, arg1), client.field334[this.field52], true, client.field555, client.field556);
                    if (var7 >= 1) {
                        for (int var8 = 0; var8 < var7 - 1; var8++) {
                            var4.method16(client.field555[var8], client.field556[var8], (byte) 2);
                        }
                    }
                }
            }
            this.method16(arg0, arg1, arg2);
        } else {
            this.method15(this.field859, this.field839);
        }
    }

    @ObfuscatedName("k.g(IIB)V")
    public void method15(int arg0, int arg1) {
        this.field829 = 0;
        this.field870 = 0;
        this.field812 = 0;
        this.field866[0] = arg0;
        this.field867[0] = arg1;
        int var3 = this.method20();
        this.field859 = this.field866[0] * 128 + var3 * 64;
        this.field839 = this.field867[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("k.o(IIBB)V")
    public final void method16(int arg0, int arg1, byte arg2) {
        if (this.field829 < 9) {
            this.field829++;
        }
        for (int var4 = this.field829; var4 > 0; var4--) {
            this.field866[var4] = this.field866[var4 - 1];
            this.field867[var4] = this.field867[var4 - 1];
            this.field868[var4] = this.field868[var4 - 1];
        }
        this.field866[0] = arg0;
        this.field867[0] = arg1;
        this.field868[0] = arg2;
    }

    @ObfuscatedName("k.i(I)Z")
    public final boolean method17() {
        return this.field43 != null;
    }
}

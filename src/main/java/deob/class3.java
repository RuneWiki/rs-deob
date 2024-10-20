package deob;

@ObfuscatedName("f")
public final class class3 extends class38 {

    @ObfuscatedName("f.a")
    public String field41;

    @ObfuscatedName("f.r")
    public class179 field44;

    @ObfuscatedName("f.f")
    public int field28 = -1;

    @ObfuscatedName("f.s")
    public int field37 = -1;

    @ObfuscatedName("f.e")
    public String[] field31 = new String[3];

    @ObfuscatedName("f.g")
    public int field32;

    @ObfuscatedName("f.m")
    public int field33;

    @ObfuscatedName("f.j")
    public int field34;

    @ObfuscatedName("f.n")
    public int field35;

    @ObfuscatedName("f.l")
    public int field36;

    @ObfuscatedName("f.h")
    public int field47;

    @ObfuscatedName("f.i")
    public int field38;

    @ObfuscatedName("f.v")
    public int field43;

    @ObfuscatedName("f.z")
    public class105 field40;

    @ObfuscatedName("f.u")
    public int field26;

    @ObfuscatedName("f.t")
    public int field42;

    @ObfuscatedName("f.b")
    public int field52;

    @ObfuscatedName("f.c")
    public int field51;

    @ObfuscatedName("f.x")
    public boolean field45;

    @ObfuscatedName("f.d")
    public int field46;

    @ObfuscatedName("f.p")
    public boolean field53;

    @ObfuscatedName("f.q")
    public int field48;

    @ObfuscatedName("f.w")
    public int field49;

    @ObfuscatedName("f.k")
    public boolean field50;

    @ObfuscatedName("f.o")
    public int field29;

    @ObfuscatedName("f.ad")
    public int field30;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field31[var1] = "";
        }
        this.field32 = 0;
        this.field33 = 0;
        this.field35 = 0;
        this.field36 = 0;
        this.field45 = false;
        this.field46 = 0;
        this.field53 = false;
        this.field50 = false;
    }

    @ObfuscatedName("f.a(Lds;B)V")
    public final void method20(class119 arg0) {
        arg0.field1980 = 0;
        int var2 = arg0.method2412();
        this.field28 = arg0.method2540();
        this.field37 = arg0.method2540();
        int var3 = -1;
        this.field46 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2412();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2412();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2347();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method1531(var4[var5] - 512).field1153;
                    if (var8 != 0) {
                        this.field46 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2412();
            if (var11 < 0 || var11 >= Statics.field2028[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field818 = arg0.method2347();
        if (this.field818 == 65535) {
            this.field818 = -1;
        }
        this.field831 = arg0.method2347();
        if (this.field831 == 65535) {
            this.field831 = -1;
        }
        this.field820 = this.field831;
        this.field821 = arg0.method2347();
        if (this.field821 == 65535) {
            this.field821 = -1;
        }
        this.field822 = arg0.method2347();
        if (this.field822 == 65535) {
            this.field822 = -1;
        }
        this.field861 = arg0.method2347();
        if (this.field861 == 65535) {
            this.field861 = -1;
        }
        this.field824 = arg0.method2347();
        if (this.field824 == 65535) {
            this.field824 = -1;
        }
        this.field829 = arg0.method2347();
        if (this.field829 == 65535) {
            this.field829 = -1;
        }
        this.field41 = arg0.method2353();
        if (Statics.field2254 == this) {
            Statics.field2210 = this.field41;
        }
        this.field32 = arg0.method2412();
        this.field33 = arg0.method2347();
        this.field53 = arg0.method2412() == 1;
        if (client.field296 == 0 && client.field461 >= 2) {
            this.field53 = false;
        }
        if (this.field44 == null) {
            this.field44 = new class179();
        }
        this.field44.method3251(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("f.r(I)I")
    public int method21() {
        return this.field44 == null || this.field44.field2906 == -1 ? 1 : class40.method586(this.field44.field2906).field882;
    }

    @ObfuscatedName("f.f(I)Ldn;")
    public final class105 method27() {
        if (this.field44 == null) {
            return null;
        }
        class43 var1 = this.field870 != -1 && this.field847 == 0 ? class43.method2701(this.field870) : null;
        class43 var2 = this.field841 == -1 || this.field45 || this.field841 == this.field818 && var1 != null ? null : class43.method2701(this.field841);
        class105 var3 = this.field44.method3257(var1, this.field845, var2, this.field842);
        if (var3 == null) {
            return null;
        }
        var3.method2152();
        this.field846 = var3.field1449;
        if (!this.field45 && this.field860 != -1 && this.field850 != -1) {
            class105 var4 = class44.method588(this.field860).method884(this.field850);
            if (var4 != null) {
                var4.method2166(0, -this.field853, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field45 && this.field40 != null) {
            if (client.field304 >= this.field36) {
                this.field40 = null;
            }
            if (client.field304 >= this.field35 && client.field304 < this.field36) {
                class105 var6 = this.field40;
                var6.method2166(this.field47 - this.field871, this.field38 - this.field34, this.field43 - this.field814);
                if (this.field863 == 512) {
                    var6.method2162();
                    var6.method2162();
                    var6.method2162();
                } else if (this.field863 == 1024) {
                    var6.method2162();
                    var6.method2162();
                } else if (this.field863 == 1536) {
                    var6.method2162();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field863 == 512) {
                    var6.method2162();
                } else if (this.field863 == 1024) {
                    var6.method2162();
                    var6.method2162();
                } else if (this.field863 == 1536) {
                    var6.method2162();
                    var6.method2162();
                    var6.method2162();
                }
                var6.method2166(this.field871 - this.field47, this.field34 - this.field38, this.field814 - this.field43);
            }
        }
        var3.field1813 = true;
        return var3;
    }

    @ObfuscatedName("f.s(IIBI)V")
    public final void method23(int arg0, int arg1, byte arg2) {
        if (this.field870 != -1 && class43.method2701(this.field870).field993 == 1) {
            this.field870 = -1;
        }
        this.field840 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method40(arg0, arg1);
        } else if (this.field867[0] >= 0 && this.field867[0] < 104 && this.field868[0] >= 0 && this.field868[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field867[0];
                int var6 = this.field868[0];
                int var7 = this.method21();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class106.method134(var5, var6, this.method21(), client.method2663(arg0, arg1), client.field360[this.field48], true, client.field577, client.field301);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method38(client.field577[var9], client.field301[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method38(arg0, arg1, arg2);
        } else {
            this.method40(arg0, arg1);
        }
    }

    @ObfuscatedName("f.y(IIS)V")
    public void method40(int arg0, int arg1) {
        this.field866 = 0;
        this.field862 = 0;
        this.field849 = 0;
        this.field867[0] = arg0;
        this.field868[0] = arg1;
        int var3 = this.method21();
        this.field871 = this.field867[0] * 128 + var3 * 64;
        this.field814 = this.field868[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("f.e(IIBB)V")
    public final void method38(int arg0, int arg1, byte arg2) {
        if (this.field866 < 9) {
            this.field866++;
        }
        for (int var4 = this.field866; var4 > 0; var4--) {
            this.field867[var4] = this.field867[var4 - 1];
            this.field868[var4] = this.field868[var4 - 1];
            this.field832[var4] = this.field832[var4 - 1];
        }
        this.field867[0] = arg0;
        this.field868[0] = arg1;
        this.field832[0] = arg2;
    }

    @ObfuscatedName("f.g(I)Z")
    public final boolean method25() {
        return this.field44 != null;
    }
}

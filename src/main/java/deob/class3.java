package deob;

@ObfuscatedName("v")
public final class class3 extends class38 {

    @ObfuscatedName("v.h")
    public String field41;

    @ObfuscatedName("v.q")
    public class179 field32;

    @ObfuscatedName("v.v")
    public int field33 = -1;

    @ObfuscatedName("v.n")
    public int field38 = -1;

    @ObfuscatedName("v.f")
    public int field35 = 0;

    @ObfuscatedName("v.g")
    public int field34 = 0;

    @ObfuscatedName("v.o")
    public int field31;

    @ObfuscatedName("v.s")
    public int field53 = 0;

    @ObfuscatedName("v.k")
    public int field39 = 0;

    @ObfuscatedName("v.b")
    public int field54;

    @ObfuscatedName("v.c")
    public int field36;

    @ObfuscatedName("v.l")
    public int field42;

    @ObfuscatedName("v.p")
    public class105 field43;

    @ObfuscatedName("v.d")
    public int field50;

    @ObfuscatedName("v.i")
    public int field45;

    @ObfuscatedName("v.x")
    public int field46;

    @ObfuscatedName("v.j")
    public int field47;

    @ObfuscatedName("v.w")
    public boolean field48 = false;

    @ObfuscatedName("v.r")
    public int field49 = 0;

    @ObfuscatedName("v.u")
    public boolean field44 = false;

    @ObfuscatedName("v.m")
    public int field51;

    @ObfuscatedName("v.t")
    public int field55;

    @ObfuscatedName("v.z")
    public boolean field40 = false;

    @ObfuscatedName("v.e")
    public int field52;

    @ObfuscatedName("v.y")
    public int field37;

    @ObfuscatedName("v.h(Ldm;I)V")
    public final void method12(class119 arg0) {
        arg0.field1973 = 0;
        int var2 = arg0.method2383();
        this.field33 = arg0.method2370();
        this.field38 = arg0.method2370();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2383();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2383();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2385();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method588(var4[var5] - 512).field1152;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2383();
            if (var11 < 0 || var11 >= Statics.field2286[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field820 = arg0.method2385();
        if (this.field820 == 65535) {
            this.field820 = -1;
        }
        this.field871 = arg0.method2385();
        if (this.field871 == 65535) {
            this.field871 = -1;
        }
        this.field823 = this.field871;
        this.field824 = arg0.method2385();
        if (this.field824 == 65535) {
            this.field824 = -1;
        }
        this.field875 = arg0.method2385();
        if (this.field875 == 65535) {
            this.field875 = -1;
        }
        this.field850 = arg0.method2385();
        if (this.field850 == 65535) {
            this.field850 = -1;
        }
        this.field829 = arg0.method2385();
        if (this.field829 == 65535) {
            this.field829 = -1;
        }
        this.field828 = arg0.method2385();
        if (this.field828 == 65535) {
            this.field828 = -1;
        }
        this.field41 = arg0.method2391();
        if (Statics.field101 == this) {
            Statics.field2207 = this.field41;
        }
        this.field35 = arg0.method2383();
        this.field34 = arg0.method2385();
        this.field44 = arg0.method2383() == 1;
        if (client.field298 == 0 && client.field453 >= 2) {
            this.field44 = false;
        }
        if (this.field32 == null) {
            this.field32 = new class179();
        }
        this.field32.method3303(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("v.q(B)I")
    public int method11() {
        return this.field32 == null || this.field32.field2889 == -1 ? 1 : class40.method3(this.field32.field2889).field907;
    }

    @ObfuscatedName("v.v(B)Ldg;")
    public final class105 method32() {
        if (this.field32 == null) {
            return null;
        }
        class43 var1 = this.field834 != -1 && this.field819 == 0 ? class43.method733(this.field834) : null;
        class43 var2 = this.field844 == -1 || this.field48 || this.field844 == this.field820 && var1 != null ? null : class43.method733(this.field844);
        class105 var3 = this.field32.method3335(var1, this.field848, var2, this.field845);
        if (var3 == null) {
            return null;
        }
        var3.method2220();
        this.field865 = var3.field1450;
        if (!this.field48 && this.field826 != -1 && this.field847 != -1) {
            class105 var4 = class44.method2821(this.field826).method886(this.field847);
            if (var4 != null) {
                var4.method2172(0, -this.field827, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field48 && this.field43 != null) {
            if (client.field303 >= this.field39) {
                this.field43 = null;
            }
            if (client.field303 >= this.field53 && client.field303 < this.field39) {
                class105 var6 = this.field43;
                var6.method2172(this.field54 - this.field853, this.field36 - this.field31, this.field42 - this.field843);
                if (this.field866 == 512) {
                    var6.method2182();
                    var6.method2182();
                    var6.method2182();
                } else if (this.field866 == 1024) {
                    var6.method2182();
                    var6.method2182();
                } else if (this.field866 == 1536) {
                    var6.method2182();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field866 == 512) {
                    var6.method2182();
                } else if (this.field866 == 1024) {
                    var6.method2182();
                    var6.method2182();
                } else if (this.field866 == 1536) {
                    var6.method2182();
                    var6.method2182();
                    var6.method2182();
                }
                var6.method2172(this.field853 - this.field54, this.field31 - this.field36, this.field843 - this.field42);
            }
        }
        var3.field1853 = true;
        return var3;
    }

    @ObfuscatedName("v.n(IIBI)V")
    public final void method15(int arg0, int arg1, byte arg2) {
        if (this.field834 != -1 && class43.method733(this.field834).field1006 == 1) {
            this.field834 = -1;
        }
        this.field868 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method16(arg0, arg1);
        } else if (this.field870[0] >= 0 && this.field870[0] < 104 && this.field817[0] >= 0 && this.field817[0] < 104) {
            if (arg2 == 2) {
                client.method2812(this, arg0, arg1, (byte) 2);
            }
            this.method30(arg0, arg1, arg2);
        } else {
            this.method16(arg0, arg1);
        }
    }

    @ObfuscatedName("v.f(IIB)V")
    public void method16(int arg0, int arg1) {
        this.field869 = 0;
        this.field874 = 0;
        this.field873 = 0;
        this.field870[0] = arg0;
        this.field817[0] = arg1;
        int var3 = this.method11();
        this.field853 = this.field870[0] * 128 + var3 * 64;
        this.field843 = this.field817[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("v.g(IIBI)V")
    public final void method30(int arg0, int arg1, byte arg2) {
        if (this.field869 < 9) {
            this.field869++;
        }
        for (int var4 = this.field869; var4 > 0; var4--) {
            this.field870[var4] = this.field870[var4 - 1];
            this.field817[var4] = this.field817[var4 - 1];
            this.field872[var4] = this.field872[var4 - 1];
        }
        this.field870[0] = arg0;
        this.field817[0] = arg1;
        this.field872[0] = arg2;
    }

    @ObfuscatedName("v.o(I)Z")
    public final boolean method18() {
        return this.field32 != null;
    }
}

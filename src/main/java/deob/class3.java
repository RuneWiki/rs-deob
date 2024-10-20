package deob;

@ObfuscatedName("i")
public final class class3 extends class38 {

    @ObfuscatedName("i.o")
    public String field44;

    @ObfuscatedName("i.f")
    public class179 field36;

    @ObfuscatedName("i.i")
    public int field37 = -1;

    @ObfuscatedName("i.h")
    public int field38 = -1;

    @ObfuscatedName("i.u")
    public String[] field53 = new String[3];

    @ObfuscatedName("i.m")
    public int field41;

    @ObfuscatedName("i.y")
    public int field42;

    @ObfuscatedName("i.p")
    public int field43;

    @ObfuscatedName("i.t")
    public int field48;

    @ObfuscatedName("i.g")
    public int field63;

    @ObfuscatedName("i.v")
    public int field51;

    @ObfuscatedName("i.l")
    public int field47;

    @ObfuscatedName("i.e")
    public int field45;

    @ObfuscatedName("i.a")
    public class105 field49;

    @ObfuscatedName("i.w")
    public int field50;

    @ObfuscatedName("i.d")
    public int field62;

    @ObfuscatedName("i.z")
    public int field52;

    @ObfuscatedName("i.s")
    public int field46;

    @ObfuscatedName("i.j")
    public boolean field54;

    @ObfuscatedName("i.b")
    public int field55;

    @ObfuscatedName("i.r")
    public boolean field56;

    @ObfuscatedName("i.n")
    public int field40;

    @ObfuscatedName("i.c")
    public int field58;

    @ObfuscatedName("i.k")
    public boolean field59;

    @ObfuscatedName("i.x")
    public int field64;

    @ObfuscatedName("i.ar")
    public int field61;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field53[var1] = "";
        }
        this.field41 = 0;
        this.field42 = 0;
        this.field48 = 0;
        this.field63 = 0;
        this.field54 = false;
        this.field55 = 0;
        this.field56 = false;
        this.field59 = false;
    }

    @ObfuscatedName("i.o(Ldc;B)V")
    public final void method12(class119 arg0) {
        arg0.field1984 = 0;
        int var2 = arg0.method2290();
        this.field37 = arg0.method2435();
        this.field38 = arg0.method2435();
        int var3 = -1;
        this.field55 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2290();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2290();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2292();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method1979(var4[var5] - 512).field1143;
                    if (var8 != 0) {
                        this.field55 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2290();
            if (var11 < 0 || var11 >= Statics.field2215[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field812 = arg0.method2292();
        if (this.field812 == 65535) {
            this.field812 = -1;
        }
        this.field831 = arg0.method2292();
        if (this.field831 == 65535) {
            this.field831 = -1;
        }
        this.field829 = this.field831;
        this.field815 = arg0.method2292();
        if (this.field815 == 65535) {
            this.field815 = -1;
        }
        this.field816 = arg0.method2292();
        if (this.field816 == 65535) {
            this.field816 = -1;
        }
        this.field817 = arg0.method2292();
        if (this.field817 == 65535) {
            this.field817 = -1;
        }
        this.field849 = arg0.method2292();
        if (this.field849 == 65535) {
            this.field849 = -1;
        }
        this.field819 = arg0.method2292();
        if (this.field819 == 65535) {
            this.field819 = -1;
        }
        this.field44 = arg0.method2344();
        for (int var12 = 0; var12 < 3; var12++) {
            this.field53[var12] = arg0.method2344();
        }
        if (Statics.field2040 == this) {
            Statics.field2038 = this.field44;
        }
        this.field41 = arg0.method2290();
        this.field42 = arg0.method2292();
        this.field56 = arg0.method2290() == 1;
        if (client.field290 == 0 && client.field453 >= 2) {
            this.field56 = false;
        }
        if (this.field36 == null) {
            this.field36 = new class179();
        }
        this.field36.method3190(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("i.f(B)I")
    public int method11() {
        return this.field36 == null || this.field36.field2914 == -1 ? 1 : class40.method3100(this.field36.field2914).field881;
    }

    @ObfuscatedName("i.i(B)Ldm;")
    public final class105 method21() {
        if (this.field36 == null) {
            return null;
        }
        class43 var1 = this.field847 != -1 && this.field841 == 0 ? class43.method3081(this.field847) : null;
        class43 var2 = this.field848 == -1 || this.field54 || this.field848 == this.field812 && var1 != null ? null : class43.method3081(this.field848);
        class105 var3 = this.field36.method3204(var1, this.field860, var2, this.field836);
        if (var3 == null) {
            return null;
        }
        var3.method2093();
        this.field856 = var3.field1441;
        if (!this.field54 && this.field843 != -1 && this.field835 != -1) {
            class105 var4 = class44.method1455(this.field843).method847(this.field835);
            if (var4 != null) {
                var4.method2102(0, -this.field813, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field54 && this.field49 != null) {
            if (client.field299 >= this.field63) {
                this.field49 = null;
            }
            if (client.field299 >= this.field48 && client.field299 < this.field63) {
                class105 var6 = this.field49;
                var6.method2102(this.field51 - this.field854, this.field47 - this.field43, this.field45 - this.field808);
                if (this.field857 == 512) {
                    var6.method2099();
                    var6.method2099();
                    var6.method2099();
                } else if (this.field857 == 1024) {
                    var6.method2099();
                    var6.method2099();
                } else if (this.field857 == 1536) {
                    var6.method2099();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field857 == 512) {
                    var6.method2099();
                } else if (this.field857 == 1024) {
                    var6.method2099();
                    var6.method2099();
                } else if (this.field857 == 1536) {
                    var6.method2099();
                    var6.method2099();
                    var6.method2099();
                }
                var6.method2102(this.field854 - this.field51, this.field43 - this.field47, this.field808 - this.field45);
            }
        }
        var3.field1815 = true;
        return var3;
    }

    @ObfuscatedName("i.h(IIBI)V")
    public final void method13(int arg0, int arg1, byte arg2) {
        if (this.field847 != -1 && class43.method3081(this.field847).field990 == 1) {
            this.field847 = -1;
        }
        this.field834 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method14(arg0, arg1);
        } else if (this.field853[0] >= 0 && this.field853[0] < 104 && this.field862[0] >= 0 && this.field862[0] < 104) {
            if (arg2 == 2) {
                class3 var4 = this;
                int var5 = this.field853[0];
                int var6 = this.field862[0];
                int var7 = this.method11();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method11();
                    client.field566.field1879 = arg0;
                    client.field566.field1869 = arg1;
                    client.field566.field1870 = 1;
                    client.field566.field1871 = 1;
                    class11 var11 = client.field566;
                    int var12 = class106.method1424(var5, var6, var10, var11, client.field348[this.field40], true, client.field456, client.field568);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method15(client.field456[var13], client.field568[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method15(arg0, arg1, arg2);
        } else {
            this.method14(arg0, arg1);
        }
    }

    @ObfuscatedName("i.q(III)V")
    public void method14(int arg0, int arg1) {
        this.field865 = 0;
        this.field832 = 0;
        this.field864 = 0;
        this.field853[0] = arg0;
        this.field862[0] = arg1;
        int var3 = this.method11();
        this.field854 = this.field853[0] * 128 + var3 * 64;
        this.field808 = this.field862[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("i.u(IIBI)V")
    public final void method15(int arg0, int arg1, byte arg2) {
        if (this.field865 < 9) {
            this.field865++;
        }
        for (int var4 = this.field865; var4 > 0; var4--) {
            this.field853[var4] = this.field853[var4 - 1];
            this.field862[var4] = this.field862[var4 - 1];
            this.field863[var4] = this.field863[var4 - 1];
        }
        this.field853[0] = arg0;
        this.field862[0] = arg1;
        this.field863[0] = arg2;
    }

    @ObfuscatedName("i.m(B)Z")
    public final boolean method22() {
        return this.field36 != null;
    }
}

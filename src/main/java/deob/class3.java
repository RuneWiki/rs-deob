package deob;

@ObfuscatedName("r")
public final class class3 extends class38 {

    @ObfuscatedName("r.i")
    public String field35;

    @ObfuscatedName("r.v")
    public class179 field30;

    @ObfuscatedName("r.r")
    public int field29 = -1;

    @ObfuscatedName("r.n")
    public int field32 = -1;

    @ObfuscatedName("r.x")
    public int field33 = 0;

    @ObfuscatedName("r.q")
    public int field51 = 0;

    @ObfuscatedName("r.h")
    public int field49;

    @ObfuscatedName("r.d")
    public int field36 = 0;

    @ObfuscatedName("r.c")
    public int field40 = 0;

    @ObfuscatedName("r.y")
    public int field55;

    @ObfuscatedName("r.m")
    public int field39;

    @ObfuscatedName("r.e")
    public int field48;

    @ObfuscatedName("r.z")
    public class105 field41;

    @ObfuscatedName("r.t")
    public int field42;

    @ObfuscatedName("r.b")
    public int field43;

    @ObfuscatedName("r.l")
    public int field44;

    @ObfuscatedName("r.s")
    public int field45;

    @ObfuscatedName("r.f")
    public boolean field37 = false;

    @ObfuscatedName("r.g")
    public int field34 = 0;

    @ObfuscatedName("r.u")
    public boolean field47 = false;

    @ObfuscatedName("r.o")
    public int field38;

    @ObfuscatedName("r.k")
    public int field50;

    @ObfuscatedName("r.a")
    public boolean field46 = false;

    @ObfuscatedName("r.j")
    public int field52;

    @ObfuscatedName("r.p")
    public int field53;

    @ObfuscatedName("r.i(Ldx;B)V")
    public final void method26(class119 arg0) {
        arg0.field1980 = 0;
        int var2 = arg0.method2380();
        this.field29 = arg0.method2346();
        this.field32 = arg0.method2346();
        int var3 = -1;
        this.field34 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2380();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2380();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2347();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method970(var4[var5] - 512).field1156;
                    if (var8 != 0) {
                        this.field34 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2380();
            if (var11 < 0 || var11 >= Statics.field2895[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field815 = arg0.method2347();
        if (this.field815 == 65535) {
            this.field815 = -1;
        }
        this.field855 = arg0.method2347();
        if (this.field855 == 65535) {
            this.field855 = -1;
        }
        this.field817 = this.field855;
        this.field818 = arg0.method2347();
        if (this.field818 == 65535) {
            this.field818 = -1;
        }
        this.field819 = arg0.method2347();
        if (this.field819 == 65535) {
            this.field819 = -1;
        }
        this.field829 = arg0.method2347();
        if (this.field829 == 65535) {
            this.field829 = -1;
        }
        this.field821 = arg0.method2347();
        if (this.field821 == 65535) {
            this.field821 = -1;
        }
        this.field822 = arg0.method2347();
        if (this.field822 == 65535) {
            this.field822 = -1;
        }
        this.field35 = arg0.method2356();
        if (Statics.field1544 == this) {
            Statics.field2204 = this.field35;
        }
        this.field33 = arg0.method2380();
        this.field51 = arg0.method2347();
        this.field47 = arg0.method2380() == 1;
        if (client.field288 == 0 && client.field384 >= 2) {
            this.field47 = false;
        }
        if (this.field30 == null) {
            this.field30 = new class179();
        }
        this.field30.method3269(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("r.v(I)I")
    public int method42() {
        return this.field30 == null || this.field30.field2896 == -1 ? 1 : class40.method2940(this.field30.field2896).field906;
    }

    @ObfuscatedName("r.r(I)Ldj;")
    public final class105 method18() {
        if (this.field30 == null) {
            return null;
        }
        class43 var1 = this.field841 != -1 && this.field844 == 0 ? class43.method2299(this.field841) : null;
        class43 var2 = this.field838 == -1 || this.field37 || this.field838 == this.field815 && var1 != null ? null : class43.method2299(this.field838);
        class105 var3 = this.field30.method3242(var1, this.field842, var2, this.field810);
        if (var3 == null) {
            return null;
        }
        var3.method2153();
        this.field859 = var3.field1451;
        if (!this.field37 && this.field843 != -1 && this.field847 != -1) {
            class105 var4 = class44.method2267(this.field843).method900(this.field847);
            if (var4 != null) {
                var4.method2162(0, -this.field850, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field37 && this.field41 != null) {
            if (client.field290 >= this.field40) {
                this.field41 = null;
            }
            if (client.field290 >= this.field36 && client.field290 < this.field40) {
                class105 var6 = this.field41;
                var6.method2162(this.field55 - this.field866, this.field39 - this.field49, this.field48 - this.field814);
                if (this.field860 == 512) {
                    var6.method2158();
                    var6.method2158();
                    var6.method2158();
                } else if (this.field860 == 1024) {
                    var6.method2158();
                    var6.method2158();
                } else if (this.field860 == 1536) {
                    var6.method2158();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field860 == 512) {
                    var6.method2158();
                } else if (this.field860 == 1024) {
                    var6.method2158();
                    var6.method2158();
                } else if (this.field860 == 1536) {
                    var6.method2158();
                    var6.method2158();
                    var6.method2158();
                }
                var6.method2162(this.field866 - this.field55, this.field49 - this.field39, this.field814 - this.field48);
            }
        }
        var3.field1810 = true;
        return var3;
    }

    @ObfuscatedName("r.n(IIBI)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field841 != -1 && class43.method2299(this.field841).field979 == 1) {
            this.field841 = -1;
        }
        this.field837 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method20(arg0, arg1);
        } else if (this.field857[0] >= 0 && this.field857[0] < 104 && this.field865[0] >= 0 && this.field865[0] < 104) {
            if (arg2 == 2) {
                client.method170(this, arg0, arg1, (byte) 2);
            }
            this.method21(arg0, arg1, arg2);
        } else {
            this.method20(arg0, arg1);
        }
    }

    @ObfuscatedName("r.x(III)V")
    public void method20(int arg0, int arg1) {
        this.field863 = 0;
        this.field824 = 0;
        this.field867 = 0;
        this.field857[0] = arg0;
        this.field865[0] = arg1;
        int var3 = this.method42();
        this.field866 = this.field857[0] * 128 + var3 * 64;
        this.field814 = this.field865[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("r.q(IIBB)V")
    public final void method21(int arg0, int arg1, byte arg2) {
        if (this.field863 < 9) {
            this.field863++;
        }
        for (int var4 = this.field863; var4 > 0; var4--) {
            this.field857[var4] = this.field857[var4 - 1];
            this.field865[var4] = this.field865[var4 - 1];
            this.field861[var4] = this.field861[var4 - 1];
        }
        this.field857[0] = arg0;
        this.field865[0] = arg1;
        this.field861[0] = arg2;
    }

    @ObfuscatedName("r.h(I)Z")
    public final boolean method36() {
        return this.field30 != null;
    }
}

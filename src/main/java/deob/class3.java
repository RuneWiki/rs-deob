package deob;

@ObfuscatedName("c")
public final class class3 extends class38 {

    @ObfuscatedName("c.n")
    public String field60;

    @ObfuscatedName("c.q")
    public class179 field37;

    @ObfuscatedName("c.c")
    public int field36 = -1;

    @ObfuscatedName("c.l")
    public int field58 = -1;

    @ObfuscatedName("c.u")
    public String[] field39 = new String[3];

    @ObfuscatedName("c.j")
    public int field40;

    @ObfuscatedName("c.w")
    public int field41;

    @ObfuscatedName("c.y")
    public int field42;

    @ObfuscatedName("c.o")
    public int field57;

    @ObfuscatedName("c.h")
    public int field44;

    @ObfuscatedName("c.e")
    public int field45;

    @ObfuscatedName("c.v")
    public int field46;

    @ObfuscatedName("c.p")
    public int field35;

    @ObfuscatedName("c.m")
    public class105 field47;

    @ObfuscatedName("c.b")
    public int field49;

    @ObfuscatedName("c.s")
    public int field50;

    @ObfuscatedName("c.x")
    public int field34;

    @ObfuscatedName("c.z")
    public int field59;

    @ObfuscatedName("c.d")
    public boolean field53;

    @ObfuscatedName("c.a")
    public int field54;

    @ObfuscatedName("c.t")
    public boolean field55;

    @ObfuscatedName("c.k")
    public int field56;

    @ObfuscatedName("c.f")
    public int field52;

    @ObfuscatedName("c.g")
    public boolean field48;

    @ObfuscatedName("c.i")
    public int field51;

    @ObfuscatedName("c.ah")
    public int field43;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field39[var1] = "";
        }
        this.field40 = 0;
        this.field41 = 0;
        this.field57 = 0;
        this.field44 = 0;
        this.field53 = false;
        this.field54 = 0;
        this.field55 = false;
        this.field48 = false;
    }

    @ObfuscatedName("c.n(Ldc;S)V")
    public final void method12(class119 arg0) {
        arg0.field1982 = 0;
        int var2 = arg0.method2360();
        this.field36 = arg0.method2512();
        this.field58 = arg0.method2512();
        int var3 = -1;
        this.field54 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2360();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2360();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2430();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method724(var4[var5] - 512).field1135;
                    if (var8 != 0) {
                        this.field54 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2360();
            if (var11 < 0 || var11 >= Statics.field2593[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field834 = arg0.method2430();
        if (this.field834 == 65535) {
            this.field834 = -1;
        }
        this.field826 = arg0.method2430();
        if (this.field826 == 65535) {
            this.field826 = -1;
        }
        this.field818 = this.field826;
        this.field814 = arg0.method2430();
        if (this.field814 == 65535) {
            this.field814 = -1;
        }
        this.field815 = arg0.method2430();
        if (this.field815 == 65535) {
            this.field815 = -1;
        }
        this.field816 = arg0.method2430();
        if (this.field816 == 65535) {
            this.field816 = -1;
        }
        this.field817 = arg0.method2430();
        if (this.field817 == 65535) {
            this.field817 = -1;
        }
        this.field835 = arg0.method2430();
        if (this.field835 == 65535) {
            this.field835 = -1;
        }
        this.field60 = arg0.method2368();
        if (Statics.field180 == this) {
            Statics.field2207 = this.field60;
        }
        this.field40 = arg0.method2360();
        this.field41 = arg0.method2430();
        this.field55 = arg0.method2360() == 1;
        if (client.field297 == 0 && client.field540 >= 2) {
            this.field55 = false;
        }
        if (this.field37 == null) {
            this.field37 = new class179();
        }
        this.field37.method3230(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("c.q(I)I")
    public int method13() {
        return this.field37 == null || this.field37.field2908 == -1 ? 1 : class40.method177(this.field37.field2908).field882;
    }

    @ObfuscatedName("c.c(I)Ldt;")
    public final class105 method14() {
        if (this.field37 == null) {
            return null;
        }
        class43 var1 = this.field811 != -1 && this.field841 == 0 ? class43.method788(this.field811) : null;
        class43 var2 = this.field838 == -1 || this.field53 || this.field838 == this.field834 && var1 != null ? null : class43.method788(this.field838);
        class105 var3 = this.field37.method3235(var1, this.field851, var2, this.field820);
        if (var3 == null) {
            return null;
        }
        var3.method2164();
        this.field856 = var3.field1437;
        if (!this.field53 && this.field843 != -1 && this.field844 != -1) {
            class105 var4 = class44.method601(this.field843).method895(this.field844);
            if (var4 != null) {
                var4.method2191(0, -this.field847, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field53 && this.field47 != null) {
            if (client.field303 >= this.field44) {
                this.field47 = null;
            }
            if (client.field303 >= this.field57 && client.field303 < this.field44) {
                class105 var6 = this.field47;
                var6.method2191(this.field45 - this.field867, this.field46 - this.field42, this.field35 - this.field807);
                if (this.field821 == 512) {
                    var6.method2169();
                    var6.method2169();
                    var6.method2169();
                } else if (this.field821 == 1024) {
                    var6.method2169();
                    var6.method2169();
                } else if (this.field821 == 1536) {
                    var6.method2169();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field821 == 512) {
                    var6.method2169();
                } else if (this.field821 == 1024) {
                    var6.method2169();
                    var6.method2169();
                } else if (this.field821 == 1536) {
                    var6.method2169();
                    var6.method2169();
                    var6.method2169();
                }
                var6.method2191(this.field867 - this.field45, this.field42 - this.field46, this.field807 - this.field35);
            }
        }
        var3.field1815 = true;
        return var3;
    }

    @ObfuscatedName("c.l(IIBI)V")
    public final void method30(int arg0, int arg1, byte arg2) {
        if (this.field811 != -1 && class43.method788(this.field811).field987 == 1) {
            this.field811 = -1;
        }
        this.field813 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method34(arg0, arg1);
        } else if (this.field861[0] >= 0 && this.field861[0] < 104 && this.field862[0] >= 0 && this.field862[0] < 104) {
            if (arg2 == 2) {
                client.method3006(this, arg0, arg1, (byte) 2);
            }
            this.method11(arg0, arg1, arg2);
        } else {
            this.method34(arg0, arg1);
        }
    }

    @ObfuscatedName("c.r(III)V")
    public void method34(int arg0, int arg1) {
        this.field836 = 0;
        this.field865 = 0;
        this.field808 = 0;
        this.field861[0] = arg0;
        this.field862[0] = arg1;
        int var3 = this.method13();
        this.field867 = this.field861[0] * 128 + var3 * 64;
        this.field807 = this.field862[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("c.u(IIBI)V")
    public final void method11(int arg0, int arg1, byte arg2) {
        if (this.field836 < 9) {
            this.field836++;
        }
        for (int var4 = this.field836; var4 > 0; var4--) {
            this.field861[var4] = this.field861[var4 - 1];
            this.field862[var4] = this.field862[var4 - 1];
            this.field863[var4] = this.field863[var4 - 1];
        }
        this.field861[0] = arg0;
        this.field862[0] = arg1;
        this.field863[0] = arg2;
    }

    @ObfuscatedName("c.j(B)Z")
    public final boolean method32() {
        return this.field37 != null;
    }
}

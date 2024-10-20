package deob;

@ObfuscatedName("f")
public final class class3 extends class38 {

    @ObfuscatedName("f.e")
    public String field46;

    @ObfuscatedName("f.w")
    public class180 field36;

    @ObfuscatedName("f.f")
    public int field35 = -1;

    @ObfuscatedName("f.s")
    public int field38 = -1;

    @ObfuscatedName("f.h")
    public String[] field47 = new String[3];

    @ObfuscatedName("f.g")
    public int field40;

    @ObfuscatedName("f.a")
    public int field41;

    @ObfuscatedName("f.r")
    public int field42;

    @ObfuscatedName("f.k")
    public int field43;

    @ObfuscatedName("f.m")
    public int field60;

    @ObfuscatedName("f.n")
    public int field39;

    @ObfuscatedName("f.y")
    public int field54;

    @ObfuscatedName("f.i")
    public int field44;

    @ObfuscatedName("f.j")
    public class106 field48;

    @ObfuscatedName("f.l")
    public int field49;

    @ObfuscatedName("f.o")
    public int field50;

    @ObfuscatedName("f.c")
    public int field51;

    @ObfuscatedName("f.x")
    public int field52;

    @ObfuscatedName("f.b")
    public boolean field53;

    @ObfuscatedName("f.q")
    public int field63;

    @ObfuscatedName("f.u")
    public boolean field55;

    @ObfuscatedName("f.t")
    public int field56;

    @ObfuscatedName("f.d")
    public int field57;

    @ObfuscatedName("f.z")
    public boolean field45;

    @ObfuscatedName("f.v")
    public int field59;

    @ObfuscatedName("f.aq")
    public int field37;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field47[var1] = "";
        }
        this.field40 = 0;
        this.field41 = 0;
        this.field43 = 0;
        this.field60 = 0;
        this.field53 = false;
        this.field63 = 0;
        this.field55 = false;
        this.field45 = false;
    }

    @ObfuscatedName("f.e(Ldq;B)V")
    public final void method22(class120 arg0) {
        arg0.field1977 = 0;
        int var2 = arg0.method2355();
        this.field35 = arg0.method2465();
        this.field38 = arg0.method2465();
        int var3 = -1;
        this.field63 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2355();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2355();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2532();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method696(var4[var5] - 512).field1125;
                    if (var8 != 0) {
                        this.field63 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2355();
            if (var11 < 0 || var11 >= Statics.field2924[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field848 = arg0.method2532();
        if (this.field848 == 65535) {
            this.field848 = -1;
        }
        this.field795 = arg0.method2532();
        if (this.field795 == 65535) {
            this.field795 = -1;
        }
        this.field796 = this.field795;
        this.field797 = arg0.method2532();
        if (this.field797 == 65535) {
            this.field797 = -1;
        }
        this.field830 = arg0.method2532();
        if (this.field830 == 65535) {
            this.field830 = -1;
        }
        this.field799 = arg0.method2532();
        if (this.field799 == 65535) {
            this.field799 = -1;
        }
        this.field800 = arg0.method2532();
        if (this.field800 == 65535) {
            this.field800 = -1;
        }
        this.field798 = arg0.method2532();
        if (this.field798 == 65535) {
            this.field798 = -1;
        }
        this.field46 = arg0.method2363();
        if (Statics.field573 == this) {
            Statics.field3118 = this.field46;
        }
        this.field40 = arg0.method2355();
        this.field41 = arg0.method2532();
        this.field55 = arg0.method2355() == 1;
        if (client.field283 == 0 && client.field483 >= 2) {
            this.field55 = false;
        }
        if (this.field36 == null) {
            this.field36 = new class180();
        }
        this.field36.method3252(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("f.w(I)I")
    public int method23() {
        return this.field36 == null || this.field36.field2929 == -1 ? 1 : class40.method3129(this.field36.field2929).field872;
    }

    @ObfuscatedName("f.f(B)Ldy;")
    public final class106 method25() {
        if (this.field36 == null) {
            return null;
        }
        class43 var1 = this.field820 != -1 && this.field823 == 0 ? class43.method949(this.field820) : null;
        class43 var2 = this.field839 == -1 || this.field53 || this.field848 == this.field839 && var1 != null ? null : class43.method949(this.field839);
        class106 var3 = this.field36.method3228(var1, this.field790, var2, this.field840);
        if (var3 == null) {
            return null;
        }
        var3.method2183();
        this.field809 = var3.field1439;
        if (!this.field53 && this.field825 != -1 && this.field818 != -1) {
            class106 var4 = class44.method1763(this.field825).method889(this.field818);
            if (var4 != null) {
                var4.method2179(0, -this.field829, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (!this.field53 && this.field48 != null) {
            if (client.field290 >= this.field60) {
                this.field48 = null;
            }
            if (client.field290 >= this.field43 && client.field290 < this.field60) {
                class106 var6 = this.field48;
                var6.method2179(this.field39 - this.field805, this.field54 - this.field42, this.field44 - this.field815);
                if (this.field794 == 512) {
                    var6.method2222();
                    var6.method2222();
                    var6.method2222();
                } else if (this.field794 == 1024) {
                    var6.method2222();
                    var6.method2222();
                } else if (this.field794 == 1536) {
                    var6.method2222();
                }
                class106[] var7 = new class106[] { var3, var6 };
                var3 = new class106(var7, 2);
                if (this.field794 == 512) {
                    var6.method2222();
                } else if (this.field794 == 1024) {
                    var6.method2222();
                    var6.method2222();
                } else if (this.field794 == 1536) {
                    var6.method2222();
                    var6.method2222();
                    var6.method2222();
                }
                var6.method2179(this.field805 - this.field39, this.field42 - this.field54, this.field815 - this.field44);
            }
        }
        var3.field1802 = true;
        return var3;
    }

    @ObfuscatedName("f.s(IIBI)V")
    public final void method24(int arg0, int arg1, byte arg2) {
        if (this.field820 != -1 && class43.method949(this.field820).field979 == 1) {
            this.field820 = -1;
        }
        this.field816 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method26(arg0, arg1);
        } else if (this.field843[0] >= 0 && this.field843[0] < 104 && this.field844[0] >= 0 && this.field844[0] < 104) {
            if (arg2 == 2) {
                client.method2039(this, arg0, arg1, (byte) 2);
            }
            this.method27(arg0, arg1, arg2);
        } else {
            this.method26(arg0, arg1);
        }
    }

    @ObfuscatedName("f.p(IIB)V")
    public void method26(int arg0, int arg1) {
        this.field835 = 0;
        this.field812 = 0;
        this.field833 = 0;
        this.field843[0] = arg0;
        this.field844[0] = arg1;
        int var3 = this.method23();
        this.field805 = this.field843[0] * 128 + var3 * 64;
        this.field815 = this.field844[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("f.h(IIBI)V")
    public final void method27(int arg0, int arg1, byte arg2) {
        if (this.field835 < 9) {
            this.field835++;
        }
        for (int var4 = this.field835; var4 > 0; var4--) {
            this.field843[var4] = this.field843[var4 - 1];
            this.field844[var4] = this.field844[var4 - 1];
            this.field845[var4] = this.field845[var4 - 1];
        }
        this.field843[0] = arg0;
        this.field844[0] = arg1;
        this.field845[0] = arg2;
    }

    @ObfuscatedName("f.g(I)Z")
    public final boolean method30() {
        return this.field36 != null;
    }
}

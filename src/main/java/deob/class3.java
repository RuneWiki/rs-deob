package deob;

@ObfuscatedName("q")
public final class class3 extends class38 {

    @ObfuscatedName("q.f")
    public String field52;

    @ObfuscatedName("q.s")
    public class179 field50;

    @ObfuscatedName("q.q")
    public int field39 = -1;

    @ObfuscatedName("q.g")
    public int field31 = -1;

    @ObfuscatedName("q.t")
    public String[] field29 = new String[3];

    @ObfuscatedName("q.j")
    public int field30;

    @ObfuscatedName("q.n")
    public int field33;

    @ObfuscatedName("q.l")
    public int field36;

    @ObfuscatedName("q.i")
    public int field53;

    @ObfuscatedName("q.w")
    public int field38;

    @ObfuscatedName("q.v")
    public int field35;

    @ObfuscatedName("q.o")
    public int field45;

    @ObfuscatedName("q.p")
    public int field37;

    @ObfuscatedName("q.b")
    public class105 field34;

    @ObfuscatedName("q.z")
    public int field43;

    @ObfuscatedName("q.k")
    public int field44;

    @ObfuscatedName("q.r")
    public int field42;

    @ObfuscatedName("q.d")
    public int field46;

    @ObfuscatedName("q.u")
    public boolean field47;

    @ObfuscatedName("q.a")
    public int field48;

    @ObfuscatedName("q.x")
    public boolean field49;

    @ObfuscatedName("q.y")
    public int field28;

    @ObfuscatedName("q.c")
    public int field51;

    @ObfuscatedName("q.h")
    public boolean field40;

    @ObfuscatedName("q.e")
    public int field41;

    @ObfuscatedName("q.ab")
    public int field54;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field29[var1] = "";
        }
        this.field30 = 0;
        this.field33 = 0;
        this.field53 = 0;
        this.field38 = 0;
        this.field47 = false;
        this.field48 = 0;
        this.field49 = false;
        this.field40 = false;
    }

    @ObfuscatedName("q.f(Ldn;I)V")
    public final void method20(class119 arg0) {
        arg0.field1994 = 0;
        int var2 = arg0.method2363();
        this.field39 = arg0.method2364();
        this.field31 = arg0.method2364();
        int var3 = -1;
        this.field48 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2363();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2363();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2353();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = Statics.method975(var4[var5] - 512).field1121;
                    if (var8 != 0) {
                        this.field48 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2363();
            if (var11 < 0 || var11 >= Statics.field1970[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field852 = arg0.method2353();
        if (this.field852 == 65535) {
            this.field852 = -1;
        }
        this.field834 = arg0.method2353();
        if (this.field834 == 65535) {
            this.field834 = -1;
        }
        this.field824 = this.field834;
        this.field825 = arg0.method2353();
        if (this.field825 == 65535) {
            this.field825 = -1;
        }
        this.field826 = arg0.method2353();
        if (this.field826 == 65535) {
            this.field826 = -1;
        }
        this.field862 = arg0.method2353();
        if (this.field862 == 65535) {
            this.field862 = -1;
        }
        this.field863 = arg0.method2353();
        if (this.field863 == 65535) {
            this.field863 = -1;
        }
        this.field871 = arg0.method2353();
        if (this.field871 == 65535) {
            this.field871 = -1;
        }
        this.field52 = arg0.method2365();
        if (Statics.field2054 == this) {
            Statics.field2210 = this.field52;
        }
        this.field30 = arg0.method2363();
        this.field33 = arg0.method2353();
        this.field49 = arg0.method2363() == 1;
        if (client.field301 == 0 && client.field569 >= 2) {
            this.field49 = false;
        }
        if (this.field50 == null) {
            this.field50 = new class179();
        }
        this.field50.method3280(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("q.s(I)I")
    public int method17() {
        return this.field50 == null || this.field50.field2911 == -1 ? 1 : class40.method2058(this.field50.field2911).field917;
    }

    @ObfuscatedName("q.q(I)Ldu;")
    public final class105 method16() {
        if (this.field50 == null) {
            return null;
        }
        class43 var1 = this.field848 != -1 && this.field851 == 0 ? Statics.method653(this.field848) : null;
        class43 var2 = this.field874 == -1 || this.field47 || this.field874 == this.field852 && var1 != null ? null : Statics.method653(this.field874);
        class105 var3 = this.field50.method3271(var1, this.field849, var2, this.field846);
        if (var3 == null) {
            return null;
        }
        var3.method2161();
        this.field866 = var3.field1462;
        if (!this.field47 && this.field853 != -1 && this.field854 != -1) {
            class105 var4 = class44.method732(this.field853).method886(this.field854);
            if (var4 != null) {
                var4.method2178(0, -this.field843, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field47 && this.field34 != null) {
            if (client.field577 >= this.field38) {
                this.field34 = null;
            }
            if (client.field577 >= this.field53 && client.field577 < this.field38) {
                class105 var6 = this.field34;
                var6.method2178(this.field35 - this.field828, this.field45 - this.field36, this.field37 - this.field818);
                if (this.field867 == 512) {
                    var6.method2173();
                    var6.method2173();
                    var6.method2173();
                } else if (this.field867 == 1024) {
                    var6.method2173();
                    var6.method2173();
                } else if (this.field867 == 1536) {
                    var6.method2173();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field867 == 512) {
                    var6.method2173();
                } else if (this.field867 == 1024) {
                    var6.method2173();
                    var6.method2173();
                } else if (this.field867 == 1536) {
                    var6.method2173();
                    var6.method2173();
                    var6.method2173();
                }
                var6.method2178(this.field828 - this.field35, this.field36 - this.field45, this.field818 - this.field37);
            }
        }
        var3.field1821 = true;
        return var3;
    }

    @ObfuscatedName("q.g(IIBB)V")
    public final void method36(int arg0, int arg1, byte arg2) {
        if (this.field848 != -1 && Statics.method653(this.field848).field1004 == 1) {
            this.field848 = -1;
        }
        this.field833 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method18(arg0, arg1);
        } else if (this.field827[0] >= 0 && this.field827[0] < 104 && this.field872[0] >= 0 && this.field872[0] < 104) {
            if (arg2 == 2) {
                client.method1075(this, arg0, arg1, (byte) 2);
            }
            this.method19(arg0, arg1, arg2);
        } else {
            this.method18(arg0, arg1);
        }
    }

    @ObfuscatedName("q.m(III)V")
    public void method18(int arg0, int arg1) {
        this.field857 = 0;
        this.field877 = 0;
        this.field875 = 0;
        this.field827[0] = arg0;
        this.field872[0] = arg1;
        int var3 = this.method17();
        this.field828 = this.field827[0] * 128 + var3 * 64;
        this.field818 = this.field872[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("q.t(IIBI)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field857 < 9) {
            this.field857++;
        }
        for (int var4 = this.field857; var4 > 0; var4--) {
            this.field827[var4] = this.field827[var4 - 1];
            this.field872[var4] = this.field872[var4 - 1];
            this.field873[var4] = this.field873[var4 - 1];
        }
        this.field827[0] = arg0;
        this.field872[0] = arg1;
        this.field873[0] = arg2;
    }

    @ObfuscatedName("q.j(S)Z")
    public final boolean method28() {
        return this.field50 != null;
    }
}

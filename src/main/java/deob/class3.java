package deob;

@ObfuscatedName("a")
public final class class3 extends class38 {

    @ObfuscatedName("a.j")
    public String field49;

    @ObfuscatedName("a.l")
    public class179 field35;

    @ObfuscatedName("a.a")
    public int field42 = -1;

    @ObfuscatedName("a.i")
    public int field37 = -1;

    @ObfuscatedName("a.m")
    public String[] field39 = new String[3];

    @ObfuscatedName("a.o")
    public int field40;

    @ObfuscatedName("a.h")
    public int field41;

    @ObfuscatedName("a.n")
    public int field43;

    @ObfuscatedName("a.k")
    public int field44;

    @ObfuscatedName("a.r")
    public int field53;

    @ObfuscatedName("a.b")
    public int field45;

    @ObfuscatedName("a.q")
    public int field46;

    @ObfuscatedName("a.u")
    public int field47;

    @ObfuscatedName("a.g")
    public class105 field48;

    @ObfuscatedName("a.y")
    public int field60;

    @ObfuscatedName("a.s")
    public int field34;

    @ObfuscatedName("a.d")
    public int field51;

    @ObfuscatedName("a.z")
    public int field52;

    @ObfuscatedName("a.p")
    public boolean field59;

    @ObfuscatedName("a.w")
    public int field54;

    @ObfuscatedName("a.t")
    public boolean field55;

    @ObfuscatedName("a.c")
    public int field56;

    @ObfuscatedName("a.x")
    public int field57;

    @ObfuscatedName("a.e")
    public boolean field50;

    @ObfuscatedName("a.v")
    public int field58;

    @ObfuscatedName("a.ab")
    public int field36;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field39[var1] = "";
        }
        this.field40 = 0;
        this.field41 = 0;
        this.field44 = 0;
        this.field53 = 0;
        this.field59 = false;
        this.field54 = 0;
        this.field55 = false;
        this.field50 = false;
    }

    @ObfuscatedName("a.j(Ldc;I)V")
    public final void method12(class119 arg0) {
        arg0.field1999 = 0;
        int var2 = arg0.method2316();
        this.field42 = arg0.method2317();
        this.field37 = arg0.method2317();
        int var3 = -1;
        this.field54 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2316();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2316();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2318();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method578(var4[var5] - 512).field1120;
                    if (var8 != 0) {
                        this.field54 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2316();
            if (var11 < 0 || var11 >= Statics.field2080[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field816 = arg0.method2318();
        if (this.field816 == 65535) {
            this.field816 = -1;
        }
        this.field817 = arg0.method2318();
        if (this.field817 == 65535) {
            this.field817 = -1;
        }
        this.field858 = this.field817;
        this.field819 = arg0.method2318();
        if (this.field819 == 65535) {
            this.field819 = -1;
        }
        this.field820 = arg0.method2318();
        if (this.field820 == 65535) {
            this.field820 = -1;
        }
        this.field812 = arg0.method2318();
        if (this.field812 == 65535) {
            this.field812 = -1;
        }
        this.field822 = arg0.method2318();
        if (this.field822 == 65535) {
            this.field822 = -1;
        }
        this.field823 = arg0.method2318();
        if (this.field823 == 65535) {
            this.field823 = -1;
        }
        this.field49 = arg0.method2324();
        if (Statics.field2250 == this) {
            Statics.field2236 = this.field49;
        }
        this.field40 = arg0.method2316();
        this.field41 = arg0.method2318();
        this.field55 = arg0.method2316() == 1;
        if (client.field289 == 0 && client.field456 >= 2) {
            this.field55 = false;
        }
        if (this.field35 == null) {
            this.field35 = new class179();
        }
        this.field35.method3216(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("a.l(I)I")
    public int method32() {
        return this.field35 == null || this.field35.field2917 == -1 ? 1 : class40.method159(this.field35.field2917).field886;
    }

    @ObfuscatedName("a.a(I)Ldd;")
    public final class105 method14() {
        if (this.field35 == null) {
            return null;
        }
        class43 var1 = this.field821 != -1 && this.field845 == 0 ? class43.method729(this.field821) : null;
        class43 var2 = this.field839 == -1 || this.field59 || this.field839 == this.field816 && var1 != null ? null : class43.method729(this.field839);
        class105 var3 = this.field35.method3221(var1, this.field828, var2, this.field830);
        if (var3 == null) {
            return null;
        }
        var3.method2133();
        this.field844 = var3.field1462;
        if (!this.field59 && this.field847 != -1 && this.field848 != -1) {
            class105 var4 = class44.method632(this.field847).method884(this.field848);
            if (var4 != null) {
                var4.method2142(0, -this.field851, 0);
                class105[] var5 = new class105[] { var3, var4 };
                var3 = new class105(var5, 2);
            }
        }
        if (!this.field59 && this.field48 != null) {
            if (client.field395 >= this.field53) {
                this.field48 = null;
            }
            if (client.field395 >= this.field44 && client.field395 < this.field53) {
                class105 var6 = this.field48;
                var6.method2142(this.field45 - this.field840, this.field46 - this.field43, this.field47 - this.field849);
                if (this.field861 == 512) {
                    var6.method2138();
                    var6.method2138();
                    var6.method2138();
                } else if (this.field861 == 1024) {
                    var6.method2138();
                    var6.method2138();
                } else if (this.field861 == 1536) {
                    var6.method2138();
                }
                class105[] var7 = new class105[] { var3, var6 };
                var3 = new class105(var7, 2);
                if (this.field861 == 512) {
                    var6.method2138();
                } else if (this.field861 == 1024) {
                    var6.method2138();
                    var6.method2138();
                } else if (this.field861 == 1536) {
                    var6.method2138();
                    var6.method2138();
                    var6.method2138();
                }
                var6.method2142(this.field840 - this.field45, this.field43 - this.field46, this.field849 - this.field47);
            }
        }
        var3.field1830 = true;
        return var3;
    }

    @ObfuscatedName("a.i(IIBI)V")
    public final void method27(int arg0, int arg1, byte arg2) {
        if (this.field821 != -1 && class43.method729(this.field821).field999 == 1) {
            this.field821 = -1;
        }
        this.field854 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method13(arg0, arg1);
        } else if (this.field865[0] >= 0 && this.field865[0] < 104 && this.field818[0] >= 0 && this.field818[0] < 104) {
            if (arg2 == 2) {
                client.method111(this, arg0, arg1, (byte) 2);
            }
            this.method17(arg0, arg1, arg2);
        } else {
            this.method13(arg0, arg1);
        }
    }

    @ObfuscatedName("a.f(IIB)V")
    public void method13(int arg0, int arg1) {
        this.field825 = 0;
        this.field869 = 0;
        this.field868 = 0;
        this.field865[0] = arg0;
        this.field818[0] = arg1;
        int var3 = this.method32();
        this.field840 = this.field865[0] * 128 + var3 * 64;
        this.field849 = this.field818[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("a.m(IIBI)V")
    public final void method17(int arg0, int arg1, byte arg2) {
        if (this.field825 < 9) {
            this.field825++;
        }
        for (int var4 = this.field825; var4 > 0; var4--) {
            this.field865[var4] = this.field865[var4 - 1];
            this.field818[var4] = this.field818[var4 - 1];
            this.field867[var4] = this.field867[var4 - 1];
        }
        this.field865[0] = arg0;
        this.field818[0] = arg1;
        this.field867[0] = arg2;
    }

    @ObfuscatedName("a.o(I)Z")
    public final boolean method18() {
        return this.field35 != null;
    }
}

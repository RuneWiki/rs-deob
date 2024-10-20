package deob;

@ObfuscatedName("j")
public final class class3 extends class40 {

    @ObfuscatedName("j.x")
    public String field28;

    @ObfuscatedName("j.r")
    public class183 field34;

    @ObfuscatedName("j.j")
    public int field29 = -1;

    @ObfuscatedName("j.z")
    public int field42 = -1;

    @ObfuscatedName("j.b")
    public String[] field47 = new String[3];

    @ObfuscatedName("j.l")
    public int field32;

    @ObfuscatedName("j.m")
    public int field33;

    @ObfuscatedName("j.p")
    public int field38;

    @ObfuscatedName("j.f")
    public int field35;

    @ObfuscatedName("j.d")
    public int field36;

    @ObfuscatedName("j.v")
    public int field37;

    @ObfuscatedName("j.q")
    public int field46;

    @ObfuscatedName("j.t")
    public int field31;

    @ObfuscatedName("j.g")
    public class109 field40;

    @ObfuscatedName("j.s")
    public int field41;

    @ObfuscatedName("j.h")
    public int field39;

    @ObfuscatedName("j.u")
    public int field43;

    @ObfuscatedName("j.a")
    public int field44;

    @ObfuscatedName("j.e")
    public boolean field45;

    @ObfuscatedName("j.c")
    public int field52;

    @ObfuscatedName("j.n")
    public boolean field30;

    @ObfuscatedName("j.y")
    public int field48;

    @ObfuscatedName("j.k")
    public int field49;

    @ObfuscatedName("j.w")
    public boolean field50;

    @ObfuscatedName("j.o")
    public int field51;

    @ObfuscatedName("j.ah")
    public int field27;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field47[var1] = "";
        }
        this.field32 = 0;
        this.field33 = 0;
        this.field35 = 0;
        this.field36 = 0;
        this.field45 = false;
        this.field52 = 0;
        this.field30 = false;
        this.field50 = false;
    }

    @ObfuscatedName("j.x(Ldp;I)V")
    public final void method20(class123 arg0) {
        arg0.field2057 = 0;
        int var2 = arg0.method2408();
        this.field29 = arg0.method2409();
        this.field42 = arg0.method2409();
        int var3 = -1;
        this.field52 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2408();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2408();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2403();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class56.method709(var4[var5] - 512).field1201;
                    if (var8 != 0) {
                        this.field52 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2408();
            if (var11 < 0 || var11 >= Statics.field625[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field818 = arg0.method2403();
        if (this.field818 == 65535) {
            this.field818 = -1;
        }
        this.field840 = arg0.method2403();
        if (this.field840 == 65535) {
            this.field840 = -1;
        }
        this.field853 = this.field840;
        this.field826 = arg0.method2403();
        if (this.field826 == 65535) {
            this.field826 = -1;
        }
        this.field827 = arg0.method2403();
        if (this.field827 == 65535) {
            this.field827 = -1;
        }
        this.field828 = arg0.method2403();
        if (this.field828 == 65535) {
            this.field828 = -1;
        }
        this.field870 = arg0.method2403();
        if (this.field870 == 65535) {
            this.field870 = -1;
        }
        this.field830 = arg0.method2403();
        if (this.field830 == 65535) {
            this.field830 = -1;
        }
        this.field28 = arg0.method2626();
        if (Statics.field1067 == this) {
            Statics.field2278 = this.field28;
        }
        this.field32 = arg0.method2408();
        this.field33 = arg0.method2403();
        this.field30 = arg0.method2408() == 1;
        if (client.field561 == 0 && client.field313 >= 2) {
            this.field30 = false;
        }
        if (this.field34 == null) {
            this.field34 = new class183();
        }
        this.field34.method3296(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("j.r(I)I")
    public int method28() {
        return this.field34 == null || this.field34.field2971 == -1 ? 1 : class42.method2094(this.field34.field2971).field903;
    }

    @ObfuscatedName("j.j(I)Ldj;")
    public final class109 method17() {
        if (this.field34 == null) {
            return null;
        }
        class45 var1 = this.field850 != -1 && this.field832 == 0 ? class45.method2337(this.field850) : null;
        class45 var2 = this.field847 == -1 || this.field45 || this.field847 == this.field818 && var1 != null ? null : class45.method2337(this.field847);
        class109 var3 = this.field34.method3285(var1, this.field851, var2, this.field848);
        if (var3 == null) {
            return null;
        }
        var3.method2250();
        this.field868 = var3.field1504;
        if (!this.field45 && this.field855 != -1 && this.field856 != -1) {
            class109 var4 = class46.method1823(this.field855).method875(this.field856);
            if (var4 != null) {
                var4.method2287(0, -this.field859, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (!this.field45 && this.field40 != null) {
            if (client.field291 >= this.field36) {
                this.field40 = null;
            }
            if (client.field291 >= this.field35 && client.field291 < this.field36) {
                class109 var6 = this.field40;
                var6.method2287(this.field37 - this.field852, this.field46 - this.field38, this.field31 - this.field869);
                if (this.field836 == 512) {
                    var6.method2288();
                    var6.method2288();
                    var6.method2288();
                } else if (this.field836 == 1024) {
                    var6.method2288();
                    var6.method2288();
                } else if (this.field836 == 1536) {
                    var6.method2288();
                }
                class109[] var7 = new class109[] { var3, var6 };
                var3 = new class109(var7, 2);
                if (this.field836 == 512) {
                    var6.method2288();
                } else if (this.field836 == 1024) {
                    var6.method2288();
                    var6.method2288();
                } else if (this.field836 == 1536) {
                    var6.method2288();
                    var6.method2288();
                    var6.method2288();
                }
                var6.method2287(this.field852 - this.field37, this.field38 - this.field46, this.field869 - this.field31);
            }
        }
        var3.field1867 = true;
        return var3;
    }

    @ObfuscatedName("j.z(IIBB)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        if (this.field850 != -1 && class45.method2337(this.field850).field1010 == 1) {
            this.field850 = -1;
        }
        this.field846 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method37(arg0, arg1);
        } else if (this.field873[0] >= 0 && this.field873[0] < 104 && this.field874[0] >= 0 && this.field874[0] < 104) {
            if (arg2 == 2) {
                client.method104(this, arg0, arg1, (byte) 2);
            }
            this.method24(arg0, arg1, arg2);
        } else {
            this.method37(arg0, arg1);
        }
    }

    @ObfuscatedName("j.i(III)V")
    public void method37(int arg0, int arg1) {
        this.field872 = 0;
        this.field823 = 0;
        this.field876 = 0;
        this.field873[0] = arg0;
        this.field874[0] = arg1;
        int var3 = this.method28();
        this.field852 = this.field873[0] * 128 + var3 * 64;
        this.field869 = this.field874[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("j.b(IIBB)V")
    public final void method24(int arg0, int arg1, byte arg2) {
        if (this.field872 < 9) {
            this.field872++;
        }
        for (int var4 = this.field872; var4 > 0; var4--) {
            this.field873[var4] = this.field873[var4 - 1];
            this.field874[var4] = this.field874[var4 - 1];
            this.field831[var4] = this.field831[var4 - 1];
        }
        this.field873[0] = arg0;
        this.field874[0] = arg1;
        this.field831[0] = arg2;
    }

    @ObfuscatedName("j.l(I)Z")
    public final boolean method23() {
        return this.field34 != null;
    }
}

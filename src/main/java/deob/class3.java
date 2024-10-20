package deob;

@ObfuscatedName("v")
public final class class3 extends class40 {

    @ObfuscatedName("v.a")
    public String field53;

    @ObfuscatedName("v.d")
    public class183 field33;

    @ObfuscatedName("v.v")
    public int field35 = -1;

    @ObfuscatedName("v.r")
    public int field47 = -1;

    @ObfuscatedName("v.t")
    public String[] field37 = new String[3];

    @ObfuscatedName("v.n")
    public int field57;

    @ObfuscatedName("v.i")
    public int field39;

    @ObfuscatedName("v.g")
    public int field40;

    @ObfuscatedName("v.m")
    public int field54;

    @ObfuscatedName("v.k")
    public int field32;

    @ObfuscatedName("v.x")
    public int field43;

    @ObfuscatedName("v.u")
    public int field44;

    @ObfuscatedName("v.j")
    public int field45;

    @ObfuscatedName("v.q")
    public class109 field38;

    @ObfuscatedName("v.w")
    public int field34;

    @ObfuscatedName("v.b")
    public int field48;

    @ObfuscatedName("v.p")
    public int field49;

    @ObfuscatedName("v.o")
    public int field50;

    @ObfuscatedName("v.y")
    public boolean field51;

    @ObfuscatedName("v.s")
    public int field52;

    @ObfuscatedName("v.e")
    public boolean field42;

    @ObfuscatedName("v.h")
    public int field41;

    @ObfuscatedName("v.l")
    public int field55;

    @ObfuscatedName("v.c")
    public boolean field56;

    @ObfuscatedName("v.f")
    public int field46;

    @ObfuscatedName("v.ac")
    public int field58;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field37[var1] = "";
        }
        this.field57 = 0;
        this.field39 = 0;
        this.field54 = 0;
        this.field32 = 0;
        this.field51 = false;
        this.field52 = 0;
        this.field42 = false;
        this.field56 = false;
    }

    @ObfuscatedName("v.a(Ldb;I)V")
    public final void method15(class123 arg0) {
        arg0.field2071 = 0;
        int var2 = arg0.method2395();
        this.field35 = arg0.method2396();
        this.field47 = arg0.method2396();
        int var3 = -1;
        this.field52 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2395();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2395();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2584();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class56.method754(var4[var5] - 512).field1224;
                    if (var8 != 0) {
                        this.field52 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2395();
            if (var11 < 0 || var11 >= Statics.field2976[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field859 = arg0.method2584();
        if (this.field859 == 65535) {
            this.field859 = -1;
        }
        this.field850 = arg0.method2584();
        if (this.field850 == 65535) {
            this.field850 = -1;
        }
        this.field891 = this.field850;
        this.field848 = arg0.method2584();
        if (this.field848 == 65535) {
            this.field848 = -1;
        }
        this.field888 = arg0.method2584();
        if (this.field888 == 65535) {
            this.field888 = -1;
        }
        this.field864 = arg0.method2584();
        if (this.field864 == 65535) {
            this.field864 = -1;
        }
        this.field851 = arg0.method2584();
        if (this.field851 == 65535) {
            this.field851 = -1;
        }
        this.field852 = arg0.method2584();
        if (this.field852 == 65535) {
            this.field852 = -1;
        }
        this.field53 = arg0.method2397();
        if (Statics.field68 == this) {
            Statics.field2291 = this.field53;
        }
        this.field57 = arg0.method2395();
        this.field39 = arg0.method2584();
        this.field42 = arg0.method2395() == 1;
        if (client.field282 == 0 && client.field352 >= 2) {
            this.field42 = false;
        }
        if (this.field33 == null) {
            this.field33 = new class183();
        }
        this.field33.method3324(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("v.d(I)I")
    public int method16() {
        return this.field33 == null || this.field33.field2979 == -1 ? 1 : class42.method823(this.field33.field2979).field916;
    }

    @ObfuscatedName("v.v(I)Ldp;")
    public final class109 method40() {
        if (this.field33 == null) {
            return null;
        }
        class45 var1 = this.field872 != -1 && this.field875 == 0 ? class45.method185(this.field872) : null;
        class45 var2 = this.field869 == -1 || this.field51 || this.field869 == this.field859 && var1 != null ? null : class45.method185(this.field869);
        class109 var3 = this.field33.method3327(var1, this.field890, var2, this.field870);
        if (var3 == null) {
            return null;
        }
        var3.method2220();
        this.field841 = var3.field1549;
        if (!this.field51 && this.field874 != -1 && this.field878 != -1) {
            class109 var4 = class46.method1007(this.field874).method918(this.field878);
            if (var4 != null) {
                var4.method2209(0, -this.field881, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (!this.field51 && this.field38 != null) {
            if (client.field565 >= this.field32) {
                this.field38 = null;
            }
            if (client.field565 >= this.field54 && client.field565 < this.field32) {
                class109 var6 = this.field38;
                var6.method2209(this.field43 - this.field847, this.field44 - this.field40, this.field45 - this.field849);
                if (this.field892 == 512) {
                    var6.method2205();
                    var6.method2205();
                    var6.method2205();
                } else if (this.field892 == 1024) {
                    var6.method2205();
                    var6.method2205();
                } else if (this.field892 == 1536) {
                    var6.method2205();
                }
                class109[] var7 = new class109[] { var3, var6 };
                var3 = new class109(var7, 2);
                if (this.field892 == 512) {
                    var6.method2205();
                } else if (this.field892 == 1024) {
                    var6.method2205();
                    var6.method2205();
                } else if (this.field892 == 1536) {
                    var6.method2205();
                    var6.method2205();
                    var6.method2205();
                }
                var6.method2209(this.field847 - this.field43, this.field40 - this.field44, this.field849 - this.field45);
            }
        }
        var3.field1909 = true;
        return var3;
    }

    @ObfuscatedName("v.r(IIBI)V")
    public final void method30(int arg0, int arg1, byte arg2) {
        if (this.field872 != -1 && class45.method185(this.field872).field1018 == 1) {
            this.field872 = -1;
        }
        this.field886 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method21(arg0, arg1);
        } else if (this.field895[0] >= 0 && this.field895[0] < 104 && this.field896[0] >= 0 && this.field896[0] < 104) {
            if (arg2 == 2) {
                client.method231(this, arg0, arg1, (byte) 2);
            }
            this.method20(arg0, arg1, arg2);
        } else {
            this.method21(arg0, arg1);
        }
    }

    @ObfuscatedName("v.z(III)V")
    public void method21(int arg0, int arg1) {
        this.field894 = 0;
        this.field899 = 0;
        this.field898 = 0;
        this.field895[0] = arg0;
        this.field896[0] = arg1;
        int var3 = this.method16();
        this.field847 = this.field895[0] * 128 + var3 * 64;
        this.field849 = this.field896[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("v.t(IIBB)V")
    public final void method20(int arg0, int arg1, byte arg2) {
        if (this.field894 < 9) {
            this.field894++;
        }
        for (int var4 = this.field894; var4 > 0; var4--) {
            this.field895[var4] = this.field895[var4 - 1];
            this.field896[var4] = this.field896[var4 - 1];
            this.field897[var4] = this.field897[var4 - 1];
        }
        this.field895[0] = arg0;
        this.field896[0] = arg1;
        this.field897[0] = arg2;
    }

    @ObfuscatedName("v.n(I)Z")
    public final boolean method17() {
        return this.field33 != null;
    }
}

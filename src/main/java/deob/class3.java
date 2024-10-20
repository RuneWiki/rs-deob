package deob;

@ObfuscatedName("v")
public final class class3 extends class33 {

    @ObfuscatedName("v.g")
    public String field39;

    @ObfuscatedName("v.s")
    public class158 field45;

    @ObfuscatedName("v.v")
    public int field33 = -1;

    @ObfuscatedName("v.o")
    public int field34 = -1;

    @ObfuscatedName("v.k")
    public int field52 = 0;

    @ObfuscatedName("v.m")
    public int field36 = 0;

    @ObfuscatedName("v.i")
    public int field40;

    @ObfuscatedName("v.t")
    public int field37 = 0;

    @ObfuscatedName("v.l")
    public int field35 = 0;

    @ObfuscatedName("v.p")
    public int field47;

    @ObfuscatedName("v.r")
    public int field41;

    @ObfuscatedName("v.j")
    public int field31;

    @ObfuscatedName("v.c")
    public class98 field43;

    @ObfuscatedName("v.q")
    public int field44;

    @ObfuscatedName("v.n")
    public int field49;

    @ObfuscatedName("v.h")
    public int field46;

    @ObfuscatedName("v.d")
    public int field38;

    @ObfuscatedName("v.b")
    public boolean field48 = false;

    @ObfuscatedName("v.w")
    public int field42 = 0;

    @ObfuscatedName("v.z")
    public boolean field50 = false;

    @ObfuscatedName("v.g(Lde;I)V")
    public final void method16(class107 arg0) {
        arg0.field1851 = 0;
        int var2 = arg0.method2116();
        this.field33 = arg0.method2093();
        this.field34 = arg0.method2093();
        int var3 = -1;
        this.field42 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2116();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2116();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2094();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method2351(var4[var5] - 512).field1030;
                    if (var8 != 0) {
                        this.field42 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2116();
            if (var11 < 0 || var11 >= Statics.field2695[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field756 = arg0.method2094();
        if (this.field756 == 65535) {
            this.field756 = -1;
        }
        this.field724 = arg0.method2094();
        if (this.field724 == 65535) {
            this.field724 = -1;
        }
        this.field766 = this.field724;
        this.field726 = arg0.method2094();
        if (this.field726 == 65535) {
            this.field726 = -1;
        }
        this.field727 = arg0.method2094();
        if (this.field727 == 65535) {
            this.field727 = -1;
        }
        this.field728 = arg0.method2094();
        if (this.field728 == 65535) {
            this.field728 = -1;
        }
        this.field731 = arg0.method2094();
        if (this.field731 == 65535) {
            this.field731 = -1;
        }
        this.field747 = arg0.method2094();
        if (this.field747 == 65535) {
            this.field747 = -1;
        }
        this.field39 = arg0.method2100();
        if (Statics.field1819 == this) {
            Statics.field2091 = this.field39;
        }
        this.field52 = arg0.method2116();
        this.field36 = arg0.method2094();
        this.field50 = arg0.method2116() == 1;
        if (client.field264 == 0 && client.field435 >= 2) {
            this.field50 = false;
        }
        if (this.field45 == null) {
            this.field45 = new class158();
        }
        this.field45.method2892(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("v.s(I)Lcg;")
    public final class98 method17() {
        if (this.field45 == null) {
            return null;
        }
        class38 var1 = this.field748 != -1 && this.field750 == 0 ? class38.method1935(this.field748) : null;
        class38 var2 = this.field745 == -1 || this.field48 || this.field756 == this.field745 && var1 != null ? null : class38.method1935(this.field745);
        class98 var3 = this.field45.method2876(var1, this.field730, var2, this.field746);
        if (var3 == null) {
            return null;
        }
        var3.method1950();
        this.field751 = var3.field1353;
        if (!this.field48 && this.field753 != -1 && this.field754 != -1) {
            class98 var4 = class39.method612(this.field753).method745(this.field754);
            if (var4 != null) {
                var4.method1989(0, -this.field725, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field48 && this.field43 != null) {
            if (client.field316 >= this.field35) {
                this.field43 = null;
            }
            if (client.field316 >= this.field37 && client.field316 < this.field35) {
                class98 var6 = this.field43;
                var6.method1989(this.field47 - this.field729, this.field41 - this.field40, this.field31 - this.field761);
                if (this.field767 == 512) {
                    var6.method2018();
                    var6.method2018();
                    var6.method2018();
                } else if (this.field767 == 1024) {
                    var6.method2018();
                    var6.method2018();
                } else if (this.field767 == 1536) {
                    var6.method2018();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field767 == 512) {
                    var6.method2018();
                } else if (this.field767 == 1024) {
                    var6.method2018();
                    var6.method2018();
                } else if (this.field767 == 1536) {
                    var6.method2018();
                    var6.method2018();
                    var6.method2018();
                }
                var6.method1989(this.field729 - this.field47, this.field40 - this.field41, this.field761 - this.field31);
            }
        }
        var3.field1734 = true;
        return var3;
    }

    @ObfuscatedName("v.v(I)Z")
    public final boolean method28() {
        return this.field45 != null;
    }
}

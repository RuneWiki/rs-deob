package deob;

@ObfuscatedName("i")
public final class class3 extends class33 {

    @ObfuscatedName("i.t")
    public String field35;

    @ObfuscatedName("i.o")
    public class157 field32;

    @ObfuscatedName("i.i")
    public int field33 = -1;

    @ObfuscatedName("i.p")
    public int field34 = -1;

    @ObfuscatedName("i.c")
    public int field39 = 0;

    @ObfuscatedName("i.y")
    public int field36 = 0;

    @ObfuscatedName("i.g")
    public int field40;

    @ObfuscatedName("i.l")
    public int field38 = 0;

    @ObfuscatedName("i.h")
    public int field37 = 0;

    @ObfuscatedName("i.n")
    public int field47;

    @ObfuscatedName("i.w")
    public int field42;

    @ObfuscatedName("i.m")
    public int field41;

    @ObfuscatedName("i.x")
    public class98 field43;

    @ObfuscatedName("i.b")
    public int field44;

    @ObfuscatedName("i.u")
    public int field45;

    @ObfuscatedName("i.r")
    public int field46;

    @ObfuscatedName("i.z")
    public int field31;

    @ObfuscatedName("i.v")
    public boolean field48 = false;

    @ObfuscatedName("i.k")
    public int field49 = 0;

    @ObfuscatedName("i.a")
    public boolean field50 = false;

    @ObfuscatedName("i.t(Ldg;I)V")
    public final void method15(class107 arg0) {
        arg0.field1827 = 0;
        int var2 = arg0.method2118();
        this.field33 = arg0.method2253();
        this.field34 = arg0.method2253();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2118();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2118();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2120();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method1771(var4[var5] - 512).field1013;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2118();
            if (var11 < 0 || var11 >= Statics.field2665[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field754 = arg0.method2120();
        if (this.field754 == 65535) {
            this.field754 = -1;
        }
        this.field716 = arg0.method2120();
        if (this.field716 == 65535) {
            this.field716 = -1;
        }
        this.field752 = this.field716;
        this.field725 = arg0.method2120();
        if (this.field725 == 65535) {
            this.field725 = -1;
        }
        this.field748 = arg0.method2120();
        if (this.field748 == 65535) {
            this.field748 = -1;
        }
        this.field726 = arg0.method2120();
        if (this.field726 == 65535) {
            this.field726 = -1;
        }
        this.field727 = arg0.method2120();
        if (this.field727 == 65535) {
            this.field727 = -1;
        }
        this.field728 = arg0.method2120();
        if (this.field728 == 65535) {
            this.field728 = -1;
        }
        this.field35 = arg0.method2126();
        if (Statics.field994 == this) {
            Statics.field2043 = this.field35;
        }
        this.field39 = arg0.method2118();
        this.field36 = arg0.method2120();
        this.field50 = arg0.method2118() == 1;
        if (client.field254 == 0 && client.field469 >= 2) {
            this.field50 = false;
        }
        if (this.field32 == null) {
            this.field32 = new class157();
        }
        this.field32.method2867(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("i.o(I)Lcx;")
    public final class98 method21() {
        if (this.field32 == null) {
            return null;
        }
        class38 var1 = this.field740 != -1 && this.field749 == 0 ? class38.method1579(this.field740) : null;
        class38 var2 = this.field762 == -1 || this.field48 || this.field762 == this.field754 && var1 != null ? null : class38.method1579(this.field762);
        class98 var3 = this.field32.method2873(var1, this.field747, var2, this.field737);
        if (var3 == null) {
            return null;
        }
        var3.method1974();
        this.field764 = var3.field1351;
        if (!this.field48 && this.field751 != -1 && this.field773 != -1) {
            class98 var4 = class39.method2654(this.field751).method744(this.field773);
            if (var4 != null) {
                var4.method2036(0, -this.field755, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field48 && this.field43 != null) {
            if (client.field274 >= this.field37) {
                this.field43 = null;
            }
            if (client.field274 >= this.field38 && client.field274 < this.field37) {
                class98 var6 = this.field43;
                var6.method2036(this.field47 - this.field743, this.field42 - this.field40, this.field41 - this.field717);
                if (this.field765 == 512) {
                    var6.method1980();
                    var6.method1980();
                    var6.method1980();
                } else if (this.field765 == 1024) {
                    var6.method1980();
                    var6.method1980();
                } else if (this.field765 == 1536) {
                    var6.method1980();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field765 == 512) {
                    var6.method1980();
                } else if (this.field765 == 1024) {
                    var6.method1980();
                    var6.method1980();
                } else if (this.field765 == 1536) {
                    var6.method1980();
                    var6.method1980();
                    var6.method1980();
                }
                var6.method2036(this.field743 - this.field47, this.field40 - this.field42, this.field717 - this.field41);
            }
        }
        var3.field1688 = true;
        return var3;
    }

    @ObfuscatedName("i.i(I)Z")
    public final boolean method16() {
        return this.field32 != null;
    }
}

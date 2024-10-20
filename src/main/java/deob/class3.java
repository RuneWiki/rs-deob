package deob;

@ObfuscatedName("k")
public final class class3 extends class33 {

    @ObfuscatedName("k.y")
    public String field37;

    @ObfuscatedName("k.u")
    public class156 field38;

    @ObfuscatedName("k.k")
    public int field39 = -1;

    @ObfuscatedName("k.v")
    public int field59 = -1;

    @ObfuscatedName("k.l")
    public int field41 = 0;

    @ObfuscatedName("k.g")
    public int field42 = 0;

    @ObfuscatedName("k.a")
    public int field43;

    @ObfuscatedName("k.x")
    public int field57 = 0;

    @ObfuscatedName("k.r")
    public int field45 = 0;

    @ObfuscatedName("k.w")
    public int field44;

    @ObfuscatedName("k.c")
    public int field47;

    @ObfuscatedName("k.f")
    public int field48;

    @ObfuscatedName("k.o")
    public class98 field49;

    @ObfuscatedName("k.p")
    public int field50;

    @ObfuscatedName("k.n")
    public int field51;

    @ObfuscatedName("k.m")
    public int field52;

    @ObfuscatedName("k.s")
    public int field53;

    @ObfuscatedName("k.t")
    public boolean field54 = false;

    @ObfuscatedName("k.j")
    public int field55 = 0;

    @ObfuscatedName("k.y(Ldo;B)V")
    public final void method12(class107 arg0) {
        arg0.field1854 = 0;
        int var2 = arg0.method2109();
        this.field39 = arg0.method2110();
        this.field59 = arg0.method2110();
        int var3 = -1;
        this.field55 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2109();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2109();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2111();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method148(var4[var5] - 512).field999;
                    if (var8 != 0) {
                        this.field55 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2109();
            if (var11 < 0 || var11 >= Statics.field2646[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field751 = arg0.method2111();
        if (this.field751 == 65535) {
            this.field751 = -1;
        }
        this.field718 = arg0.method2111();
        if (this.field718 == 65535) {
            this.field718 = -1;
        }
        this.field719 = this.field718;
        this.field720 = arg0.method2111();
        if (this.field720 == 65535) {
            this.field720 = -1;
        }
        this.field721 = arg0.method2111();
        if (this.field721 == 65535) {
            this.field721 = -1;
        }
        this.field722 = arg0.method2111();
        if (this.field722 == 65535) {
            this.field722 = -1;
        }
        this.field723 = arg0.method2111();
        if (this.field723 == 65535) {
            this.field723 = -1;
        }
        this.field736 = arg0.method2111();
        if (this.field736 == 65535) {
            this.field736 = -1;
        }
        this.field37 = arg0.method2126();
        if (Statics.field1561 == this) {
            Statics.field2077 = this.field37;
        }
        this.field41 = arg0.method2109();
        this.field42 = arg0.method2111();
        if (this.field38 == null) {
            this.field38 = new class156();
        }
        this.field38.method2899(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("k.u(I)Lcz;")
    public final class98 method14() {
        if (this.field38 == null) {
            return null;
        }
        class38 var1 = this.field742 != -1 && this.field745 == 0 ? class38.method1866(this.field742) : null;
        class38 var2 = this.field739 == -1 || this.field54 || this.field751 == this.field739 && var1 != null ? null : class38.method1866(this.field739);
        class98 var3 = this.field38.method2908(var1, this.field743, var2, this.field737);
        if (var3 == null) {
            return null;
        }
        var3.method1966();
        this.field744 = var3.field1344;
        if (!this.field54 && this.field747 != -1 && this.field748 != -1) {
            class98 var4 = class39.method2683(this.field747).method739(this.field748);
            if (var4 != null) {
                var4.method2035(0, -this.field760, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field54 && this.field49 != null) {
            if (client.field262 >= this.field45) {
                this.field49 = null;
            }
            if (client.field262 >= this.field57 && client.field262 < this.field45) {
                class98 var6 = this.field49;
                var6.method2035(this.field44 - this.field746, this.field47 - this.field43, this.field48 - this.field713);
                if (this.field761 == 512) {
                    var6.method1972();
                    var6.method1972();
                    var6.method1972();
                } else if (this.field761 == 1024) {
                    var6.method1972();
                    var6.method1972();
                } else if (this.field761 == 1536) {
                    var6.method1972();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field761 == 512) {
                    var6.method1972();
                } else if (this.field761 == 1024) {
                    var6.method1972();
                    var6.method1972();
                } else if (this.field761 == 1536) {
                    var6.method1972();
                    var6.method1972();
                    var6.method1972();
                }
                var6.method2035(this.field746 - this.field44, this.field43 - this.field47, this.field713 - this.field48);
            }
        }
        var3.field1728 = true;
        return var3;
    }

    @ObfuscatedName("k.k(B)Z")
    public final boolean method20() {
        return this.field38 != null;
    }
}

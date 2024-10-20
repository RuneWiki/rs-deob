package deob;

@ObfuscatedName("y")
public final class class3 extends class30 {

    @ObfuscatedName("y.m")
    public String field38;

    @ObfuscatedName("y.k")
    public class153 field50;

    @ObfuscatedName("y.y")
    public int field34 = -1;

    @ObfuscatedName("y.g")
    public int field35 = -1;

    @ObfuscatedName("y.r")
    public int field36 = 0;

    @ObfuscatedName("y.i")
    public int field37 = 0;

    @ObfuscatedName("y.f")
    public int field54;

    @ObfuscatedName("y.a")
    public int field39 = 0;

    @ObfuscatedName("y.w")
    public int field45 = 0;

    @ObfuscatedName("y.u")
    public int field41;

    @ObfuscatedName("y.d")
    public int field42;

    @ObfuscatedName("y.t")
    public int field43;

    @ObfuscatedName("y.j")
    public class95 field44;

    @ObfuscatedName("y.q")
    public int field40;

    @ObfuscatedName("y.p")
    public int field46;

    @ObfuscatedName("y.v")
    public int field47;

    @ObfuscatedName("y.n")
    public int field48;

    @ObfuscatedName("y.l")
    public boolean field33 = false;

    @ObfuscatedName("y.c")
    public int field32 = 0;

    @ObfuscatedName("y.m(Lcb;I)V")
    public final void method17(class104 arg0) {
        arg0.field1806 = 0;
        int var2 = arg0.method2190();
        this.field34 = arg0.method2159();
        this.field35 = arg0.method2159();
        int var3 = -1;
        this.field32 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2190();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2190();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2132();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class42.method124(var4[var5] - 512).field1023;
                    if (var8 != 0) {
                        this.field32 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2190();
            if (var11 < 0 || var11 >= Statics.field1239[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field731 = arg0.method2132();
        if (this.field731 == 65535) {
            this.field731 = -1;
        }
        this.field698 = arg0.method2132();
        if (this.field698 == 65535) {
            this.field698 = -1;
        }
        this.field728 = this.field698;
        this.field726 = arg0.method2132();
        if (this.field726 == 65535) {
            this.field726 = -1;
        }
        this.field701 = arg0.method2132();
        if (this.field701 == 65535) {
            this.field701 = -1;
        }
        this.field702 = arg0.method2132();
        if (this.field702 == 65535) {
            this.field702 = -1;
        }
        this.field705 = arg0.method2132();
        if (this.field705 == 65535) {
            this.field705 = -1;
        }
        this.field737 = arg0.method2132();
        if (this.field737 == 65535) {
            this.field737 = -1;
        }
        this.field38 = arg0.method2138();
        if (Statics.field944 == this) {
            Statics.field2048 = this.field38;
        }
        this.field36 = arg0.method2190();
        this.field37 = arg0.method2132();
        if (this.field50 == null) {
            this.field50 = new class153();
        }
        this.field50.method2907(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("y.k(I)Lcl;")
    public final class95 method22() {
        if (this.field50 == null) {
            return null;
        }
        class35 var1 = this.field721 != -1 && this.field749 == 0 ? class35.method162(this.field721) : null;
        class35 var2 = this.field718 == -1 || this.field33 || this.field731 == this.field718 && var1 != null ? null : class35.method162(this.field718);
        class95 var3 = this.field50.method2892(var1, this.field716, var2, this.field719);
        if (var3 == null) {
            return null;
        }
        var3.method1975();
        this.field739 = var3.field1315;
        if (!this.field33 && this.field697 != -1 && this.field722 != -1) {
            class95 var4 = class36.method2678(this.field697).method707(this.field722);
            if (var4 != null) {
                var4.method1980(0, -this.field730, 0);
                class95[] var5 = new class95[] { var3, var4 };
                var3 = new class95(var5, 2);
            }
        }
        if (!this.field33 && this.field44 != null) {
            if (client.field463 >= this.field45) {
                this.field44 = null;
            }
            if (client.field463 >= this.field39 && client.field463 < this.field45) {
                class95 var6 = this.field44;
                var6.method1980(this.field41 - this.field704, this.field42 - this.field54, this.field43 - this.field693);
                if (this.field743 == 512) {
                    var6.method1981();
                    var6.method1981();
                    var6.method1981();
                } else if (this.field743 == 1024) {
                    var6.method1981();
                    var6.method1981();
                } else if (this.field743 == 1536) {
                    var6.method1981();
                }
                class95[] var7 = new class95[] { var3, var6 };
                var3 = new class95(var7, 2);
                if (this.field743 == 512) {
                    var6.method1981();
                } else if (this.field743 == 1024) {
                    var6.method1981();
                    var6.method1981();
                } else if (this.field743 == 1536) {
                    var6.method1981();
                    var6.method1981();
                    var6.method1981();
                }
                var6.method1980(this.field704 - this.field41, this.field54 - this.field42, this.field693 - this.field43);
            }
        }
        var3.field1667 = true;
        return var3;
    }

    @ObfuscatedName("y.y(B)Z")
    public final boolean method18() {
        return this.field50 != null;
    }
}

package deob;

@ObfuscatedName("h")
public final class class3 extends class33 {

    @ObfuscatedName("h.g")
    public String field42;

    @ObfuscatedName("h.s")
    public class158 field30;

    @ObfuscatedName("h.h")
    public int field32 = -1;

    @ObfuscatedName("h.m")
    public int field38 = -1;

    @ObfuscatedName("h.u")
    public int field34 = 0;

    @ObfuscatedName("h.j")
    public int field35 = 0;

    @ObfuscatedName("h.b")
    public int field36;

    @ObfuscatedName("h.v")
    public int field37 = 0;

    @ObfuscatedName("h.y")
    public int field46 = 0;

    @ObfuscatedName("h.w")
    public int field39;

    @ObfuscatedName("h.x")
    public int field31;

    @ObfuscatedName("h.k")
    public int field45;

    @ObfuscatedName("h.o")
    public class98 field43;

    @ObfuscatedName("h.a")
    public int field41;

    @ObfuscatedName("h.f")
    public int field44;

    @ObfuscatedName("h.r")
    public int field47;

    @ObfuscatedName("h.e")
    public int field33;

    @ObfuscatedName("h.t")
    public boolean field50 = false;

    @ObfuscatedName("h.c")
    public int field48 = 0;

    @ObfuscatedName("h.l")
    public boolean field49 = false;

    @ObfuscatedName("h.g(Ldi;I)V")
    public final void method16(class107 arg0) {
        arg0.field1835 = 0;
        int var2 = arg0.method2101();
        this.field32 = arg0.method2263();
        this.field38 = arg0.method2263();
        int var3 = -1;
        this.field48 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2101();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2101();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2166();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method612(var4[var5] - 512).field1030;
                    if (var8 != 0) {
                        this.field48 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2101();
            if (var11 < 0 || var11 >= Statics.field1655[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field756 = arg0.method2166();
        if (this.field756 == 65535) {
            this.field756 = -1;
        }
        this.field726 = arg0.method2166();
        if (this.field726 == 65535) {
            this.field726 = -1;
        }
        this.field727 = this.field726;
        this.field728 = arg0.method2166();
        if (this.field728 == 65535) {
            this.field728 = -1;
        }
        this.field729 = arg0.method2166();
        if (this.field729 == 65535) {
            this.field729 = -1;
        }
        this.field768 = arg0.method2166();
        if (this.field768 == 65535) {
            this.field768 = -1;
        }
        this.field731 = arg0.method2166();
        if (this.field731 == 65535) {
            this.field731 = -1;
        }
        this.field730 = arg0.method2166();
        if (this.field730 == 65535) {
            this.field730 = -1;
        }
        this.field42 = arg0.method2137();
        if (Statics.field628 == this) {
            Statics.field2060 = this.field42;
        }
        this.field34 = arg0.method2101();
        this.field35 = arg0.method2166();
        this.field49 = arg0.method2101() == 1;
        if (client.field468 == 0 && client.field412 >= 2) {
            this.field49 = false;
        }
        if (this.field30 == null) {
            this.field30 = new class158();
        }
        this.field30.method2881(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("h.s(I)Lcl;")
    public final class98 method17() {
        if (this.field30 == null) {
            return null;
        }
        class38 var1 = this.field751 != -1 && this.field754 == 0 ? class38.method114(this.field751) : null;
        class38 var2 = this.field770 == -1 || this.field50 || this.field770 == this.field756 && var1 != null ? null : class38.method114(this.field770);
        class98 var3 = this.field30.method2886(var1, this.field752, var2, this.field749);
        if (var3 == null) {
            return null;
        }
        var3.method1958();
        this.field769 = var3.field1354;
        if (!this.field50 && this.field723 != -1 && this.field757 != -1) {
            class98 var4 = class39.method3306(this.field723).method743(this.field757);
            if (var4 != null) {
                var4.method1979(0, -this.field760, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field50 && this.field43 != null) {
            if (client.field251 >= this.field46) {
                this.field43 = null;
            }
            if (client.field251 >= this.field37 && client.field251 < this.field46) {
                class98 var6 = this.field43;
                var6.method1979(this.field39 - this.field771, this.field31 - this.field36, this.field45 - this.field721);
                if (this.field720 == 512) {
                    var6.method2010();
                    var6.method2010();
                    var6.method2010();
                } else if (this.field720 == 1024) {
                    var6.method2010();
                    var6.method2010();
                } else if (this.field720 == 1536) {
                    var6.method2010();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field720 == 512) {
                    var6.method2010();
                } else if (this.field720 == 1024) {
                    var6.method2010();
                    var6.method2010();
                } else if (this.field720 == 1536) {
                    var6.method2010();
                    var6.method2010();
                    var6.method2010();
                }
                var6.method1979(this.field771 - this.field39, this.field36 - this.field31, this.field721 - this.field45);
            }
        }
        var3.field1717 = true;
        return var3;
    }

    @ObfuscatedName("h.h(I)Z")
    public final boolean method18() {
        return this.field30 != null;
    }
}

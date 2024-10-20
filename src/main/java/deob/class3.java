package deob;

@ObfuscatedName("y")
public final class class3 extends class33 {

    @ObfuscatedName("y.j")
    public String field32;

    @ObfuscatedName("y.z")
    public class157 field38;

    @ObfuscatedName("y.y")
    public int field33 = -1;

    @ObfuscatedName("y.h")
    public int field40 = -1;

    @ObfuscatedName("y.r")
    public int field34 = 0;

    @ObfuscatedName("y.e")
    public int field48 = 0;

    @ObfuscatedName("y.k")
    public int field30;

    @ObfuscatedName("y.b")
    public int field44 = 0;

    @ObfuscatedName("y.n")
    public int field36 = 0;

    @ObfuscatedName("y.a")
    public int field39;

    @ObfuscatedName("y.q")
    public int field37;

    @ObfuscatedName("y.i")
    public int field41;

    @ObfuscatedName("y.f")
    public class98 field42;

    @ObfuscatedName("y.o")
    public int field43;

    @ObfuscatedName("y.t")
    public int field35;

    @ObfuscatedName("y.c")
    public int field45;

    @ObfuscatedName("y.d")
    public int field46;

    @ObfuscatedName("y.g")
    public boolean field47 = false;

    @ObfuscatedName("y.s")
    public int field31 = 0;

    @ObfuscatedName("y.j(Lde;I)V")
    public final void method19(class107 arg0) {
        arg0.field1847 = 0;
        int var2 = arg0.method2130();
        this.field33 = arg0.method2131();
        this.field40 = arg0.method2131();
        int var3 = -1;
        this.field31 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2130();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2130();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2132();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method500(var4[var5] - 512).field1019;
                    if (var8 != 0) {
                        this.field31 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2130();
            if (var11 < 0 || var11 >= Statics.field1822[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field739 = arg0.method2132();
        if (this.field739 == 65535) {
            this.field739 = -1;
        }
        this.field740 = arg0.method2132();
        if (this.field740 == 65535) {
            this.field740 = -1;
        }
        this.field758 = this.field740;
        this.field742 = arg0.method2132();
        if (this.field742 == 65535) {
            this.field742 = -1;
        }
        this.field761 = arg0.method2132();
        if (this.field761 == 65535) {
            this.field761 = -1;
        }
        this.field789 = arg0.method2132();
        if (this.field789 == 65535) {
            this.field789 = -1;
        }
        this.field765 = arg0.method2132();
        if (this.field765 == 65535) {
            this.field765 = -1;
        }
        this.field746 = arg0.method2132();
        if (this.field746 == 65535) {
            this.field746 = -1;
        }
        this.field32 = arg0.method2138();
        if (Statics.field391 == this) {
            Statics.field2082 = this.field32;
        }
        this.field34 = arg0.method2130();
        this.field48 = arg0.method2132();
        if (this.field38 == null) {
            this.field38 = new class157();
        }
        this.field38.method2944(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("y.z(I)Lcl;")
    public final class98 method15() {
        if (this.field38 == null) {
            return null;
        }
        class38 var1 = this.field785 != -1 && this.field791 == 0 ? class38.method38(this.field785) : null;
        class38 var2 = this.field741 == -1 || this.field47 || this.field741 == this.field739 && var1 != null ? null : class38.method38(this.field741);
        class98 var3 = this.field38.method2950(var1, this.field753, var2, this.field762);
        if (var3 == null) {
            return null;
        }
        var3.method1988();
        this.field767 = var3.field1354;
        if (!this.field47 && this.field774 != -1 && this.field770 != -1) {
            class98 var4 = class39.method3319(this.field774).method714(this.field770);
            if (var4 != null) {
                var4.method2020(0, -this.field764, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field47 && this.field42 != null) {
            if (client.field280 >= this.field36) {
                this.field42 = null;
            }
            if (client.field280 >= this.field44 && client.field280 < this.field36) {
                class98 var6 = this.field42;
                var6.method2020(this.field39 - this.field747, this.field37 - this.field30, this.field41 - this.field735);
                if (this.field783 == 512) {
                    var6.method1993();
                    var6.method1993();
                    var6.method1993();
                } else if (this.field783 == 1024) {
                    var6.method1993();
                    var6.method1993();
                } else if (this.field783 == 1536) {
                    var6.method1993();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field783 == 512) {
                    var6.method1993();
                } else if (this.field783 == 1024) {
                    var6.method1993();
                    var6.method1993();
                } else if (this.field783 == 1536) {
                    var6.method1993();
                    var6.method1993();
                    var6.method1993();
                }
                var6.method2020(this.field747 - this.field39, this.field30 - this.field37, this.field735 - this.field41);
            }
        }
        var3.field1711 = true;
        return var3;
    }

    @ObfuscatedName("y.y(I)Z")
    public final boolean method16() {
        return this.field38 != null;
    }
}

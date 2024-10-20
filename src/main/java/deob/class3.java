package deob;

@ObfuscatedName("e")
public final class class3 extends class35 {

    @ObfuscatedName("e.p")
    public String field39;

    @ObfuscatedName("e.k")
    public class170 field44;

    @ObfuscatedName("e.e")
    public int field33 = -1;

    @ObfuscatedName("e.f")
    public int field34 = -1;

    @ObfuscatedName("e.w")
    public int field35 = 0;

    @ObfuscatedName("e.t")
    public int field36 = 0;

    @ObfuscatedName("e.s")
    public int field37;

    @ObfuscatedName("e.c")
    public int field38 = 0;

    @ObfuscatedName("e.d")
    public int field32 = 0;

    @ObfuscatedName("e.v")
    public int field40;

    @ObfuscatedName("e.m")
    public int field47;

    @ObfuscatedName("e.h")
    public int field45;

    @ObfuscatedName("e.n")
    public class100 field43;

    @ObfuscatedName("e.x")
    public int field31;

    @ObfuscatedName("e.o")
    public int field41;

    @ObfuscatedName("e.r")
    public int field46;

    @ObfuscatedName("e.y")
    public int field42;

    @ObfuscatedName("e.i")
    public boolean field48 = false;

    @ObfuscatedName("e.q")
    public int field49 = 0;

    @ObfuscatedName("e.g")
    public boolean field50 = false;

    @ObfuscatedName("e.p(Lde;I)V")
    public final void method16(class111 arg0) {
        arg0.field1885 = 0;
        int var2 = arg0.method2314();
        this.field33 = arg0.method2176();
        this.field34 = arg0.method2176();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2314();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2314();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2177();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method2450(var4[var5] - 512).field1093;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2314();
            if (var11 < 0 || var11 >= Statics.field1302[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field769 = arg0.method2177();
        if (this.field769 == 65535) {
            this.field769 = -1;
        }
        this.field807 = arg0.method2177();
        if (this.field807 == 65535) {
            this.field807 = -1;
        }
        this.field771 = this.field807;
        this.field783 = arg0.method2177();
        if (this.field783 == 65535) {
            this.field783 = -1;
        }
        this.field806 = arg0.method2177();
        if (this.field806 == 65535) {
            this.field806 = -1;
        }
        this.field774 = arg0.method2177();
        if (this.field774 == 65535) {
            this.field774 = -1;
        }
        this.field812 = arg0.method2177();
        if (this.field812 == 65535) {
            this.field812 = -1;
        }
        this.field776 = arg0.method2177();
        if (this.field776 == 65535) {
            this.field776 = -1;
        }
        this.field39 = arg0.method2265();
        if (Statics.field734 == this) {
            Statics.field2131 = this.field39;
        }
        this.field35 = arg0.method2314();
        this.field36 = arg0.method2177();
        this.field50 = arg0.method2314() == 1;
        if (client.field259 == 0 && client.field427 >= 2) {
            this.field50 = false;
        }
        if (this.field44 == null) {
            this.field44 = new class170();
        }
        this.field44.method3150(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("e.k(I)Lcm;")
    public final class100 method23() {
        if (this.field44 == null) {
            return null;
        }
        class40 var1 = this.field795 != -1 && this.field798 == 0 ? class40.method678(this.field795) : null;
        class40 var2 = this.field792 == -1 || this.field48 || this.field792 == this.field769 && var1 != null ? null : class40.method678(this.field792);
        class100 var3 = this.field44.method3155(var1, this.field765, var2, this.field793);
        if (var3 == null) {
            return null;
        }
        var3.method2053();
        this.field770 = var3.field1390;
        if (!this.field48 && this.field800 != -1 && this.field796 != -1) {
            class100 var4 = class41.method2637(this.field800).method780(this.field796);
            if (var4 != null) {
                var4.method2037(0, -this.field804, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field48 && this.field43 != null) {
            if (client.field267 >= this.field32) {
                this.field43 = null;
            }
            if (client.field267 >= this.field38 && client.field267 < this.field32) {
                class100 var6 = this.field43;
                var6.method2037(this.field40 - this.field773, this.field47 - this.field37, this.field45 - this.field775);
                if (this.field813 == 512) {
                    var6.method2033();
                    var6.method2033();
                    var6.method2033();
                } else if (this.field813 == 1024) {
                    var6.method2033();
                    var6.method2033();
                } else if (this.field813 == 1536) {
                    var6.method2033();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field813 == 512) {
                    var6.method2033();
                } else if (this.field813 == 1024) {
                    var6.method2033();
                    var6.method2033();
                } else if (this.field813 == 1536) {
                    var6.method2033();
                    var6.method2033();
                    var6.method2033();
                }
                var6.method2037(this.field773 - this.field40, this.field37 - this.field47, this.field775 - this.field45);
            }
        }
        var3.field1755 = true;
        return var3;
    }

    @ObfuscatedName("e.e(S)Z")
    public final boolean method18() {
        return this.field44 != null;
    }
}

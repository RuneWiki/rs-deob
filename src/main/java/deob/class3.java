package deob;

@ObfuscatedName("h")
public final class class3 extends class35 {

    @ObfuscatedName("h.q")
    public String field37;

    @ObfuscatedName("h.s")
    public class169 field29;

    @ObfuscatedName("h.h")
    public int field30 = -1;

    @ObfuscatedName("h.e")
    public int field31 = -1;

    @ObfuscatedName("h.n")
    public int field32 = 0;

    @ObfuscatedName("h.t")
    public int field33 = 0;

    @ObfuscatedName("h.l")
    public int field34;

    @ObfuscatedName("h.m")
    public int field35 = 0;

    @ObfuscatedName("h.o")
    public int field36 = 0;

    @ObfuscatedName("h.k")
    public int field46;

    @ObfuscatedName("h.p")
    public int field28;

    @ObfuscatedName("h.u")
    public int field39;

    @ObfuscatedName("h.g")
    public class100 field40;

    @ObfuscatedName("h.a")
    public int field48;

    @ObfuscatedName("h.y")
    public int field42;

    @ObfuscatedName("h.d")
    public int field43;

    @ObfuscatedName("h.b")
    public int field44;

    @ObfuscatedName("h.j")
    public boolean field45 = false;

    @ObfuscatedName("h.f")
    public int field41 = 0;

    @ObfuscatedName("h.w")
    public boolean field47 = false;

    @ObfuscatedName("h.q(Ldx;I)V")
    public final void method13(class111 arg0) {
        arg0.field1852 = 0;
        int var2 = arg0.method2231();
        this.field30 = arg0.method2149();
        this.field31 = arg0.method2149();
        int var3 = -1;
        this.field41 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2231();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2231();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2307();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method832(var4[var5] - 512).field1039;
                    if (var8 != 0) {
                        this.field41 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2231();
            if (var11 < 0 || var11 >= Statics.field2758[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field745 = arg0.method2307();
        if (this.field745 == 65535) {
            this.field745 = -1;
        }
        this.field746 = arg0.method2307();
        if (this.field746 == 65535) {
            this.field746 = -1;
        }
        this.field747 = this.field746;
        this.field748 = arg0.method2307();
        if (this.field748 == 65535) {
            this.field748 = -1;
        }
        this.field749 = arg0.method2307();
        if (this.field749 == 65535) {
            this.field749 = -1;
        }
        this.field750 = arg0.method2307();
        if (this.field750 == 65535) {
            this.field750 = -1;
        }
        this.field800 = arg0.method2307();
        if (this.field800 == 65535) {
            this.field800 = -1;
        }
        this.field742 = arg0.method2307();
        if (this.field742 == 65535) {
            this.field742 = -1;
        }
        this.field37 = arg0.method2156();
        if (Statics.field393 == this) {
            Statics.field2070 = this.field37;
        }
        this.field32 = arg0.method2231();
        this.field33 = arg0.method2307();
        this.field47 = arg0.method2231() == 1;
        if (client.field382 == 0 && client.field435 >= 2) {
            this.field47 = false;
        }
        if (this.field29 == null) {
            this.field29 = new class169();
        }
        this.field29.method3032(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("h.s(B)Lch;")
    public final class100 method14() {
        if (this.field29 == null) {
            return null;
        }
        class40 var1 = this.field783 != -1 && this.field789 == 0 ? class40.method575(this.field783) : null;
        class40 var2 = this.field774 == -1 || this.field45 || this.field774 == this.field745 && var1 != null ? null : class40.method575(this.field774);
        class100 var3 = this.field29.method3020(var1, this.field773, var2, this.field770);
        if (var3 == null) {
            return null;
        }
        var3.method1995();
        this.field790 = var3.field1355;
        if (!this.field45 && this.field777 != -1 && this.field778 != -1) {
            class100 var4 = class41.method535(this.field777).method755(this.field778);
            if (var4 != null) {
                var4.method2026(0, -this.field772, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field45 && this.field40 != null) {
            if (client.field275 >= this.field36) {
                this.field40 = null;
            }
            if (client.field275 >= this.field35 && client.field275 < this.field36) {
                class100 var6 = this.field40;
                var6.method2026(this.field46 - this.field754, this.field28 - this.field34, this.field39 - this.field787);
                if (this.field740 == 512) {
                    var6.method2011();
                    var6.method2011();
                    var6.method2011();
                } else if (this.field740 == 1024) {
                    var6.method2011();
                    var6.method2011();
                } else if (this.field740 == 1536) {
                    var6.method2011();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field740 == 512) {
                    var6.method2011();
                } else if (this.field740 == 1024) {
                    var6.method2011();
                    var6.method2011();
                } else if (this.field740 == 1536) {
                    var6.method2011();
                    var6.method2011();
                    var6.method2011();
                }
                var6.method2026(this.field754 - this.field46, this.field34 - this.field28, this.field787 - this.field39);
            }
        }
        var3.field1722 = true;
        return var3;
    }

    @ObfuscatedName("h.h(B)Z")
    public final boolean method15() {
        return this.field29 != null;
    }
}

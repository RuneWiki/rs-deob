package deob;

@ObfuscatedName("gi")
public final class class183 extends class179 {

    @ObfuscatedName("gi.bt")
    public String field2792;

    @ObfuscatedName("gi.by")
    public class94 field2794;

    @ObfuscatedName("gi.bs")
    public int field2788 = -1;

    @ObfuscatedName("gi.bq")
    public int field2802 = -1;

    @ObfuscatedName("gi.bd")
    public int field2790 = 0;

    @ObfuscatedName("gi.bx")
    public int field2791 = 0;

    @ObfuscatedName("gi.bm")
    public int field2789;

    @ObfuscatedName("gi.bv")
    public int field2793 = 0;

    @ObfuscatedName("gi.bb")
    public int field2804 = 0;

    @ObfuscatedName("gi.br")
    public int field2795;

    @ObfuscatedName("gi.ba")
    public int field2796;

    @ObfuscatedName("gi.bl")
    public int field2797;

    @ObfuscatedName("gi.bo")
    public class181 field2798;

    @ObfuscatedName("gi.bh")
    public int field2799;

    @ObfuscatedName("gi.cr")
    public int field2800;

    @ObfuscatedName("gi.ch")
    public int field2801;

    @ObfuscatedName("gi.cc")
    public int field2786;

    @ObfuscatedName("gi.cf")
    public boolean field2803 = false;

    @ObfuscatedName("gi.cg")
    public int field2787 = 0;

    @ObfuscatedName("gi.ar(Let;I)V")
    public final void method3073(class136 arg0) {
        arg0.field1722 = 0;
        int var2 = arg0.method1602();
        this.field2788 = arg0.method1603();
        this.field2802 = arg0.method1603();
        int var3 = -1;
        this.field2787 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method1602();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method1602();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method1712();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class162.method768(var4[var5] - 512).field2438;
                    if (var8 != 0) {
                        this.field2787 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method1602();
            if (var11 < 0 || var11 >= Statics.field1239[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field2619 = arg0.method1712();
        if (this.field2619 == 65535) {
            this.field2619 = -1;
        }
        this.field2620 = arg0.method1712();
        if (this.field2620 == 65535) {
            this.field2620 = -1;
        }
        this.field2621 = this.field2620;
        this.field2622 = arg0.method1712();
        if (this.field2622 == 65535) {
            this.field2622 = -1;
        }
        this.field2668 = arg0.method1712();
        if (this.field2668 == 65535) {
            this.field2668 = -1;
        }
        this.field2624 = arg0.method1712();
        if (this.field2624 == 65535) {
            this.field2624 = -1;
        }
        this.field2625 = arg0.method1712();
        if (this.field2625 == 65535) {
            this.field2625 = -1;
        }
        this.field2626 = arg0.method1712();
        if (this.field2626 == 65535) {
            this.field2626 = -1;
        }
        this.field2792 = arg0.method1610();
        if (Statics.field1230 == this) {
            Statics.field2497 = this.field2792;
        }
        this.field2790 = arg0.method1602();
        this.field2791 = arg0.method1712();
        if (this.field2794 == null) {
            this.field2794 = new class94();
        }
        this.field2794.method1149(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("gi.u(S)Lfb;")
    public final class181 method2641() {
        if (this.field2794 == null) {
            return null;
        }
        class156 var1 = this.field2644 != -1 && this.field2647 == 0 ? class156.method482(this.field2644) : null;
        class156 var2 = this.field2641 == -1 || this.field2803 || this.field2641 == this.field2619 && var1 != null ? null : class156.method482(this.field2641);
        class181 var3 = this.field2794.method1146(var1, this.field2631, var2, this.field2639);
        if (var3 == null) {
            return null;
        }
        var3.method3001();
        this.field2662 = var3.field2489;
        if (!this.field2803 && this.field2623 != -1 && this.field2650 != -1) {
            class181 var4 = class157.method404(this.field2623).method2453(this.field2650);
            if (var4 != null) {
                var4.method3014(0, -this.field2614, 0);
                class181[] var5 = new class181[] { var3, var4 };
                var3 = new class181(var5, 2);
            }
        }
        if (!this.field2803 && this.field2798 != null) {
            if (client.field1919 >= this.field2804) {
                this.field2798 = null;
            }
            if (client.field1919 >= this.field2793 && client.field1919 < this.field2804) {
                class181 var6 = this.field2798;
                var6.method3014(this.field2795 - this.field2630, this.field2796 - this.field2789, this.field2797 - this.field2615);
                if (this.field2670 == 512) {
                    var6.method3009();
                    var6.method3009();
                    var6.method3009();
                } else if (this.field2670 == 1024) {
                    var6.method3009();
                    var6.method3009();
                } else if (this.field2670 == 1536) {
                    var6.method3009();
                }
                class181[] var7 = new class181[] { var3, var6 };
                var3 = new class181(var7, 2);
                if (this.field2670 == 512) {
                    var6.method3009();
                } else if (this.field2670 == 1024) {
                    var6.method3009();
                    var6.method3009();
                } else if (this.field2670 == 1536) {
                    var6.method3009();
                    var6.method3009();
                    var6.method3009();
                }
                var6.method3014(this.field2630 - this.field2795, this.field2789 - this.field2796, this.field2615 - this.field2797);
            }
        }
        var3.field2777 = true;
        return var3;
    }

    @ObfuscatedName("gi.z(B)Z")
    public final boolean method2909() {
        return this.field2794 != null;
    }
}

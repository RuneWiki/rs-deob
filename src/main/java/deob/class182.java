package deob;

@ObfuscatedName("fl")
public final class class182 extends class178 {

    @ObfuscatedName("fl.bd")
    public String field2797;

    @ObfuscatedName("fl.bo")
    public class93 field2792;

    @ObfuscatedName("fl.bi")
    public int field2787 = -1;

    @ObfuscatedName("fl.bu")
    public int field2788 = -1;

    @ObfuscatedName("fl.bt")
    public int field2789 = 0;

    @ObfuscatedName("fl.br")
    public int field2800 = 0;

    @ObfuscatedName("fl.bp")
    public int field2791;

    @ObfuscatedName("fl.bw")
    public int field2786 = 0;

    @ObfuscatedName("fl.bg")
    public int field2793 = 0;

    @ObfuscatedName("fl.bv")
    public int field2794;

    @ObfuscatedName("fl.by")
    public int field2795;

    @ObfuscatedName("fl.bb")
    public int field2796;

    @ObfuscatedName("fl.bc")
    public class180 field2790;

    @ObfuscatedName("fl.bm")
    public int field2798;

    @ObfuscatedName("fl.cl")
    public int field2799;

    @ObfuscatedName("fl.cp")
    public int field2785;

    @ObfuscatedName("fl.cb")
    public int field2801;

    @ObfuscatedName("fl.cd")
    public boolean field2802 = false;

    @ObfuscatedName("fl.cj")
    public int field2803 = 0;

    @ObfuscatedName("fl.y(Lec;I)V")
    public final void method3034(class135 arg0) {
        arg0.field1722 = 0;
        int var2 = arg0.method1571();
        this.field2787 = arg0.method1572();
        this.field2788 = arg0.method1572();
        int var3 = -1;
        this.field2803 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method1571();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method1571();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method1725();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class161.method2496(var4[var5] - 512).field2469;
                    if (var8 != 0) {
                        this.field2803 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method1571();
            if (var11 < 0 || var11 >= Statics.field1225[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field2618 = arg0.method1725();
        if (this.field2618 == 65535) {
            this.field2618 = -1;
        }
        this.field2656 = arg0.method1725();
        if (this.field2656 == 65535) {
            this.field2656 = -1;
        }
        this.field2655 = this.field2656;
        this.field2621 = arg0.method1725();
        if (this.field2621 == 65535) {
            this.field2621 = -1;
        }
        this.field2622 = arg0.method1725();
        if (this.field2622 == 65535) {
            this.field2622 = -1;
        }
        this.field2664 = arg0.method1725();
        if (this.field2664 == 65535) {
            this.field2664 = -1;
        }
        this.field2617 = arg0.method1725();
        if (this.field2617 == 65535) {
            this.field2617 = -1;
        }
        this.field2625 = arg0.method1725();
        if (this.field2625 == 65535) {
            this.field2625 = -1;
        }
        this.field2797 = arg0.method1716();
        if (Statics.field1127 == this) {
            Statics.field2495 = this.field2797;
        }
        this.field2789 = arg0.method1571();
        this.field2800 = arg0.method1725();
        if (this.field2792 == null) {
            this.field2792 = new class93();
        }
        this.field2792.method1130(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("fl.e(I)Lfr;")
    public final class180 method2628() {
        if (this.field2792 == null) {
            return null;
        }
        class155 var1 = this.field2643 != -1 && this.field2620 == 0 ? class155.method2497(this.field2643) : null;
        class155 var2 = this.field2613 == -1 || this.field2802 || this.field2618 == this.field2613 && var1 != null ? null : class155.method2497(this.field2613);
        class180 var3 = this.field2792.method1138(var1, this.field2644, var2, this.field2641);
        if (var3 == null) {
            return null;
        }
        var3.method2977();
        this.field2654 = var3.field2484;
        if (!this.field2802 && this.field2640 != -1 && this.field2619 != -1) {
            class180 var4 = class156.method1555(this.field2640).method2416(this.field2619);
            if (var4 != null) {
                var4.method2987(0, -this.field2652, 0);
                class180[] var5 = new class180[] { var3, var4 };
                var3 = new class180(var5, 2);
            }
        }
        if (!this.field2802 && this.field2790 != null) {
            if (client.field1917 >= this.field2793) {
                this.field2790 = null;
            }
            if (client.field1917 >= this.field2786 && client.field1917 < this.field2793) {
                class180 var6 = this.field2790;
                var6.method2987(this.field2794 - this.field2642, this.field2795 - this.field2791, this.field2796 - this.field2614);
                if (this.field2662 == 512) {
                    var6.method2992();
                    var6.method2992();
                    var6.method2992();
                } else if (this.field2662 == 1024) {
                    var6.method2992();
                    var6.method2992();
                } else if (this.field2662 == 1536) {
                    var6.method2992();
                }
                class180[] var7 = new class180[] { var3, var6 };
                var3 = new class180(var7, 2);
                if (this.field2662 == 512) {
                    var6.method2992();
                } else if (this.field2662 == 1024) {
                    var6.method2992();
                    var6.method2992();
                } else if (this.field2662 == 1536) {
                    var6.method2992();
                    var6.method2992();
                    var6.method2992();
                }
                var6.method2987(this.field2642 - this.field2794, this.field2791 - this.field2795, this.field2614 - this.field2796);
            }
        }
        var3.field2744 = true;
        return var3;
    }

    @ObfuscatedName("fl.m(B)Z")
    public final boolean method2900() {
        return this.field2792 != null;
    }
}

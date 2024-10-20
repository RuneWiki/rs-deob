package deob;

@ObfuscatedName("ft")
public final class class177 extends class165 {

    @ObfuscatedName("ft.l")
    public int field2609;

    @ObfuscatedName("ft.i")
    public int field2604;

    @ObfuscatedName("ft.e")
    public int field2605;

    @ObfuscatedName("ft.a")
    public int field2606;

    @ObfuscatedName("ft.g")
    public int field2612;

    @ObfuscatedName("ft.w")
    public int field2608;

    @ObfuscatedName("ft.v")
    public class155 field2607;

    @ObfuscatedName("ft.u")
    public int field2610 = 0;

    @ObfuscatedName("ft.m")
    public int field2611 = 0;

    @ObfuscatedName("ft.b")
    public boolean field2603 = false;

    public class177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2609 = arg0;
        this.field2605 = arg1;
        this.field2606 = arg2;
        this.field2612 = arg3;
        this.field2608 = arg4;
        this.field2604 = arg5 + arg6;
        int var8 = class156.method1555(this.field2609).field2377;
        if (var8 == -1) {
            this.field2603 = true;
        } else {
            this.field2603 = false;
            this.field2607 = class155.method2497(var8);
        }
    }

    @ObfuscatedName("ft.w(IB)V")
    public final void method2894(int arg0) {
        if (this.field2603) {
            return;
        }
        this.field2611 += arg0;
        while (this.field2611 > this.field2607.field2359[this.field2610]) {
            this.field2611 -= this.field2607.field2359[this.field2610];
            this.field2610++;
            if (this.field2610 >= this.field2607.field2369.length) {
                this.field2603 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ft.e(I)Lfr;")
    public final class180 method2628() {
        class156 var1 = class156.method1555(this.field2609);
        class180 var2;
        if (this.field2603) {
            var2 = var1.method2416(-1);
        } else {
            var2 = var1.method2416(this.field2610);
        }
        return var2 == null ? null : var2;
    }
}

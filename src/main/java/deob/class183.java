package deob;

@ObfuscatedName("gv")
public final class class183 extends class178 {

    @ObfuscatedName("gv.bd")
    public class152 field2804;

    @ObfuscatedName("gv.e(I)Lfr;")
    public final class180 method2628() {
        if (this.field2804 == null) {
            return null;
        }
        class155 var1 = this.field2643 != -1 && this.field2620 == 0 ? class155.method2497(this.field2643) : null;
        class155 var2 = this.field2613 == -1 || this.field2618 == this.field2613 && var1 != null ? null : class155.method2497(this.field2613);
        class180 var3 = this.field2804.method2314(var1, this.field2644, var2, this.field2641);
        if (var3 == null) {
            return null;
        }
        var3.method2977();
        this.field2654 = var3.field2484;
        if (this.field2640 != -1 && this.field2619 != -1) {
            class180 var4 = class156.method1555(this.field2640).method2416(this.field2619);
            if (var4 != null) {
                var4.method2987(0, -this.field2652, 0);
                class180[] var5 = new class180[] { var3, var4 };
                var3 = new class180(var5, 2);
            }
        }
        if (this.field2804.field2271 == 1) {
            var3.field2744 = true;
        }
        return var3;
    }

    @ObfuscatedName("gv.m(B)Z")
    public final boolean method2900() {
        return this.field2804 != null;
    }
}

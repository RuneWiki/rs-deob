package deob;

@ObfuscatedName("ge")
public final class class183 extends class178 {

    @ObfuscatedName("ge.bu")
    public class152 field2804;

    @ObfuscatedName("ge.g(I)Lfo;")
    public final class180 method2643() {
        if (this.field2804 == null) {
            return null;
        }
        class155 var1 = this.field2643 != -1 && this.field2627 == 0 ? class155.method104(this.field2643) : null;
        class155 var2 = this.field2640 == -1 || this.field2640 == this.field2622 && var1 != null ? null : class155.method104(this.field2640);
        class180 var3 = this.field2804.method2330(var1, this.field2653, var2, this.field2641);
        if (var3 == null) {
            return null;
        }
        var3.method3002();
        this.field2626 = var3.field2487;
        if (this.field2648 != -1 && this.field2649 != -1) {
            class180 var4 = class156.method1133(this.field2648).method2455(this.field2649);
            if (var4 != null) {
                var4.method3012(0, -this.field2629, 0);
                class180[] var5 = new class180[] { var3, var4 };
                var3 = new class180(var5, 2);
            }
        }
        if (this.field2804.field2283 == 1) {
            var3.field2744 = true;
        }
        return var3;
    }

    @ObfuscatedName("ge.f(I)Z")
    public final boolean method2915() {
        return this.field2804 != null;
    }
}

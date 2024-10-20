package deob;

@ObfuscatedName("n")
public final class class66 extends class164 {

    @ObfuscatedName("n.v")
    public class184 field971;

    @ObfuscatedName("n.c(I)Ldk;")
    public final class43 method908() {
        if (this.field971 == null) {
            return null;
        }
        class165 var1 = this.field2483 != -1 && this.field2470 == 0 ? class165.method3233(this.field2483) : null;
        class165 var2 = this.field2480 == -1 || this.field2480 == this.field2459 && var1 != null ? null : class165.method3233(this.field2480);
        class43 var3 = this.field971.method3437(var1, this.field2477, var2, this.field2481);
        if (var3 == null) {
            return null;
        }
        var3.method778();
        this.field2501 = var3.field1455;
        if (this.field2488 != -1 && this.field2475 != -1) {
            class43 var4 = class173.method1223(this.field2488).method3134(this.field2475);
            if (var4 != null) {
                var4.method786(0, -this.field2471, 0);
                class43[] var5 = new class43[] { var3, var4 };
                var3 = new class43(var5, 2);
            }
        }
        if (this.field971.field2829 == 1) {
            var3.field489 = true;
        }
        return var3;
    }

    @ObfuscatedName("n.b(I)Z")
    public final boolean method944() {
        return this.field971 != null;
    }
}

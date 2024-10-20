package deob;

@ObfuscatedName("c")
public final class class62 extends class179 {

    @ObfuscatedName("c.b")
    public class171 field678;

    @ObfuscatedName("c.h(I)Ldu;")
    public final class27 method1087() {
        if (this.field678 == null) {
            return null;
        }
        class173 var1 = this.field2692 != -1 && this.field2695 == 0 ? class173.method3098(this.field2692) : null;
        class173 var2 = this.field2689 == -1 || this.field2689 == this.field2668 && var1 != null ? null : class173.method3098(this.field2689);
        class27 var3 = this.field678.method2955(var1, this.field2693, var2, this.field2690);
        if (var3 == null) {
            return null;
        }
        var3.method389();
        this.field2710 = var3.field2207;
        if (this.field2697 != -1 && this.field2698 != -1) {
            class27 var4 = class184.method1375(this.field2697).method3339(this.field2698);
            if (var4 != null) {
                var4.method406(0, -this.field2709, 0);
                class27[] var5 = new class27[] { var3, var4 };
                var3 = new class27(var5, 2);
            }
        }
        if (this.field678.field2563 == 1) {
            var3.field291 = true;
        }
        return var3;
    }

    @ObfuscatedName("c.k(I)Z")
    public final boolean method1095() {
        return this.field678 != null;
    }
}

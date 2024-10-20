package deob;

@ObfuscatedName("y")
public final class class25 extends class27 {

    @ObfuscatedName("y.i")
    public class31 field396;

    @ObfuscatedName("y.w(I)Ldb;")
    public final class112 method17() {
        if (this.field396 == null) {
            return null;
        }
        class34 var1 = this.field451 != -1 && this.field454 == 0 ? class34.method235(this.field451) : null;
        class34 var2 = this.field474 == -1 || this.field474 == this.field427 && var1 != null ? null : class34.method235(this.field474);
        class112 var3 = this.field396.method620(var1, this.field452, var2, this.field465);
        if (var3 == null) {
            return null;
        }
        var3.method2244();
        this.field469 = var3.field1548;
        if (this.field456 != -1 && this.field475 != -1) {
            class112 var4 = class35.method633(this.field456).method743(this.field475);
            if (var4 != null) {
                var4.method2264(0, -this.field431, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field396.field785 == 1) {
            var3.field1889 = true;
        }
        return var3;
    }

    @ObfuscatedName("y.f(B)Z")
    public final boolean method26() {
        return this.field396 != null;
    }
}

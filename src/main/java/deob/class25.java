package deob;

@ObfuscatedName("j")
public final class class25 extends class27 {

    @ObfuscatedName("j.q")
    public class31 field387;

    @ObfuscatedName("j.c(I)Ldn;")
    public final class112 method17() {
        if (this.field387 == null) {
            return null;
        }
        class34 var1 = this.field437 != -1 && this.field440 == 0 ? class34.method2178(this.field437) : null;
        class34 var2 = this.field452 == -1 || this.field452 == this.field432 && var1 != null ? null : class34.method2178(this.field452);
        class112 var3 = this.field387.method629(var1, this.field438, var2, this.field435);
        if (var3 == null) {
            return null;
        }
        var3.method2213();
        this.field455 = var3.field1555;
        if (this.field442 != -1 && this.field466 != -1) {
            class112 var4 = class35.method131(this.field442).method742(this.field466);
            if (var4 != null) {
                var4.method2223(0, -this.field446, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field387.field781 == 1) {
            var3.field1863 = true;
        }
        return var3;
    }

    @ObfuscatedName("j.p(S)Z")
    public final boolean method21() {
        return this.field387 != null;
    }
}

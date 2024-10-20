package deob;

@ObfuscatedName("q")
public final class class25 extends class27 {

    @ObfuscatedName("q.p")
    public class31 field367;

    @ObfuscatedName("q.l(I)Ldl;")
    public final class112 method9() {
        if (this.field367 == null) {
            return null;
        }
        class34 var1 = this.field403 != -1 && this.field410 == 0 ? class34.method93(this.field403) : null;
        class34 var2 = this.field424 == -1 || this.field424 == this.field398 && var1 != null ? null : class34.method93(this.field424);
        class112 var3 = this.field367.method606(var1, this.field423, var2, this.field420);
        if (var3 == null) {
            return null;
        }
        var3.method2274();
        this.field440 = var3.field1546;
        if (this.field427 != -1 && this.field422 != -1) {
            class112 var4 = class35.method144(this.field427).method747(this.field422);
            if (var4 != null) {
                var4.method2283(0, -this.field431, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field367.field786 == 1) {
            var3.field1877 = true;
        }
        return var3;
    }

    @ObfuscatedName("q.d(B)Z")
    public final boolean method14() {
        return this.field367 != null;
    }
}

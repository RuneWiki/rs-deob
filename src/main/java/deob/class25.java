package deob;

@ObfuscatedName("e")
public final class class25 extends class27 {

    @ObfuscatedName("e.b")
    public class31 field396;

    @ObfuscatedName("e.c(I)Ldr;")
    public final class112 method13() {
        if (this.field396 == null) {
            return null;
        }
        class34 var1 = this.field448 != -1 && this.field451 == 0 ? Statics.method61(this.field448) : null;
        class34 var2 = this.field445 == -1 || this.field445 == this.field424 && var1 != null ? null : Statics.method61(this.field445);
        class112 var3 = this.field396.method592(var1, this.field425, var2, this.field446);
        if (var3 == null) {
            return null;
        }
        var3.method2196();
        this.field466 = var3.field1572;
        if (this.field453 != -1 && this.field454 != -1) {
            class112 var4 = class35.method216(this.field453).method731(this.field454);
            if (var4 != null) {
                var4.method2205(0, -this.field457, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field396.field781 == 1) {
            var3.field1895 = true;
        }
        return var3;
    }

    @ObfuscatedName("e.j(I)Z")
    public final boolean method14() {
        return this.field396 != null;
    }
}

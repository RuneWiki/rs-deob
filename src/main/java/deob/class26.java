package deob;

@ObfuscatedName("j")
public final class class26 extends class28 {

    @ObfuscatedName("j.i")
    public class32 field400;

    @ObfuscatedName("j.b(I)Ldt;")
    public final class113 method26() {
        if (this.field400 == null) {
            return null;
        }
        class35 var1 = this.field459 != -1 && this.field451 == 0 ? class35.method708(this.field459) : null;
        class35 var2 = this.field445 == -1 || this.field445 == this.field423 && var1 != null ? null : class35.method708(this.field445);
        class113 var3 = this.field400.method626(var1, this.field449, var2, this.field461);
        if (var3 == null) {
            return null;
        }
        var3.method2271();
        this.field434 = var3.field1564;
        if (this.field453 != -1 && this.field454 != -1) {
            class113 var4 = Statics.method623(this.field453).method756(this.field454);
            if (var4 != null) {
                var4.method2270(0, -this.field457, 0);
                class113[] var5 = new class113[] { var3, var4 };
                var3 = new class113(var5, 2);
            }
        }
        if (this.field400.field792 == 1) {
            var3.field1888 = true;
        }
        return var3;
    }

    @ObfuscatedName("j.r(B)Z")
    public final boolean method14() {
        return this.field400 != null;
    }
}

package deob;

@ObfuscatedName("ab")
public final class class30 extends class33 {

    @ObfuscatedName("ab.e")
    public class35 field712;

    @ObfuscatedName("ab.o(B)Lcd;")
    public final class98 method21() {
        if (this.field712 == null) {
            return null;
        }
        class38 var1 = this.field773 != -1 && this.field772 == 0 ? class38.method131(this.field773) : null;
        class38 var2 = this.field770 == -1 || this.field770 == this.field748 && var1 != null ? null : class38.method131(this.field770);
        class98 var3 = this.field712.method601(var1, this.field774, var2, this.field771);
        if (var3 == null) {
            return null;
        }
        var3.method1923();
        this.field791 = var3.field1353;
        if (this.field763 != -1 && this.field779 != -1) {
            class98 var4 = class39.method147(this.field763).method740(this.field779);
            if (var4 != null) {
                var4.method1937(0, -this.field782, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field712.field812 == 1) {
            var3.field1720 = true;
        }
        return var3;
    }

    @ObfuscatedName("ab.y(I)Z")
    public final boolean method22() {
        return this.field712 != null;
    }
}

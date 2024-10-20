package deob;

@ObfuscatedName("aj")
public final class class32 extends class35 {

    @ObfuscatedName("aj.n")
    public class37 field743;

    @ObfuscatedName("aj.o(I)Lcp;")
    public final class100 method13() {
        if (this.field743 == null) {
            return null;
        }
        class40 var1 = this.field804 != -1 && this.field785 == 0 ? Statics.method860(this.field804) : null;
        class40 var2 = this.field824 == -1 || this.field824 == this.field777 && var1 != null ? null : Statics.method860(this.field824);
        class100 var3 = this.field743.method667(var1, this.field805, var2, this.field802);
        if (var3 == null) {
            return null;
        }
        var3.method2080();
        this.field822 = var3.field1392;
        if (this.field809 != -1 && this.field810 != -1) {
            class100 var4 = class41.method493(this.field809).method793(this.field810);
            if (var4 != null) {
                var4.method2098(0, -this.field813, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field743.field852 == 1) {
            var3.field1745 = true;
        }
        return var3;
    }

    @ObfuscatedName("aj.a(I)Z")
    public final boolean method20() {
        return this.field743 != null;
    }
}

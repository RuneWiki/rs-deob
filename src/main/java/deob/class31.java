package deob;

@ObfuscatedName("ae")
public final class class31 extends class34 {

    @ObfuscatedName("ae.a")
    public class36 field707;

    @ObfuscatedName("ae.v(I)Lcl;")
    public final class99 method24() {
        if (this.field707 == null) {
            return null;
        }
        class39 var1 = this.field766 != -1 && this.field769 == 0 ? Statics.method97(this.field766) : null;
        class39 var2 = this.field763 == -1 || this.field763 == this.field740 && var1 != null ? null : Statics.method97(this.field763);
        class99 var3 = this.field707.method633(var1, this.field767, var2, this.field737);
        if (var3 == null) {
            return null;
        }
        var3.method1980();
        this.field784 = var3.field1356;
        if (this.field794 != -1 && this.field772 != -1) {
            class99 var4 = class40.method1765(this.field794).method768(this.field772);
            if (var4 != null) {
                var4.method2008(0, -this.field775, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (this.field707.field820 == 1) {
            var3.field1722 = true;
        }
        return var3;
    }

    @ObfuscatedName("ae.i(I)Z")
    public final boolean method15() {
        return this.field707 != null;
    }
}

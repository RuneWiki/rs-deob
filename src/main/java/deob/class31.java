package deob;

@ObfuscatedName("az")
public final class class31 extends class34 {

    @ObfuscatedName("az.l")
    public class36 field687;

    @ObfuscatedName("az.y(I)Lck;")
    public final class99 method23() {
        if (this.field687 == null) {
            return null;
        }
        class39 var1 = this.field760 != -1 && this.field753 == 0 ? class39.method821(this.field760) : null;
        class39 var2 = this.field728 == -1 || this.field728 == this.field724 && var1 != null ? null : class39.method821(this.field728);
        class99 var3 = this.field687.method641(var1, this.field751, var2, this.field748);
        if (var3 == null) {
            return null;
        }
        var3.method2064();
        this.field778 = var3.field1340;
        if (this.field755 != -1 && this.field756 != -1) {
            class99 var4 = Statics.method503(this.field755).method752(this.field756);
            if (var4 != null) {
                var4.method2060(0, -this.field759, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (this.field687.field794 == 1) {
            var3.field1703 = true;
        }
        return var3;
    }

    @ObfuscatedName("az.g(B)Z")
    public final boolean method16() {
        return this.field687 != null;
    }
}

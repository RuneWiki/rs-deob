package deob;

@ObfuscatedName("at")
public final class class31 extends class34 {

    @ObfuscatedName("at.v")
    public class36 field695;

    @ObfuscatedName("at.t(I)Lcy;")
    public final class99 method11() {
        if (this.field695 == null) {
            return null;
        }
        class39 var1 = this.field764 != -1 && this.field736 == 0 ? class39.method682(this.field764) : null;
        class39 var2 = this.field734 == -1 || this.field772 == this.field734 && var1 != null ? null : class39.method682(this.field734);
        class99 var3 = this.field695.method625(var1, this.field765, var2, this.field762);
        if (var3 == null) {
            return null;
        }
        var3.method2006();
        this.field782 = var3.field1355;
        if (this.field769 != -1 && this.field750 != -1) {
            class99 var4 = class40.method2864(this.field769).method754(this.field750);
            if (var4 != null) {
                var4.method2001(0, -this.field787, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (this.field695.field806 == 1) {
            var3.field1710 = true;
        }
        return var3;
    }

    @ObfuscatedName("at.f(I)Z")
    public final boolean method12() {
        return this.field695 != null;
    }
}

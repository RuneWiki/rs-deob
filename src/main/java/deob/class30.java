package deob;

@ObfuscatedName("az")
public final class class30 extends class33 {

    @ObfuscatedName("az.b")
    public class35 field692;

    @ObfuscatedName("az.u(I)Lcu;")
    public final class98 method19() {
        if (this.field692 == null) {
            return null;
        }
        class38 var1 = this.field756 != -1 && this.field781 == 0 ? Statics.method484(this.field756) : null;
        class38 var2 = this.field759 == -1 || this.field759 == this.field730 && var1 != null ? null : Statics.method484(this.field759);
        class98 var3 = this.field692.method635(var1, this.field757, var2, this.field754);
        if (var3 == null) {
            return null;
        }
        var3.method1989();
        this.field774 = var3.field1346;
        if (this.field761 != -1 && this.field750 != -1) {
            class98 var4 = class39.method1(this.field761).method733(this.field750);
            if (var4 != null) {
                var4.method1999(0, -this.field765, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (this.field692.field825 == 1) {
            var3.field1738 = true;
        }
        return var3;
    }

    @ObfuscatedName("az.x(I)Z")
    public final boolean method12() {
        return this.field692 != null;
    }
}

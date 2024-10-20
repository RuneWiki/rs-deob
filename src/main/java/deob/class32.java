package deob;

@ObfuscatedName("am")
public final class class32 extends class35 {

    @ObfuscatedName("am.e")
    public class37 field691;

    @ObfuscatedName("am.a(I)Lcy;")
    public final class100 method30() {
        if (this.field691 == null) {
            return null;
        }
        class40 var1 = this.field782 != -1 && this.field756 == 0 ? class40.method1826(this.field782) : null;
        class40 var2 = this.field750 == -1 || this.field761 == this.field750 && var1 != null ? null : class40.method1826(this.field750);
        class100 var3 = this.field691.method648(var1, this.field754, var2, this.field751);
        if (var3 == null) {
            return null;
        }
        var3.method2051();
        this.field771 = var3.field1324;
        if (this.field774 != -1 && this.field759 != -1) {
            class100 var4 = class41.method2784(this.field774).method776(this.field759);
            if (var4 != null) {
                var4.method2030(0, -this.field747, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field691.field796 == 1) {
            var3.field1706 = true;
        }
        return var3;
    }

    @ObfuscatedName("am.l(I)Z")
    public final boolean method25() {
        return this.field691 != null;
    }
}

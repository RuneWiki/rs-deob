package deob;

@ObfuscatedName("t")
public final class class24 extends class26 {

    @ObfuscatedName("t.p")
    public class30 field388;

    @ObfuscatedName("t.j(I)Ldm;")
    public final class111 method19() {
        if (this.field388 == null) {
            return null;
        }
        class33 var1 = this.field439 != -1 && this.field418 == 0 ? class33.method751(this.field439) : null;
        class33 var2 = this.field436 == -1 || this.field436 == this.field410 && var1 != null ? null : class33.method751(this.field436);
        class111 var3 = this.field388.method559(var1, this.field440, var2, this.field437);
        if (var3 == null) {
            return null;
        }
        var3.method2184();
        this.field430 = var3.field1558;
        if (this.field444 != -1 && this.field445 != -1) {
            class111 var4 = class34.method7(this.field444).method713(this.field445);
            if (var4 != null) {
                var4.method2183(0, -this.field455, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (this.field388.field781 == 1) {
            var3.field1891 = true;
        }
        return var3;
    }

    @ObfuscatedName("t.w(B)Z")
    public final boolean method18() {
        return this.field388 != null;
    }
}

package deob;

@ObfuscatedName("av")
public final class class32 extends class35 {

    @ObfuscatedName("av.q")
    public class37 field714;

    @ObfuscatedName("av.s(B)Lch;")
    public final class100 method14() {
        if (this.field714 == null) {
            return null;
        }
        class40 var1 = this.field783 != -1 && this.field789 == 0 ? class40.method575(this.field783) : null;
        class40 var2 = this.field774 == -1 || this.field774 == this.field745 && var1 != null ? null : class40.method575(this.field774);
        class100 var3 = this.field714.method642(var1, this.field773, var2, this.field770);
        if (var3 == null) {
            return null;
        }
        var3.method1995();
        this.field790 = var3.field1355;
        if (this.field777 != -1 && this.field778 != -1) {
            class100 var4 = class41.method535(this.field777).method755(this.field778);
            if (var4 != null) {
                var4.method2026(0, -this.field772, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field714.field815 == 1) {
            var3.field1722 = true;
        }
        return var3;
    }

    @ObfuscatedName("av.h(B)Z")
    public final boolean method15() {
        return this.field714 != null;
    }
}

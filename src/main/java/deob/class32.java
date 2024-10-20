package deob;

@ObfuscatedName("ac")
public final class class32 extends class35 {

    @ObfuscatedName("ac.b")
    public class37 field705;

    @ObfuscatedName("ac.e(I)Lcx;")
    public final class100 method16() {
        if (this.field705 == null) {
            return null;
        }
        class40 var1 = this.field766 != -1 && this.field769 == 0 ? class40.method512(this.field766) : null;
        class40 var2 = this.field763 == -1 || this.field793 == this.field763 && var1 != null ? null : class40.method512(this.field763);
        class100 var3 = this.field705.method638(var1, this.field767, var2, this.field754);
        if (var3 == null) {
            return null;
        }
        var3.method1974();
        this.field761 = var3.field1384;
        if (this.field748 != -1 && this.field772 != -1) {
            class100 var4 = class41.method174(this.field748).method764(this.field772);
            if (var4 != null) {
                var4.method1984(0, -this.field775, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (this.field705.field819 == 1) {
            var3.field1770 = true;
        }
        return var3;
    }

    @ObfuscatedName("ac.a(I)Z")
    public final boolean method17() {
        return this.field705 != null;
    }
}

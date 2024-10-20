package deob;

@ObfuscatedName("b")
public final class class25 extends class27 {

    @ObfuscatedName("b.p")
    public class31 field376;

    @ObfuscatedName("b.e(I)Lds;")
    public final class112 method19() {
        if (this.field376 == null) {
            return null;
        }
        class34 var1 = this.field456 != -1 && this.field429 == 0 ? Statics.method1204(this.field456) : null;
        class34 var2 = this.field423 == -1 || this.field423 == this.field402 && var1 != null ? null : Statics.method1204(this.field423);
        class112 var3 = this.field376.method631(var1, this.field427, var2, this.field401);
        if (var3 == null) {
            return null;
        }
        var3.method2303();
        this.field444 = var3.field1554;
        if (this.field415 != -1 && this.field432 != -1) {
            class112 var4 = class35.method163(this.field415).method760(this.field432);
            if (var4 != null) {
                var4.method2313(0, -this.field435, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field376.field766 == 1) {
            var3.field1905 = true;
        }
        return var3;
    }

    @ObfuscatedName("b.a(B)Z")
    public final boolean method20() {
        return this.field376 != null;
    }
}

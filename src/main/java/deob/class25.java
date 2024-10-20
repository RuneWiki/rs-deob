package deob;

@ObfuscatedName("g")
public final class class25 extends class27 {

    @ObfuscatedName("g.y")
    public class31 field376;

    @ObfuscatedName("g.m(I)Ldw;")
    public final class112 method20() {
        if (this.field376 == null) {
            return null;
        }
        class34 var1 = this.field428 != -1 && this.field411 == 0 ? class34.method540(this.field428) : null;
        class34 var2 = this.field446 == -1 || this.field446 == this.field441 && var1 != null ? null : class34.method540(this.field446);
        class112 var3 = this.field376.method603(var1, this.field419, var2, this.field426);
        if (var3 == null) {
            return null;
        }
        var3.method2277();
        this.field429 = var3.field1541;
        if (this.field433 != -1 && this.field416 != -1) {
            class112 var4 = class35.method1458(this.field433).method760(this.field416);
            if (var4 != null) {
                var4.method2322(0, -this.field437, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (this.field376.field767 == 1) {
            var3.field1885 = true;
        }
        return var3;
    }

    @ObfuscatedName("g.d(I)Z")
    public final boolean method33() {
        return this.field376 != null;
    }
}

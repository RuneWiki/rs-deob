package deob;

@ObfuscatedName("ap")
public final class class31 extends class34 {

    @ObfuscatedName("ap.c")
    public class36 field699;

    @ObfuscatedName("ap.j(B)Lcl;")
    public final class99 method20() {
        if (this.field699 == null) {
            return null;
        }
        class39 var1 = this.field758 != -1 && this.field761 == 0 ? class39.method109(this.field758) : null;
        class39 var2 = this.field747 == -1 || this.field747 == this.field732 && var1 != null ? null : class39.method109(this.field747);
        class99 var3 = this.field699.method602(var1, this.field738, var2, this.field756);
        if (var3 == null) {
            return null;
        }
        var3.method2022();
        this.field748 = var3.field1347;
        if (this.field763 != -1 && this.field764 != -1) {
            class99 var4 = class40.method903(this.field763).method735(this.field764);
            if (var4 != null) {
                var4.method1997(0, -this.field767, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (this.field699.field804 == 1) {
            var3.field1702 = true;
        }
        return var3;
    }

    @ObfuscatedName("ap.y(I)Z")
    public final boolean method10() {
        return this.field699 != null;
    }
}

package deob;

@ObfuscatedName("v")
public final class class26 extends class28 {

    @ObfuscatedName("v.e")
    public class32 field413;

    @ObfuscatedName("v.i(B)Ldo;")
    public final class113 method16() {
        if (this.field413 == null) {
            return null;
        }
        class35 var1 = this.field450 != -1 && this.field464 == 0 ? class35.method28(this.field450) : null;
        class35 var2 = this.field468 == -1 || this.field475 == this.field468 && var1 != null ? null : class35.method28(this.field468);
        class113 var3 = this.field413.method648(var1, this.field479, var2, this.field453);
        if (var3 == null) {
            return null;
        }
        var3.method2268();
        this.field485 = var3.field1545;
        if (this.field472 != -1 && this.field473 != -1) {
            class113 var4 = class36.method867(this.field472).method795(this.field473);
            if (var4 != null) {
                var4.method2261(0, -this.field456, 0);
                class113[] var5 = new class113[] { var3, var4 };
                var3 = new class113(var5, 2);
            }
        }
        if (this.field413.field799 == 1) {
            var3.field1881 = true;
        }
        return var3;
    }

    @ObfuscatedName("v.k(B)Z")
    public final boolean method17() {
        return this.field413 != null;
    }
}

package deob;

@ObfuscatedName("au")
public class class35 extends class128 {

    @ObfuscatedName("au.i")
    public class194 field752;

    @ObfuscatedName("au.t")
    public class127 field750 = new class127();

    public class35(class194 arg0) {
        this.field752 = arg0;
    }

    @ObfuscatedName("au.b(IIIII)V")
    public void method767(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field750.method2307(); var7 != null; var7 = (class29) this.field750.method2289()) {
            var6++;
            if (var7.field669 == arg0) {
                var7.method639(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field669 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2286(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field750.method2307().method2313();
            }
        } else if (var6 < 4) {
            this.field750.method2285(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("au.l(II)Lab;")
    public class29 method760(int arg0) {
        class29 var2 = (class29) this.field750.method2307();
        if (var2 == null || var2.field669 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field750.method2289(); var3 != null && var3.field669 <= arg0; var3 = (class29) this.field750.method2289()) {
            var2.method2313();
            var2 = var3;
        }
        if (this.field752.field2841 + var2.field669 + var2.field667 > arg0) {
            return var2;
        } else {
            var2.method2313();
            return null;
        }
    }

    @ObfuscatedName("au.i(B)Z")
    public boolean method765() {
        return this.field750.method2290();
    }
}

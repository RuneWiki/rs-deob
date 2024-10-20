package deob;

@ObfuscatedName("am")
public class class35 extends class128 {

    @ObfuscatedName("am.f")
    public class194 field752;

    @ObfuscatedName("am.k")
    public class127 field753 = new class127();

    public class35(class194 arg0) {
        this.field752 = arg0;
    }

    @ObfuscatedName("am.i(IIIII)V")
    public void method661(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field753.method2176(); var7 != null; var7 = (class29) this.field753.method2177()) {
            var6++;
            if (var7.field662 == arg0) {
                var7.method585(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field662 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2182(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field753.method2176().method2200();
            }
        } else if (var6 < 4) {
            this.field753.method2179(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("am.e(II)Laq;")
    public class29 method667(int arg0) {
        class29 var2 = (class29) this.field753.method2176();
        if (var2 == null || var2.field662 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field753.method2177(); var3 != null && var3.field662 <= arg0; var3 = (class29) this.field753.method2177()) {
            var2.method2200();
            var2 = var3;
        }
        if (this.field752.field2842 + var2.field665 + var2.field662 > arg0) {
            return var2;
        } else {
            var2.method2200();
            return null;
        }
    }

    @ObfuscatedName("am.f(I)Z")
    public boolean method662() {
        return this.field753.method2178();
    }
}

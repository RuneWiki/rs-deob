package deob;

@ObfuscatedName("ar")
public class class35 extends class128 {

    @ObfuscatedName("ar.u")
    public class194 field775;

    @ObfuscatedName("ar.h")
    public class127 field777 = new class127();

    public class35(class194 arg0) {
        this.field775 = arg0;
    }

    @ObfuscatedName("ar.f(IIIII)V")
    public void method714(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field777.method2279(); var7 != null; var7 = (class29) this.field777.method2270()) {
            var6++;
            if (var7.field685 == arg0) {
                var7.method588(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field685 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2269(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field777.method2279().method2289();
            }
        } else if (var6 < 4) {
            this.field777.method2280(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ar.i(IS)Laq;")
    public class29 method720(int arg0) {
        class29 var2 = (class29) this.field777.method2279();
        if (var2 == null || var2.field685 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field777.method2270(); var3 != null && var3.field685 <= arg0; var3 = (class29) this.field777.method2270()) {
            var2.method2289();
            var2 = var3;
        }
        if (this.field775.field2841 + var2.field691 + var2.field685 > arg0) {
            return var2;
        } else {
            var2.method2289();
            return null;
        }
    }

    @ObfuscatedName("ar.u(B)Z")
    public boolean method716() {
        return this.field777.method2266();
    }
}

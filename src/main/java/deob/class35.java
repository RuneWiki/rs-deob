package deob;

@ObfuscatedName("aw")
public class class35 extends class128 {

    @ObfuscatedName("aw.c")
    public class194 field747;

    @ObfuscatedName("aw.l")
    public class127 field749 = new class127();

    public class35(class194 arg0) {
        this.field747 = arg0;
    }

    @ObfuscatedName("aw.b(IIIII)V")
    public void method734(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field749.method2277(); var7 != null; var7 = (class29) this.field749.method2280()) {
            var6++;
            if (var7.field665 == arg0) {
                var7.method602(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field665 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2279(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field749.method2277().method2298();
            }
        } else if (var6 < 4) {
            this.field749.method2276(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("aw.e(II)Lae;")
    public class29 method726(int arg0) {
        class29 var2 = (class29) this.field749.method2277();
        if (var2 == null || var2.field665 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field749.method2280(); var3 != null && var3.field665 <= arg0; var3 = (class29) this.field749.method2280()) {
            var2.method2298();
            var2 = var3;
        }
        if (this.field747.field2848 + var2.field665 + var2.field663 > arg0) {
            return var2;
        } else {
            var2.method2298();
            return null;
        }
    }

    @ObfuscatedName("aw.c(I)Z")
    public boolean method727() {
        return this.field749.method2282();
    }
}

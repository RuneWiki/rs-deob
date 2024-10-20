package deob;

@ObfuscatedName("ah")
public class class35 extends class128 {

    @ObfuscatedName("ah.i")
    public class194 field748;

    @ObfuscatedName("ah.a")
    public class127 field749 = new class127();

    public class35(class194 arg0) {
        this.field748 = arg0;
    }

    @ObfuscatedName("ah.u(IIIII)V")
    public void method698(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field749.method2209(); var7 != null; var7 = (class29) this.field749.method2211()) {
            var6++;
            if (var7.field663 == arg0) {
                var7.method616(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field663 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2208(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field749.method2209().method2228();
            }
        } else if (var6 < 4) {
            this.field749.method2207(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ah.x(II)Lal;")
    public class29 method703(int arg0) {
        class29 var2 = (class29) this.field749.method2209();
        if (var2 == null || var2.field663 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field749.method2211(); var3 != null && var3.field663 <= arg0; var3 = (class29) this.field749.method2211()) {
            var2.method2228();
            var2 = var3;
        }
        if (this.field748.field2815 + var2.field664 + var2.field663 > arg0) {
            return var2;
        } else {
            var2.method2228();
            return null;
        }
    }

    @ObfuscatedName("ah.i(I)Z")
    public boolean method699() {
        return this.field749.method2213();
    }
}

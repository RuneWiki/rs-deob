package deob;

@ObfuscatedName("an")
public class class35 extends class128 {

    @ObfuscatedName("an.f")
    public class194 field755;

    @ObfuscatedName("an.h")
    public class127 field753 = new class127();

    public class35(class194 arg0) {
        this.field755 = arg0;
    }

    @ObfuscatedName("an.s(IIIII)V")
    public void method674(int arg0, int arg1, int arg2, int arg3) {
        class29 var5 = null;
        int var6 = 0;
        for (class29 var7 = (class29) this.field753.method2152(); var7 != null; var7 = (class29) this.field753.method2148()) {
            var6++;
            if (var7.field671 == arg0) {
                var7.method590(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field671 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class127.method2151(new class29(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field753.method2152().method2179();
            }
        } else if (var6 < 4) {
            this.field753.method2161(new class29(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("an.c(II)Lad;")
    public class29 method675(int arg0) {
        class29 var2 = (class29) this.field753.method2152();
        if (var2 == null || var2.field671 > arg0) {
            return null;
        }
        for (class29 var3 = (class29) this.field753.method2148(); var3 != null && var3.field671 <= arg0; var3 = (class29) this.field753.method2148()) {
            var2.method2179();
            var2 = var3;
        }
        if (this.field755.field2850 + var2.field671 + var2.field670 > arg0) {
            return var2;
        } else {
            var2.method2179();
            return null;
        }
    }

    @ObfuscatedName("an.f(I)Z")
    public boolean method673() {
        return this.field753.method2155();
    }
}

package deob;

@ObfuscatedName("cz")
public class class79 extends class181 {

    @ObfuscatedName("cz.v")
    public class247 field1110;

    @ObfuscatedName("cz.u")
    public class261 field1111 = new class261();

    public class79(class247 arg0) {
        this.field1110 = arg0;
    }

    @ObfuscatedName("cz.z(IIIIB)V")
    public void method1844(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1111.method4385(); var7 != null; var7 = (class71) this.field1111.method4365()) {
            var6++;
            if (var7.field991 == arg0) {
                var7.method1585(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field991 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class261.method4362(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1111.method4385().method3249();
            }
        } else if (var6 < 4) {
            this.field1111.method4368(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cz.n(IB)Lbq;")
    public class71 method1851(int arg0) {
        class71 var2 = (class71) this.field1111.method4385();
        if (var2 == null || var2.field991 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1111.method4365(); var3 != null && var3.field991 <= arg0; var3 = (class71) this.field1111.method4365()) {
            var2.method3249();
            var2 = var3;
        }
        if (this.field1110.field3266 + var2.field993 + var2.field991 > arg0) {
            return var2;
        } else {
            var2.method3249();
            return null;
        }
    }

    @ObfuscatedName("cz.v(I)Z")
    public boolean method1846() {
        return this.field1111.method4367();
    }
}

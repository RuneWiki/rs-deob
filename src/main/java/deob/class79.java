package deob;

@ObfuscatedName("cb")
public class class79 extends class181 {

    @ObfuscatedName("cb.t")
    public class247 field1093;

    @ObfuscatedName("cb.g")
    public class261 field1095 = new class261();

    public class79(class247 arg0) {
        this.field1093 = arg0;
    }

    @ObfuscatedName("cb.c(IIIII)V")
    public void method1862(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1095.method4492(); var7 != null; var7 = (class71) this.field1095.method4482()) {
            var6++;
            if (var7.field979 == arg0) {
                var7.method1575(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field979 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class261.method4512(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1095.method4492().method3326();
            }
        } else if (var6 < 4) {
            this.field1095.method4493(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cb.x(IB)Lbl;")
    public class71 method1875(int arg0) {
        class71 var2 = (class71) this.field1095.method4492();
        if (var2 == null || var2.field979 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1095.method4482(); var3 != null && var3.field979 <= arg0; var3 = (class71) this.field1095.method4482()) {
            var2.method3326();
            var2 = var3;
        }
        if (this.field1093.field3261 + var2.field980 + var2.field979 > arg0) {
            return var2;
        } else {
            var2.method3326();
            return null;
        }
    }

    @ObfuscatedName("cb.t(I)Z")
    public boolean method1864() {
        return this.field1095.method4541();
    }
}

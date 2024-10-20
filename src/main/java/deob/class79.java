package deob;

@ObfuscatedName("co")
public class class79 extends class188 {

    @ObfuscatedName("co.y")
    public class247 field1099;

    @ObfuscatedName("co.w")
    public class261 field1100 = new class261();

    public class79(class247 arg0) {
        this.field1099 = arg0;
    }

    @ObfuscatedName("co.f(IIIII)V")
    public void method1861(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1100.method4447(); var7 != null; var7 = (class71) this.field1100.method4487()) {
            var6++;
            if (var7.field987 == arg0) {
                var7.method1590(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field987 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class261.method4453(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1100.method4447().method3292();
            }
        } else if (var6 < 4) {
            this.field1100.method4446(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("co.i(II)Lbu;")
    public class71 method1862(int arg0) {
        class71 var2 = (class71) this.field1100.method4447();
        if (var2 == null || var2.field987 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1100.method4487(); var3 != null && var3.field987 <= arg0; var3 = (class71) this.field1100.method4487()) {
            var2.method3292();
            var2 = var3;
        }
        if (this.field1099.field3253 + var2.field987 + var2.field984 > arg0) {
            return var2;
        } else {
            var2.method3292();
            return null;
        }
    }

    @ObfuscatedName("co.y(I)Z")
    public boolean method1863() {
        return this.field1100.method4451();
    }
}

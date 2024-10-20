package deob;

@ObfuscatedName("cm")
public class class79 extends class181 {

    @ObfuscatedName("cm.b")
    public class247 field1120;

    @ObfuscatedName("cm.g")
    public class261 field1118 = new class261();

    public class79(class247 arg0) {
        this.field1120 = arg0;
    }

    @ObfuscatedName("cm.u(IIIIB)V")
    public void method1859(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1118.method4491(); var7 != null; var7 = (class71) this.field1118.method4520()) {
            var6++;
            if (var7.field998 == arg0) {
                var7.method1595(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field998 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class261.method4502(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1118.method4491().method3332();
            }
        } else if (var6 < 4) {
            this.field1118.method4487(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cm.f(II)Lbl;")
    public class71 method1860(int arg0) {
        class71 var2 = (class71) this.field1118.method4491();
        if (var2 == null || var2.field998 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1118.method4520(); var3 != null && var3.field998 <= arg0; var3 = (class71) this.field1118.method4520()) {
            var2.method3332();
            var2 = var3;
        }
        if (this.field1120.field3282 + var2.field998 + var2.field1003 > arg0) {
            return var2;
        } else {
            var2.method3332();
            return null;
        }
    }

    @ObfuscatedName("cm.b(I)Z")
    public boolean method1861() {
        return this.field1118.method4501();
    }
}

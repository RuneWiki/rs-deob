package deob;

@ObfuscatedName("cx")
public class class79 extends class181 {

    @ObfuscatedName("cx.n")
    public class247 field1109;

    @ObfuscatedName("cx.q")
    public class261 field1102 = new class261();

    public class79(class247 arg0) {
        this.field1109 = arg0;
    }

    @ObfuscatedName("cx.a(IIIII)V")
    public void method1949(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1102.method4509(); var7 != null; var7 = (class71) this.field1102.method4506()) {
            var6++;
            if (var7.field988 == arg0) {
                var7.method1671(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field988 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class261.method4503(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1102.method4509().method3386();
            }
        } else if (var6 < 4) {
            this.field1102.method4502(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cx.t(II)Lbo;")
    public class71 method1954(int arg0) {
        class71 var2 = (class71) this.field1102.method4509();
        if (var2 == null || var2.field988 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1102.method4506(); var3 != null && var3.field988 <= arg0; var3 = (class71) this.field1102.method4506()) {
            var2.method3386();
            var2 = var3;
        }
        if (this.field1109.field3264 + var2.field989 + var2.field988 > arg0) {
            return var2;
        } else {
            var2.method3386();
            return null;
        }
    }

    @ObfuscatedName("cx.n(B)Z")
    public boolean method1952() {
        return this.field1102.method4555();
    }
}

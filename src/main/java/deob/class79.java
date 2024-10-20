package deob;

@ObfuscatedName("cp")
public class class79 extends class181 {

    @ObfuscatedName("cp.o")
    public class248 field1113;

    @ObfuscatedName("cp.e")
    public class262 field1112 = new class262();

    public class79(class248 arg0) {
        this.field1113 = arg0;
    }

    @ObfuscatedName("cp.c(IIIIS)V")
    public void method1896(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1112.method4491(); var7 != null; var7 = (class71) this.field1112.method4490()) {
            var6++;
            if (var7.field1004 == arg0) {
                var7.method1584(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1004 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class262.method4481(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1112.method4491().method3351();
            }
        } else if (var6 < 4) {
            this.field1112.method4480(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cp.t(II)Lbh;")
    public class71 method1893(int arg0) {
        class71 var2 = (class71) this.field1112.method4491();
        if (var2 == null || var2.field1004 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1112.method4490(); var3 != null && var3.field1004 <= arg0; var3 = (class71) this.field1112.method4490()) {
            var2.method3351();
            var2 = var3;
        }
        if (this.field1113.field3283 + var2.field1005 + var2.field1004 > arg0) {
            return var2;
        } else {
            var2.method3351();
            return null;
        }
    }

    @ObfuscatedName("cp.o(I)Z")
    public boolean method1894() {
        return this.field1112.method4484();
    }
}

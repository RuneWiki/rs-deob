package deob;

@ObfuscatedName("ca")
public class class85 extends class194 {

    @ObfuscatedName("ca.a")
    public class250 field1376;

    @ObfuscatedName("ca.r")
    public class193 field1377 = new class193();

    public class85(class250 arg0) {
        this.field1376 = arg0;
    }

    @ObfuscatedName("ca.i(IIIII)V")
    public void method1548(int arg0, int arg1, int arg2, int arg3) {
        class79 var5 = null;
        int var6 = 0;
        for (class79 var7 = (class79) this.field1377.method3379(); var7 != null; var7 = (class79) this.field1377.method3381()) {
            var6++;
            if (var7.field1296 == arg0) {
                var7.method1408(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1296 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class193.method3377(new class79(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1377.method3379().method3397();
            }
        } else if (var6 < 4) {
            this.field1377.method3376(new class79(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ca.j(IB)Lcj;")
    public class79 method1550(int arg0) {
        class79 var2 = (class79) this.field1377.method3379();
        if (var2 == null || var2.field1296 > arg0) {
            return null;
        }
        for (class79 var3 = (class79) this.field1377.method3381(); var3 != null && var3.field1296 <= arg0; var3 = (class79) this.field1377.method3381()) {
            var2.method3397();
            var2 = var3;
        }
        if (this.field1376.field3374 + var2.field1296 + var2.field1295 > arg0) {
            return var2;
        } else {
            var2.method3397();
            return null;
        }
    }

    @ObfuscatedName("ca.a(I)Z")
    public boolean method1551() {
        return this.field1377.method3382();
    }
}

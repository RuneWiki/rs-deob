package deob;

@ObfuscatedName("cb")
public class class85 extends class200 {

    @ObfuscatedName("cb.k")
    public class256 field1292;

    @ObfuscatedName("cb.z")
    public class199 field1290 = new class199();

    public class85(class256 arg0) {
        this.field1292 = arg0;
    }

    @ObfuscatedName("cb.d(IIIIB)V")
    public void method1601(int arg0, int arg1, int arg2, int arg3) {
        class79 var5 = null;
        int var6 = 0;
        for (class79 var7 = (class79) this.field1290.method3453(); var7 != null; var7 = (class79) this.field1290.method3450()) {
            var6++;
            if (var7.field1207 == arg0) {
                var7.method1466(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1207 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class199.method3451(new class79(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1290.method3453().method3475();
            }
        } else if (var6 < 4) {
            this.field1290.method3457(new class79(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cb.x(II)Lcd;")
    public class79 method1604(int arg0) {
        class79 var2 = (class79) this.field1290.method3453();
        if (var2 == null || var2.field1207 > arg0) {
            return null;
        }
        for (class79 var3 = (class79) this.field1290.method3450(); var3 != null && var3.field1207 <= arg0; var3 = (class79) this.field1290.method3450()) {
            var2.method3475();
            var2 = var3;
        }
        if (this.field1292.field3441 + var2.field1209 + var2.field1207 > arg0) {
            return var2;
        } else {
            var2.method3475();
            return null;
        }
    }

    @ObfuscatedName("cb.k(I)Z")
    public boolean method1603() {
        return this.field1290.method3456();
    }
}

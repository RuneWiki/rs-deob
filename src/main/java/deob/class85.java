package deob;

@ObfuscatedName("cb")
public class class85 extends class204 {

    @ObfuscatedName("cb.y")
    public class260 field1289;

    @ObfuscatedName("cb.r")
    public class203 field1291 = new class203();

    public class85(class260 arg0) {
        this.field1289 = arg0;
    }

    @ObfuscatedName("cb.n(IIIII)V")
    public void method1565(int arg0, int arg1, int arg2, int arg3) {
        class79 var5 = null;
        int var6 = 0;
        for (class79 var7 = (class79) this.field1291.method3442(); var7 != null; var7 = (class79) this.field1291.method3444()) {
            var6++;
            if (var7.field1211 == arg0) {
                var7.method1447(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1211 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class203.method3440(new class79(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1291.method3442().method3474();
            }
        } else if (var6 < 4) {
            this.field1291.method3439(new class79(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cb.v(II)Lcj;")
    public class79 method1566(int arg0) {
        class79 var2 = (class79) this.field1291.method3442();
        if (var2 == null || var2.field1211 > arg0) {
            return null;
        }
        for (class79 var3 = (class79) this.field1291.method3444(); var3 != null && var3.field1211 <= arg0; var3 = (class79) this.field1291.method3444()) {
            var2.method3474();
            var2 = var3;
        }
        if (this.field1289.field3463 + var2.field1213 + var2.field1211 > arg0) {
            return var2;
        } else {
            var2.method3474();
            return null;
        }
    }

    @ObfuscatedName("cb.y(I)Z")
    public boolean method1567() {
        return this.field1291.method3469();
    }
}

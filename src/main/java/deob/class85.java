package deob;

@ObfuscatedName("cy")
public class class85 extends class200 {

    @ObfuscatedName("cy.r")
    public class256 field1284;

    @ObfuscatedName("cy.g")
    public class199 field1287 = new class199();

    public class85(class256 arg0) {
        this.field1284 = arg0;
    }

    @ObfuscatedName("cy.b(IIIIS)V")
    public void method1526(int arg0, int arg1, int arg2, int arg3) {
        class79 var5 = null;
        int var6 = 0;
        for (class79 var7 = (class79) this.field1287.method3362(); var7 != null; var7 = (class79) this.field1287.method3364()) {
            var6++;
            if (var7.field1208 == arg0) {
                var7.method1400(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1208 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class199.method3360(new class79(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1287.method3362().method3392();
            }
        } else if (var6 < 4) {
            this.field1287.method3359(new class79(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cy.s(IB)Lce;")
    public class79 method1532(int arg0) {
        class79 var2 = (class79) this.field1287.method3362();
        if (var2 == null || var2.field1208 > arg0) {
            return null;
        }
        for (class79 var3 = (class79) this.field1287.method3364(); var3 != null && var3.field1208 <= arg0; var3 = (class79) this.field1287.method3364()) {
            var2.method3392();
            var2 = var3;
        }
        if (this.field1284.field3412 + var2.field1211 + var2.field1208 > arg0) {
            return var2;
        } else {
            var2.method3392();
            return null;
        }
    }

    @ObfuscatedName("cy.r(I)Z")
    public boolean method1528() {
        return this.field1287.method3365();
    }
}

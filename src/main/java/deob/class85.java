package deob;

@ObfuscatedName("cy")
public class class85 extends class200 {

    @ObfuscatedName("cy.i")
    public class256 field1283;

    @ObfuscatedName("cy.j")
    public class199 field1284 = new class199();

    public class85(class256 arg0) {
        this.field1283 = arg0;
    }

    @ObfuscatedName("cy.m(IIIII)V")
    public void method1607(int arg0, int arg1, int arg2, int arg3) {
        class79 var5 = null;
        int var6 = 0;
        for (class79 var7 = (class79) this.field1284.method3453(); var7 != null; var7 = (class79) this.field1284.method3455()) {
            var6++;
            if (var7.field1206 == arg0) {
                var7.method1487(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1206 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class199.method3450(new class79(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1284.method3453().method3476();
            }
        } else if (var6 < 4) {
            this.field1284.method3452(new class79(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cy.p(IB)Lcn;")
    public class79 method1608(int arg0) {
        class79 var2 = (class79) this.field1284.method3453();
        if (var2 == null || var2.field1206 > arg0) {
            return null;
        }
        for (class79 var3 = (class79) this.field1284.method3455(); var3 != null && var3.field1206 <= arg0; var3 = (class79) this.field1284.method3455()) {
            var2.method3476();
            var2 = var3;
        }
        if (this.field1283.field3427 + var2.field1207 + var2.field1206 > arg0) {
            return var2;
        } else {
            var2.method3476();
            return null;
        }
    }

    @ObfuscatedName("cy.i(B)Z")
    public boolean method1609() {
        return this.field1284.method3456();
    }
}

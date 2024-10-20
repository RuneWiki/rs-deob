package deob;

@ObfuscatedName("cy")
public class class86 extends class193 {

    @ObfuscatedName("cy.e")
    public class249 field1389;

    @ObfuscatedName("cy.v")
    public class192 field1390 = new class192();

    public class86(class249 arg0) {
        this.field1389 = arg0;
    }

    @ObfuscatedName("cy.i(IIIIB)V")
    public void method1548(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1390.method3248(); var7 != null; var7 = (class80) this.field1390.method3258()) {
            var6++;
            if (var7.field1307 == arg0) {
                var7.method1406(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1307 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3257(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1390.method3248().method3278();
            }
        } else if (var6 < 4) {
            this.field1390.method3250(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cy.c(IB)Lce;")
    public class80 method1541(int arg0) {
        class80 var2 = (class80) this.field1390.method3248();
        if (var2 == null || var2.field1307 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1390.method3258(); var3 != null && var3.field1307 <= arg0; var3 = (class80) this.field1390.method3258()) {
            var2.method3278();
            var2 = var3;
        }
        if (this.field1389.field3371 + var2.field1310 + var2.field1307 > arg0) {
            return var2;
        } else {
            var2.method3278();
            return null;
        }
    }

    @ObfuscatedName("cy.e(I)Z")
    public boolean method1542() {
        return this.field1390.method3256();
    }
}

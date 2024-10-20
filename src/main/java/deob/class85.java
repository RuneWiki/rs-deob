package deob;

@ObfuscatedName("cy")
public final class class85 extends class142 {

    @ObfuscatedName("cy.a")
    public int field1351;

    @ObfuscatedName("cy.j")
    public int field1354;

    @ObfuscatedName("cy.n")
    public int field1352;

    @ObfuscatedName("cy.r")
    public int field1347;

    @ObfuscatedName("cy.v")
    public int field1348;

    @ObfuscatedName("cy.e")
    public int field1349;

    @ObfuscatedName("cy.l")
    public class261 field1350;

    @ObfuscatedName("cy.s")
    public int field1346 = 0;

    @ObfuscatedName("cy.w")
    public int field1344 = 0;

    @ObfuscatedName("cy.p")
    public boolean field1353 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1351 = arg0;
        this.field1352 = arg1;
        this.field1347 = arg2;
        this.field1348 = arg3;
        this.field1349 = arg4;
        this.field1354 = arg5 + arg6;
        int var8 = class246.method3901(this.field1351).field3330;
        if (var8 == -1) {
            this.field1353 = true;
        } else {
            this.field1353 = false;
            this.field1350 = class261.method1884(var8);
        }
    }

    @ObfuscatedName("cy.a(II)V")
    public final void method1501(int arg0) {
        if (this.field1353) {
            return;
        }
        this.field1344 += arg0;
        while (this.field1344 > this.field1350.field3619[this.field1346]) {
            this.field1344 -= this.field1350.field3619[this.field1346];
            this.field1346++;
            if (this.field1346 >= this.field1350.field3608.length) {
                this.field1353 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cy.n(B)Lej;")
    public final class134 method1018() {
        class246 var1 = class246.method3901(this.field1351);
        class134 var2;
        if (this.field1353) {
            var2 = var1.method3954(-1);
        } else {
            var2 = var1.method3954(this.field1346);
        }
        return var2 == null ? null : var2;
    }
}

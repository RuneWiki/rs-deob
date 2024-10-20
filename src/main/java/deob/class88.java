package deob;

@ObfuscatedName("cy")
public class class88 implements class85 {

    @ObfuscatedName("cy.k")
    public class76[] field1519;

    @ObfuscatedName("cy.b")
    public class177 field1515 = new class177();

    @ObfuscatedName("cy.e")
    public int field1517;

    @ObfuscatedName("cy.i")
    public int field1518 = 0;

    @ObfuscatedName("cy.t")
    public double field1516 = 1.0D;

    @ObfuscatedName("cy.z")
    public int field1526 = 128;

    @ObfuscatedName("cy.g")
    public class146 field1521;

    public class88(class146 arg0, class146 arg1, int arg2, double arg3, int arg4) {
        this.field1521 = arg1;
        this.field1517 = arg2;
        this.field1518 = this.field1517;
        this.field1516 = arg3;
        this.field1526 = arg4;
        int[] var7 = arg0.method2705(0);
        int var8 = var7.length;
        this.field1519 = new class76[arg0.method2723(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2759(0, var7[var9]));
            this.field1519[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cy.p(D)V")
    public void method1864(double arg0) {
        this.field1516 = arg0;
        this.method1853();
    }

    @ObfuscatedName("cy.k(IB)[I")
    public int[] method1842(int arg0) {
        class76 var2 = this.field1519[arg0];
        if (var2 != null) {
            if (var2.field1336 != null) {
                this.field1515.method3224(var2);
                var2.field1347 = true;
                return var2.field1336;
            }
            boolean var3 = var2.method1579(this.field1516, this.field1526, this.field1521);
            if (var3) {
                if (this.field1518 == 0) {
                    class76 var4 = (class76) this.field1515.method3229();
                    var4.method1578();
                } else {
                    this.field1518--;
                }
                this.field1515.method3224(var2);
                var2.field1347 = true;
                return var2.field1336;
            }
        }
        return null;
    }

    @ObfuscatedName("cy.b(IB)I")
    public int method1841(int arg0) {
        return this.field1519[arg0] == null ? 0 : this.field1519[arg0].field1339;
    }

    @ObfuscatedName("cy.e(II)Z")
    public boolean method1850(int arg0) {
        return this.field1519[arg0].field1337;
    }

    @ObfuscatedName("cy.i(II)Z")
    public boolean method1843(int arg0) {
        return this.field1526 == 64;
    }

    @ObfuscatedName("cy.m(I)V")
    public void method1853() {
        for (int var1 = 0; var1 < this.field1519.length; var1++) {
            if (this.field1519[var1] != null) {
                this.field1519[var1].method1578();
            }
        }
        this.field1515 = new class177();
        this.field1518 = this.field1517;
    }

    @ObfuscatedName("cy.a(IB)V")
    public void method1854(int arg0) {
        for (int var2 = 0; var2 < this.field1519.length; var2++) {
            class76 var3 = this.field1519[var2];
            if (var3 != null && var3.field1334 != 0 && var3.field1347) {
                var3.method1580(arg0);
                var3.field1347 = false;
            }
        }
    }
}

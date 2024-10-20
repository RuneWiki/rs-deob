package deob;

@ObfuscatedName("cy")
public class class95 implements class92 {

    @ObfuscatedName("cy.j")
    public class83[] field1629;

    @ObfuscatedName("cy.l")
    public class199 field1619 = new class199();

    @ObfuscatedName("cy.a")
    public int field1625;

    @ObfuscatedName("cy.i")
    public int field1623 = 0;

    @ObfuscatedName("cy.f")
    public double field1622 = 1.0D;

    @ObfuscatedName("cy.m")
    public int field1626 = 128;

    @ObfuscatedName("cy.o")
    public class167 field1624;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1624 = arg1;
        this.field1625 = arg2;
        this.field1623 = this.field1625;
        this.field1622 = arg3;
        this.field1626 = arg4;
        int[] var7 = arg0.method3014(0);
        int var8 = var7.length;
        this.field1629 = new class83[arg0.method3015(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3005(0, var7[var9]));
            this.field1629[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cy.u(D)V")
    public void method2025(double arg0) {
        this.field1622 = arg0;
        this.method2027();
    }

    @ObfuscatedName("cy.j(IB)[I")
    public int[] method2008(int arg0) {
        class83 var2 = this.field1629[arg0];
        if (var2 != null) {
            if (var2.field1443 != null) {
                this.field1619.method3524(var2);
                var2.field1451 = true;
                return var2.field1443;
            }
            boolean var3 = var2.method1745(this.field1622, this.field1626, this.field1624);
            if (var3) {
                if (this.field1623 == 0) {
                    class83 var4 = (class83) this.field1619.method3550();
                    var4.method1739();
                } else {
                    this.field1623--;
                }
                this.field1619.method3524(var2);
                var2.field1451 = true;
                return var2.field1443;
            }
        }
        return null;
    }

    @ObfuscatedName("cy.l(II)I")
    public int method2016(int arg0) {
        return this.field1629[arg0] == null ? 0 : this.field1629[arg0].field1446;
    }

    @ObfuscatedName("cy.a(II)Z")
    public boolean method2009(int arg0) {
        return this.field1629[arg0].field1444;
    }

    @ObfuscatedName("cy.i(II)Z")
    public boolean method2010(int arg0) {
        return this.field1626 == 64;
    }

    @ObfuscatedName("cy.g(I)V")
    public void method2027() {
        for (int var1 = 0; var1 < this.field1629.length; var1++) {
            if (this.field1629[var1] != null) {
                this.field1629[var1].method1739();
            }
        }
        this.field1619 = new class199();
        this.field1623 = this.field1625;
    }

    @ObfuscatedName("cy.y(II)V")
    public void method2026(int arg0) {
        for (int var2 = 0; var2 < this.field1629.length; var2++) {
            class83 var3 = this.field1629[var2];
            if (var3 != null && var3.field1452 != 0 && var3.field1451) {
                var3.method1740(arg0);
                var3.field1451 = false;
            }
        }
    }
}

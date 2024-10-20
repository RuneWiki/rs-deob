package deob;

@ObfuscatedName("cu")
public class class96 implements class93 {

    @ObfuscatedName("cu.s")
    public class84[] field1636;

    @ObfuscatedName("cu.j")
    public class200 field1634 = new class200();

    @ObfuscatedName("cu.p")
    public int field1629;

    @ObfuscatedName("cu.x")
    public int field1630 = 0;

    @ObfuscatedName("cu.d")
    public double field1632 = 1.0D;

    @ObfuscatedName("cu.u")
    public int field1628 = 128;

    @ObfuscatedName("cu.o")
    public class168 field1633;

    public class96(class168 arg0, class168 arg1, int arg2, double arg3, int arg4) {
        this.field1633 = arg1;
        this.field1629 = arg2;
        this.field1630 = this.field1629;
        this.field1632 = arg3;
        this.field1628 = arg4;
        int[] var7 = arg0.method3056(0);
        int var8 = var7.length;
        this.field1636 = new class84[arg0.method3024(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class120 var10 = new class120(arg0.method3014(0, var7[var9]));
            this.field1636[var7[var9]] = new class84(var10);
        }
    }

    @ObfuscatedName("cu.h(D)V")
    public void method2030(double arg0) {
        this.field1632 = arg0;
        this.method2026();
    }

    @ObfuscatedName("cu.s(IS)[I")
    public int[] method2004(int arg0) {
        class84 var2 = this.field1636[arg0];
        if (var2 != null) {
            if (var2.field1456 != null) {
                this.field1634.method3549(var2);
                var2.field1446 = true;
                return var2.field1456;
            }
            boolean var3 = var2.method1761(this.field1632, this.field1628, this.field1633);
            if (var3) {
                if (this.field1630 == 0) {
                    class84 var4 = (class84) this.field1634.method3554();
                    var4.method1749();
                } else {
                    this.field1630--;
                }
                this.field1634.method3549(var2);
                var2.field1446 = true;
                return var2.field1456;
            }
        }
        return null;
    }

    @ObfuscatedName("cu.j(II)I")
    public int method2010(int arg0) {
        return this.field1636[arg0] == null ? 0 : this.field1636[arg0].field1448;
    }

    @ObfuscatedName("cu.p(IB)Z")
    public boolean method2007(int arg0) {
        return this.field1636[arg0].field1449;
    }

    @ObfuscatedName("cu.x(II)Z")
    public boolean method2006(int arg0) {
        return this.field1628 == 64;
    }

    @ObfuscatedName("cu.z(I)V")
    public void method2026() {
        for (int var1 = 0; var1 < this.field1636.length; var1++) {
            if (this.field1636[var1] != null) {
                this.field1636[var1].method1749();
            }
        }
        this.field1634 = new class200();
        this.field1630 = this.field1629;
    }

    @ObfuscatedName("cu.a(IB)V")
    public void method2025(int arg0) {
        for (int var2 = 0; var2 < this.field1636.length; var2++) {
            class84 var3 = this.field1636[var2];
            if (var3 != null && var3.field1447 != 0 && var3.field1446) {
                var3.method1750(arg0);
                var3.field1446 = false;
            }
        }
    }
}

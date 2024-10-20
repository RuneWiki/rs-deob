package deob;

@ObfuscatedName("cq")
public class class95 implements class92 {

    @ObfuscatedName("cq.m")
    public class83[] field1569;

    @ObfuscatedName("cq.l")
    public class199 field1570 = new class199();

    @ObfuscatedName("cq.y")
    public int field1568;

    @ObfuscatedName("cq.u")
    public int field1567 = 0;

    @ObfuscatedName("cq.k")
    public double field1566 = 1.0D;

    @ObfuscatedName("cq.j")
    public int field1571 = 128;

    @ObfuscatedName("cq.i")
    public class167 field1572;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1572 = arg1;
        this.field1568 = arg2;
        this.field1567 = this.field1568;
        this.field1566 = arg3;
        this.field1571 = arg4;
        int[] var7 = arg0.method3121(0);
        int var8 = var7.length;
        this.field1569 = new class83[arg0.method3090(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3080(0, var7[var9]));
            this.field1569[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cq.s(D)V")
    public void method2087(double arg0) {
        this.field1566 = arg0;
        this.method2080();
    }

    @ObfuscatedName("cq.m(IB)[I")
    public int[] method2071(int arg0) {
        class83 var2 = this.field1569[arg0];
        if (var2 != null) {
            if (var2.field1394 != null) {
                this.field1570.method3633(var2);
                var2.field1393 = true;
                return var2.field1394;
            }
            boolean var3 = var2.method1803(this.field1566, this.field1571, this.field1572);
            if (var3) {
                if (this.field1567 == 0) {
                    class83 var4 = (class83) this.field1570.method3625();
                    var4.method1806();
                } else {
                    this.field1567--;
                }
                this.field1570.method3633(var2);
                var2.field1393 = true;
                return var2.field1394;
            }
        }
        return null;
    }

    @ObfuscatedName("cq.l(II)I")
    public int method2063(int arg0) {
        return this.field1569[arg0] == null ? 0 : this.field1569[arg0].field1386;
    }

    @ObfuscatedName("cq.y(II)Z")
    public boolean method2070(int arg0) {
        return this.field1569[arg0].field1387;
    }

    @ObfuscatedName("cq.u(II)Z")
    public boolean method2065(int arg0) {
        return this.field1571 == 64;
    }

    @ObfuscatedName("cq.r(I)V")
    public void method2080() {
        for (int var1 = 0; var1 < this.field1569.length; var1++) {
            if (this.field1569[var1] != null) {
                this.field1569[var1].method1806();
            }
        }
        this.field1570 = new class199();
        this.field1567 = this.field1568;
    }

    @ObfuscatedName("cq.h(IB)V")
    public void method2081(int arg0) {
        for (int var2 = 0; var2 < this.field1569.length; var2++) {
            class83 var3 = this.field1569[var2];
            if (var3 != null && var3.field1384 != 0 && var3.field1393) {
                var3.method1805(arg0);
                var3.field1393 = false;
            }
        }
    }
}

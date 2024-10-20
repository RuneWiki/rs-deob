package deob;

@ObfuscatedName("cn")
public class class89 implements class86 {

    @ObfuscatedName("cn.l")
    public class77[] field1503;

    @ObfuscatedName("cn.y")
    public class180 field1495 = new class180();

    @ObfuscatedName("cn.g")
    public int field1496;

    @ObfuscatedName("cn.j")
    public int field1494 = 0;

    @ObfuscatedName("cn.w")
    public double field1498 = 1.0D;

    @ObfuscatedName("cn.c")
    public int field1499 = 128;

    @ObfuscatedName("cn.x")
    public class149 field1500;

    public class89(class149 arg0, class149 arg1, int arg2, double arg3, int arg4) {
        this.field1500 = arg1;
        this.field1496 = arg2;
        this.field1494 = this.field1496;
        this.field1498 = arg3;
        this.field1499 = arg4;
        int[] var7 = arg0.method2789(0);
        int var8 = var7.length;
        this.field1503 = new class77[arg0.method2799(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class108 var10 = new class108(arg0.method2752(0, var7[var9]));
            this.field1503[var7[var9]] = new class77(var10);
        }
    }

    @ObfuscatedName("cn.z(D)V")
    public void method1874(double arg0) {
        this.field1498 = arg0;
        this.method1869();
    }

    @ObfuscatedName("cn.l(IB)[I")
    public int[] method1849(int arg0) {
        class77 var2 = this.field1503[arg0];
        if (var2 != null) {
            if (var2.field1326 != null) {
                this.field1495.method3290(var2);
                var2.field1315 = true;
                return var2.field1326;
            }
            boolean var3 = var2.method1605(this.field1498, this.field1499, this.field1500);
            if (var3) {
                if (this.field1494 == 0) {
                    class77 var4 = (class77) this.field1495.method3281();
                    var4.method1601();
                } else {
                    this.field1494--;
                }
                this.field1495.method3290(var2);
                var2.field1315 = true;
                return var2.field1326;
            }
        }
        return null;
    }

    @ObfuscatedName("cn.y(IB)I")
    public int method1858(int arg0) {
        return this.field1503[arg0] == null ? 0 : this.field1503[arg0].field1318;
    }

    @ObfuscatedName("cn.g(IS)Z")
    public boolean method1850(int arg0) {
        return this.field1503[arg0].field1320;
    }

    @ObfuscatedName("cn.j(II)Z")
    public boolean method1851(int arg0) {
        return this.field1499 == 64;
    }

    @ObfuscatedName("cn.u(I)V")
    public void method1869() {
        for (int var1 = 0; var1 < this.field1503.length; var1++) {
            if (this.field1503[var1] != null) {
                this.field1503[var1].method1601();
            }
        }
        this.field1495 = new class180();
        this.field1494 = this.field1496;
    }

    @ObfuscatedName("cn.s(II)V")
    public void method1883(int arg0) {
        for (int var2 = 0; var2 < this.field1503.length; var2++) {
            class77 var3 = this.field1503[var2];
            if (var3 != null && var3.field1324 != 0 && var3.field1315) {
                var3.method1599(arg0);
                var3.field1315 = false;
            }
        }
    }
}

package deob;

@ObfuscatedName("cp")
public class class96 implements class93 {

    @ObfuscatedName("cp.w")
    public class84[] field1637;

    @ObfuscatedName("cp.x")
    public class200 field1625 = new class200();

    @ObfuscatedName("cp.t")
    public int field1626;

    @ObfuscatedName("cp.p")
    public int field1630 = 0;

    @ObfuscatedName("cp.e")
    public double field1627 = 1.0D;

    @ObfuscatedName("cp.y")
    public int field1629 = 128;

    @ObfuscatedName("cp.m")
    public class168 field1624;

    public class96(class168 arg0, class168 arg1, int arg2, double arg3, int arg4) {
        this.field1624 = arg1;
        this.field1626 = arg2;
        this.field1630 = this.field1626;
        this.field1627 = arg3;
        this.field1629 = arg4;
        int[] var7 = arg0.method3124(0);
        int var8 = var7.length;
        this.field1637 = new class84[arg0.method3122(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class120 var10 = new class120(arg0.method3127(0, var7[var9]));
            this.field1637[var7[var9]] = new class84(var10);
        }
    }

    @ObfuscatedName("cp.j(D)V")
    public void method2043(double arg0) {
        this.field1627 = arg0;
        this.method2041();
    }

    @ObfuscatedName("cp.w(IB)[I")
    public int[] method2035(int arg0) {
        class84 var2 = this.field1637[arg0];
        if (var2 != null) {
            if (var2.field1454 != null) {
                this.field1625.method3584(var2);
                var2.field1445 = true;
                return var2.field1454;
            }
            boolean var3 = var2.method1768(this.field1627, this.field1629, this.field1624);
            if (var3) {
                if (this.field1630 == 0) {
                    class84 var4 = (class84) this.field1625.method3588();
                    var4.method1770();
                } else {
                    this.field1630--;
                }
                this.field1625.method3584(var2);
                var2.field1445 = true;
                return var2.field1454;
            }
        }
        return null;
    }

    @ObfuscatedName("cp.x(II)I")
    public int method2030(int arg0) {
        return this.field1637[arg0] == null ? 0 : this.field1637[arg0].field1447;
    }

    @ObfuscatedName("cp.t(II)Z")
    public boolean method2027(int arg0) {
        return this.field1637[arg0].field1448;
    }

    @ObfuscatedName("cp.p(IB)Z")
    public boolean method2028(int arg0) {
        return this.field1629 == 64;
    }

    @ObfuscatedName("cp.q(I)V")
    public void method2041() {
        for (int var1 = 0; var1 < this.field1637.length; var1++) {
            if (this.field1637[var1] != null) {
                this.field1637[var1].method1770();
            }
        }
        this.field1625 = new class200();
        this.field1630 = this.field1626;
    }

    @ObfuscatedName("cp.a(II)V")
    public void method2042(int arg0) {
        for (int var2 = 0; var2 < this.field1637.length; var2++) {
            class84 var3 = this.field1637[var2];
            if (var3 != null && var3.field1452 != 0 && var3.field1445) {
                var3.method1775(arg0);
                var3.field1445 = false;
            }
        }
    }
}

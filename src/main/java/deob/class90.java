package deob;

@ObfuscatedName("cm")
public class class90 implements class87 {

    @ObfuscatedName("cm.q")
    public class78[] field1513;

    @ObfuscatedName("cm.s")
    public class189 field1506 = new class189();

    @ObfuscatedName("cm.h")
    public int field1510;

    @ObfuscatedName("cm.e")
    public int field1509 = 0;

    @ObfuscatedName("cm.n")
    public double field1505 = 1.0D;

    @ObfuscatedName("cm.t")
    public int field1511 = 128;

    @ObfuscatedName("cm.l")
    public class158 field1508;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1508 = arg1;
        this.field1510 = arg2;
        this.field1509 = this.field1510;
        this.field1505 = arg3;
        this.field1511 = arg4;
        int[] var7 = arg0.method2807(0);
        int var8 = var7.length;
        this.field1513 = new class78[arg0.method2808(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2811(0, var7[var9]));
            this.field1513[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cm.b(D)V")
    public void method1874(double arg0) {
        this.field1505 = arg0;
        this.method1876();
    }

    @ObfuscatedName("cm.q(II)[I")
    public int[] method1860(int arg0) {
        class78 var2 = this.field1513[arg0];
        if (var2 != null) {
            if (var2.field1342 != null) {
                this.field1506.method3305(var2);
                var2.field1332 = true;
                return var2.field1342;
            }
            boolean var3 = var2.method1598(this.field1505, this.field1511, this.field1508);
            if (var3) {
                if (this.field1509 == 0) {
                    class78 var4 = (class78) this.field1506.method3319();
                    var4.method1599();
                } else {
                    this.field1509--;
                }
                this.field1506.method3305(var2);
                var2.field1332 = true;
                return var2.field1342;
            }
        }
        return null;
    }

    @ObfuscatedName("cm.s(II)I")
    public int method1853(int arg0) {
        return this.field1513[arg0] == null ? 0 : this.field1513[arg0].field1334;
    }

    @ObfuscatedName("cm.h(II)Z")
    public boolean method1854(int arg0) {
        return this.field1513[arg0].field1343;
    }

    @ObfuscatedName("cm.e(IB)Z")
    public boolean method1855(int arg0) {
        return this.field1511 == 64;
    }

    @ObfuscatedName("cm.j(B)V")
    public void method1876() {
        for (int var1 = 0; var1 < this.field1513.length; var1++) {
            if (this.field1513[var1] != null) {
                this.field1513[var1].method1599();
            }
        }
        this.field1506 = new class189();
        this.field1509 = this.field1510;
    }

    @ObfuscatedName("cm.f(II)V")
    public void method1879(int arg0) {
        for (int var2 = 0; var2 < this.field1513.length; var2++) {
            class78 var3 = this.field1513[var2];
            if (var3 != null && var3.field1340 != 0 && var3.field1332) {
                var3.method1597(arg0);
                var3.field1332 = false;
            }
        }
    }
}

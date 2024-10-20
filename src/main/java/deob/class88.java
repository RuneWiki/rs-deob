package deob;

@ObfuscatedName("cx")
public class class88 implements class85 {

    @ObfuscatedName("cx.g")
    public class76[] field1511;

    @ObfuscatedName("cx.s")
    public class178 field1512 = new class178();

    @ObfuscatedName("cx.h")
    public int field1513;

    @ObfuscatedName("cx.m")
    public int field1514 = 0;

    @ObfuscatedName("cx.u")
    public double field1522 = 1.0D;

    @ObfuscatedName("cx.j")
    public int field1516 = 128;

    @ObfuscatedName("cx.b")
    public class147 field1517;

    public class88(class147 arg0, class147 arg1, int arg2, double arg3, int arg4) {
        this.field1517 = arg1;
        this.field1513 = arg2;
        this.field1514 = this.field1513;
        this.field1522 = arg3;
        this.field1516 = arg4;
        int[] var7 = arg0.method2707(0);
        int var8 = var7.length;
        this.field1511 = new class76[arg0.method2732(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class107 var10 = new class107(arg0.method2667(0, var7[var9]));
            this.field1511[var7[var9]] = new class76(var10);
        }
    }

    @ObfuscatedName("cx.a(D)V")
    public void method1842(double arg0) {
        this.field1522 = arg0;
        this.method1843();
    }

    @ObfuscatedName("cx.g(IB)[I")
    public int[] method1822(int arg0) {
        class76 var2 = this.field1511[arg0];
        if (var2 != null) {
            if (var2.field1342 != null) {
                this.field1512.method3217(var2);
                var2.field1334 = true;
                return var2.field1342;
            }
            boolean var3 = var2.method1598(this.field1522, this.field1516, this.field1517);
            if (var3) {
                if (this.field1514 == 0) {
                    class76 var4 = (class76) this.field1512.method3208();
                    var4.method1593();
                } else {
                    this.field1514--;
                }
                this.field1512.method3217(var2);
                var2.field1334 = true;
                return var2.field1342;
            }
        }
        return null;
    }

    @ObfuscatedName("cx.s(II)I")
    public int method1833(int arg0) {
        return this.field1511[arg0] == null ? 0 : this.field1511[arg0].field1330;
    }

    @ObfuscatedName("cx.h(II)Z")
    public boolean method1823(int arg0) {
        return this.field1511[arg0].field1335;
    }

    @ObfuscatedName("cx.m(II)Z")
    public boolean method1824(int arg0) {
        return this.field1516 == 64;
    }

    @ObfuscatedName("cx.f(I)V")
    public void method1843() {
        for (int var1 = 0; var1 < this.field1511.length; var1++) {
            if (this.field1511[var1] != null) {
                this.field1511[var1].method1593();
            }
        }
        this.field1512 = new class178();
        this.field1514 = this.field1513;
    }

    @ObfuscatedName("cx.r(II)V")
    public void method1841(int arg0) {
        for (int var2 = 0; var2 < this.field1511.length; var2++) {
            class76 var3 = this.field1511[var2];
            if (var3 != null && var3.field1344 != 0 && var3.field1334) {
                var3.method1594(arg0);
                var3.field1334 = false;
            }
        }
    }
}

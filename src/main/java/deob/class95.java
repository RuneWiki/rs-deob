package deob;

@ObfuscatedName("cl")
public class class95 implements class92 {

    @ObfuscatedName("cl.i")
    public class83[] field1614;

    @ObfuscatedName("cl.v")
    public class199 field1618 = new class199();

    @ObfuscatedName("cl.f")
    public int field1616;

    @ObfuscatedName("cl.h")
    public int field1617 = 0;

    @ObfuscatedName("cl.a")
    public double field1619 = 1.0D;

    @ObfuscatedName("cl.s")
    public int field1620 = 128;

    @ObfuscatedName("cl.p")
    public class167 field1615;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1615 = arg1;
        this.field1616 = arg2;
        this.field1617 = this.field1616;
        this.field1619 = arg3;
        this.field1620 = arg4;
        int[] var7 = arg0.method3028(0);
        int var8 = var7.length;
        this.field1614 = new class83[arg0.method3078(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method3080(0, var7[var9]));
            this.field1614[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cl.c(D)V")
    public void method1993(double arg0) {
        this.field1619 = arg0;
        this.method1995();
    }

    @ObfuscatedName("cl.i(II)[I")
    public int[] method1979(int arg0) {
        class83 var2 = this.field1614[arg0];
        if (var2 != null) {
            if (var2.field1434 != null) {
                this.field1618.method3531(var2);
                var2.field1441 = true;
                return var2.field1434;
            }
            boolean var3 = var2.method1706(this.field1619, this.field1620, this.field1615);
            if (var3) {
                if (this.field1617 == 0) {
                    class83 var4 = (class83) this.field1618.method3534();
                    var4.method1708();
                } else {
                    this.field1617--;
                }
                this.field1618.method3531(var2);
                var2.field1441 = true;
                return var2.field1434;
            }
        }
        return null;
    }

    @ObfuscatedName("cl.v(II)I")
    public int method1978(int arg0) {
        return this.field1614[arg0] == null ? 0 : this.field1614[arg0].field1430;
    }

    @ObfuscatedName("cl.f(II)Z")
    public boolean method1983(int arg0) {
        return this.field1614[arg0].field1433;
    }

    @ObfuscatedName("cl.h(II)Z")
    public boolean method1981(int arg0) {
        return this.field1620 == 64;
    }

    @ObfuscatedName("cl.b(I)V")
    public void method1995() {
        for (int var1 = 0; var1 < this.field1614.length; var1++) {
            if (this.field1614[var1] != null) {
                this.field1614[var1].method1708();
            }
        }
        this.field1618 = new class199();
        this.field1617 = this.field1616;
    }

    @ObfuscatedName("cl.w(II)V")
    public void method1996(int arg0) {
        for (int var2 = 0; var2 < this.field1614.length; var2++) {
            class83 var3 = this.field1614[var2];
            if (var3 != null && var3.field1438 != 0 && var3.field1441) {
                var3.method1714(arg0);
                var3.field1441 = false;
            }
        }
    }
}

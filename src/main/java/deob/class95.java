package deob;

@ObfuscatedName("cz")
public class class95 implements class92 {

    @ObfuscatedName("cz.c")
    public class83[] field1596;

    @ObfuscatedName("cz.h")
    public class199 field1592 = new class199();

    @ObfuscatedName("cz.k")
    public int field1593;

    @ObfuscatedName("cz.t")
    public int field1594 = 0;

    @ObfuscatedName("cz.g")
    public double field1595 = 1.0D;

    @ObfuscatedName("cz.o")
    public int field1591 = 128;

    @ObfuscatedName("cz.i")
    public class167 field1598;

    public class95(class167 arg0, class167 arg1, int arg2, double arg3, int arg4) {
        this.field1598 = arg1;
        this.field1593 = arg2;
        this.field1594 = this.field1593;
        this.field1595 = arg3;
        this.field1591 = arg4;
        int[] var7 = arg0.method3003(0);
        int var8 = var7.length;
        this.field1596 = new class83[arg0.method3046(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class119 var10 = new class119(arg0.method2994(0, var7[var9]));
            this.field1596[var7[var9]] = new class83(var10);
        }
    }

    @ObfuscatedName("cz.l(D)V")
    public void method1984(double arg0) {
        this.field1595 = arg0;
        this.method1985();
    }

    @ObfuscatedName("cz.c(II)[I")
    public int[] method1977(int arg0) {
        class83 var2 = this.field1596[arg0];
        if (var2 != null) {
            if (var2.field1424 != null) {
                this.field1592.method3577(var2);
                var2.field1425 = true;
                return var2.field1424;
            }
            boolean var3 = var2.method1722(this.field1595, this.field1591, this.field1598);
            if (var3) {
                if (this.field1594 == 0) {
                    class83 var4 = (class83) this.field1592.method3557();
                    var4.method1721();
                } else {
                    this.field1594--;
                }
                this.field1592.method3577(var2);
                var2.field1425 = true;
                return var2.field1424;
            }
        }
        return null;
    }

    @ObfuscatedName("cz.h(II)I")
    public int method1963(int arg0) {
        return this.field1596[arg0] == null ? 0 : this.field1596[arg0].field1416;
    }

    @ObfuscatedName("cz.k(IB)Z")
    public boolean method1964(int arg0) {
        return this.field1596[arg0].field1412;
    }

    @ObfuscatedName("cz.t(II)Z")
    public boolean method1962(int arg0) {
        return this.field1591 == 64;
    }

    @ObfuscatedName("cz.u(I)V")
    public void method1985() {
        for (int var1 = 0; var1 < this.field1596.length; var1++) {
            if (this.field1596[var1] != null) {
                this.field1596[var1].method1721();
            }
        }
        this.field1592 = new class199();
        this.field1594 = this.field1593;
    }

    @ObfuscatedName("cz.a(IB)V")
    public void method1991(int arg0) {
        for (int var2 = 0; var2 < this.field1596.length; var2++) {
            class83 var3 = this.field1596[var2];
            if (var3 != null && var3.field1422 != 0 && var3.field1425) {
                var3.method1723(arg0);
                var3.field1425 = false;
            }
        }
    }
}

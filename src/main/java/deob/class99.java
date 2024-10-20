package deob;

@ObfuscatedName("ck")
public class class99 implements class96 {

    @ObfuscatedName("ck.a")
    public class87[] field1705;

    @ObfuscatedName("ck.d")
    public class203 field1709 = new class203();

    @ObfuscatedName("ck.v")
    public int field1708;

    @ObfuscatedName("ck.r")
    public int field1706 = 0;

    @ObfuscatedName("ck.z")
    public double field1707 = 1.0D;

    @ObfuscatedName("ck.t")
    public int field1704 = 128;

    @ObfuscatedName("ck.n")
    public class171 field1711;

    public class99(class171 arg0, class171 arg1, int arg2, double arg3, int arg4) {
        this.field1711 = arg1;
        this.field1708 = arg2;
        this.field1706 = this.field1708;
        this.field1707 = arg3;
        this.field1704 = arg4;
        int[] var7 = arg0.method3138(0);
        int var8 = var7.length;
        this.field1705 = new class87[arg0.method3127(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class123 var10 = new class123(arg0.method3117(0, var7[var9]));
            this.field1705[var7[var9]] = new class87(var10);
        }
    }

    @ObfuscatedName("ck.u(D)V")
    public void method2097(double arg0) {
        this.field1707 = arg0;
        this.method2089();
    }

    @ObfuscatedName("ck.a(II)[I")
    public int[] method2079(int arg0) {
        class87 var2 = this.field1705[arg0];
        if (var2 != null) {
            if (var2.field1526 != null) {
                this.field1709.method3640(var2);
                var2.field1532 = true;
                return var2.field1526;
            }
            boolean var3 = var2.method1824(this.field1707, this.field1704, this.field1711);
            if (var3) {
                if (this.field1706 == 0) {
                    class87 var4 = (class87) this.field1709.method3616();
                    var4.method1819();
                } else {
                    this.field1706--;
                }
                this.field1709.method3640(var2);
                var2.field1532 = true;
                return var2.field1526;
            }
        }
        return null;
    }

    @ObfuscatedName("ck.d(IB)I")
    public int method2076(int arg0) {
        return this.field1705[arg0] == null ? 0 : this.field1705[arg0].field1523;
    }

    @ObfuscatedName("ck.v(IB)Z")
    public boolean method2077(int arg0) {
        return this.field1705[arg0].field1524;
    }

    @ObfuscatedName("ck.r(II)Z")
    public boolean method2078(int arg0) {
        return this.field1704 == 64;
    }

    @ObfuscatedName("ck.j(B)V")
    public void method2089() {
        for (int var1 = 0; var1 < this.field1705.length; var1++) {
            if (this.field1705[var1] != null) {
                this.field1705[var1].method1819();
            }
        }
        this.field1709 = new class203();
        this.field1706 = this.field1708;
    }

    @ObfuscatedName("ck.q(IB)V")
    public void method2087(int arg0) {
        for (int var2 = 0; var2 < this.field1705.length; var2++) {
            class87 var3 = this.field1705[var2];
            if (var3 != null && var3.field1529 != 0 && var3.field1532) {
                var3.method1820(arg0);
                var3.field1532 = false;
            }
        }
    }
}

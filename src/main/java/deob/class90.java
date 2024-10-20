package deob;

@ObfuscatedName("cn")
public class class90 implements class87 {

    @ObfuscatedName("cn.y")
    public class78[] field1545;

    @ObfuscatedName("cn.k")
    public class190 field1541 = new class190();

    @ObfuscatedName("cn.g")
    public int field1549;

    @ObfuscatedName("cn.n")
    public int field1543 = 0;

    @ObfuscatedName("cn.t")
    public double field1544 = 1.0D;

    @ObfuscatedName("cn.e")
    public int field1547 = 128;

    @ObfuscatedName("cn.q")
    public class158 field1546;

    public class90(class158 arg0, class158 arg1, int arg2, double arg3, int arg4) {
        this.field1546 = arg1;
        this.field1549 = arg2;
        this.field1543 = this.field1549;
        this.field1544 = arg3;
        this.field1547 = arg4;
        int[] var7 = arg0.method2882(0);
        int var8 = var7.length;
        this.field1545 = new class78[arg0.method2883(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class111 var10 = new class111(arg0.method2874(0, var7[var9]));
            this.field1545[var7[var9]] = new class78(var10);
        }
    }

    @ObfuscatedName("cn.l(D)V")
    public void method1887(double arg0) {
        this.field1544 = arg0;
        this.method1885();
    }

    @ObfuscatedName("cn.y(II)[I")
    public int[] method1870(int arg0) {
        class78 var2 = this.field1545[arg0];
        if (var2 != null) {
            if (var2.field1367 != null) {
                this.field1541.method3415(var2);
                var2.field1357 = true;
                return var2.field1367;
            }
            boolean var3 = var2.method1620(this.field1544, this.field1547, this.field1546);
            if (var3) {
                if (this.field1543 == 0) {
                    class78 var4 = (class78) this.field1541.method3393();
                    var4.method1618();
                } else {
                    this.field1543--;
                }
                this.field1541.method3415(var2);
                var2.field1357 = true;
                return var2.field1367;
            }
        }
        return null;
    }

    @ObfuscatedName("cn.k(II)I")
    public int method1871(int arg0) {
        return this.field1545[arg0] == null ? 0 : this.field1545[arg0].field1362;
    }

    @ObfuscatedName("cn.g(II)Z")
    public boolean method1869(int arg0) {
        return this.field1545[arg0].field1360;
    }

    @ObfuscatedName("cn.n(II)Z")
    public boolean method1876(int arg0) {
        return this.field1547 == 64;
    }

    @ObfuscatedName("cn.j(I)V")
    public void method1885() {
        for (int var1 = 0; var1 < this.field1545.length; var1++) {
            if (this.field1545[var1] != null) {
                this.field1545[var1].method1618();
            }
        }
        this.field1541 = new class190();
        this.field1543 = this.field1549;
    }

    @ObfuscatedName("cn.s(II)V")
    public void method1886(int arg0) {
        for (int var2 = 0; var2 < this.field1545.length; var2++) {
            class78 var3 = this.field1545[var2];
            if (var3 != null && var3.field1365 != 0 && var3.field1357) {
                var3.method1622(arg0);
                var3.field1357 = false;
            }
        }
    }
}

package deob;

@ObfuscatedName("hm")
public class class193 implements class206 {

    @ObfuscatedName("hm.ab")
    public class178[] field2116;

    @ObfuscatedName("hm.ay")
    public class408 field2117 = new class408();

    @ObfuscatedName("hm.an")
    public int field2118;

    @ObfuscatedName("hm.au")
    public int field2121 = 0;

    @ObfuscatedName("hm.ax")
    public double field2123 = 1.0D;

    @ObfuscatedName("hm.ao")
    public int field2120 = 128;

    @ObfuscatedName("hm.am")
    public class389 field2122;

    public class193(class389 arg0, class389 arg1, int arg2, double arg3, int arg4) {
        this.field2122 = arg1;
        this.field2118 = arg2;
        this.field2121 = this.field2118;
        this.field2123 = arg3;
        this.field2120 = arg4;
        int[] var7 = arg0.method6647(0);
        if (var7 == null) {
            this.field2116 = new class178[0];
        } else {
            int var8 = var7.length;
            this.field2116 = new class178[arg0.method6685(0)];
            for (int var9 = 0; var9 < var8; var9++) {
                class549 var10 = new class549(arg0.method6670(0, var7[var9]));
                this.field2116[var7[var9]] = new class178(var10);
            }
        }
    }

    @ObfuscatedName("hm.ab(I)I")
    public int method3863() {
        if (this.field2116.length == 0) {
            return 100;
        }
        int var1 = 0;
        int var2 = 0;
        class178[] var3 = this.field2116;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class178 var5 = var3[var4];
            if (var5 != null && var5.field1888 != null) {
                var1 += var5.field1888.length;
                int[] var6 = var5.field1888;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    int var8 = var6[var7];
                    if (this.field2122.method6653(var8)) {
                        var2++;
                    }
                }
            }
        }
        if (var1 == 0) {
            return 0;
        } else {
            return var2 * 100 / var1;
        }
    }

    @ObfuscatedName("hm.ay(D)V")
    public void method3842(double arg0) {
        this.field2123 = arg0;
        this.method3860();
    }

    @ObfuscatedName("hm.an(II)[I")
    public int[] method3845(int arg0) {
        class178 var2 = this.field2116[arg0];
        if (var2 != null) {
            if (var2.field1893 != null) {
                this.field2117.method6893(var2);
                var2.field1894 = true;
                return var2.field1893;
            }
            boolean var3 = var2.method3430(this.field2123, this.field2120, this.field2122);
            if (var3) {
                if (this.field2121 == 0) {
                    class178 var4 = (class178) this.field2117.method6895();
                    var4.method3431();
                } else {
                    this.field2121--;
                }
                this.field2117.method6893(var2);
                var2.field1894 = true;
                return var2.field1893;
            }
        }
        return null;
    }

    @ObfuscatedName("hm.au(II)I")
    public int method3846(int arg0) {
        return this.field2116[arg0] == null ? 0 : this.field2116[arg0].field1892;
    }

    @ObfuscatedName("hm.ax(II)Z")
    public boolean method3847(int arg0) {
        return this.field2116[arg0].field1901;
    }

    @ObfuscatedName("hm.ao(II)Z")
    public boolean method3848(int arg0) {
        return this.field2120 == 64;
    }

    @ObfuscatedName("hm.am(I)V")
    public void method3860() {
        for (int var1 = 0; var1 < this.field2116.length; var1++) {
            if (this.field2116[var1] != null) {
                this.field2116[var1].method3431();
            }
        }
        this.field2117 = new class408();
        this.field2121 = this.field2118;
    }

    @ObfuscatedName("hm.ac(II)V")
    public void method3850(int arg0) {
        for (int var2 = 0; var2 < this.field2116.length; var2++) {
            class178 var3 = this.field2116[var2];
            if (var3 != null && var3.field1902 != 0 && var3.field1894) {
                var3.method3432(arg0);
                var3.field1894 = false;
            }
        }
    }
}

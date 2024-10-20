package deob;

@ObfuscatedName("cn")
public class class99 implements class96 {

    @ObfuscatedName("cn.s")
    public class87[] field1666;

    @ObfuscatedName("cn.z")
    public class203 field1662 = new class203();

    @ObfuscatedName("cn.t")
    public int field1658;

    @ObfuscatedName("cn.y")
    public int field1659 = 0;

    @ObfuscatedName("cn.p")
    public double field1660 = 1.0D;

    @ObfuscatedName("cn.g")
    public int field1661 = 128;

    @ObfuscatedName("cn.m")
    public class171 field1657;

    public class99(class171 arg0, class171 arg1, int arg2, double arg3, int arg4) {
        this.field1657 = arg1;
        this.field1658 = arg2;
        this.field1659 = this.field1658;
        this.field1660 = arg3;
        this.field1661 = arg4;
        int[] var7 = arg0.method3101(0);
        int var8 = var7.length;
        this.field1666 = new class87[arg0.method3079(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class123 var10 = new class123(arg0.method3091(0, var7[var9]));
            this.field1666[var7[var9]] = new class87(var10);
        }
    }

    @ObfuscatedName("cn.r(D)V")
    public void method2069(double arg0) {
        this.field1660 = arg0;
        this.method2056();
    }

    @ObfuscatedName("cn.s(II)[I")
    public int[] method2045(int arg0) {
        class87 var2 = this.field1666[arg0];
        if (var2 != null) {
            if (var2.field1482 != null) {
                this.field1662.method3591(var2);
                var2.field1494 = true;
                return var2.field1482;
            }
            boolean var3 = var2.method1803(this.field1660, this.field1661, this.field1657);
            if (var3) {
                if (this.field1659 == 0) {
                    class87 var4 = (class87) this.field1662.method3587();
                    var4.method1807();
                } else {
                    this.field1659--;
                }
                this.field1662.method3591(var2);
                var2.field1494 = true;
                return var2.field1482;
            }
        }
        return null;
    }

    @ObfuscatedName("cn.z(II)I")
    public int method2043(int arg0) {
        return this.field1666[arg0] == null ? 0 : this.field1666[arg0].field1486;
    }

    @ObfuscatedName("cn.t(II)Z")
    public boolean method2044(int arg0) {
        return this.field1666[arg0].field1491;
    }

    @ObfuscatedName("cn.y(II)Z")
    public boolean method2046(int arg0) {
        return this.field1661 == 64;
    }

    @ObfuscatedName("cn.w(B)V")
    public void method2056() {
        for (int var1 = 0; var1 < this.field1666.length; var1++) {
            if (this.field1666[var1] != null) {
                this.field1666[var1].method1807();
            }
        }
        this.field1662 = new class203();
        this.field1659 = this.field1658;
    }

    @ObfuscatedName("cn.u(II)V")
    public void method2055(int arg0) {
        for (int var2 = 0; var2 < this.field1666.length; var2++) {
            class87 var3 = this.field1666[var2];
            if (var3 != null && var3.field1493 != 0 && var3.field1494) {
                var3.method1805(arg0);
                var3.field1494 = false;
            }
        }
    }
}

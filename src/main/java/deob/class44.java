package deob;

@ObfuscatedName("ak")
public class class44 extends class208 {

    @ObfuscatedName("ak.d")
    public static class197 field1000 = new class197(64);

    @ObfuscatedName("ak.v")
    public int field1001 = 0;

    @ObfuscatedName("ak.r")
    public int field999;

    @ObfuscatedName("ak.z")
    public int field1003;

    @ObfuscatedName("ak.t")
    public int field1004;

    @ObfuscatedName("ak.n")
    public int field1005;

    @ObfuscatedName("ak.a(S)V")
    public void method864() {
        this.method863(this.field1001);
    }

    @ObfuscatedName("ak.d(Ldb;IB)V")
    public void method865(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2395();
            if (var3 == 0) {
                return;
            }
            this.method868(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ak.v(Ldb;III)V")
    public void method868(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1001 = arg0.method2399();
        }
    }

    @ObfuscatedName("ak.r(II)V")
    public void method863(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field1003 = (int) (var14 * 256.0D);
        this.field1004 = (int) (var16 * 256.0D);
        if (this.field1003 < 0) {
            this.field1003 = 0;
        } else if (this.field1003 > 255) {
            this.field1003 = 255;
        }
        if (this.field1004 < 0) {
            this.field1004 = 0;
        } else if (this.field1004 > 255) {
            this.field1004 = 255;
        }
        if (var16 > 0.5D) {
            this.field1005 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1005 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1005 < 1) {
            this.field1005 = 1;
        }
        this.field999 = (int) ((double) this.field1005 * var18);
    }
}

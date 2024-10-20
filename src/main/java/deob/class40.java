package deob;

@ObfuscatedName("bn")
public class class40 {

    @ObfuscatedName("bn.aw")
    public class62[] field264 = new class62[10];

    @ObfuscatedName("bn.al")
    public int field265;

    @ObfuscatedName("bn.ai")
    public int field262;

    @ObfuscatedName("bn.aq(Lof;II)Lbn;")
    public static class40 method705(class378 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method6489(arg1, arg2);
        return var3 == null ? null : new class40(new class534(var3));
    }

    public class40(class534 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method8591();
            if (var3 != 0) {
                arg0.field5200--;
                this.field264[var2] = new class62();
                this.field264[var2].method1080(arg0);
            }
        }
        this.field265 = arg0.method8593();
        this.field262 = arg0.method8593();
    }

    @ObfuscatedName("bn.aw()Lbr;")
    public class41 method710() {
        byte[] var1 = this.method707();
        return new class41(22050, var1, this.field265 * 22050 / 1000, this.field262 * 22050 / 1000);
    }

    @ObfuscatedName("bn.al()I")
    public final int method706() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field264[var2] != null && this.field264[var2].field454 / 20 < var1) {
                var1 = this.field264[var2].field454 / 20;
            }
        }
        if (this.field265 < this.field262 && this.field265 / 20 < var1) {
            var1 = this.field265 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field264[var3] != null) {
                this.field264[var3].field454 -= var1 * 20;
            }
        }
        if (this.field265 < this.field262) {
            this.field265 -= var1 * 20;
            this.field262 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bn.ai()[B")
    public final byte[] method707() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field264[var2] != null && this.field264[var2].field454 + this.field264[var2].field453 > var1) {
                var1 = this.field264[var2].field454 + this.field264[var2].field453;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field264[var5] != null) {
                int var6 = this.field264[var5].field453 * 22050 / 1000;
                int var7 = this.field264[var5].field454 * 22050 / 1000;
                int[] var8 = this.field264[var5].method1079(var6, this.field264[var5].field453);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }
}

package deob;

@ObfuscatedName("cs")
public class class94 {

    @ObfuscatedName("cs.l")
    public class110[] field1301 = new class110[10];

    @ObfuscatedName("cs.w")
    public int field1303;

    @ObfuscatedName("cs.s")
    public int field1304;

    @ObfuscatedName("cs.f(Lik;II)Lcs;")
    public static class94 method2024(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4289(arg1, arg2);
        return var3 == null ? null : new class94(new class185(var3));
    }

    public class94(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3344();
            if (var3 != 0) {
                arg0.field2414--;
                this.field1301[var2] = new class110();
                this.field1301[var2].method2344(arg0);
            }
        }
        this.field1303 = arg0.method3346();
        this.field1304 = arg0.method3346();
    }

    @ObfuscatedName("cs.l()Lcr;")
    public class96 method2034() {
        byte[] var1 = this.method2031();
        return new class96(22050, var1, this.field1303 * 22050 / 1000, this.field1304 * 22050 / 1000);
    }

    @ObfuscatedName("cs.w()I")
    public final int method2023() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1301[var2] != null && this.field1301[var2].field1466 / 20 < var1) {
                var1 = this.field1301[var2].field1466 / 20;
            }
        }
        if (this.field1303 < this.field1304 && this.field1303 / 20 < var1) {
            var1 = this.field1303 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1301[var3] != null) {
                this.field1301[var3].field1466 -= var1 * 20;
            }
        }
        if (this.field1303 < this.field1304) {
            this.field1303 -= var1 * 20;
            this.field1304 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cs.s()[B")
    public final byte[] method2031() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1301[var2] != null && this.field1301[var2].field1469 + this.field1301[var2].field1466 > var1) {
                var1 = this.field1301[var2].field1469 + this.field1301[var2].field1466;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1301[var5] != null) {
                int var6 = this.field1301[var5].field1469 * 22050 / 1000;
                int var7 = this.field1301[var5].field1466 * 22050 / 1000;
                int[] var8 = this.field1301[var5].method2342(var6, this.field1301[var5].field1469);
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

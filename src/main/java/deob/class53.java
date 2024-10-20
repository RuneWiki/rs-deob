package deob;

@ObfuscatedName("be")
public class class53 {

    @ObfuscatedName("be.y")
    public class66[] field1099 = new class66[10];

    @ObfuscatedName("be.d")
    public int field1101;

    @ObfuscatedName("be.c")
    public int field1102;

    @ObfuscatedName("be.p(Len;II)Lbe;")
    public static class53 method1069(class151 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2811(arg1, arg2);
        return var3 == null ? null : new class53(new class110(var3));
    }

    public class53(class110 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2309();
            if (var3 != 0) {
                arg0.field1842--;
                this.field1099[var2] = new class66();
                this.field1099[var2].method1340(arg0);
            }
        }
        this.field1101 = arg0.method2243();
        this.field1102 = arg0.method2243();
    }

    @ObfuscatedName("be.y()Lbk;")
    public class57 method1062() {
        byte[] var1 = this.method1064();
        return new class57(22050, var1, this.field1101 * 22050 / 1000, this.field1102 * 22050 / 1000);
    }

    @ObfuscatedName("be.d()I")
    public final int method1063() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1099[var2] != null && this.field1099[var2].field1229 / 20 < var1) {
                var1 = this.field1099[var2].field1229 / 20;
            }
        }
        if (this.field1101 < this.field1102 && this.field1101 / 20 < var1) {
            var1 = this.field1101 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1099[var3] != null) {
                this.field1099[var3].field1229 -= var1 * 20;
            }
        }
        if (this.field1101 < this.field1102) {
            this.field1101 -= var1 * 20;
            this.field1102 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("be.c()[B")
    public final byte[] method1064() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1099[var2] != null && this.field1099[var2].field1232 + this.field1099[var2].field1229 > var1) {
                var1 = this.field1099[var2].field1232 + this.field1099[var2].field1229;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1099[var5] != null) {
                int var6 = this.field1099[var5].field1232 * 22050 / 1000;
                int var7 = this.field1099[var5].field1229 * 22050 / 1000;
                int[] var8 = this.field1099[var5].method1338(var6, this.field1099[var5].field1232);
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

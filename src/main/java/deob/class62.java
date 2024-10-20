package deob;

@ObfuscatedName("bh")
public class class62 {

    @ObfuscatedName("bh.l")
    public class75[] field1278 = new class75[10];

    @ObfuscatedName("bh.c")
    public int field1279;

    @ObfuscatedName("bh.h")
    public int field1277;

    @ObfuscatedName("bh.e(Lfe;II)Lbh;")
    public static class62 method1324(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3130(arg1, arg2);
        return var3 == null ? null : new class62(new class123(var3));
    }

    public class62(class123 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2464();
            if (var3 != 0) {
                arg0.field2062--;
                this.field1278[var2] = new class75();
                this.field1278[var2].method1572(arg0);
            }
        }
        this.field1279 = arg0.method2466();
        this.field1277 = arg0.method2466();
    }

    @ObfuscatedName("bh.l()Lbf;")
    public class66 method1310() {
        byte[] var1 = this.method1312();
        return new class66(22050, var1, this.field1279 * 22050 / 1000, this.field1277 * 22050 / 1000);
    }

    @ObfuscatedName("bh.c()I")
    public final int method1311() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1278[var2] != null && this.field1278[var2].field1408 / 20 < var1) {
                var1 = this.field1278[var2].field1408 / 20;
            }
        }
        if (this.field1279 < this.field1277 && this.field1279 / 20 < var1) {
            var1 = this.field1279 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1278[var3] != null) {
                this.field1278[var3].field1408 -= var1 * 20;
            }
        }
        if (this.field1279 < this.field1277) {
            this.field1279 -= var1 * 20;
            this.field1277 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bh.h()[B")
    public final byte[] method1312() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1278[var2] != null && this.field1278[var2].field1410 + this.field1278[var2].field1408 > var1) {
                var1 = this.field1278[var2].field1410 + this.field1278[var2].field1408;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1278[var5] != null) {
                int var6 = this.field1278[var5].field1410 * 22050 / 1000;
                int var7 = this.field1278[var5].field1408 * 22050 / 1000;
                int[] var8 = this.field1278[var5].method1566(var6, this.field1278[var5].field1410);
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

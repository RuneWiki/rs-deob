package deob;

@ObfuscatedName("bs")
public class class62 {

    @ObfuscatedName("bs.h")
    public class75[] field1267 = new class75[10];

    @ObfuscatedName("bs.e")
    public int field1264;

    @ObfuscatedName("bs.g")
    public int field1266;

    @ObfuscatedName("bs.i(Lfu;II)Lbs;")
    public static class62 method1259(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3086(arg1, arg2);
        return var3 == null ? null : new class62(new class123(var3));
    }

    public class62(class123 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2404();
            if (var3 != 0) {
                arg0.field2046--;
                this.field1267[var2] = new class75();
                this.field1267[var2].method1514(arg0);
            }
        }
        this.field1264 = arg0.method2406();
        this.field1266 = arg0.method2406();
    }

    @ObfuscatedName("bs.h()Lbd;")
    public class66 method1250() {
        byte[] var1 = this.method1258();
        return new class66(22050, var1, this.field1264 * 22050 / 1000, this.field1266 * 22050 / 1000);
    }

    @ObfuscatedName("bs.e()I")
    public final int method1251() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1267[var2] != null && this.field1267[var2].field1392 / 20 < var1) {
                var1 = this.field1267[var2].field1392 / 20;
            }
        }
        if (this.field1264 < this.field1266 && this.field1264 / 20 < var1) {
            var1 = this.field1264 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1267[var3] != null) {
                this.field1267[var3].field1392 -= var1 * 20;
            }
        }
        if (this.field1264 < this.field1266) {
            this.field1264 -= var1 * 20;
            this.field1266 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bs.g()[B")
    public final byte[] method1258() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1267[var2] != null && this.field1267[var2].field1392 + this.field1267[var2].field1391 > var1) {
                var1 = this.field1267[var2].field1392 + this.field1267[var2].field1391;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1267[var5] != null) {
                int var6 = this.field1267[var5].field1391 * 22050 / 1000;
                int var7 = this.field1267[var5].field1392 * 22050 / 1000;
                int[] var8 = this.field1267[var5].method1511(var6, this.field1267[var5].field1391);
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

package deob;

@ObfuscatedName("cf")
public class class94 {

    @ObfuscatedName("cf.c")
    public class110[] field1295 = new class110[10];

    @ObfuscatedName("cf.n")
    public int field1294;

    @ObfuscatedName("cf.u")
    public int field1297;

    @ObfuscatedName("cf.y(Liu;II)Lcf;")
    public static class94 method1974(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4263(arg1, arg2);
        return var3 == null ? null : new class94(new class185(var3));
    }

    public class94(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3299();
            if (var3 != 0) {
                arg0.field2374--;
                this.field1295[var2] = new class110();
                this.field1295[var2].method2276(arg0);
            }
        }
        this.field1294 = arg0.method3280();
        this.field1297 = arg0.method3280();
    }

    @ObfuscatedName("cf.c()Lcz;")
    public class96 method1970() {
        byte[] var1 = this.method1973();
        return new class96(22050, var1, this.field1294 * 22050 / 1000, this.field1297 * 22050 / 1000);
    }

    @ObfuscatedName("cf.n()I")
    public final int method1972() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1295[var2] != null && this.field1295[var2].field1456 / 20 < var1) {
                var1 = this.field1295[var2].field1456 / 20;
            }
        }
        if (this.field1294 < this.field1297 && this.field1294 / 20 < var1) {
            var1 = this.field1294 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1295[var3] != null) {
                this.field1295[var3].field1456 -= var1 * 20;
            }
        }
        if (this.field1294 < this.field1297) {
            this.field1294 -= var1 * 20;
            this.field1297 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cf.u()[B")
    public final byte[] method1973() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1295[var2] != null && this.field1295[var2].field1456 + this.field1295[var2].field1455 > var1) {
                var1 = this.field1295[var2].field1456 + this.field1295[var2].field1455;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1295[var5] != null) {
                int var6 = this.field1295[var5].field1455 * 22050 / 1000;
                int var7 = this.field1295[var5].field1456 * 22050 / 1000;
                int[] var8 = this.field1295[var5].method2274(var6, this.field1295[var5].field1455);
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

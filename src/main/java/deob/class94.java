package deob;

@ObfuscatedName("cd")
public class class94 {

    @ObfuscatedName("cd.h")
    public class110[] field1285 = new class110[10];

    @ObfuscatedName("cd.e")
    public int field1286;

    @ObfuscatedName("cd.b")
    public int field1288;

    @ObfuscatedName("cd.f(Lie;II)Lcd;")
    public static class94 method1971(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4267(arg1, arg2);
        return var3 == null ? null : new class94(new class185(var3));
    }

    public class94(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3323();
            if (var3 != 0) {
                arg0.field2397--;
                this.field1285[var2] = new class110();
                this.field1285[var2].method2281(arg0);
            }
        }
        this.field1286 = arg0.method3325();
        this.field1288 = arg0.method3325();
    }

    @ObfuscatedName("cd.h()Lcb;")
    public class96 method1959() {
        byte[] var1 = this.method1965();
        return new class96(22050, var1, this.field1286 * 22050 / 1000, this.field1288 * 22050 / 1000);
    }

    @ObfuscatedName("cd.e()I")
    public final int method1960() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1285[var2] != null && this.field1285[var2].field1452 / 20 < var1) {
                var1 = this.field1285[var2].field1452 / 20;
            }
        }
        if (this.field1286 < this.field1288 && this.field1286 / 20 < var1) {
            var1 = this.field1286 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1285[var3] != null) {
                this.field1285[var3].field1452 -= var1 * 20;
            }
        }
        if (this.field1286 < this.field1288) {
            this.field1286 -= var1 * 20;
            this.field1288 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cd.b()[B")
    public final byte[] method1965() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1285[var2] != null && this.field1285[var2].field1452 + this.field1285[var2].field1451 > var1) {
                var1 = this.field1285[var2].field1452 + this.field1285[var2].field1451;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1285[var5] != null) {
                int var6 = this.field1285[var5].field1451 * 22050 / 1000;
                int var7 = this.field1285[var5].field1452 * 22050 / 1000;
                int[] var8 = this.field1285[var5].method2279(var6, this.field1285[var5].field1451);
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

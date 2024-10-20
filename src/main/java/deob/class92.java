package deob;

@ObfuscatedName("cg")
public class class92 {

    @ObfuscatedName("cg.w")
    public class108[] field1242 = new class108[10];

    @ObfuscatedName("cg.s")
    public int field1240;

    @ObfuscatedName("cg.l")
    public int field1241;

    @ObfuscatedName("cg.z(Lir;II)Lcg;")
    public static class92 method1936(class248 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4247(arg1, arg2);
        return var3 == null ? null : new class92(new class183(var3));
    }

    public class92(class183 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3247();
            if (var3 != 0) {
                arg0.field2340--;
                this.field1242[var2] = new class108();
                this.field1242[var2].method2262(arg0);
            }
        }
        this.field1240 = arg0.method3253();
        this.field1241 = arg0.method3253();
    }

    @ObfuscatedName("cg.w()Lct;")
    public class94 method1934() {
        byte[] var1 = this.method1933();
        return new class94(22050, var1, this.field1240 * 22050 / 1000, this.field1241 * 22050 / 1000);
    }

    @ObfuscatedName("cg.s()I")
    public final int method1935() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1242[var2] != null && this.field1242[var2].field1406 / 20 < var1) {
                var1 = this.field1242[var2].field1406 / 20;
            }
        }
        if (this.field1240 < this.field1241 && this.field1240 / 20 < var1) {
            var1 = this.field1240 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1242[var3] != null) {
                this.field1242[var3].field1406 -= var1 * 20;
            }
        }
        if (this.field1240 < this.field1241) {
            this.field1240 -= var1 * 20;
            this.field1241 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cg.l()[B")
    public final byte[] method1933() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1242[var2] != null && this.field1242[var2].field1406 + this.field1242[var2].field1405 > var1) {
                var1 = this.field1242[var2].field1406 + this.field1242[var2].field1405;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1242[var5] != null) {
                int var6 = this.field1242[var5].field1405 * 22050 / 1000;
                int var7 = this.field1242[var5].field1406 * 22050 / 1000;
                int[] var8 = this.field1242[var5].method2260(var6, this.field1242[var5].field1405);
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

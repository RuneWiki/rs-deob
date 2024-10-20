package deob;

@ObfuscatedName("cm")
public class class92 {

    @ObfuscatedName("cm.m")
    public class108[] field1266 = new class108[10];

    @ObfuscatedName("cm.q")
    public int field1268;

    @ObfuscatedName("cm.b")
    public int field1269;

    @ObfuscatedName("cm.w(Liv;II)Lcm;")
    public static class92 method1964(class248 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method4250(arg1, arg2);
        return var3 == null ? null : new class92(new class183(var3));
    }

    public class92(class183 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3436();
            if (var3 != 0) {
                arg0.field2360--;
                this.field1266[var2] = new class108();
                this.field1266[var2].method2300(arg0);
            }
        }
        this.field1268 = arg0.method3268();
        this.field1269 = arg0.method3268();
    }

    @ObfuscatedName("cm.m()Lcg;")
    public class94 method1960() {
        byte[] var1 = this.method1968();
        return new class94(22050, var1, this.field1268 * 22050 / 1000, this.field1269 * 22050 / 1000);
    }

    @ObfuscatedName("cm.q()I")
    public final int method1963() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1266[var2] != null && this.field1266[var2].field1431 / 20 < var1) {
                var1 = this.field1266[var2].field1431 / 20;
            }
        }
        if (this.field1268 < this.field1269 && this.field1268 / 20 < var1) {
            var1 = this.field1268 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1266[var3] != null) {
                this.field1266[var3].field1431 -= var1 * 20;
            }
        }
        if (this.field1268 < this.field1269) {
            this.field1268 -= var1 * 20;
            this.field1269 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("cm.x()[B")
    public final byte[] method1968() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1266[var2] != null && this.field1266[var2].field1431 + this.field1266[var2].field1425 > var1) {
                var1 = this.field1266[var2].field1431 + this.field1266[var2].field1425;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1266[var5] != null) {
                int var6 = this.field1266[var5].field1425 * 22050 / 1000;
                int var7 = this.field1266[var5].field1431 * 22050 / 1000;
                int[] var8 = this.field1266[var5].method2297(var6, this.field1266[var5].field1425);
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

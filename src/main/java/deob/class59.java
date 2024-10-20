package deob;

@ObfuscatedName("bh")
public class class59 {

    @ObfuscatedName("bh.w")
    public class72[] field1183 = new class72[10];

    @ObfuscatedName("bh.f")
    public int field1184;

    @ObfuscatedName("bh.s")
    public int field1182;

    @ObfuscatedName("bh.e(Lft;II)Lbh;")
    public static class59 method1197(class168 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3048(arg1, arg2);
        return var3 == null ? null : new class59(new class120(var3));
    }

    public class59(class120 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2355();
            if (var3 != 0) {
                arg0.field1977--;
                this.field1183[var2] = new class72();
                this.field1183[var2].method1456(arg0);
            }
        }
        this.field1184 = arg0.method2532();
        this.field1182 = arg0.method2532();
    }

    @ObfuscatedName("bh.w()Lbu;")
    public class63 method1199() {
        byte[] var1 = this.method1202();
        return new class63(22050, var1, this.field1184 * 22050 / 1000, this.field1182 * 22050 / 1000);
    }

    @ObfuscatedName("bh.f()I")
    public final int method1194() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1183[var2] != null && this.field1183[var2].field1314 / 20 < var1) {
                var1 = this.field1183[var2].field1314 / 20;
            }
        }
        if (this.field1184 < this.field1182 && this.field1184 / 20 < var1) {
            var1 = this.field1184 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1183[var3] != null) {
                this.field1183[var3].field1314 -= var1 * 20;
            }
        }
        if (this.field1184 < this.field1182) {
            this.field1184 -= var1 * 20;
            this.field1182 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bh.s()[B")
    public final byte[] method1202() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1183[var2] != null && this.field1183[var2].field1314 + this.field1183[var2].field1303 > var1) {
                var1 = this.field1183[var2].field1314 + this.field1183[var2].field1303;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1183[var5] != null) {
                int var6 = this.field1183[var5].field1303 * 22050 / 1000;
                int var7 = this.field1183[var5].field1314 * 22050 / 1000;
                int[] var8 = this.field1183[var5].method1457(var6, this.field1183[var5].field1303);
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

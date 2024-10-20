package deob;

@ObfuscatedName("bd")
public class class62 {

    @ObfuscatedName("bd.d")
    public class75[] field1283 = new class75[10];

    @ObfuscatedName("bd.v")
    public int field1282;

    @ObfuscatedName("bd.r")
    public int field1285;

    @ObfuscatedName("bd.a(Lfu;II)Lbd;")
    public static class62 method1287(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3117(arg1, arg2);
        return var3 == null ? null : new class62(new class123(var3));
    }

    public class62(class123 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2395();
            if (var3 != 0) {
                arg0.field2071--;
                this.field1283[var2] = new class75();
                this.field1283[var2].method1526(arg0);
            }
        }
        this.field1282 = arg0.method2584();
        this.field1285 = arg0.method2584();
    }

    @ObfuscatedName("bd.d()Lbx;")
    public class66 method1277() {
        byte[] var1 = this.method1275();
        return new class66(22050, var1, this.field1282 * 22050 / 1000, this.field1285 * 22050 / 1000);
    }

    @ObfuscatedName("bd.v()I")
    public final int method1278() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1283[var2] != null && this.field1283[var2].field1410 / 20 < var1) {
                var1 = this.field1283[var2].field1410 / 20;
            }
        }
        if (this.field1282 < this.field1285 && this.field1282 / 20 < var1) {
            var1 = this.field1282 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1283[var3] != null) {
                this.field1283[var3].field1410 -= var1 * 20;
            }
        }
        if (this.field1282 < this.field1285) {
            this.field1282 -= var1 * 20;
            this.field1285 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bd.r()[B")
    public final byte[] method1275() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1283[var2] != null && this.field1283[var2].field1410 + this.field1283[var2].field1409 > var1) {
                var1 = this.field1283[var2].field1410 + this.field1283[var2].field1409;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1283[var5] != null) {
                int var6 = this.field1283[var5].field1409 * 22050 / 1000;
                int var7 = this.field1283[var5].field1410 * 22050 / 1000;
                int[] var8 = this.field1283[var5].method1527(var6, this.field1283[var5].field1409);
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

package deob;

@ObfuscatedName("bv")
public class class58 {

    @ObfuscatedName("bv.i")
    public class55[] field1217 = new class55[10];

    @ObfuscatedName("bv.k")
    public int field1216;

    @ObfuscatedName("bv.q")
    public int field1219;

    @ObfuscatedName("bv.e(Lea;II)Lbv;")
    public static class58 method1307(class155 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3069(arg1, arg2);
        return var3 == null ? null : new class58(new class128(var3));
    }

    public class58(class128 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2548();
            if (var3 != 0) {
                arg0.field2045--;
                this.field1217[var2] = new class55();
                this.field1217[var2].method1273(arg0);
            }
        }
        this.field1216 = arg0.method2456();
        this.field1219 = arg0.method2456();
    }

    @ObfuscatedName("bv.i()Lbs;")
    public class64 method1303() {
        byte[] var1 = this.method1305();
        return new class64(22050, var1, this.field1216 * 22050 / 1000, this.field1219 * 22050 / 1000);
    }

    @ObfuscatedName("bv.k()I")
    public final int method1304() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1217[var2] != null && this.field1217[var2].field1183 / 20 < var1) {
                var1 = this.field1217[var2].field1183 / 20;
            }
        }
        if (this.field1216 < this.field1219 && this.field1216 / 20 < var1) {
            var1 = this.field1216 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1217[var3] != null) {
                this.field1217[var3].field1183 -= var1 * 20;
            }
        }
        if (this.field1216 < this.field1219) {
            this.field1216 -= var1 * 20;
            this.field1219 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bv.q()[B")
    public final byte[] method1305() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1217[var2] != null && this.field1217[var2].field1188 + this.field1217[var2].field1183 > var1) {
                var1 = this.field1217[var2].field1188 + this.field1217[var2].field1183;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1217[var5] != null) {
                int var6 = this.field1217[var5].field1188 * 22050 / 1000;
                int var7 = this.field1217[var5].field1183 * 22050 / 1000;
                int[] var8 = this.field1217[var5].method1274(var6, this.field1217[var5].field1188);
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

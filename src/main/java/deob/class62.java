package deob;

@ObfuscatedName("bw")
public class class62 {

    @ObfuscatedName("bw.e")
    public class75[] field1256 = new class75[10];

    @ObfuscatedName("bw.n")
    public int field1258;

    @ObfuscatedName("bw.t")
    public int field1257;

    @ObfuscatedName("bw.f(Lfj;II)Lbw;")
    public static class62 method1279(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3107(arg1, arg2);
        return var3 == null ? null : new class62(new class123(var3));
    }

    public class62(class123 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2522();
            if (var3 != 0) {
                arg0.field2052--;
                this.field1256[var2] = new class75();
                this.field1256[var2].method1536(arg0);
            }
        }
        this.field1258 = arg0.method2401();
        this.field1257 = arg0.method2401();
    }

    @ObfuscatedName("bw.e()Lbu;")
    public class66 method1268() {
        byte[] var1 = this.method1270();
        return new class66(22050, var1, this.field1258 * 22050 / 1000, this.field1257 * 22050 / 1000);
    }

    @ObfuscatedName("bw.n()I")
    public final int method1267() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1256[var2] != null && this.field1256[var2].field1385 / 20 < var1) {
                var1 = this.field1256[var2].field1385 / 20;
            }
        }
        if (this.field1258 < this.field1257 && this.field1258 / 20 < var1) {
            var1 = this.field1258 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1256[var3] != null) {
                this.field1256[var3].field1385 -= var1 * 20;
            }
        }
        if (this.field1258 < this.field1257) {
            this.field1258 -= var1 * 20;
            this.field1257 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bw.t()[B")
    public final byte[] method1270() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1256[var2] != null && this.field1256[var2].field1385 + this.field1256[var2].field1372 > var1) {
                var1 = this.field1256[var2].field1385 + this.field1256[var2].field1372;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1256[var5] != null) {
                int var6 = this.field1256[var5].field1372 * 22050 / 1000;
                int var7 = this.field1256[var5].field1385 * 22050 / 1000;
                int[] var8 = this.field1256[var5].method1534(var6, this.field1256[var5].field1372);
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

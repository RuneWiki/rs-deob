package deob;

@ObfuscatedName("bm")
public class class62 {

    @ObfuscatedName("bm.w")
    public class75[] field1282 = new class75[10];

    @ObfuscatedName("bm.e")
    public int field1284;

    @ObfuscatedName("bm.o")
    public int field1285;

    @ObfuscatedName("bm.m(Lfa;II)Lbm;")
    public static class62 method1290(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3086(arg1, arg2);
        return var3 == null ? null : new class62(new class123(var3));
    }

    public class62(class123 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2398();
            if (var3 != 0) {
                arg0.field2046--;
                this.field1282[var2] = new class75();
                this.field1282[var2].method1560(arg0);
            }
        }
        this.field1284 = arg0.method2548();
        this.field1285 = arg0.method2548();
    }

    @ObfuscatedName("bm.w()Lbn;")
    public class66 method1285() {
        byte[] var1 = this.method1298();
        return new class66(22050, var1, this.field1284 * 22050 / 1000, this.field1285 * 22050 / 1000);
    }

    @ObfuscatedName("bm.e()I")
    public final int method1286() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1282[var2] != null && this.field1282[var2].field1412 / 20 < var1) {
                var1 = this.field1282[var2].field1412 / 20;
            }
        }
        if (this.field1284 < this.field1285 && this.field1284 / 20 < var1) {
            var1 = this.field1284 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1282[var3] != null) {
                this.field1282[var3].field1412 -= var1 * 20;
            }
        }
        if (this.field1284 < this.field1285) {
            this.field1284 -= var1 * 20;
            this.field1285 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bm.o()[B")
    public final byte[] method1298() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1282[var2] != null && this.field1282[var2].field1412 + this.field1282[var2].field1411 > var1) {
                var1 = this.field1282[var2].field1412 + this.field1282[var2].field1411;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1282[var5] != null) {
                int var6 = this.field1282[var5].field1411 * 22050 / 1000;
                int var7 = this.field1282[var5].field1412 * 22050 / 1000;
                int[] var8 = this.field1282[var5].method1559(var6, this.field1282[var5].field1411);
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

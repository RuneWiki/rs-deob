package deob;

@ObfuscatedName("bk")
public class class62 {

    @ObfuscatedName("bk.r")
    public class75[] field1256 = new class75[10];

    @ObfuscatedName("bk.j")
    public int field1258;

    @ObfuscatedName("bk.z")
    public int field1259;

    @ObfuscatedName("bk.x(Lfp;II)Lbk;")
    public static class62 method1263(class171 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3079(arg1, arg2);
        return var3 == null ? null : new class62(new class123(var3));
    }

    public class62(class123 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2408();
            if (var3 != 0) {
                arg0.field2057--;
                this.field1256[var2] = new class75();
                this.field1256[var2].method1504(arg0);
            }
        }
        this.field1258 = arg0.method2403();
        this.field1259 = arg0.method2403();
    }

    @ObfuscatedName("bk.r()Lbn;")
    public class66 method1262() {
        byte[] var1 = this.method1264();
        return new class66(22050, var1, this.field1258 * 22050 / 1000, this.field1259 * 22050 / 1000);
    }

    @ObfuscatedName("bk.j()I")
    public final int method1265() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1256[var2] != null && this.field1256[var2].field1382 / 20 < var1) {
                var1 = this.field1256[var2].field1382 / 20;
            }
        }
        if (this.field1258 < this.field1259 && this.field1258 / 20 < var1) {
            var1 = this.field1258 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1256[var3] != null) {
                this.field1256[var3].field1382 -= var1 * 20;
            }
        }
        if (this.field1258 < this.field1259) {
            this.field1258 -= var1 * 20;
            this.field1259 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bk.z()[B")
    public final byte[] method1264() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1256[var2] != null && this.field1256[var2].field1390 + this.field1256[var2].field1382 > var1) {
                var1 = this.field1256[var2].field1390 + this.field1256[var2].field1382;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1256[var5] != null) {
                int var6 = this.field1256[var5].field1390 * 22050 / 1000;
                int var7 = this.field1256[var5].field1382 * 22050 / 1000;
                int[] var8 = this.field1256[var5].method1503(var6, this.field1256[var5].field1390);
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

package deob;

@ObfuscatedName("ao")
public class class52 {

    @ObfuscatedName("ao.r")
    public class65[] field1112 = new class65[10];

    @ObfuscatedName("ao.y")
    public int field1111;

    @ObfuscatedName("ao.w")
    public int field1110;

    @ObfuscatedName("ao.k(Lee;II)Lao;")
    public static class52 method1053(class146 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2749(arg1, arg2);
        return var3 == null ? null : new class52(new class107(var3));
    }

    public class52(class107 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2111();
            if (var3 != 0) {
                arg0.field1863--;
                this.field1112[var2] = new class65();
                this.field1112[var2].method1324(arg0);
            }
        }
        this.field1111 = arg0.method2232();
        this.field1110 = arg0.method2232();
    }

    @ObfuscatedName("ao.r()Lbw;")
    public class56 method1051() {
        byte[] var1 = this.method1052();
        return new class56(22050, var1, this.field1111 * 22050 / 1000, this.field1110 * 22050 / 1000);
    }

    @ObfuscatedName("ao.y()I")
    public final int method1061() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1112[var2] != null && this.field1112[var2].field1236 / 20 < var1) {
                var1 = this.field1112[var2].field1236 / 20;
            }
        }
        if (this.field1111 < this.field1110 && this.field1111 / 20 < var1) {
            var1 = this.field1111 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1112[var3] != null) {
                this.field1112[var3].field1236 -= var1 * 20;
            }
        }
        if (this.field1111 < this.field1110) {
            this.field1111 -= var1 * 20;
            this.field1110 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("ao.w()[B")
    public final byte[] method1052() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1112[var2] != null && this.field1112[var2].field1236 + this.field1112[var2].field1235 > var1) {
                var1 = this.field1112[var2].field1236 + this.field1112[var2].field1235;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1112[var5] != null) {
                int var6 = this.field1112[var5].field1235 * 22050 / 1000;
                int var7 = this.field1112[var5].field1236 * 22050 / 1000;
                int[] var8 = this.field1112[var5].method1322(var6, this.field1112[var5].field1235);
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

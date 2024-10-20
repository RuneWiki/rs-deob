package deob;

@ObfuscatedName("bw")
public class class59 {

    @ObfuscatedName("bw.l")
    public class72[] field1170 = new class72[10];

    @ObfuscatedName("bw.y")
    public int field1171;

    @ObfuscatedName("bw.u")
    public int field1172;

    @ObfuscatedName("bw.m(Lfx;II)Lbw;")
    public static class59 method1243(class167 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3080(arg1, arg2);
        return var3 == null ? null : new class59(new class119(var3));
    }

    public class59(class119 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2562();
            if (var3 != 0) {
                arg0.field1955--;
                this.field1170[var2] = new class72();
                this.field1170[var2].method1512(arg0);
            }
        }
        this.field1171 = arg0.method2541();
        this.field1172 = arg0.method2541();
    }

    @ObfuscatedName("bw.l()Lbt;")
    public class63 method1244() {
        byte[] var1 = this.method1246();
        return new class63(22050, var1, this.field1171 * 22050 / 1000, this.field1172 * 22050 / 1000);
    }

    @ObfuscatedName("bw.y()I")
    public final int method1253() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1170[var2] != null && this.field1170[var2].field1296 / 20 < var1) {
                var1 = this.field1170[var2].field1296 / 20;
            }
        }
        if (this.field1171 < this.field1172 && this.field1171 / 20 < var1) {
            var1 = this.field1171 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1170[var3] != null) {
                this.field1170[var3].field1296 -= var1 * 20;
            }
        }
        if (this.field1171 < this.field1172) {
            this.field1171 -= var1 * 20;
            this.field1172 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("bw.u()[B")
    public final byte[] method1246() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1170[var2] != null && this.field1170[var2].field1296 + this.field1170[var2].field1293 > var1) {
                var1 = this.field1170[var2].field1296 + this.field1170[var2].field1293;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1170[var5] != null) {
                int var6 = this.field1170[var5].field1293 * 22050 / 1000;
                int var7 = this.field1170[var5].field1296 * 22050 / 1000;
                int[] var8 = this.field1170[var5].method1520(var6, this.field1170[var5].field1293);
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

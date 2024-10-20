package deob;

@ObfuscatedName("be")
public class class53 {

    @ObfuscatedName("be.j")
    public class66[] field1112 = new class66[10];

    @ObfuscatedName("be.y")
    public int field1113;

    @ObfuscatedName("be.r")
    public int field1111;

    @ObfuscatedName("be.c(Ler;II)Lbe;")
    public static class53 method1058(class149 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2746(arg1, arg2);
        return var3 == null ? null : new class53(new class108(var3));
    }

    public class53(class108 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2134();
            if (var3 != 0) {
                arg0.field1826--;
                this.field1112[var2] = new class66();
                this.field1112[var2].method1301(arg0);
            }
        }
        this.field1113 = arg0.method2136();
        this.field1111 = arg0.method2136();
    }

    @ObfuscatedName("be.j()Lbg;")
    public class57 method1057() {
        byte[] var1 = this.method1059();
        return new class57(22050, var1, this.field1113 * 22050 / 1000, this.field1111 * 22050 / 1000);
    }

    @ObfuscatedName("be.y()I")
    public final int method1056() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1112[var2] != null && this.field1112[var2].field1245 / 20 < var1) {
                var1 = this.field1112[var2].field1245 / 20;
            }
        }
        if (this.field1113 < this.field1111 && this.field1113 / 20 < var1) {
            var1 = this.field1113 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1112[var3] != null) {
                this.field1112[var3].field1245 -= var1 * 20;
            }
        }
        if (this.field1113 < this.field1111) {
            this.field1113 -= var1 * 20;
            this.field1111 -= var1 * 20;
        }
        return var1;
    }

    @ObfuscatedName("be.r()[B")
    public final byte[] method1059() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1112[var2] != null && this.field1112[var2].field1245 + this.field1112[var2].field1235 > var1) {
                var1 = this.field1112[var2].field1245 + this.field1112[var2].field1235;
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
                int var7 = this.field1112[var5].field1245 * 22050 / 1000;
                int[] var8 = this.field1112[var5].method1299(var6, this.field1112[var5].field1235);
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
